public class InsertionSort {
    public void print(int arr[]){

        for(int i = 0 ; i<arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    
    public void insertionSort(int arr[]){
        int i,j,element;
        for(i=0;i<arr.length-1;++i){
            j = i+1; //outside element
            element = arr[j];

            while(j>0 && arr[j-1] > element){
                arr[j]  = arr[j-1];
                --j;
            }

            arr[j] = element;
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int arr[] = { 4,5,7,8,9,2,6,3,10,1};
        System.out.println("Element before sorting: ");
        obj.print(arr);
        System.out.println("Element after sorting:");
        obj.insertionSort(arr);
        obj.print(arr);
    }
}
