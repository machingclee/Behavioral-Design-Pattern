package CommandPattern.AbstractUndoableCommand;

import CommandPattern.ContrastHistory;
import CommandPattern.VideoEditor;

public class SetContrastCommand extends AbstractUndoableCommand {
  private VideoEditor videoEditor;
  public float prevContrast;
  private float newContrast;

  public SetContrastCommand(float newContrast, VideoEditor videoEditor, ContrastHistory history) {
    super(history);
    this.videoEditor = videoEditor;
    this.newContrast = newContrast;
  }

  @Override
  public void doExecute() {
    try {

      prevContrast = videoEditor.getContrast();
      videoEditor.setContrast(newContrast);

    } catch (Exception err) {

      System.out.println(err);

    }
  }

  @Override
  public void unexecute() {
    videoEditor.setContrast(prevContrast);
  }

}