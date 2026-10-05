package AnujBhiya.for_each_loop;

public class sum {
    public static void main(String[] args) {
        //use for each loop -->
        int numbers [] = {30,20,50,70};
        int sum = 0;
        for(int number:numbers){
            sum += number;
        }
        System.out.println("Sum is:"+sum);


        // using normal for loops --->
        int number [] = {40,50,60,70};
        int addition = 0;
        for (int i = 0; i < number.length; i++) {
              sum += numbers[i];

        }
        System.out.println("The addition is:"+sum);

    }
    
}
