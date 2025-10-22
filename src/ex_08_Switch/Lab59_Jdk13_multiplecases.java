package ex_08_Switch;

public class Lab59_Jdk13_multiplecases {
    public static void main(String[] args) {
        int itemcode=220;
        switch (itemcode){
            case 001,002,003:
                System.out.println("ALL");
                break;
            case 004,005,221,220:
                System.out.println("One");
                break;
            default:
                System.out.println("No");
        }
    }
}
