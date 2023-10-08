package com.workintech.main;

import com.workintech.model.Point;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0, 0);

        System.out.println("distance()= " + point.distance());

        Point point1 = new Point(4,5);
        Point p2 = null;
        String name = null;
        System.out.println("Distance: " + point1.distance(p2));

        System.out.println(Point.distanceCount);
    }
}