package creational.abstract_factory;

import creational.abstract_factory.type.EconomicCar;
import creational.abstract_factory.type.FactoryProvider;
import creational.abstract_factory.type.LuxuryCar;

public class FactoryManager {


    public FactoryProvider factoryProvider(Class<?> className){
        if (className.getSimpleName().equals("EconomicCar")){
            return new EconomicCar();
        }else if(className.getSimpleName().equals("LuxuryCar")){
            return new LuxuryCar();
        }
        return null;
    }



}
