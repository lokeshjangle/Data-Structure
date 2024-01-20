public class SelectionSort {
    

        public void print(int arr[]){
    
            for(int i = 0 ; i<arr.length; ++i){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
    
        }
       
        public void selectionSort(int arr[]){
            int i,j,min,pos;
            for(i=0;i<arr.length-1;++i){
                min = arr[i];
                pos = i;
                for(j=i+1;j<arr.length;++j){
                    if(arr[j] < min){
                        min = arr[j];
                        pos = j;
                    }
                }

                //Swap arr[i] with min, pos;
                arr[pos] = arr[i];
                arr[i] = min;
            }
        }
    
        public static void main(String[] args) {
            SelectionSort obj = new SelectionSort();
            int arr[] = { 4,5,7,8,9,2,6,3,10,1};
            System.out.println("Element before sorting: ");
            obj.print(arr);
            System.out.println("Element after sorting:");
            obj.selectionSort(arr);
            obj.print(arr);
        }
    
}
