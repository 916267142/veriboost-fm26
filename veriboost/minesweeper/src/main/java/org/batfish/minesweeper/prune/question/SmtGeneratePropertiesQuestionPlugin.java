package org.batfish.minesweeper.prune.question;

import com.google.auto.service.AutoService;
import org.batfish.common.Answerer;
import org.batfish.common.NetworkSnapshot;
import org.batfish.common.plugin.IBatfish;
import org.batfish.common.plugin.Plugin;
import org.batfish.datamodel.answers.AnswerElement;
import org.batfish.datamodel.answers.StringAnswerElement;
import org.batfish.datamodel.questions.Question;
import org.batfish.minesweeper.prune.experiment.GeneratePropertiesExperiment;
import org.batfish.minesweeper.question.HeaderLocationQuestion;
import org.batfish.question.QuestionPlugin;

@AutoService(Plugin.class)
public class SmtGeneratePropertiesQuestionPlugin extends QuestionPlugin {
    @Override
    protected Answerer createAnswerer(Question question, IBatfish batfish) {
        return new SmtGeneratePropertiesAnswerer(question, batfish);
    }

    @Override
    protected Question createQuestion() {
        return new SmtGeneratePropertiesQuestion();
    }

    public static class SmtGeneratePropertiesAnswerer extends Answerer {
        public SmtGeneratePropertiesAnswerer(Question question, IBatfish batfish) {
            super(question, batfish);
        }

        @Override
        public AnswerElement answer(NetworkSnapshot snapshot) {
            SmtGeneratePropertiesQuestionPlugin.SmtGeneratePropertiesQuestion q = (SmtGeneratePropertiesQuestionPlugin.SmtGeneratePropertiesQuestion) _question;
            GeneratePropertiesExperiment p = new GeneratePropertiesExperiment(_batfish);
            p.generateProperties(snapshot, q);
            return new StringAnswerElement("generate properties successfully");
        }
    }

    public static class SmtGeneratePropertiesQuestion extends HeaderLocationQuestion {
        private static final boolean DEFAULT_REACHABILITY = false;
        private static final boolean DEFAULT_MINCUT = false;
        private static final String DEFAULT_CONFIG_PATH  = "";

        private boolean _reachability;

        private boolean _mincut;

        private String _configPath;

        public SmtGeneratePropertiesQuestion() {
            super();
            _reachability = DEFAULT_REACHABILITY;
            _mincut = DEFAULT_MINCUT;
            _configPath= DEFAULT_CONFIG_PATH;
        }

        public boolean getReachability() {
            return _reachability;
        }

        public void setReachability(boolean _reachability) {
            this._reachability = _reachability;
        }

        public boolean getMincut() {
            return _mincut;
        }

        public void setMincut(boolean _mincut) {
            this._mincut = _mincut;
        }

        public String getConfigPath() {
            return _configPath;
        }

        public void setConfigPath(String _configPath) {
            this._configPath = _configPath;
        }

        public String getName() {
            return "smt-generate-properties";
        }
    }
}
