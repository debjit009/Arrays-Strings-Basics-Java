package learning_strings;

import java.util.Scanner;
public class string_basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking String input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // Printing String
        System.out.println("Your name is: " + name);

        // String length
        System.out.println("Length: " + name.length());

        // First character
        System.out.println("First Character: " + name.charAt(0));

        // Uppercase
        System.out.println("Uppercase: " + name.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + name.toLowerCase());

        
    }
}

    

