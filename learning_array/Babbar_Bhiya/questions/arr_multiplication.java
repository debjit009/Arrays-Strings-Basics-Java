package learning_array.Babbar_Bhiya.questions;

public class arr_multiplication {
    public static void main(String[] args) {
        int arr [] = {12,20,45,30};
        int ans = 1;
        int n = arr.length;

        for(int i=0;i<=n-1;i++){
            int value = arr[i];
             ans = ans * value;
        }
        System.out.println("The value is:"+ans);
    }
    
}
