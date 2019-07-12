package com.company;

public class main {
    public static void main(String[] args) {
        com.company.Point point = new Point(3, 4);
        MoveablePoint moveablePoint = new MoveablePoint(2, 3, 4, 5);

        System.out.println(point.toString());
        System.out.println(moveablePoint.move());

    }
}
