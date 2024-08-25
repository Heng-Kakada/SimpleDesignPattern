package creational.factory;

public class ClientDemo {


    public static void main(String[] args) {

        Shape circle = new ShapeFactory().getInstance(Circle.class);
        circle.calculateArea();

        Shape square = new ShapeFactory().getInstance(Square.class);
        square.calculateArea();

    }



}
