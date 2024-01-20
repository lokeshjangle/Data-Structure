package CircularLinkedList;

class Node {
    int data;
    Node next; //Self reference
    Node (int data){
        this.data = data;
        this.next = null;  //bydefault next = null
    }
}
public class CircularLinkedListExample {
    Node root,last;

    public void createList(){
        root=last=null;
    }

    public void insertLeft(int data){
        Node node = new Node(data);
        if(root==null){
            root = last = node;
            last.next = root;
        }
        else{
            node.next = root;
            root = node;
            last.next = root;
        }
        System.out.println("Inserted.....");
    }

    public void deleteLeft(){
        if(root==null){
            System.out.println("List Empty");
        }
        else{
            Node temp = root;

            if(root==last){ //If only single node remain
                root=last=null; //Manual deletion
            }
            else{
                root = root.next;
                last.next = root;
            }
            System.out.println("Deleted...:"+temp.data);
        }
    }

    public void insertRight(int data){
        Node node = new Node(data);
        if(root==null){
            root = node;
            last.next = root;
        }
        else{
            // Node temp = root;
            // while(temp.next!=last){
            //     temp = temp.next;
            // }
            // temp.next = node;
            last.next = node;
            last = node;
            last.next = root;
        }
        System.out.println("Inserted...");
    }

    public void deleteRight(){
        if(root==null){
            System.out.println("List Empty...");
        }
        else{
            Node temp1 = root;//1
            Node temp2 = temp1;//1
            
            if(root == last ){
                root = last = null;
            }
            else{

                while (temp1!=last) {//2  //temp.next!=last ==> will delete second last element in list
                temp2 = temp1;
                temp1 = temp1.next;
                }

                last = temp2;//3
                last.next = root;//4
   
            }
            System.out.println("Deleted..."+temp1.data);
        }
    }

    public void printList(){
        if(root==null){
            System.out.println("Empty List......");
        }
        else{
            Node temp = root;
            do{
                System.out.print("|"+temp.data+"|->");
                temp = temp.next;
            }while(temp!=root);
        }
    }
}
