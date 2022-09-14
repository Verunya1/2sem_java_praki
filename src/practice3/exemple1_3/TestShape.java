package practice3.exemple1_3;

import practice3.exemple1_3.Shape;
import practice3.exemple1_3.Square;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED",false,5.5 ); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //тк у нас создан объект типа Shape,
                                            //а у него нет метода getRadius и мы не делаем переопределения, то возникает ошибка
        Circle c1 = (Circle)s1; // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

         //Shape s2 = new Shape(); он абстрактный не может быть создан экземляр

        Shape s3 = new Rectangle("RED",false,1.0, 2.0 ); // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //- сужение типа -> у класса Shape нет методов получения длины

        Rectangle r1 = (Rectangle)s3; // downcast  - сужение типа
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); - у Класса Shape нет метода получаения размера
        // Take note that we downcast Shape s4 to Rectangle,
// which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4; //-> сужение типа
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
       // System.out.println(r2.getSide());
        System.out.println(r2.getLength());
// Downcast Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        //System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

}
