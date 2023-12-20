import java.util.Arrays;

public class MergeSortRecursion {

    public static void main(String[] args)
    {
        int[] arr = {5,4,3,2,1,0};
         arr = mergeSort(arr);  //updating the array ... so as a new / copy of the array
         System.out.print(Arrays.toString(arr));
    }


    static int[] mergeSort(int[] arr) {
        // divide the array into two arrays using finding a middle element
        // but first check if is there only one element in the array.
        //by chance if YES, then return the array as it is .. or else go ahead with finding mid


        if (arr.length == 1) {
            return (arr);
        }
        int mid = arr.length / 2; // no need to put else... unn

        // now divide the array into left subarray and right subarray
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid)); // will take a range of left subarray i.e from 0 to mid, and put these by creating a copy of a leftarray from original array
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length)); // will take a range of right subarray i.e from mid+1 to length-1, and put these by creating a copy of a rightarray from original array

        return (merge(left, right));
        // recursive call actually. recursion call of a method is returned in main method

    }

    private static int[] merge(int[] LHS, int[] RHS)
    {

        // declare a new array and giv a range of limit of index that how many element are gng to be merged inserted after sorting

        /* creating a new array*/

        int[] mixArrayResult = new int [(LHS.length) + (RHS.length)]; //[size calculation equation]

        // declare index pointers for lhs array, rhs array and newResult array
        int i = 0; // for lhs subarray
        int j = 0; // for rhs subarray
        int k = 0; // for new Array
        while(i < LHS.length &&   j < RHS.length) // anyone false = false nd both true = true// agar OR lagause, then with whom will you compare the subarray.. hahaha
        {
            if(LHS[i] < RHS[j])
            {
               mixArrayResult[k] = LHS[i];
               i++;
            }
            else
            {
               mixArrayResult[k] = RHS[j];
               j++;
            }
            k++;
        }
        // in && operaor any one false = false.. that is why...
        // suppose there is anyone one subarray (either left or right) is left with the values still present in them.. so those remaining will be inserted in new array by checking their length
        // anyone loop will work here and return the result
        while(i < LHS.length)
        {
           mixArrayResult[k] = LHS[i];
           i++;
           k++;
        }
        while(j < RHS.length)
        {

            mixArrayResult[k] = RHS[j];
            j++;
            k++;
        }

        return mixArrayResult;
    }


}
