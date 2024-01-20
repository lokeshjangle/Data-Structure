package ListWithStack;

import java.util.Scanner;

public class Program {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StackLIst stack = new StackLIst();
        stack.createStack();
        int ch;
        
        do{
            System.out.println("1:Push \n2:Pop \n3:Peek \n4:Print \n5:Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    
                        System.out.println("Enter element: ");  
                        int num = sc.nextInt();
                        stack.push(num);
                    
                    
                    break;
                case 2:
                    stack.pop();
                      
                    break;
                case 3:
                    stack.peek();
                    break;
                case 4: 
                    stack.printStack();
                    break;
                default:
                    break;
            }
        }while(ch!=5);
        
    
     sc.close();   
    }
    
}
