public class Locker {
    private String pin = "1234";
    private boolean locked = true;

    public boolean unlock(String input) {
        if (input.equals(pin)) {
            locked = false;
            return true;
        }
        return false;
    }

    public void lock() {
        locked = true;
    }

    public boolean isLocked() {
        return locked;
    }
}
