package learning_array.Babbar_Bhiya;

public class array_01 {
    public static void main(String[] args) {
        //declaration
        int arr[];
        //allocation
        arr = new int[5];
        //inti
        int brr[]={10,20,30,40};

        // length find out--->
        int n = brr.length;
        for(int index = 0;index<=n-1;index++){
            System.out.println(brr[index]);
        }

        // using for each loop ==>
            for(int val:brr){
                System.out.println(val);
            }

        // System.out.println("value at 0 index"+brr[0]); //10
        // System.out.println("value at 1 index"+brr[1]); //20
        // System.out.println("value at 2 index"+brr[2]); //30
        // System.out.println("value at 3 index"+brr[3]); //40

    }
    
}
