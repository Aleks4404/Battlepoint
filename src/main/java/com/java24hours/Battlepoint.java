package com.java24hours;

import java.awt.*;
import java.util.*;

public class Battlepoint {
    ArrayList<Point> targets = new ArrayList<Point>();

    public Battlepoint() {
        //TODO create targets to shoot at
        createTargets();
        //TODO display the game map
        showMap();
        //TODO shoot at three points
        shoot(7,4);
        shoot(3,3);
        shoot(9,2);
        //TODO display the map again
        showMap();
    }

    private void showMap() {
        System.out.println("\n   1  2  3  4  5  6  7  8  9");
        for (int column = 1; column < 10; column++) {
            for (int row = 1; row < 10; row++) {
                if (row == 1) {
                    System.out.print(column + " ");
                }
                System.out.print(" ");
                Point cell = new Point(row, column);
                if (targets.indexOf(cell) > -1) {
                    //TODO a target is at this position
                    System.out.print("X");
                } else {
                    //TODO no target is here
                    System.out.print(".");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private void createTargets() {
        Point p1 = new Point(5,9);
        targets.add(p1);
        Point p2 = new Point(4,5);
        targets.add(p2);
        Point p3 = new Point(9,2);
        targets.add(p3);
        Point p3 = new Point(9,2);
        targets.add(p3);
    }

    private void shoot(int x, int y) {
        Point shot = new Point(x,y);
        System.out.print("Firing at (" + x + "," + y + ") ... ");
        if (targets.indexOf(shot) > -1) {
            System.out.println("you sank my battlepoint!");
            //TODO delete the destroyed target
            targets.remove(shot);
        } else {
            System.out.println("miss.");
        }
    }

    public static void main(String[] arguments) {
        new Battlepoint();
    }
}