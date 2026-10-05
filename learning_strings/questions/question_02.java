package learning_strings.questions;

public class question_02 {
 public static void main(String[] args) {
    
     // Count length without length()==>

        String str = "Java";
        int count = 0;

        for (char ch : str.toCharArray()) {
            count++;
        }

        System.out.println("Length = " + count); //output==> Length = 4

    }
}
