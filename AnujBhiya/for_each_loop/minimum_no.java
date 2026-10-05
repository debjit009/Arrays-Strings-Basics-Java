package AnujBhiya.for_each_loop;

public class minimum_no {
    public static void main(String[] args) {
        int numbers[]={12,35,74,64,2,55};
        int min = Integer.MAX_VALUE;

        for(int number:numbers){
            if(number < min){
                min = number;
            }
        }
        System.out.println("The minimum no is:"+min);
    }
    
}
