package MediatorPattern;

public class Button extends UIControl {
    private boolean isEnabled = false;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyChanges();
    }
}
