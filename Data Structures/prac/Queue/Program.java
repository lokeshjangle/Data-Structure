package Queue;

import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueExample queue = new QueueExample();
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
