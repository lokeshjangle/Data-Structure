public class BubbleSort{

    public void print(int arr[]){

        for(int i = 0 ; i<arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1; ++i){ //passes
            for(int j = 0; j<arr.length-1; ++j){  //To stop in last
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
      public void bubbleSort2(int arr[]){
        int count = 0;
        for(int i = 0; i<arr.length-1; ++i){ //passes
            for(int j = 0; j<arr.length-(i+1); ++j){  //To stop where check already sorted element 
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    count++;
                }
            }
            
        
        if(count==0){
                System.out.println("Array already sorted...");
                break;
        }
    }
        
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        // int arr[] = { 4,5,7,8,9,2,6,3,10,1};
        int arr[]  = {1,2,3,4,5,6};
        System.out.println("Element before sorting: ");
        obj.print(arr);
        System.out.println("Element after sorting:");
        obj.bubbleSort2(arr);
        obj.print(arr);
    }
}