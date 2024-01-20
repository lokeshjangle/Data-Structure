//Question 1: implement 2 stack in a single array

package Stack.Assignment.Assignment1;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Stack");
        int a = sc.nextInt();
        TwoStack obj = new TwoStack();
        obj.createStack(a);

        int choice;
        do {
            System.out.println("1.Push\n2.Pop\n3.Print Stack\n4.Push in Stack 2\n5.Pop From Stack 2\n6.Print Stack 2 \n0: Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (obj.isFull()) {
                        System.out.println("Stack is full\n");
                    } else {
                        System.out.println("Enter An Element to Push\n");
                        obj.push(sc.nextInt());
                    }
                    break;

                case 2:
                    if (obj.isEmpty()) {
                        System.out.println("Stack is Empty\n");
                    } else {
                        obj.pop();
                    }
                    break;

                case 3:
                    obj.traverseStack();
                    break;

                case 4:
                    if (obj.isFull()) {
                        System.out.println("Stack is full\n");
                    } else {
                        System.out.println("Enter An Element to Push\n");
                        obj.push2(sc.nextInt());
                    }
                    break;

                case 5:
                    if (obj.isEmpty()) {
                        System.out.println("Stack is Empty\n");
                    } else {
                        obj.pop2();
                    }
                    break;

                case 6:
                    obj.traverseStack2();
                    break;

                
            }
        } while (choice != 0);
        sc.close();

            }
        
}
