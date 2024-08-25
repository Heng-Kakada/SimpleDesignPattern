package creational.abstract_factory;

import creational.abstract_factory.car.Car;
import creational.abstract_factory.type.EconomicCar;
import creational.abstract_factory.type.FactoryProvider;

public class ClientDemo {

    public static void main(String[] args) {
        FactoryManager manager = new FactoryManager();
        FactoryProvider provider = manager.factoryProvider(EconomicCar.class);
        Car car = provider.getInstance(1000);
        System.out.println(car.getTopSpeed());
    }


}
