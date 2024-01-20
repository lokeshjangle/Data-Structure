package Queue;

import java.util.Scanner;

public class CircularQueueExample {
    int front,rear, MaxSize, count, queue[];
    public void createQueue(int size){
        front = 0;
        rear = -1;
        MaxSize = size;
        count = 0;
        queue = new int[MaxSize];
    }

    public void enqueue(int num){
        rear=(rear+1)%MaxSize;
        count++;
        queue[rear] = num;
    }

    public boolean isFull(){
        if(count==MaxSize)
            return true;
        return false;
    }

    public int dequeue(){  //Deletion from queue
        int num = queue[front];
        front = (front+1)%MaxSize;
        count--;
        return num;
    }

    public boolean isEmpty(){
        if(count==0){
            return true;
        }
        return false;
    }

    public void printQueue(){
        int i = front;
        for(int c=0;c<count;++c){
            
            System.out.println(queue[i]);
            i = (i+1)%MaxSize;
            

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueueExample queue = new CircularQueueExample();
        System.out.println("Enter the size of queue: ");
        int size = sc.nextInt();
        queue.createQueue(size);
        int ch;
        do{
            System.out.println("1:Enqueue \n2:Dequeue \n3:PrintQueue \n0:Exit");
            System.out.println("Enter choice:");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    if(!queue.isFull()){
                        System.out.println("Enter element: ");
                        int num = sc.nextInt();
                        queue.enqueue(num);
                    }else{
                        System.out.println("\nQueue is full");
                    }
                    break;
                
                case 2:
                    if(!queue.isEmpty())
                    {
                        System.out.println(queue.dequeue());
                       
                    }
                    else
                    {
                        System.out.println("Your queue is empty");
                    }
                    break;
                case 3:
                    if(!queue.isEmpty())
                    {
                         System.out.println("\nElement in queue:");
                        queue.printQueue();
                       
                    }
                    else
                    {
                        System.out.println("Your queue is empty");
                    }
            }
        }while(ch!=0);
    }
}
