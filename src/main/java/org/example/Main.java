package org.example;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();

        System.out.println(calc.sum(0,8));
        System.out.println(calc.sum(11993,-993));
        System.out.println(calc.sum(23,84));

        System.out.println(calc.mult(0,8));
        System.out.println(calc.mult(-4,18));
        System.out.println(calc.mult(33,3));

        System.out.println(calc.pow(0,8));
        System.out.println(calc.pow(8,0));
        System.out.println(calc.pow(2,10));
    }
}
