package ex_04_Typecasting;

public class Lab34_TypeCasting_Used {
    public static void main(String[] args) {
        int val=100;
        float GST= 13.85f;
        int result = val+(int)GST;//Explicit Casting Narrowing
        System.out.println(result);

        float result1= val+GST;// Widening Casting Implicit
        System.out.println(result1);
    }
}
