package DoublyLinkedList;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        
    
    Scanner  sc = new Scanner(System.in);
    DoublyLinkedListExample dlist = new DoublyLinkedListExample();
        dlist.createList();
        int ch,data;
        do{
            System.out.println("\n1:Insert Left \n2:Insert Right \n3:Delete Left \n4:Delete Right \n5:Print List Left to Right \n6:Print List Right to left\n7:Size of list \n0:Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    data = sc.nextInt();
                    dlist.insertLeft(data);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    data = sc.nextInt();
                    dlist.insertRight(data);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    dlist.deleteLeft();
                    break;

                case 4:
                    dlist.deleteRight();
                    break;
                case 5:
                    dlist.printListLeftToRight();
                    break;
                case 6:
                    dlist.printListRightToLeft();
                    break;
                case 7:
                    dlist.getSize();
                    break;
            }
        }while(ch!=0);
        sc.close();
    }
}
