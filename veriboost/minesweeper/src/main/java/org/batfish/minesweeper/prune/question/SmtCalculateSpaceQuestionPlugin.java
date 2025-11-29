package org.batfish.minesweeper.prune.question;

import com.google.auto.service.AutoService;
import org.batfish.common.Answerer;
import org.batfish.common.NetworkSnapshot;
import org.batfish.common.plugin.IBatfish;
import org.batfish.common.plugin.Plugin;
import org.batfish.datamodel.answers.AnswerElement;
import org.batfish.datamodel.answers.StringAnswerElement;
import org.batfish.datamodel.questions.Question;
import org.batfish.minesweeper.prune.experiment.CalculateSpaceExperiment;
import org.batfish.minesweeper.prune.experiment.GeneratePropertiesExperiment;
import org.batfish.minesweeper.question.HeaderLocationQuestion;
import org.batfish.question.QuestionPlugin;

@AutoService(Plugin.class)
public class SmtCalculateSpaceQuestionPlugin extends QuestionPlugin {
    @Override
    protected Answerer createAnswerer(Question question, IBatfish batfish) {
        return new SmtCalculateSpaceAnswerer(question, batfish);
    }

    @Override
    protected Question createQuestion() {
        return new SmtCalculateSpaceQuestionQuestion();
    }

    public static class SmtCalculateSpaceAnswerer extends Answerer {
        public SmtCalculateSpaceAnswerer(Question question, IBatfish batfish) {
            super(question, batfish);
        }

        @Override
        public AnswerElement answer(NetworkSnapshot snapshot) {
            SmtCalculateSpaceQuestionPlugin.SmtCalculateSpaceQuestionQuestion q = (SmtCalculateSpaceQuestionPlugin.SmtCalculateSpaceQuestionQuestion) _question;
            CalculateSpaceExperiment p = new CalculateSpaceExperiment();
            p.run(q.getConfigPath());
            return new StringAnswerElement("calculate optimization successfully");
        }
    }

    public static class SmtCalculateSpaceQuestionQuestion extends HeaderLocationQuestion {

        private static final String DEFAULT_CONFIG_PATH  = "";

        private String _configPath;

        public SmtCalculateSpaceQuestionQuestion() {
            super();
            _configPath= DEFAULT_CONFIG_PATH;
        }

        public String getConfigPath() {
            return _configPath;
        }

        public void setConfigPath(String _configPath) {
            this._configPath = _configPath;
        }

        public String getName() {
            return "smt-calculate-space";
        }
    }
}
