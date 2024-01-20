

//Implement Node as a class


class Node {
    int data;
    Node next; //Self reference
    Node (int data){
        this.data = data;
        this.next = null;  //bydefault next = null
    }
}

//First node of linked list is always says that root node we cannot create root node externally

//Implement Linear linked list
public class LinearLinkedListExample{
    Node root;
    private int size;
    LinearLinkedListExample(){
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
            node.next = root;//1  node.next = 1000, root=8000
            root = node;//2 root = 1000  //root should  be left most node or first node in linked list
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
            root = root.next; //2 temp.next  //root will shift from current node to next node
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
            
            while(temp.next!=null){//2  Traversing list untill node is null
                temp=temp.next;
            }
            temp.next = node;  //3
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
            Node temp2 = temp1;//1
            while(temp1.next!=null){//2
                temp2 = temp1;
                temp1 = temp1.next;
            } 
            size--;

            if(temp1==root){
                root = null; //Reset Linkded List
            }
            else{
                temp2.next = null;//3
            }

            System.out.println("Deleted: "+temp1.data);

        }
    }

    public void getSize(){
        System.out.println(size);
    }

    
    //Printing element in linked list
    public void printList(){
        if(root==null){
            System.out.println("Empty List");
        }
        else{
            Node temp = root;
            while(temp!=null){
                System.out.print("|"+temp.data+"|->");
                temp = temp.next;
            }
        }
    }


    //Searching element in list                                                                                         
    public void search(int key){
          if(root==null){
            System.out.println("Empty List");
        }
        else{
            Node temp = root;
            while(temp!=null){  //Search till key not found

                if(temp.data==key){ 
                    System.out.println("Key Found");
                    break;
                }
            
                temp = temp.next;
            }
            //if temp has reached to null means not found
            if(temp == null){
                System.out.println("Key not found!!");
            }
        }
    }

    //Delete element in list
    public void deleteKey(int key){
        boolean check = false;
        if(root==null){
            System.out.println("Empty List");
        }
        else{
            Node temp = root;
            Node temp2 = temp;
            while(temp!=null){  //Search till key not found

                if(temp.data==key){ 
                    System.out.println("Key Found");
                    check = true;
                    break;
                }
                temp2 = temp;
                temp = temp.next;
            }
            //if temp has reached to null means not found
            if(temp == null){
                System.out.println("Key not found!!");
                check = false;
            }

           
            //Code for deletion 
            if (check==true){
                {//cases
                        if(temp==root){ //case1: key on root
                            root = root.next;
                        }
                        else if(temp.next==null){ //case 2: key on end of list
                            temp2.next = null;
                        }
                        else{  //case 3: Anywhere in list
                            temp2.next = temp.next;
                        }
                        System.out.println("Element deleted: "+temp.data);
                    }
            }

        }
    }

    //Insert at particular location
    void insertAt(int index,int data){
        Node node = new Node(data);
        if(root == null){
            root = node;
        }
        else{
            if(index == 0){
                node.next = root;
                root = node;
                System.out.println("Inserted");
            }
            else{
                Node temp1 = root; //1
                Node temp2 = temp1;
                while (temp1!=null && index>0) {
                    temp2 = temp1;
                    temp1 = temp1.next;
                    --index; //count down to location
                    
                }

                if(temp1!=null){
                    node.next = temp1;
                    temp2.next = node;
                    System.out.println("Inserted");
                }
                else{
                    System.out.println("Index out of range....");
                }
            }
        }
    }

    //Sorting of list
    void sortList(){
        if(root==null){
            System.out.println("Empty list.....");
        }
        else{
            //Bubble sort
            for(Node i = root;i.next!=null;i=i.next){
                
                for(Node j = root; j.next!=null; j=j.next){
                    Node j2 = j.next; //(j.next).data
                    if(j2!=null && j.data>j2.data){
                        int temp = j.data;
                        j.data = j2.data;
                        j2.data = temp;
                    }
                }
            }
            System.out.println("List Sortede....Done");
        }
    }


    //Reverse list without recurssion
    public void reverseList(){

        if(root  == null || root.next == null){
            return;
        }
        Node previous = root;
        Node current = root.next;
        while(current!=null){
            Node nextNode = current.next;
            current.next = previous;

            //update
            previous  = current;
            current = nextNode;
        }

        root.next = null;
        root = previous;

    }


    //Reverse list using recurssion
    public Node reverseRecurssion(Node root){
        if(root == null || root.next == null){
            return root;
        }
        Node nweNode = reverseRecurssion(root.next);
        root.next.next = root;
        root.next = null;
        return nweNode;
    }

    //Delete Nth element from last
    public Node removeNthEleFromLast(int index){
        if(root == null){
            return null;
        }

        //Finding size of List
        int size = 0;
        Node current = root;
        while(current!=null){
            current = current.next;
            ++size;
        }

        int indexToSearch = size - index;  //find privious index 
        Node previous = root;
        int i = 0;
        while(i<indexToSearch){
            previous = previous.next;
            i++;
        }

        previous.next = previous.next.next;
        return root;

    }
   
}