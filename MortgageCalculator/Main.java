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

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Anual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / ((Math.pow(1 + monthlyInterest, numberOfPayments)) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
