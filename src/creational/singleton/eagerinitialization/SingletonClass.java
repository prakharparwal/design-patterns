package creational.singleton.eagerinitialization;

public class SingletonClass {

    private static final SingletonClass instance = new SingletonClass();

    public SingletonClass(){

    }

    public static SingletonClass getInstance() {
        return instance;
    }
}
