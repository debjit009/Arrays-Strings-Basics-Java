package AnujBhiya.for_each_loop;

public class name {
    public static void main(String[] args) {
        
        //Normal for loop -->
        String names [] = {"Arka","Suraj","Deep","Debjit"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name is:"+names[i]);
        }
         
        // use for-each-loop --->
        for(String name:names){
            System.out.println("for each:"+name);
        }
    }
    
}
