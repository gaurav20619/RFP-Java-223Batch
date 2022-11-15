import java.util.*;
public class SecondLargest {
    public static void main(String args[]){
        int array[] = {10, 20, 30, 40, 50, 60};
        int size = array.length;
        Arrays.sort(array);
        System.out.println("sorted Array ::"+Arrays.toString(array));
        int secondLargest = array[size-2];
        System.out.println("2nd largest element is ::"+secondLargest);
     }
  }

