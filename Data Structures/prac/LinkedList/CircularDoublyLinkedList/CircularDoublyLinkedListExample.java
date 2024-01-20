package CircularDoublyLinkedList;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left=right=null;
    }
}

public class CircularDoublyLinkedListExample {
    private int size;
    Node root,last;

    CircularDoublyLinkedListExample(){
        this.size=0;
    }

    public void createList(){
        root=last=null;
    }

    public void insertLeft(int data){
        Node node = new Node(data);
        if(root==null){
            root = last = node;
            last.right = last.left = root;
        }
        else{
            node.right = root;
            root.left = node;
            root = node;
            last.right = node;  // or last.right = root;
            root.left = last;

           
        }
        size++;

        System.out.println("Inserted....");
    }

    public void insertRight(int data){
        Node node = new Node(data);
        if(root == null){
            root = last = node;
            last.right = last.left = root;
        }
        else{
            
            node.left = last;
            node.right = root;
            last.right = node;
            last = node;
            root.left = last;
            
        }
        ++size;
        System.out.println("Inserted....");
    }


    public void deleteLeft(){
        if(root == null){
            System.out.println("List is Empty.....");
        }
        else{
            Node temp = root;
            // root = root.right;
            // root.left = last;
            if(root==last){
                root = last = null;
            }
            else{
                root = root.right;
                root.left = last;
                last.right = root;
            }
            System.out.println("Deleted....: "+temp.data);
            --size;
        }
    }

    public void deleteRight(){
        if(root==null){
            System.out.println("List is Empty.....");
        }
        else{
            Node temp = last;
            if(root==last){
                root = last = null;
            }
            else{
                last = last.left;
                last.right = root;
                root.left = last;
            }
            System.out.println("Deleted....."+temp.data);
            --size;
        }
    }
    public void printList(){
        if(root==null){
            System.out.println("Empty list...");
        }
        else{
            Node temp = root;
            do{
                System.out.print("|"+temp.data+"|<->");
                temp = temp.right;
            }while(temp!=root);
            
        }
    }

    public void printListRev(){
        if(root==null){
            System.out.println("Empty list..........");
        }
        else{
            Node temp = last;
            do{
                System.out.print("|"+temp.data+"|<->");
                temp=temp.left;
            }while(temp!=last);
        }
    }
       //Size of list
    public void getSize(){
        System.out.println("List size : "+size);
    }

    
    
}
