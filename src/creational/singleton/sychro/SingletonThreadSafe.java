package creational.singleton.sychro;

public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe(){}

    public synchronized static SingletonThreadSafe getInstance(){

        if(instance == null){
            instance = new SingletonThreadSafe();
        }

        return instance;
    }

}
