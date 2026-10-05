package learning_array.Babbar_Bhiya.Matrix;
import java.util.*;
public class matrix_02 {
    public static void main(String[] args) {
        int arr [][]= new int[3][4];
        Scanner sc = new Scanner(System.in);

        //input
        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                System.out.println("Provied value fro row:"+i+"and colum:" +j);
                arr[i][j]= sc.nextInt();
            }   

        }
        for(int rowIndex=0;rowIndex<=arr.length-1;rowIndex++){
            for(int colIndex=0;colIndex<=arr.length-1;colIndex++){
                System.out.println(arr[rowIndex][colIndex]+" ");
            }
            System.out.println();
        } 


    }
    
}
