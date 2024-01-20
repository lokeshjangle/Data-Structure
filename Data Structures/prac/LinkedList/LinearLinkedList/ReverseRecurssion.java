import java.util.Scanner;

public class ReverseRecurssion {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinearLinkedListExample list = new LinearLinkedListExample();
        list.createList();
        System.out.println("Enter size of list: ");
        int size = sc.nextInt();
        while (size!=0) {
            System.out.println("Enter element : ");
            int num = sc.nextInt();
            list.insertLeft(num);
            --size;
        }

        System.out.println("Element are : ");
        list.printList();

        
        System.out.println("\nElement after reverse is : ");
        list.root = list.reverseRecurssion(list.root);
        list.printList();


    }
}
