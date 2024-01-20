package Stack.Assignment.Assignment2;


public class DecimalToBinary {
    
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
        
        if(tos==-1)
            return true;
        return false;
        

    }

    void printStack(){
        for(int i=tos;i>-1;--i){
            System.out.print(stack[i]+" ");
        }
    }


   
}