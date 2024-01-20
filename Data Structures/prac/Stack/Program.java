package Stack;

import java.util.Scanner;

public class Program {

     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();
        StackExample stack = new StackExample();
        stack.createStack(size);
        int ch;
        
        do{
            System.out.println("1:Push \n2:Pop \n3:Peek \n4:Print \n5:Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    if(!stack.isFull()){
                        System.out.println("Enter element: ");  
                        int num = sc.nextInt();
                        stack.push(num);
                    }
                    else{
                        System.out.println("Stack Full");
                    }
                    break;
                case 2:
                    if(!stack.isEmpty()){
                        System.out.println(stack.pop() + " Poped");
                    }
                    else{
                        System.out.println("Stack is Empty");
                    }
                    break;
                case 3:
                    if(!stack.isEmpty()){
                        stack.peek();

                    }
                    else{
                        System.out.println("Stack Empty");
                    }
                    break;
                case 4: 
                    if(!stack.isEmpty()){
                        stack.printStack();
                    }
                    else{
                        System.out.println("Stack Empty");
                    }
                    break;
                default:
                    break;
            }
        }while(ch!=5);
        
    
        
    }
    
}
