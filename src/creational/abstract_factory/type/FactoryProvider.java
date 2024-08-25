package creational.abstract_factory.type;

import creational.abstract_factory.car.Car;

public abstract class FactoryProvider {
    public abstract Car getInstance(int price);
}
