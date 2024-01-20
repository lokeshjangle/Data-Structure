import java.util.Scanner;

public class SearchingExample {
    int size;
    int arr[];
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        arr = new int[size];
        for(int i=0;i<size;++i){
            System.out.printf("Enter element: %d\n",i+1);
            int data = sc.nextInt();
            arr[i] = data;

        }
    }

    public void printElement(){
        
        System.out.println("Element in array : ");

        for(int i=0;i<arr.length;++i){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    //Sequential search with dynamic array or user defined array
    public int sequentialSearch(int data){
        for(int i=0; i<arr.length;++i){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }
    
    //Sequential search with static array
    public int sequentialSearch(int arr[], int data){
        for(int i=0; i<arr.length;++i){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }

    //Binary Search with dynamic array or user defined array
    public int binarySearch(int start , int end, int key){
        
            if(start<=end)
            {   int mid=(start+end)/2;
                if(key==arr[mid])
                    return mid;
                else if(key<arr[mid])//go to left
                      return   binarySearch(start,mid-1,key);
                else//go to right
                        return binarySearch(mid+1,end,key);
                }

            else
                return(-1);

    }

    //Binary search with static array
    public int binarySearch(int arrr[],int start , int end, int key){
        
            if(start<=end)
            {   int mid=(start+end)/2;
                if(key==arrr[mid])
                    return mid;
                else if(key<arrr[mid])//go to left
                      return   binarySearch(arrr,start,mid-1,key);
                else//go to right
                        return binarySearch(arrr, mid+1,end,key);
                }

            else
                return(-1);

    }
}
