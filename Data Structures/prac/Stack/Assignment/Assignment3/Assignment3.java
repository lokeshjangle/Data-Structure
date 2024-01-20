//Question: implement checking of wellness of ((( )))
package Stack.Assignment.Assignment3;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Wellness stack = new Wellness();
       
        stack.createStack(20);
        System.out.println("Enter Parenthesis: ");
        String brack = sc.nextLine();
        for (int i = 0; i < brack.length(); i++)  
        { 
            char x = brack.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{')  
            { 
                stack.push(x); 
                continue; 
            } 
  
            
            if (!stack.isEmpty()) {
                    char check; 
                    switch (x) { 
                    case ')': 
                        check = stack.pop(); 
                        if (check == '{' || check == '[') 
                            System.out.println("Error....Expected )"); 
                        break; 
        
                    case '}': 
                        check = stack.pop(); 
                        if (check == '(' || check == '[') 
                            System.out.println("Error....Expected }"); 
                        break; 
        
                    case ']': 
                        check = stack.pop(); 
                        if (check == '(' || check == '{') 
                            System.out.println("Error....Expected ]"); 
                        break; 
                    } 
                    
            }
            else {
                System.out.println("Error....Unexpected " + x);
            }
        }  
        sc.close(); 
        
    }
}
