package creational.abstract_factory.type;

import creational.abstract_factory.car.Car;
import creational.abstract_factory.car.ECarOne;
import creational.abstract_factory.car.ECarTwo;

public class EconomicCar extends FactoryProvider {
    @Override
    public Car getInstance(int price) {
        if (price <= 1000){
            return new ECarOne();
        }else if(price <= 2000){
            return new ECarTwo();
        }
        return null;
    }
}
