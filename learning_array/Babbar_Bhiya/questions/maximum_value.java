package learning_array.Babbar_Bhiya.questions;

public class maximum_value {
    public static void main(String[] args) {
        int arr[]={1,2,-3,45,6};
        int n = arr.length;
        int MaxValue = arr[0];

        //compare the maxValue to array each element
        for (int i = 0; i <=n-1; i++) {
            if(arr[i]>MaxValue);

            //update MaxValue
            MaxValue = arr[i];                  
        }
        System.out.println(MaxValue);
    }
    
}
