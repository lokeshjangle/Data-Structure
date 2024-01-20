public class HeapSort {
    public void print(int arr[]){

        for(int i = 0 ; i<arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public void heapSort(int arr[]){
        int i,j,pc,done;

        for(i = arr.length-1;i>0;--i){

            for(j=0;j<=i;++j){

                pc = j;
                done = 0;

                while(pc>=0 && pc/2 >=0 && done!=1){ 

                    if(arr[pc]>arr[pc/2]){ //check child greater than parent
                        int temp = arr[pc];
                        arr[pc] = arr[pc/2];
                        arr[pc/2] = temp;

                        pc = pc/2;  //go to parent and check
                    }

                    else{
                        done = 1; //when no sorting needed
                    }
                }
            }

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
        }
    }
    
    
        
    

    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        int arr[] = { 4,5,7,8,9,2,6,3,10,1};
        // int arr[]  = {1,2,3,4,5,6};
        System.out.println("Element before sorting: ");
        obj.print(arr);
        System.out.println("Element after sorting:");
        obj.heapSort(arr);
        obj.print(arr);
    }
}
