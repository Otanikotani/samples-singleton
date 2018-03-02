package sample;

public class ThreadSafe {

    private static DoubleCheckLocking instance;

    private ThreadSafe() {
    }

    public static synchronized DoubleCheckLocking getInstance() {
        if (instance == null) {
            instance = new DoubleCheckLocking();
        }
        return instance;
    }

}