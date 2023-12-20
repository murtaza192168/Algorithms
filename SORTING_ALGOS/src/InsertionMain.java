import java.util.Arrays;
public class InsertionMain {

    public static void main(String[] args) {
        // function calls only
        int[] arr = {2,3,1}; // it wont be able to sort this fully: , this approach is only able to sort 3 elements whhy? bcz the smallest element is still present at last index and it sorts arr partially and at top of that inssertion sort is only feasible for small size arrays nd here the size is little large
        insertionSort(arr);
        System.out.print(Arrays.toString(arr));
    }


    // swap method
    private static void insertionSort(int[] arr)
    {
        for(int i=0; i <= arr.length-i-1; i++)// if i iterates to the last index of the array then obviously j(i.e. j=i+1), will be out of bound
        {
            for(int j=i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    //swap call
                    swapNums(arr, j, j-1);
                }
                else {
                    break;
                }
            }

        }

    }
    private static void swapNums(int[] arr, int first, int next)
    {
        int temp = arr[first];
        arr[first] = arr[next];
        arr[next] = temp;
    }


}


