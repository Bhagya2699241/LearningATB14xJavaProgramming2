package ex_08_Switch;

import java.util.Scanner;

public class Lab56_RealSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Browser");
        String browser = scanner.nextLine();// ✅ Read browser input\
        switch (browser.toLowerCase()){// ✅ Convert to lowercase to handle case variations
            case "chrome":
                System.out.println("start Chrome");
                break;
            case "firefox":
                System.out.println("start Firefox");
                break;
            case "edge":
                System.out.println("start edge");
                break;
            default:
                System.out.println("No");
        }
        scanner.close();//Always close the scanner
    }
}
