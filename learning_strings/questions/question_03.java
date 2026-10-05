package learning_strings.questions;

public class question_03 {
    public static void main(String[] args) {

        // Count vowels in a String==>
           String str = "Java Programming";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                count++;
            }
        }

        System.out.println("Vowels = " + count);//output==> Vowels = 5
            

    }
}
