public class MergeSort {
    
    public void print(int arr[]){

        for(int i = 0 ; i<arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
    public void mergeSort(int arr[] , int start, int end){
        if(start<end){
            int mid = (start+end)/2;

            mergeSort(arr, start, mid);//div
            mergeSort(arr, mid+1, end);
            merger(arr,start,end,mid);
        }
    }

    public void merger(int arr[], int start, int end, int mid){
        int i,j,ti,temp[];

        i = start;
        ti = start;
        j = mid+1;
        temp = new int[arr.length];

        while(i<=mid && j<=end){
            
            if(arr[i]<arr[j]){
                temp[ti++] = arr[i++];
            }
            else{
                temp[ti++] = arr[j++];
            }
            
        }

        while(i<=mid){
            temp[ti++] = arr[i++];
        }

        while(j<=end){
            temp[ti++] = arr[j++];
        }

        for(i=start;i<=end;++i){
            arr[i] = temp[i];
        }
        
    }

    
        
    
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int arr[] = { 4,5,7,8,9,2,6,3,10,1};
        // int arr[]  = {1,2,3,4,5,6};
        System.out.println("Element before sorting: ");
        obj.print(arr);
        System.out.println("Element after sorting:");
        obj.mergeSort(arr,0,arr.length-1);
        obj.print(arr);
    }
}
