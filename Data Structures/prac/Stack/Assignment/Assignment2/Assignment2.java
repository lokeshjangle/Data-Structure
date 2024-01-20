//Question: implement dec to binary converter
package Stack.Assignment.Assignment2;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        DecimalToBinary stack = new DecimalToBinary();
        stack.createStack(100);
        
        System.out.println("Enter the decimal Number: ");
        int num = sc.nextInt();
        while (num>0) {

            stack.push(num%2);
            num=num/2;
        }

        System.out.println("Binary conversion of decimal number : ");
        stack.printStack();
    
        sc.close(); 

    }
}
