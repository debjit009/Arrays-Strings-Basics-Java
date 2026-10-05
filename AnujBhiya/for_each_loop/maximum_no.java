package AnujBhiya.for_each_loop;

public class maximum_no {
    public static void main(String[] args) {
        int numbers[]={12,35,74,64,2,55};
        int max = Integer.MIN_VALUE;

        for(int number:numbers){
            if(number > max){
                max = number;
            }
        }
        System.out.println("The maximum no is:"+max);
    }
    
}
