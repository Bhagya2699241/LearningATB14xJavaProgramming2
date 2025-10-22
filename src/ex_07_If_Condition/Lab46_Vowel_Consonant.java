package ex_07_If_Condition;

public class Lab46_Vowel_Consonant {
    public static void main(String[] args) {
        int ch = 'a';
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'U' || ch == 'u') {
            System.out.println(ch + " is Vowel");

        } else {
            System.out.println(ch + "is consonant");
        }
    }
}
