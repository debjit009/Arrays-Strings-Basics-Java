package learning_array.Babbar_Bhiya.questions;

public class minimum_value {
    public static void main(String[] args) {
        int arr[]={12,23,9,45,35};
        int n = arr.length;
        int MinValue = arr[0];

        for (int i = 0; i <=n-1; i++) {
            if(arr[i]<MinValue){
                MinValue = arr[i];

            }
            System.out.println(MinValue);
        }
    }
}
