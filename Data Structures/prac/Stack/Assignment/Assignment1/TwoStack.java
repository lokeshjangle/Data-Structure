package Stack.Assignment.Assignment1;

public class TwoStack {
    
    int tos, tos2, MaxSize, SimpleStack[];

    public void createStack(int size) {
        tos = -1;
        tos2 = size;
        MaxSize = size;
        SimpleStack = new int[MaxSize];
    }

    public void push(int item) {
        ++tos;
        SimpleStack[tos] = item;
    }

    public void push2(int item) {
        --tos2;
        SimpleStack[tos2] = item;
    }

    public int pop() {
        int element = SimpleStack[tos];
        --tos;
        return element;
    }

    public int pop2() {
        int element = SimpleStack[tos2];
        ++tos2;
        return element;
    }

    

    boolean isEmpty()
    {
        if(tos==-1 && tos2==MaxSize-1)
            return true;
        else
            return false;
    }


    boolean isFull()
    {
        if(tos==tos2-1)
        return true;
        else
            return false;
    }

    public int peek() {
        return SimpleStack[tos];
    }

    public int peek2() {
        return SimpleStack[tos2];
    }

    public void traverseStack() {
        for (int i = tos; i > -1; --i) {
            System.out.println(SimpleStack[i]);
        }
    }

    public void traverseStack2() {
        for (int i = tos2; i < MaxSize; ++i) {
            System.out.println(SimpleStack[i]);
        }
    }
}
