package creational.singleton.sychro;

public class ClientDemo {
    public static void main(String[] args) {
        SingletonThreadSafe instance1 = SingletonThreadSafe.getInstance();

        System.out.println(instance1);

        SingletonThreadSafe instance2 = SingletonThreadSafe.getInstance();

        System.out.println(instance2);
    }
}
