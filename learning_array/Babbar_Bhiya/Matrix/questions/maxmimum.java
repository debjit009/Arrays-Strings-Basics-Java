package learning_array.Babbar_Bhiya.Matrix.questions;

public class maxmimum {
    public static void main(String[] args) {
     int arr[][]= {{12,13,14,},{15,16,17}};
     int maxvalue = arr[0][0];

      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(arr[i][j]>maxvalue){

                //update maxvalue
                maxvalue = arr[i][j];

            }
        }

      }
      System.out.println(maxvalue);


    }
    
}
