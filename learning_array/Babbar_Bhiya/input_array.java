package learning_array.Babbar_Bhiya;
import  java.util.Scanner;

public class input_array {
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int n = arr.length;

        //Input==>
        for (int i = 0; i<=n-1; i++) {
            System.out.println("Provide input for index:");
            arr[i] = sc.nextInt();
        }

        //print==>
           System.out.println("Your array contains:");
           for(int val:arr){
           System.out.println(val);
        } 

    }

    
}
