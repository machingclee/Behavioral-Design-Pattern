package CommandPattern;

import CommandPattern.AbstractUndoableCommand.SetContrastCommand;

public class Main {
  public static void main(String[] args) {
    var videoEditor = new VideoEditor();
    var history = new ContrastHistory();

    (new SetContrastCommand(123, videoEditor, history)).execute();
    (new SetContrastCommand(321, videoEditor, history)).execute();
    (new SetContrastCommand(1234567, videoEditor, history)).execute();
    (new SetContrastCommand(234, videoEditor, history)).execute();
    (new SetContrastCommand(432, videoEditor, history)).execute();
    (new SetContrastCommand(45678910, videoEditor, history)).execute();

    var undoCommand = new UndoCommand(history);

    undoCommand.undo();
    System.out.println(videoEditor.toString());
    undoCommand.undo();
    System.out.println(videoEditor.toString());
    undoCommand.undo();
    System.out.println(videoEditor.toString());
    undoCommand.undo();
    System.out.println(videoEditor.toString());
    undoCommand.undo();
    System.out.println(videoEditor.toString());
    undoCommand.undo();
    System.out.println(videoEditor.toString());

  }
}