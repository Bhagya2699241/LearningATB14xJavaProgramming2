package ex_09_ForLoop;

public class Lab73_Loop_Continue_Even_Odd {
    public static void main(String[] args) {
        for (int i=1;i<10;i++){
            if(i%2==0){
                continue;// even nos will be skipped and odd runs will be success
            }
            System.out.println("Odd number is " +i);
        }
        for (int i=1;i<10;i++){
            if(i%2!=0) {
                continue;
            }
                System.out.println("Even number is "+i);// odd nos will be skipped and odd runs will be success
        }
    }
}

