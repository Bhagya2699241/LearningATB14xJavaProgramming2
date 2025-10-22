package ex_10_While_Loop;

public class Lab78_Interview {
    public static void main(String[] args) {
        int i=0;
        while (i>0){// Condition fail so no o/p
            System.out.println("Enter");// exit code 0
            System.out.println(i);
            i++;
        }
        while (i<0){
            System.out.println(i);// exit code 0
            i++;
        }
    }
}
