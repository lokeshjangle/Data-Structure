package CircularDoublyLinkedList;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularDoublyLinkedListExample cdlist = new CircularDoublyLinkedListExample();
        cdlist.createList();
        int ch,data;
        do{
            System.out.println("\n1:Insert Left \n2:Insert Right \n3:Delete Left \n4:Delete Right \n5:Print List \n6:Print List in Reverse \n7:Size of list \n0:Exit");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter Element : ");
                    data = sc.nextInt();
                    cdlist.insertLeft(data);
                    break;
                case 2:
                    System.out.println("Enter Element : ");
                    data = sc.nextInt();
                    cdlist.insertRight(data);
                    break;
                case 3:
                    cdlist.deleteLeft();
                    break;
                case 4:
                    cdlist.deleteRight();
                    break;
                case 5:
                    cdlist.printList();
                    break;
                
                case 6:
                    cdlist.printListRev();
                    break;
                
                case 7:
                    cdlist.getSize();
                    break;
            }
        }while(ch!=0);
        sc.close();
    }
}
