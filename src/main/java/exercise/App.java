package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String firstString = input.next();
        double orderAmount = Double.parseDouble(firstString);

        System.out.print("What state do you live in? ");
        String state = input.next();
        double salesTax;

        if( state.equals("Wisconsin") ){
            System.out.print("What county do you in? ");
            String county = input.next();
            salesTax = 0.05;

            if( county.equals("Eau Claire") ){
                double countyTax = salesTax + 0.005;
                double tax = orderAmount * countyTax;
                String.format("%.2g%n",tax);
                double total = orderAmount + tax;

                System.out.println("The tax is $" + String.format("%.2f", tax) + "\n" + "The total is $" + String.format("%.2f", total));

            }
            else if( county.equals("Dunn") ){
                double countyTax = salesTax + 0.004;
                double tax = orderAmount * countyTax;
                String.format("%.2g%n",tax);
                double total = orderAmount + tax;

                System.out.println("The tax is $" + String.format("%.2f", tax) + "\n" + "The total is $" + String.format("%.2f", total));

            }
        }
        else if( state.equals("Illinois") ){
           salesTax = 0.08;
           double tax = orderAmount * salesTax;
           String.format("%.2g%n",tax);
           double total = orderAmount + tax;
           System.out.println("The tax is $" +  String.format("%.2f", tax) + "\n" + "The total is $" + String.format("%.2f", total));

        }
        else{
            System.out.println("The tax is $0.00"  + "\n" + "The total is $" + String.format("%.2g%n",orderAmount));

        }
    }
}
