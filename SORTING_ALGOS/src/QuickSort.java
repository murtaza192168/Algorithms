import java.util.Arrays;

public class QuickSort {
     public static void main(String[] args)
     {
       int[] arr = {7,1,5,6,4,0};
       sortIt(arr, 0, arr.length-1 );


        System.out.print(Arrays.toString(arr));
     }

     static void sortIt(int[]values, int low, int hi)
     {
         // base cond. > either equal so nothing to do.. bcz pointed value will swap with its self OR if low>hi, then nothing return
         if(low >= hi)
         {
             return;
         }

             int strt = low;
             int end = hi;
             int mid = strt+(end - strt)/2;// ae we are considering middle element as pivot bcz the time would be N/2 . when arr s divided into half, sorting subarrays becms more easier. W can even take first element / random/ or last element but the time complexity would be much.

             int pivot = values[mid];

             // you want to make this loop run again and again for n elements therefore while loop
               //making sue that the pivot gets its position by taking all elements that are less than pivot to LHS and more than pivot to RHS > and!> pivot will be at its correct position


             while(strt <= end)
             {
                 while(values[strt] < pivot)
                 {
                     strt ++;
                 }
                 while(values[end] > pivot)
                 {
                     end--;
                 }
                 if(strt <= end)
                 {
                     int temp = values[strt];
                     values[strt] = values[end];
                     values[end] = temp;
                     strt++;
                     end--;

                 }
             }

             //returning the sorted subarrays i.e. left subarray (low to end) and right subarray(strt to hi)
             sortIt(values, low, end);
             sortIt(values, strt, hi);

     }
}
