package ex_03_Operators;

public class Lab26_OR_AND_Gates {
    public static void main(String[] args) {
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(true && true);
        System.out.println(true && false);
        //OR & AND Gates - Electronics
        int sal =10000;
        boolean salb=!(sal>1000 || sal<5000);
        /*        Sal > 1000 - T
        Sal < 5000 - F
                T || F = T
                        !T = F*/
        System.out.println(salb);
    }
}
