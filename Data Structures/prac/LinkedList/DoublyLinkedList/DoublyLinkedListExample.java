package DoublyLinkedList;


//Implement Node as a class


class Node {
    int data;
    Node left; //Self reference
    Node right;
    Node (int data){
        this.data = data;
        this.left = null;  //bydefault next = null
        this.right = null;
    }
}

//First node of linked list is always says that root node we cannot create root node externally

//Implement Linear linked list
public class DoublyLinkedListExample{
    Node root;
    private int size;
    DoublyLinkedListExample(){
        size = 0;
    }
    public void createList(){
        root = null; //root is not created but assigned
    }

    //Insert node from left
    public void insertLeft(int data){
        Node node = new Node(data);
        if(root==null){  //Checking root is created or not
            root = node;
        }
        else{ //This will execute when if we already created root node
            node.right = root;//1  node.next = 1000, root=8000
            root.left = node;//2
            root = node;//3 root = 1000  //root should  be left most node or first node in linked list
            

        }
        size++;
        System.out.println("Inserted");
 
    }

    //Delete left node with saving root node
    public void deleteLeft(){
        if(root==null){
            System.out.println("List Empty");
        }
        else{
            Node temp = root; //1

            if(root.right==null){
                root = null; //Manual reset
            }
            else{
                root = root.right; //2 temp.next  //root will shift from current node to next node
                root.left = null;//3
            }    
            System.out.println("Deleted: "+temp.data);
            --size;
        }
    }
    
    //Insert node from Right
    public void insertRight(int data){
        Node node = new Node(data);
        if(root==null){  //Checking root is created or not
            root = node;
        }
        else{ //This will execute when if we already created root node

            Node temp = root;//1 create temp with value of root because when we traversing nodes root node is not changed
            
            while(temp.right!=null){//2  Traversing list untill node is null
                temp=temp.right;
            }
            node.left = temp; 
            temp.right = node;  //3
            
        }
        ++size;
        System.out.println("Inserted");
 
    }

    //Delete Right node with saving root node
    public void deleteRight(){  //Trailer method / tail method 
        if(root==null){
            System.out.println("List Empty");
        }
        else{
            Node temp1 = root;//1
           
                while(temp1.right!=null){//2
                    temp1 = temp1.right;
                } 
                size--;

                if(temp1==root){
                    root = null; //Reset Linkded List
                }
                else{
                    Node temp2 = temp1.left;//3
                    temp2.right = null;
                }
            System.out.println("Deleted: "+temp1.data);

        }
    }

    //Size of list
    public void getSize(){
        System.out.println("List size : "+size);
    }

    
    //Printing element in linked list
    public void printListRightToLeft(){
        if(root==null){
            System.out.println("Empty List");
        }
        else{
            Node temp = root;
            System.out.print("null <->");
            while(temp!=null){
                System.out.print("|"+temp.data+"|<->");
                temp = temp.right;
            }
            
            System.out.print( " null ");
        }
    }

    public void printListLeftToRight(){
        if(root==null){
            System.out.println("List is Empty...");
        }
        else{
            Node temp = root;
            while(temp.right!=null){
                temp = temp.right;
            }
            System.out.print("null <->");
            while(temp!=null){
                    System.out.print("|"+temp.data+"|<->");
                    temp = temp.left;
            }
            System.out.print( " null ");
        }
    }

    
    //Delete after specific data
    public void deleteSpecific(int key){
        if(root == null){
            System.out.println("Empty list..");
        }
        else{
            boolean check = false;
            Node temp1 = root;
            Node temp2 = temp1;
            while(temp1!=null){
                if(temp1.data == key){
                    check = true;
                    break;
                }

                temp2 = temp1;
                temp1 = temp1.right;
            }

            if(check == true){
                if(temp1 == root){
                    root = null;
                }
                else if(temp1.right == null){
                    // temp2 = temp1.previous;
                    temp2.right  = null;
                }
                else{
                    temp2.right = temp2.right.right;
                }
                System.out.println("Deleted : "+temp1.data);

            }
            else{
                
                System.out.println("Data Not Found....");
            }
        }
    }
     //Insert after specific data
     public void insertAfterSpecific(int data, int key){
        Node node = new Node(data);
        if(root == null){
            root = null;
        }
        else{
            boolean check = false;
            Node temp = root;  //1 Create a temp bcoz by the traversing of temp root not change
            Node temp2 = temp;

            while(temp!=null){
                

                if(temp.data == key){
                    check = true;
                    System.out.println(temp.data);
                    break;
                }
                temp2 = temp;
                temp = temp.right;
            }

            if(check == true){
                if(temp == root){
                    node.right = root;
                    root.left = node;
                    root = node;

                }
                else{
                    temp2.right = node;
                    node.left = temp2;
                    temp.left = node;
                    node.right = temp;
                }
            }
        }
        System.out.println("Inserted...");
    }

}