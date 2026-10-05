package learning_array.Babbar_Bhiya.questions;

public class arr_average {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average); //output==> Sum = 150 ,Average = 30.0
    }
    
}
