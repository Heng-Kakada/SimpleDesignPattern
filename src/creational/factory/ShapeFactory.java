package creational.factory;

public class ShapeFactory {

    public Shape getInstance(Class<? extends Shape> shape){
        if(shape.getSimpleName().equals("Circle")){
            return new Circle();
        }
        else if (shape.getSimpleName().equals("Square")){
            return new Square();
        }
        return null;
    }



}
