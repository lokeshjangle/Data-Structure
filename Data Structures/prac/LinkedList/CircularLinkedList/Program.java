package CircularLinkedList;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        CircularLinkedListExample clist = new CircularLinkedListExample();
        clist.createList();
        int ch,data;
        do{
            System.out.println("\n1:Insert Left \n2:Insert Right \n3:Delete Left \n4:Delete Right \n5:Print List \n0:Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    data = sc.nextInt();
                    clist.insertLeft(data);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    data = sc.nextInt();
                    clist.insertRight(data);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    clist.deleteLeft();
                    break;

                case 4:
                    clist.deleteRight();
                    break;
                case 5:
                    clist.printList();
                    break;
            }
        }while(ch!=0);
        sc.close();
    }
}
