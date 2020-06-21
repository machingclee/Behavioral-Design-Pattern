package MediatorPattern;

public class DialogBox {
  private Button button;
  private TextBox userNameTextBox;
  private TextBox passwordTextBox;
  private CheckBox checkBox;

  public DialogBox(Button button, TextBox userNameTextBox, TextBox passwordTextBox, CheckBox checkBox) {
    this.button = button;
    this.userNameTextBox = userNameTextBox;
    this.passwordTextBox = passwordTextBox;
    this.checkBox = checkBox;

    this.userNameTextBox.addObserver(() -> checkCanSubmit());
    this.passwordTextBox.addObserver(() -> checkCanSubmit());
    this.checkBox.addObserver(() -> checkCanSubmit());
  }

  public void simulation() {
    userNameTextBox.setContent("123");
    passwordTextBox.setContent("321");
    checkBox.setChecked(true);

    System.out.println(button.isEnabled());
  }

  private void checkCanSubmit() {
    String username = userNameTextBox.getContent();
    String password = passwordTextBox.getContent();

    boolean usernameIsEmpty = (username == null || username.isEmpty());
    boolean passwordIsEmpty = (password == null || password.isEmpty());
    boolean isChecked = checkBox.isChecked();

    if (!usernameIsEmpty && !passwordIsEmpty && isChecked)
      button.setEnabled(true);
    else
      button.setEnabled(false);

  }

}
