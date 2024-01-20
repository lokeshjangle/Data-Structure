package ListWithQueue;



class Node {
    int data;
    Node next; //Self reference
    Node (int data){
        this.data = data;
        this.next = null;  //bydefault next = null
    }
}

public class QueueList {
    Node front,rear;
    public void createQueue(){
        rear = null; //root is not created but assigned
        front = null;
    }
    public void enqueue(int data){
        Node node = new Node(data);
        if(rear==null){  //Checking root is created or not
            rear = node;
            front = node;
        }
        else{ //This will execute when if we already created root node

           rear.next = node;  //storing address of node
           rear = node;     //change position of rear
        }
        System.out.println("Inserted");
 
    }
    public void dequeue(){
        if(front==null){
            System.out.println("Queue Empty");
        }
        else{
            Node temp = front; //1
            if(front==rear){  //Safety condition
                front=rear=null;
            }
            else{
                front = front.next; //2 temp.next  //root will shift from current node to next node
            
            }
            System.out.println("Deleted: "+temp.data);
            
        }
    }

     //Printing element in linked list
     public void printQueue(){
        if(front==null){
            System.out.println("Empty Queue");
        }
        else{
            Node temp = front;
            while(temp!=null){
                System.out.print("|"+temp.data+"|-->");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    


}
