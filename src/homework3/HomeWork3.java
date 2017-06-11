/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework3;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sergey
 */
public class HomeWork3 {

     public static void drawStars() throws InterruptedException {
        // Cool ending of task with running asterisks
        char charDraw = '*';
        for (int i = 0; i < 40; i++) {
         System.out.print(charDraw);
         Thread.sleep(250);
        
        }
        System.out.println(charDraw);
        };
     
       
    public static void main(String[] args) throws InterruptedException {
        int firstValue = 0;
        int secondValue = 0;
        double tempValue1 = 0;
        double tempValue2 = 0;
        double tempValue3 = 0;
        double tempValue4 = 0;
        int result1 = 0;
        int result2 = 0;
        double percentValue = 0;
        double accountValue = 0;
        double bankMonthly1 = 0;
        int a = 0;
        int temp1 = 0;
        int temp2 = 0;        
        int temp3 = 0;        
        int temp4 = 0;
        int temp5 = 0;
        
        Scanner in = new Scanner(System.in); 
        System.out.println("Task 1");
        System.out.println("Move middle digits in two three-digits numbers");
        System.out.println("Please input three digits of first value");  
        firstValue = in.nextInt();  
        System.out.println("Please input three digits of second value");  
        secondValue = in.nextInt();  
        tempValue1 = ((firstValue / 100) * 100) + ((secondValue % 100 / 10 )*10) + (firstValue % 10);
        System.out.println(tempValue1);  
        tempValue2 = ((secondValue / 100) * 100) + ((firstValue % 100 / 10 )*10) + (secondValue % 10);
        System.out.println(tempValue2);  
        drawStars();
        
        System.out.println("Task 2");
        System.out.println("Count summ and substract of different digits");
        System.out.println("Please input four digits");  
        firstValue = in.nextInt();  
        result1 = (firstValue / 1000) + (firstValue / 10 % 10);
        result2 = (firstValue / 100 % 10) - (firstValue % 10);
        System.out.println("Sum of first and third digits are " + result1);
        System.out.println("Difference of second and fourth digits are " + result2);
        drawStars();
        
        System.out.println("Task 3 ");
        System.out.println("Extract middle digit from three-digits number");
        System.out.println("Please input three digits");  
        firstValue = in.nextInt();  
        result1 = ((firstValue / 100) * 10) + (firstValue % 10);
        System.out.println(result1);  
        drawStars();
        
        System.out.println("Task 4");
        System.out.println("Let's count amount of percents, which bank should pay monthly");
        System.out.println("Please input amount on account");  
        accountValue = in.nextDouble();  
        System.out.println("Please input percent rate");  
        percentValue = in.nextDouble();  
        bankMonthly1 = (accountValue * percentValue * 30.5) / (365 * 100);
        System.out.println("Monthly percents amount is " + bankMonthly1);  
        drawStars();
                       
        System.out.println("Task 5");
        System.out.println("How many items could buy for specified amount, and how many change is remain");
        System.out.println("Please input amount of available money");  
        accountValue = in.nextDouble();  
        System.out.println("Please input cost of one item");  
        tempValue1 = in.nextDouble();  
        tempValue2 = (accountValue / tempValue1);
        System.out.println("You can buy " + (int)tempValue2 + " items");  
        tempValue3 = (accountValue -  (tempValue2 * tempValue1));
        System.out.println("You have remain " + tempValue3);  
        drawStars();
        
        System.out.println("Task 6");
        System.out.println("Pound to kilograms converter");
        final double pound = 0.45359237;   //lb.av
        double pounds_in_kilo = 0;
        System.out.println("Please enter weight in kilograms");
        pounds_in_kilo = in.nextDouble(); 
        tempValue1 = pounds_in_kilo / pound;
        System.out.println(pounds_in_kilo + " kilograms contains " + (float)tempValue1 + " pounds");
        drawStars();
        
        double tempValue5 = 0;
        System.out.println("Task 7");
        System.out.println("Let's count, how much paint we need to paint a room");
        System.out.println("Please input height of room");  
        tempValue1 = in.nextDouble();  
        System.out.println("Please input length of room");  
        tempValue2 = in.nextDouble();  
        System.out.println("Please input width of room");  
        tempValue3 = in.nextDouble();  
        tempValue4 = (2 * (tempValue2 * tempValue3) + (tempValue2 * tempValue1) + (tempValue1 * tempValue3));
        System.out.println("Total square of room is " + tempValue4 + " square meters");
        System.out.println("Total square of room, which should be painted is " + ((tempValue4 - (tempValue4 /100) * 20)) + " square meters");
        tempValue5 = (tempValue4 - (tempValue4 /100) * 20) * 0.5;
        System.out.println("We need " + tempValue5 + " liters of paint to paint " + ((tempValue4 - (tempValue4 /100) * 20)) + " square meters of room");
        drawStars();
        
         
        System.out.println("Task 8");        
        System.out.println("Reverce 3-digits number");
        System.out.println("Please enter number");
        a = in.nextInt();  
        temp1 = a / 100; // Сотни первого числа
        temp2 = a % 100 / 10; // Десятки первого числа
        temp3 = a % 10; //Единицы первого числа
        System.out.println((temp3 * 100) + (temp2 * 10) + temp1);
        drawStars();
        
        
        System.out.println("Task 9");
        System.out.println("Shift number to 2 digits to the right ");
        System.out.println("Please enter 5-digit number");
        a = in.nextInt();  
        temp1 = a / 10000; // Десятки тысяч числа
        //System.out.println(temp1);
        temp2 = a % 10000 / 1000; //Тысячи числа
        //System.out.println(temp2);
        temp3 = a % 1000 /100; //Сотни числа
        //System.out.println(temp3);
        temp4 = a % 100 / 10; // Десятки  числа
        //System.out.println(temp4);
        temp5 = a % 10; //Единицы  числа
        //System.out.println(temp5);
        result1 = ((temp4 * 10000) + (temp5 * 1000) + (temp1 * 100) + (temp2 *10) + temp3);
        System.out.println(result1);
        drawStars();
        
        System.out.println("Task 10");
        System.out.println("Shift number to 2 digits to the left");
        System.out.println("Please enter 5-digit number");
        a = in.nextInt();  
        temp1 = a / 10000; // Десятки тысяч числа
        //System.out.println(temp1);
        temp2 = a % 10000 / 1000; //Тысячи числа
        //System.out.println(temp2);
        temp3 = a % 1000 /100; //Сотни числа
        //System.out.println(temp3);
        temp4 = a % 100 / 10; // Десятки  числа
        //System.out.println(temp4);
        temp5 = a % 10; //Единицы  числа
        //System.out.println(temp5);
        result1 = ((temp3 * 10000) + (temp4 * 1000) + (temp5 * 100) + (temp1 *10) + temp2);
        System.out.println(result1);
        drawStars();
    }
    
}
