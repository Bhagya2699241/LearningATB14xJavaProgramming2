package ex_09_ForLoop;

public class Lab71_Loop_Break {
    public static void main(String[] args) {
        for (int i=1;i<=50;i++){
            if(i==5) {// exits the loop once 5=5 as per if condition
                break;
            }
            System.out.println(i);// o/p = 0 1 2 3 4 5
        }
    }
}
