package ex_07_If_Condition;

import java.util.Scanner;

public class Lab50_Scanner {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Value");
        int age=scanner.nextInt();//Debug and provided int value, on giving string exception
        System.out.println(age);
        if(age>30){
            System.out.println(age + " is greater than 30 ");
        } else if (age>20 && age<30) {
            System.out.println(age + " is greater than 20 and less than 30 ");
        }else {
            System.out.println(age + " is less than 20 ");
        }
    }
}
