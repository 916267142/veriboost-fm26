package org.batfish.minesweeper.prune.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.service.AutoService;
import org.batfish.common.Answerer;
import org.batfish.common.NetworkSnapshot;
import org.batfish.common.bdd.BDDPacket;
import org.batfish.common.plugin.IBatfish;
import org.batfish.common.plugin.Plugin;
import org.batfish.datamodel.answers.AnswerElement;
import org.batfish.datamodel.answers.StringAnswerElement;
import org.batfish.datamodel.questions.Question;
import org.batfish.minesweeper.prune.experiment.BenchmarkPropertiesExperiment;
import org.batfish.minesweeper.question.SmtBenchmarkPlugin;
import org.batfish.minesweeper.smt.PropertyChecker;
import org.batfish.question.QuestionPlugin;
import org.batfish.minesweeper.smt.Optimizations;
import org.batfish.minesweeper.question.HeaderLocationQuestion;

@AutoService(Plugin.class)
public class SmtBenchmarkPropertiesQuestionPlugin extends QuestionPlugin {

    @Override
    protected Answerer createAnswerer(Question question, IBatfish batfish) {
        return new SmtBenchMarkPropertiesAnswerer(question, batfish);
    }
    @Override
    protected Question createQuestion() {
        return new SmtBenchMarkPropertiesQuestion();
    }

    public static class SmtBenchMarkPropertiesAnswerer extends Answerer {

        public SmtBenchMarkPropertiesAnswerer(Question question, IBatfish batfish) {
            super(question, batfish);
        }

        @Override
        public AnswerElement answer(NetworkSnapshot snapshot) {
            SmtBenchMarkPropertiesQuestion q = (SmtBenchMarkPropertiesQuestion) _question;
            BenchmarkPropertiesExperiment experiment = new BenchmarkPropertiesExperiment();
            experiment.run(_batfish, q, snapshot);
            return new StringAnswerElement("benchmark successfully");
        }
    }

    public static class SmtBenchMarkPropertiesQuestion extends HeaderLocationQuestion {
        private static final boolean DEFAULT_GUIDED = false;
        private static final boolean DEFAULT_MODEL_REDUCTION = false;
        private static final String DEFAULT_NETWORK_TYPE  = "0";
        private static final String DEFAULT_TOPOLOGY_PATH = "";

        private static final int DEFAULT_MODEL_NUMBER = 100000;

        private static final boolean DEFAULT_MODEL_PRUNE = false;

        private static final String PROP_Z3_NETWORK_TYPE = "networkType";
        private static final String PROP_TOPOLOGY_PATH = "topologyPath";
        // private static final String PROP_NETWORK_DISTURBED = "disturbed";
        private static final String PROP_MODEL_REDUCTION = "reduction";
        private static final String PROP_MODEL_PRUNE = "prune";

        private static final String PROP_MODEL_NUMBER = "number";

        private boolean _guided;
        // private boolean _disturbed;
        private boolean _reduction;

        private boolean _prune;
        private String _networkType;
        private String _propType;
        private String _topologyPath;

        private int _number;

        public SmtBenchMarkPropertiesQuestion() {
            super();
            _guided = DEFAULT_GUIDED;
            _networkType = DEFAULT_NETWORK_TYPE;
            _topologyPath= DEFAULT_TOPOLOGY_PATH;
            _reduction = DEFAULT_MODEL_REDUCTION;
            _prune = DEFAULT_MODEL_PRUNE;
            _number = DEFAULT_MODEL_NUMBER;
        }

        @JsonProperty(PROP_TOPOLOGY_PATH)
        public String getTopologyPath() {
            return _topologyPath;
        }

        @JsonProperty(PROP_TOPOLOGY_PATH)
        public void setTopologyPath(String topologyPath) {
            _topologyPath = topologyPath;
        }

        public boolean getGuided() {
            return _guided;
        }

        public void setGuided(boolean guided) {
            _guided = guided;
        }

        @JsonProperty(PROP_MODEL_REDUCTION)
        public boolean getReduction() {
            return _reduction;
        }

        @JsonProperty(PROP_MODEL_REDUCTION)
        public void setReduction(boolean reduction) {
//            setGuided(reduction);
            _reduction = reduction;
            if (_reduction) {
                Optimizations.enableReduction();
            } else {
                Optimizations.disableReduction();
            }
        }

        @JsonProperty(PROP_MODEL_NUMBER)
        public void setNumber(int number) {
            _number = number;
        }

        @JsonProperty(PROP_MODEL_NUMBER)
        public int getNumber() {
            return _number;
        }

        @JsonProperty(PROP_MODEL_PRUNE)
        public void setPrune(boolean prune) {
            _prune = prune;
        }

        @JsonProperty(PROP_MODEL_PRUNE)
        public boolean getPrune() {
            return _prune;
        }

        @JsonProperty(PROP_Z3_NETWORK_TYPE)
        public String getNetworkType() {
            return _networkType;
        }

        @JsonProperty(PROP_Z3_NETWORK_TYPE)
        public void setNetworkType(String networkType) {
            _networkType = networkType;
        }

        public String getProptype() {
            return _propType;
        }

        public void setProptype(String propType) {
            _propType = propType;
        }

        @Override
        public boolean getDataPlane() {
            return false;
        }

        @Override
        public String getName() {
            return "smt-benchmark-properties";
        }
    }
}