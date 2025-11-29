package org.batfish.minesweeper.prune.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.service.AutoService;
import org.batfish.common.Answerer;
import org.batfish.common.NetworkSnapshot;
import org.batfish.common.plugin.IBatfish;
import org.batfish.common.plugin.Plugin;
import org.batfish.datamodel.answers.AnswerElement;
import org.batfish.datamodel.answers.StringAnswerElement;
import org.batfish.datamodel.questions.Question;
import org.batfish.minesweeper.Graph;
import org.batfish.minesweeper.prune.util.EchartGraph;
import org.batfish.minesweeper.question.HeaderLocationQuestion;
import org.batfish.question.QuestionPlugin;
import org.jgrapht.alg.util.Pair;
import java.util.HashSet;

@AutoService(Plugin.class)
public class SmtTopologyQuestionPlugin extends QuestionPlugin {

    @Override
    protected Answerer createAnswerer(Question question, IBatfish batfish) {
        return new SmtTopologyQuestionPlugin.TopologyAnswerer(question, batfish);
    }
    @Override
    protected Question createQuestion() {
        return new SmtTopologyQuestionPlugin.TopologyQuestion();
    }


    public static class TopologyAnswerer extends Answerer {

        public TopologyAnswerer(Question question, IBatfish batfish) {
            super(question, batfish);
        }

        @Override
        public AnswerElement answer(NetworkSnapshot snapshot) {
            HashSet<Pair<String, String>> links = new HashSet<>();
            Graph graph = new Graph(_batfish, snapshot);
            graph.getEdgeMap().forEach((node, edges) -> edges.forEach(edge -> {
                if (!edge.isAbstract() && edge.getPeer() != null) {
                    links.add(new Pair<>(edge.getRouter(), edge.getPeer()));
                }
            }));
            EchartGraph.draw(links, ((TopologyQuestion) _question).getTopologyPath());
            return new StringAnswerElement("draw topology successfully");
        }
    }

    public static class TopologyQuestion extends HeaderLocationQuestion {
        private static final String DEFAULT_TOPOLOGY_PATH = "";

        private static final String PROP_TOPOLOGY_PATH = "topologyPath";

        private String _topologyPath;

        public TopologyQuestion() {
            super();
            _topologyPath= DEFAULT_TOPOLOGY_PATH;
        }

        @JsonProperty(PROP_TOPOLOGY_PATH)
        public String getTopologyPath() {
            return _topologyPath;
        }

        @JsonProperty(PROP_TOPOLOGY_PATH)
        public void setTopologyPath(String topologyPath) {
            _topologyPath = topologyPath;
        }

        @Override
        public boolean getDataPlane() {
            return false;
        }

        @Override
        public String getName() {
            return "smt-topology";
        }
    }

}
