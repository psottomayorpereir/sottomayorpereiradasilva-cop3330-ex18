package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String choice="";
        int temp=0;

        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.\nYour choice: ");
        choice=sc.nextLine();
        choice = choice.toUpperCase();

        if(choice.equals('F')){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp=sc.nextInt();
            temp=(temp-32)*5/9;
            System.out.printf("The temperature in Celsius is: %d", temp);
        }
        else {
            System.out.print("Please enter the temperature in Celsius: ");
            temp = sc.nextInt();
            temp = (temp * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is: %d", temp);
        }

    }
}