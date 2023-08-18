package creational.singleton.staticblock;

public class SingletonClass {
    private static SingletonClass instance;

    private SingletonClass () {}

    static {
        try {
            instance = new SingletonClass();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static SingletonClass getInstance() {
        return instance;
    }
}
