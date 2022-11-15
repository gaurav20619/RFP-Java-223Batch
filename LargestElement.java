public class LargestElement {
    public static void main(String[] args) {

        int[] arr = new int[] { 10,20,30,40,50 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
            max = arr[i];
        }

        System.out.println("Largest element present in the array is " + max);
    }
}

