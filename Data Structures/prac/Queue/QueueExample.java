//In queue not anything is decrease only increase

package Queue;

import java.util.Scanner;

public class QueueExample {
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

}
