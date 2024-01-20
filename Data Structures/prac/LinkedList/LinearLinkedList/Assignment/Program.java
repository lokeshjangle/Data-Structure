import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDetails emp = new EmployeeDetails();

        System.out.println("====Welcome to Employee Management System===");
        int ch;
        do{
            System.out.println("\n1:Add Employee \n2:Update Employee \n3:Delete Employee \n4:Print Employee Detail \n5:Display All Employee Details \n0:Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Employee Name : ");
                    String name = sc.next();
                    System.out.println("Enter Gender : ");
                    String gender = sc.next();
                    System.out.println("Enter Salary of Employee : ");
                    double salary = sc.nextDouble();
                    emp.createEmp(name, gender, salary);
                    break;
                
                case 2:
                    System.out.println("\nEnter Employee Id: ");
                    int eid = sc.nextInt();
                    emp.updateEmp(eid);
                    break;
                
                case 3:
                    System.out.println("\nEnter Employee Id");
                    eid = sc.nextInt();
                    emp.deleteEmp(eid);
                    break;
                case 4:
                    System.out.println("\nEnter Employee Id");
                    eid = sc.nextInt();
                    emp.printEmp(eid);
                    break;
                
                case 5:
                    emp.printAllEmp();
                    break;
            }
        }while(ch!=0);
        sc.close();
    }
}
