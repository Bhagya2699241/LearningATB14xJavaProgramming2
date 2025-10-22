package ex_09_ForLoop;

public class Lab70_Even_Odd_If_Loop {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even ->" + i);// o/p = Even -> 2 to 8
            }else {
                System.out.println("Odd -> " + i);
            }


            /*for (int j = 1; j < 10; j++) {
                if (j % 2 != 0) {
                    System.out.println("Odd ->" + j);
                }*/
            }
        }
    }
