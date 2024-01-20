package DSA_Practical_Exam;

class Node{
    int emp_id;
    static int count = 100;
    String name,gender;
    double salary;
    int deptno;
    double comm;
    Node next;
    Node previous;
    Node(String name, String gender, double salary,double comm, int deptno){
        next = previous = null;
        this.emp_id = ++count;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.comm = comm;
        this.deptno = deptno;
    }
}

public class DoublyLinkedListPractical{

    Node root;
    public void createList(){
        root = null;
    }

    //Insert left 
    public void insertLeft(String name, String gender, double salary,double comm, int deptno){
        Node node = new Node( name,  gender,  salary, comm,  deptno);
        if(root==null){  //checking the root is created or not
            root = node;
           
        }
        else{
            node.next = root;//1  setting node(next) to root
            root.previous = node;//2
            root = node; //3 Making node as root node
        }
        System.out.println("Inserted...");
    }

    //Insert Right

    public void insertRight(String name, String gender, double salary,double comm, int deptno){
        Node node = new Node( name,  gender,  salary, comm,  deptno);
        if (root==null){
            root = node;
        }
        else{
            Node temp = root;//1 create temp with value of root because when we traversing nodes root node is not changed
            while(temp.next!= null){//2 Traverse temp until null node
                temp =  temp.next;
            }

            temp.next = node;
            node.previous = temp;

        }
        System.out.println("Inserted...");
    }

    //Insert after specific data
    public void insertAfterSpecific(String name, String gender, double salary,double comm, int deptno, int empid){
        Node node = new Node( name,  gender,  salary, comm,  deptno);
        if(root == null){
            root = node;
        }
        else{
            boolean check = false;
            Node temp = root;  //1 Create a temp bcoz by the traversing of temp root not change
            Node temp2 = temp;

            while(temp!=null){
                

                if(temp.emp_id == empid){
                    check = true;
                    break;
                }
                temp2 = temp;
                temp = temp.next;
            }

            if(check == true){
                if(temp == root){
                    node.next = root;
                    root.previous = node;
                    root = node;

                }
                else{
                    temp2.next = node;
                    node.previous = temp2;
                    temp.previous = node;
                    node.next = temp;
                }
            }
        }
        System.out.println("Inserted...");
    }

    //Delete Node at start
    public void deleteLeft(){
        Node temp = root;
        if(root == null){
            System.out.println("Empty List....");
        }
        else{
            root = root.next;
            root.previous = null;
        }
        System.out.println("Deleted " + temp.emp_id);
    }

    //Delete Node at End
    public void deleteRight(){
        if(root == null){
            System.out.println("Empty List...");
        }
        else{
            Node temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            if(temp == root){
                root = null;
            }
            else{
                Node temp2 = temp.previous;
                temp2.next = null;
                
            }
            System.out.println("Deleted " + temp.emp_id);

        }
    }

    //Delete after specific data
    public void deleteSpecific(int empid){
        if(root == null){
            System.out.println("Empty list..");
        }
        else{
            boolean check = false;
            Node temp1 = root;
            Node temp2 = temp1;
            while(temp1!=null){
                if(temp1.emp_id == empid){
                    check = true;
                    break;
                }

                temp2 = temp1;
                temp1 = temp1.next;
            }

            if(check == true){
                if(temp1 == root){
                    root = null;
                }
                else if(temp1.next == null){
                    // temp2 = temp1.previous;
                    temp2.next  = null;
                }
                else{
                    temp2.next = temp2.next.next;
                }
                System.out.println("Deleted : "+temp1.emp_id);

            }
            else{
                
                System.out.println("Data Not Found....");
            }
        }
    }

    //Printing element in list
    public void printList(){
        if(root == null){
            System.out.println("Empty list..");
        }
        else{
            Node temp = root;
            System.out.println("\nDetails of Employee ");
            while (temp!=null) {

                    System.out.println("Emp Id : "+temp.emp_id);
                    System.out.println("Name   : "+temp.name);
                    System.out.println("Gender : "+temp.gender);
                    System.out.println("Salary : "+temp.salary);
                    System.out.println("-------------------------");
                    temp = temp.next;
            }
        }
    }
    
}