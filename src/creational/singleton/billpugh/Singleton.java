package creational.singleton.billpugh;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    private static class SingletonHelper {
        public static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
