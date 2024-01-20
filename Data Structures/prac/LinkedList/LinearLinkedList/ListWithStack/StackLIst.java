package ListWithStack;

class Node {
    int data;
    Node next; //Self reference
    Node (int data){
        this.data = data;
        this.next = null;  //bydefault next = null
    }
}

public class StackLIst {
    Node tos;
    public void createStack(){
        tos = null; //root is not created but assigned
    }

    //Insert node from left
    public void push(int data){
        Node node = new Node(data);
        if(tos==null){  //Checking root is created or not
            tos = node;
        }
        else{ //This will execute when if we already created root node
            node.next = tos;//1  node.next = 1000, root=8000
            tos = node;//2 root = 1000  //root should  be left most node or first node in linked list
        }
        System.out.println("Inserted");
 
    }

    //Delete left node with saving root node
    public void pop(){
        if(tos==null){
            System.out.println("Stack Empty");
        }
        else{
            Node temp = tos; //1
            tos = tos.next; //2 temp.next  //root will shift from current node to next node
            System.out.println("Deleted: "+temp.data);

        }
    }

    public void peek(){
        if(tos==null){
            System.out.println("Empty Stack");
        }
        else{
            System.out.println(tos.data+" @ Peek");
        }
    }

     //Printing element in linked list
     public void printStack(){
        if(tos==null){
            System.out.println("Empty Stack");
        }
        else{
            Node temp = tos;
            while(temp!=null){
                System.out.println("|"+temp.data+"|");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
