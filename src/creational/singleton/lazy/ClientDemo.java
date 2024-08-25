package creational.singleton.lazy;

public class ClientDemo {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance("First Singleton");
        Singleton anotherSingleton = Singleton.getInstance("Second Singleton");

        System.out.println(singleton.getValue());
        System.out.println(anotherSingleton.getValue());


    }
}
