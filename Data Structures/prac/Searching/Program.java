import java.util.Scanner;

class Program{
    public static void main(String[] args) {
     
        SearchingExample obj = new SearchingExample();
        int arr[] = {10,20,30,40,50,60,70,80,90,100};

        // obj.input();
        // obj.printElement();

        // int num = obj.sequentialSearch(20);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element you want to search: ");
        int key = sc.nextInt();
        // int res  = obj.binarySearch(0, obj.arr.length-1, key);
        int res = obj.binarySearch(arr, 0, arr.length-1, key);
        // int res = obj.sequentialSearch(arr,num);
        if(res!=-1){
            System.out.println("Element found at index: "+res);
        }
        else{
            System.out.println("Element not found....");
        }

        sc.close();

    }

}