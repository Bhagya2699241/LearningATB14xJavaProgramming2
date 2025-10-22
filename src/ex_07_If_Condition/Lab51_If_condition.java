package ex_07_If_Condition;

import java.util.Scanner;

public class Lab51_If_condition {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter A value");
        int a = scanner.nextInt();
        if(a==15){
            System.out.println("Hello");
        }else {
            System.out.println("Bye!!!");
        }
    }
}
