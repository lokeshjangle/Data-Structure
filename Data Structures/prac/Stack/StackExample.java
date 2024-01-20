package Stack;

import java.util.Scanner;

public class StackExample {
    
    //Data members
    int tos , MaxSize, stack[];

    void createStack(int size){
        tos = -1;
        MaxSize = size;
        stack = new int[MaxSize];
    }
     
    void push(int num){
        tos++;  //increment tos(index)
        stack[tos] = num; //add element in stack array
    }

    boolean isFull(){
        if(tos==MaxSize-1)
            return true;
        return false;
    }

    int  pop(){ //Remove and return the element 
        int num = stack[tos];
        tos--;
        return num;
    }

    int peek(){   //Only return top element in stack
        return stack[tos];
    }
    
    boolean isEmpty(){
        // if(stack.length==0){
        //     return true;
        // }
        // return false;

        if(tos==-1)
            return true;
        return false;
        

    }

    void printStack(){
        for(int i=tos;i>-1;--i){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of stack: ");
        int size = sc.nextInt();
        StackExample stack = new StackExample();
        stack.createStack(size);
        for(int i=0;i<size;++i){
            if(!stack.isFull()){
                System.out.printf("\nEnter the %d element : ",i);
                int num = sc.nextInt();
                stack.push(num);
            }
            else{
                System.out.println("\nStack is full;");
            }

        }
    
        while(!stack.isEmpty()){
                System.out.println(stack.pop());
            }     
       
        
    }
   
}