package Queue;

import java.util.Scanner;

public class PriorityQueueExample {
    //In queue not anything is decrease only increase

    int front,rear, MaxSize, queue[];
    public void createQueue(int size){
        front = 0;
        rear = -1;
        MaxSize = size;
        queue = new int[MaxSize];
    }

    public void enqueue(int num){
        rear++;
        queue[rear] = num;
      //  for(int i=front;i<rear;++i){
    //    //    for(int j=front;j<rear;++j){
    //             if(queue[j]>queue[j+1]){
    //                 int temp = queue[j];
    //                 queue[j] = queue[j+1];
    //                 queue[j+1] = temp;
    //             }
    //         }
        
     //   }

     for(int i=rear;i>front;--i){
      for(int j=rear;j>front;--j){
                 if(queue[j]<queue[j-1]){
                     int temp = queue[j];
                     queue[j] = queue[j-1];
                     queue[j-1] = temp;
                 }
                }
            }
    }

    public boolean isFull(){
        if(rear==MaxSize-1)
            return true;
        return false;
    }

    public int dequeue(){  //Deletion from queue
        int num = queue[front];
        front++;
        return num;
    }

    public boolean isEmpty(){
        if(front>rear){
            return true;
        }
        return false;
    }

    public void printQueue(){
        for(int i=front;i<=rear;++i){
            System.out.println(queue[i]);

        }
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueueExample queue = new PriorityQueueExample();
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


