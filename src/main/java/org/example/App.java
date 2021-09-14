/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int price1, quan1, price2, quan2, price3, quan3;
        System.out.print("Enter the price of item 1: ");
        price1 = in.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        quan1 = in.nextInt();
        System.out.print("Enter the price of item 2: ");
        price2 = in.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        quan2 = in.nextInt();
        System.out.print("Enter the price of item 3: ");
        price3 = in.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        quan3 = in.nextInt();

        float tax_conv = 0.055f;
        float subtotal = (price1*quan1) + (price2*quan2) + (price3*quan3);
        float tax_total = subtotal * tax_conv;
        float total_price = subtotal + tax_total;

        String sub = String.format("Subtotal: $%.2f", subtotal);
        System.out.println(sub);

        String tax = String.format("Tax: $%.2f", tax_total);
        System.out.println(tax);

        String total = String.format("Total: $%.2f", total_price);
        System.out.println(total);

        in.close();
    }
}