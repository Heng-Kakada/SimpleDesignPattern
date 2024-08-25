package creational.abstract_factory.type;

import creational.abstract_factory.car.Car;
import creational.abstract_factory.car.LCarOne;
import creational.abstract_factory.car.LCarTwo;

public class LuxuryCar extends FactoryProvider {
    @Override
    public Car getInstance(int price) {
        if (price <= 10000){
            return new LCarOne();
        }else if(price < 20000){
            return new LCarTwo();
        }
        return null;
    }
}
