package Stack.Assignment.Assignment3;


public class Wellness {
    
    //Data members
    int tos , MaxSize;
    char stack[];

    void createStack(int size){
        tos = -1;
        MaxSize = size;
        stack = new char[MaxSize];
    }
     
    void push(char sign){
        tos++;  //increment tos(index)
        stack[tos] = sign; //add element in stack array
    }

    boolean isFull(){
        if(tos==MaxSize-1)
            return true;
        return false;
    }

    char  pop(){ //Remove and return the element 
        char sign = stack[tos];
        tos--;
        return sign;
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
            System.out.println(stack[i]);
        }
    }


   
}