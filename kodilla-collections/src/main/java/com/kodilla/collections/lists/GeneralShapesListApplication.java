package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List <Shape> shapes = new LinkedList<>();

        Square square = new Square(7);
        shapes.add(square);
        shapes.add(new Circle(10));
        shapes.add(new Triangle(3,4,5));



        shapes.remove(new Triangle(3,4,5));
        shapes.remove(1);
     //   shapes.remove(square);

        for (Shape shape : shapes) {
            System.out.println(shape + ", Area = " + shape.getArea() +", Perimeter = " + shape.getPerimeter());

        }
    }
}
