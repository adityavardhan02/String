package anudip;

import java.util.Scanner;

public class StringDemo {
    // Method to replace characters in a string with 'x' except the last four
    String stringDemo(String str) {
        // Convert the input string to a character array
        char arr[] = str.toCharArray();
        
        // Loop through the character array up to the length minus four (excluding last four characters)
        for (int i = 0; i < arr.length - 4; i++) {
            // Replace each character with 'x'
            arr[i] = 'x';
        }
        
        // Convert the modified character array back to a string
        return new String(arr);
    }

    public static void main(String args[]) {
        // Prompt the user to enter a mobile number
        System.out.println("Enter a mobile number=");
        
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // Read the input mobile number
        String str = sc.next();
        
        // Create an instance of StringDemo class
        StringDemo rp = new StringDemo();
        
        // Call the stringDemo method to mask the mobile number and print the result
        System.out.println(rp.stringDemo(str));
        
        // Close the scanner object to prevent resource leak
        sc.close();
    }
}    
