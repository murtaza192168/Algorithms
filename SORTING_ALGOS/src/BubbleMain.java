import java.util.Arrays;
import java.io.*;

public class BubbleMain
{
    public static void main(String[] args) {
        int[] arr = {1,4,5,2,6};
        bubbleSort(arr); // calling the method
        System.out.print(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        boolean swapped; // declaration
        // outerloop for counter
      for(int i=0; i<arr.length;i++)
      {
          swapped = false; // just initialization only
          // for swaping purpose each step will contain exchange of elements
          for(int j=1; j <= arr.length-i-1; j++) // length-i-1 bcz already at each step last pos element will be the largest element hence a sorted one so no need to compare that..
          {
              if(arr[j] < arr[j-1])
              {
                  int temp = arr[j];
                  arr[j] = arr[j-1];
                  arr[j-1] = temp;
                  swapped = true;
              }
          }
          if(!swapped) // if array is already sorted in ascending order than why unnecessarily make run the "i" counter . Dont unnecessarily check for swap
          {
              break;
          }
      }
}
}
















