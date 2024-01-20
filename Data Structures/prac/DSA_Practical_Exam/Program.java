package DSA_Practical_Exam;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        
    
    Scanner  sc = new Scanner(System.in);
    DoublyLinkedListPractical emp = new DoublyLinkedListPractical();
        emp.createList();
        System.out.println("====Welcome to Employee Management System===");
        int ch;
        do{
            System.out.println("\n1:Add Employee \n2:Delete Employee \n3:Print Employee Detail  \n0:Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Employee Name : ");
                    String name = sc.next();
                    System.out.println("Enter Gender : ");
                    String gender = sc.next();
                    System.out.println("Enter Salary of Employee : ");
                    double salary = sc.nextDouble();
                    System.out.println("Enter Commision : ");
                    double comm = sc.nextDouble();
                    System.out.println("Enter dept number : ");
                    int deptno = sc.nextInt();
                    emp.insertLeft(name, gender, salary, comm, deptno);
                    break;
                
                case 2:
                    System.out.println("\nEnter Employee Id: ");
                    int eid = sc.nextInt();
                    emp.deleteSpecific(eid);
                    break;
                
               
                case 3:
                    emp.printList();
                    break;
                
               
            }
        }while(ch!=0);
        sc.close();
    }
}
