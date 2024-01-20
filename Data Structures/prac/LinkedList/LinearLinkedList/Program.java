import java.util.Scanner;

public class Program {
    
    public static void main(String args[]) {
        LinearLinkedListExample obj = new LinearLinkedListExample();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.createList();//creating LinkedList
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Search element in List\n7.Delete an element\n8.Insert At\n9.Sort List\n10:Size of List \n11:Reverse List \n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insertLeft(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insertRight(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.deleteLeft();
                    break;

                case 4:
                    obj.deleteRight();
                    break;
                case 5:
                    obj.printList();
                    break;
                case 6:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.search(e);
                    break;
                case 7:
                    System.out.println("Enter element to delete:");
                    e = in.nextInt();
                    obj.deleteKey(e);
                    break;
                case 8:
                    System.out.println("Enter index and data:");
                    int index = in.nextInt();
                    int element=in.nextInt();
                    obj.insertAt(index,element);
                    break;
                case 9:
                    obj.sortList();
                    break;
                    
                case 10:
                    obj.getSize();
                    break;
                case 11:
                    obj.reverseList();
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;

            }

        } while (ch != 0);
    }
}
