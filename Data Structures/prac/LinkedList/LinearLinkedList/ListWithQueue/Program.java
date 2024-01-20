package ListWithQueue;


import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueList queue = new QueueList();
        
        queue.createQueue();
        int ch;
        do{
            System.out.println("1:Enqueue \n2:Dequeue \n3:PrintQueue \n0:Exit");
            System.out.println("Enter choice:");
            ch = sc.nextInt();
            switch(ch){
                case 1:
               
                        System.out.println("Enter element: ");
                        int num = sc.nextInt();
                        queue.enqueue(num);
                   
                    break;
                
                case 2:
                   
                        queue.dequeue();
                       
                    
                    break;
                case 3:
                    
                        queue.printQueue();
                       
                    break;
            }
        }while(ch!=0);
        sc.close();
    }
}
