package org.batfish.minesweeper.prune.question;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.auto.service.AutoService;
import org.batfish.common.Answerer;
import org.batfish.common.BatfishException;
import org.batfish.common.NetworkSnapshot;
import org.batfish.common.bdd.BDDPacket;
import org.batfish.common.plugin.IBatfish;
import org.batfish.common.plugin.Plugin;
import org.batfish.datamodel.answers.AnswerElement;
import org.batfish.datamodel.questions.Question;
import org.batfish.minesweeper.question.HeaderLocationQuestion;
import org.batfish.minesweeper.smt.PropertyChecker;
import org.batfish.question.QuestionPlugin;

@AutoService(Plugin.class)
public class SmtNumPathsQuestionPlugin extends QuestionPlugin {

  public static class NumPathsAnswerer extends Answerer {

    public NumPathsAnswerer(Question question, IBatfish batfish) {
      super(question, batfish);
    }

    @Override
    public AnswerElement answer(NetworkSnapshot snapshot) {
      NumPathsQuestion q = (NumPathsQuestion) _question;
      if (q.getNumPaths() == null) {
        throw new BatfishException("Missing parameter length NumPaths: (e.g., NumPaths=3)");
      }
      PropertyChecker p = new PropertyChecker(new BDDPacket(), _batfish);
      return p.checkLoadBalancingSimple(snapshot, q, 2);
    }
  }

  public static class NumPathsQuestion extends HeaderLocationQuestion {

    private static final String LENGTH_VAR = "NumPaths";

    private Integer _NumPaths;

    public NumPathsQuestion() {
      _NumPaths = null;
    }

    @JsonProperty(LENGTH_VAR)
    public Integer getNumPaths() {
      return _NumPaths;
    }

    @JsonProperty(LENGTH_VAR)
    public void setNumPaths(int i) {
      _NumPaths = i;
    }

    @Override
    public boolean getDataPlane() {
      return false;
    }

    @Override
    public String getName() {
      return "smt-num-paths";
    }
  }

  @Override
  protected Answerer createAnswerer(Question question, IBatfish batfish) {
    return new NumPathsAnswerer(question, batfish);
  }

  @Override
  protected Question createQuestion() {
    return new NumPathsQuestion();
  }
}
