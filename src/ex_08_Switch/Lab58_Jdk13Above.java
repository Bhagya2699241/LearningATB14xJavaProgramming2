package ex_08_Switch;

public class Lab58_Jdk13Above {
    public static void main(String[] args) {
        // int JDK > 13
        int itemcode=001;
        switch (itemcode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("No");
        }
    }
}
