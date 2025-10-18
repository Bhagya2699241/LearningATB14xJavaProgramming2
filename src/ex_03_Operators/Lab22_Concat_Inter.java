package ex_03_Operators;

public class Lab22_Concat_Inter {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println(a+b);
        /*+ - behaves differently with diff data type
        operator overloading*/
        String s1="Bhagya";
        String s2="Enneti";
        System.out.println(s1+s2+a+b);
//        string
        System.out.println(a+b+s1+s2);
//        Addition + String
        System.out.println(a+b+(s1+s2));
        //        BODMAS Rule so String + Addition > Bracket of Div, Mul, Add, Sub

       /* System.out.println(s1 - s2);
        System.out.println(s1 * s2);
        System.out.println(s1 / s2);*/
    }
}
