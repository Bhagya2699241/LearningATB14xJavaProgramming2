package ex_07_If_Condition;

public class Lab49_If_Cond {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        System.out.println(age);
        if(age>25){
            System.out.println("You can go to Goa");
        }
        else{
            System.out.println("Not allowed");
        }
    }
}