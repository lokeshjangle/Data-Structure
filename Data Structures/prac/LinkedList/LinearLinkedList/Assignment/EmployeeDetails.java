import java.util.Scanner;

class ENode{
    int emp_id;
    static int count = 100;
    String name,gender;
    double salary;
    ENode next;
    ENode(String name, String gender, double salary){
        next = null;
        this.emp_id = ++count;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }

}

public class EmployeeDetails {
    ENode root;
    
    public void createList(){
        root = null;
    }
    public void createEmp(String name, String gender, double salary){
        ENode emp = new ENode(name, gender, salary);
        if(root==null){
            root=emp;
        }
        else{
            // emp.next = root;
            // root = emp;
            ENode temp = root;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = emp;
        }
        System.out.println("\nEmployee added successfully....");
    }

    //printing all employee details
    public void printAllEmp(){
        if(root==null){
            System.out.println("\nEmployee List is empty.....");        
        }
        else{
            ENode temp = root;
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

    //Printing particular employee details
    public void printEmp(int eid){
        if(root==null){
            System.out.println("\nEmployee List is empty.....");
        }
        else{
            boolean check = false;

            ENode temp = root;
            while (temp!=null) {
                if(temp.emp_id==eid){
                    check = true;
                    break;
                }
                temp = temp.next;
                
            }
            if(temp==null){
                System.out.println("\nEmployee Not Found.....");
                check = false;
            }

            if(check==true){
                    System.out.println("\nDetails of Employee "+eid);
                    System.out.println("Emp Id : "+temp.emp_id);
                    System.out.println("Name   : "+temp.name);
                    System.out.println("Gender : "+temp.gender);
                    System.out.println("Salary : "+temp.salary);
                    System.out.println("-------------------------");
    
            }
        }
    }


    
    public void updateEmp(int eid){
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        if(root==null){
            System.out.println("\nEmployee List is empty.....");
        }
        else{
            ENode temp = root;
            while (temp!=null) {
                if(temp.emp_id==eid){
                    check = true;
                    break;
                }
                temp = temp.next;
                
            }
            if(temp==null){
                check = false;
            }

            if(check==true){
                
                System.out.println("\nWhat you want to update...");
                    System.out.println("1:Name \n2:Gender \n3:Salary");
                    int choice = sc.nextInt();
                    switch(choice){
                        case 1:
                            System.out.println("Enter Name: ");
                            String name = sc.next();
                            temp.name = name;
                            break;
                        case 2:
                            System.out.println("Enter Gender: ");
                            String gender = sc.next();
                            temp.gender = gender;
                            break;
                        case 3:
                            System.out.println("Enter Salary: ");
                            double salary = sc.nextDouble();
                            temp.salary = salary;
                            break;
                    }
                }
                else{
                    System.out.println("\nEmployee Not Found.....");

                }
        }
    }

    
    public void deleteEmp(int eid){
        boolean check = false;
        if(root==null){
            System.out.println("\nEmployee List is empty.....");
        }
        else{
            ENode temp = root;
            ENode temp2 = temp;
            while (temp!=null) {
                if(temp.emp_id==eid){
                    check = true;
                    break;
                }
                temp2 = temp;
                temp = temp.next;
                
            }
            if(temp==null){
                check = false;
            }

            if(check==true){
                if(temp==root){
                    root = root.next;
                }
                else if(temp.next == null){
                    temp2.next = null;
                }
                else{
                    temp2.next = temp.next;
                }
                System.out.println("\nEmployee "+eid+" Deleted succssfully...");
            }
            else{
                System.out.println("\nEmployee Not Found.....");

            }
        }
    }
}
