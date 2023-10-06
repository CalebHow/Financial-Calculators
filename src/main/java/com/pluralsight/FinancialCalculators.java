package com.pluralsight;

import java.util.Scanner;

public class FinancialCalculators {
    public static void main(String[] args) {
        Mortgage_Calculator();
    }
public static void Mortgage_Calculator (){
        Scanner input = new Scanner(System.in);
        System.out.println("How much was the Principle on your loan?");
        double Principle = input.nextDouble();
        System.out.println("What percent is the current interest rate on your loan?");
        double InterestRate = input.nextDouble();
        System.out.println("How long is your loan length in years?");
        int LoanLength = input.nextInt();

      double Total =  Principle * InterestRate / (1 - Math.pow((1 + InterestRate), (-1 * (LoanLength * 12))));
    System.out.println("Your loan total is " + Total);

    double InterestPaid = Total - Principle;
   System.out.println("Your remaining balance on your loan is " + InterestPaid);
    }
}

