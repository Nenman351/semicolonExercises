package com.chiefSession;

import java.util.Scanner;

public class TaxWimp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <=3; i++){
            System.out.println("enter citizen's name: ");
            String citizenName = input.next();
            System.out.println("enter citizen's earnings:");
            int earning = input.nextInt();
            double tax = calculateTax(earning);
            tax += calculateExcessTax(earning);

            System.out.print("Citizen's name is "+citizenName);
            System.out.print(" and earnings is " +earning);
            System.out.println(" tax is " +tax);

        }
    }

    public static double calculateTax(int salary){
        double tax = salary * 0.15;
        if (salary > 30000){
            tax = 30000 * 0.15;
        }
        return tax;
    }

    public  static double calculateExcessTax(int salary){
        double excessTax = salary - 30000;
        double tax = 0;
        if (excessTax >0){
            tax = excessTax * 0.2;
        }
        return tax;
    }
}
