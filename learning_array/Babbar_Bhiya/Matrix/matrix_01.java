package learning_array.Babbar_Bhiya.Matrix;

public class matrix_01 {
    public static void main(String[] args) {
        //It's an array of arrays.
        //Declaration==>
        int[][] matrix;
        //Initialization==>

        // int[][]matrix = new int[2][2]
        // or==>

        // int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int [][] arr;
        arr = new int[3][4];
        int [][] brr = {
                    {1,2,},
                    {4,5,},
                    {7,8,},
                    {10,12}
        };
        
        //print all the number:==>

          int rowLength = brr.length;
          int colLength = brr[0].length;
          for(int rowIndex=0;rowIndex<=rowLength-1;rowIndex++){
            for(int colIndex=0;colIndex<=colLength-1;colIndex++){
                System.out.println(brr[rowIndex][colIndex]+" ");
            }
          }  
        // System.out.println(brr[0][0]);
        // System.out.println(brr[1][1]);
        // System.out.println(brr[2][1]);
        


          
    }
    
}
