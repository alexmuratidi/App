package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       transport t1 = new transport();
       transport t2 = new transport(20);
       car c1 = new car();
       car c2 = new car(30);
        System.out.println(t1.getvel());
        System.out.println(t2.getvel());
        System.out.println(c1.getvel());
        System.out.println(c2.getvel());
        car c3 = new car(c2);
        System.out.println(transport.name);
    }
}