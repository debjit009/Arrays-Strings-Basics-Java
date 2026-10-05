package learning_array.Babbar_Bhiya.Matrix.questions;

public class multiply {
    public static void main(String[] args) {
        int arr[][]= {{12,13,14,},{15,16,17}};
        int sum = 0;
        int ans = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                ans = ans * value;
            }
            System.out.println();
        }


    }
    
}
