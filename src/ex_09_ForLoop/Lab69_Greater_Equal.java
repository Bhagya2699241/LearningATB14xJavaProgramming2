package ex_09_ForLoop;

public class Lab69_Greater_Equal {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {// o/p = 0 to 10 as <= so 10=10 run will be considered
            System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i); // o/p = 0 to 9 no 10 bcoz 10 < 10 condition fail
        }
    }
}
