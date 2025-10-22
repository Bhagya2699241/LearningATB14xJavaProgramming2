package ex_08_Switch;

public class Lab57_Interview {
    public static void main(String[] args) {
        char ch = 'e';
        switch (ch) {
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No");

        }
        int a = 15;
        switch (a) {
            case 15:
                System.out.println("15");
                break; //Duplicate NA
            default:
                System.out.println("150");
        }
    }
}
