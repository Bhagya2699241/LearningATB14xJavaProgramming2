package ex_11_Do_While;

import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Lab85_JuiceOrder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String choice;
        do {
            System.out.println("Choose your juice: Apple, Orange, Mango");
            choice = sc.nextLine();
        }while (!choice.equals("Apple") && !choice.equals("Orange") && !choice.equals("Mango"));
        System.out.println("your choice is " + choice);
    }
}
