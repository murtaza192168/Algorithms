import java.util.Arrays;

public class SelectionMain {
    public static void main(String[] args) {
        //function calling

                int arr[] = {5,6,1,4,21,16,14};
                selectionSort(arr);
                System.out.print(Arrays.toString(arr));
    }
    //Selection sort method
    private static void selectionSort(int[] arr)

    {
        for(int i=0; i<=arr.length-1; i++)
        {
            //find the max element from the array and swap that max element
            // and put it at the correct index
            int last = arr.length-i-1;

            int maxIndex = getMaxIndex(arr,0, last );
            //swap call so that max element can get exchanged with another ele at its correct pos
            // max index and last index (arr[max], arr[last])
             swapNums(arr, maxIndex,last);
        }
    }

    private static int getMaxIndex(int[] arr,int start, int end){ // su start che ane su end che function call ma likhelu che

       int max = start; //base condition max = 0;


        for(int i=start; i<=end; i++)
       {
           if(arr[max] < arr[i])
           {
               max = i;

           }

       }
        return max;
    }

    private static void swapNums(int[] arr, int max_index, int end_index){
        int temp = arr[max_index];
        arr[max_index] = arr[end_index];
        arr[end_index] = temp;
    }

}
