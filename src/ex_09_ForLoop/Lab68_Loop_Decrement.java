package ex_09_ForLoop;

public class Lab68_Loop_Decrement {
    public static void main(String[] args) {
        for( int i=-1;i<-10;i--){// no o/p since condition fail -1 > -10
            System.out.println(i);
        }
        int i=5;
        for (;i>0;i--){
            System.out.println(i);
        }
    }
}
