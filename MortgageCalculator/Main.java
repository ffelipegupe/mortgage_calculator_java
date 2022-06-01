package Java.mortgage_calculator_java.MortgageCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        /* Scanner p = new Scanner(System.in);
        System.out.print("Principal: ");
        int pr = p.nextInt();
        Scanner a = new Scanner(System.in);
        System.out.print("Anual Interest Rate: ");
        double r = ((a.nextDouble()) / 100) /12;
        Scanner y = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int n = (y.nextInt()) * 12;
        System.out.print("Mortgage: ");

        double m = pr * (r * (Math.pow(1 + r, n)));
        double dd = (Math.pow(1 + r, n)) - 1;
        //System.out.println(m);
        System.out.println(m/dd); */

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        
        while (true) {
            System.out.print("Anual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        
        while (true) {
            System.out.print("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;
            }
        }
        
        

        double mortgage = principal 
                        * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
                        / ((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
