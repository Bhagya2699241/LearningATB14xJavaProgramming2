package ex_06_Increment_Decrement_Operator;

public class Lab41_PreInc_PostInc {
    public static void main(String[] args) {
        int a=30;
        int b= ++a;
        System.out.println(a);
        System.out.println(b);
        /*      ++a - PreIncrement = Add 1 and then Print > a = a + 1*/
        int c=50;
        int d = c++;
        System.out.println(c);
        System.out.println(d);
        int e= c+d;
        System.out.println(e);

        /*      c++ - PostIncrement = Print and then Add 1 > c = c + 1*/
    }
}
