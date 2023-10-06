package com.pluralsight;
import java.util.Scanner;
public class Calc2 {
    public static void main(String[] args) {
        Calculator2();
    }
    private static void Calculator2() {
    Scanner input = new Scanner(System.in);
    System.out.println("How much would you like to deposit?: " );
    double deposit;
        deposit = deposit = input.nextDouble();
        System.out.println(deposit);

    System.out.println("What is your interest?: ");
    double interest = input.nextDouble();
    System.out.println(interest);

    System.out.println("How many years?: ");
    double years = input.nextDouble();
    System.out.println(years);

    interest /= 12;
    double total = deposit * Math.pow(interest , years);


    }
}
