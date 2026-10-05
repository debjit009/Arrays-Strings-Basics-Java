package AnujBhiya.String;

public class string_01 {
    public static void main(String[] args) {
    String name = "Debjit";
    String sameName = "Debjit";
    String newName = new String("Debjit");

    System.out.println(name);
    System.out.println(newName);

    if(name == sameName){
        System.out.println("Both are same");
        // this output print --> Both are same.

    }
    if(name == newName){
        System.out.println("Both are same");
    }else{
        System.out.println("Both are not same"); 
        // this output print both are not same--> cause == check the reference.
    
    }

    // Now using two methods

    if(name.equals(newName)){
        System.out.println("name and newName are same");
    }else{
        System.out.println("not same");
        //output is :--> same
        //if you change anything in name and newName (String value) 
        // then out put is:-not same. 
    }

    if(name.equalsIgnoreCase(newName)){
        System.out.println("name and newName are same");
    }else{
        System.out.println("not same");
        //this (equalsIgnoreCase) also avoid what 
        // you change inside the string value is as it is print that same.
    }

       
    }      
    
}
