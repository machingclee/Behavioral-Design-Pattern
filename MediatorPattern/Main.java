package MediatorPattern;

public class Main {
  public static void main(String[] args) {
    Button button = new Button();
    TextBox userNameTextBox = new TextBox();
    TextBox passwordTextBox = new TextBox();
    CheckBox checkBox = new CheckBox();

    DialogBox dialogBox = new DialogBox(button, userNameTextBox, passwordTextBox, checkBox);

    dialogBox.simulation();

  }
}