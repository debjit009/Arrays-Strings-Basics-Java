package learning_strings.questions;

public class question_05 {
    public static void main(String[] args) {

        // Check String is Palindrome or Not==>

        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome"); //output==> Palindrome
        }
    }
    
}
