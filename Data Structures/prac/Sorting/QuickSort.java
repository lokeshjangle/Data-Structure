public class QuickSort {
    public void print(int arr[]){
    
        for(int i = 0 ; i<arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
   
    
    public void quickSort(int arr[], int start, int end){
        int i,j,pivot;
        if(start < end){
            i = start;
            j = end;
            pivot = end;

            while(i<j){

                while(arr[i]<arr[pivot]){
                    i++;
                }

                while(arr[j]>arr[pivot]){
                    j--;
                }

                if(i<=j){
                    int temp = arr[i];
                    arr[i] = arr[pivot];
                    arr[pivot] = temp;
                }
            }

            if(i<end){
                quickSort(arr, i+1, end);
            }

            if(j>start){
                quickSort(arr, start, j-1);
            }
        }
    }

    public static void main(String[] args) {
        QuickSort obj = new QuickSort();
        int arr[] = { 4,5,7,8,9,2,6,3,10,1};
        System.out.println("Element before sorting: ");
        obj.print(arr);
        System.out.println("Element after sorting:");
        obj.quickSort(arr,0,arr.length-1);
        obj.print(arr);
    }
}
