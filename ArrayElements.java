import java.util.Scanner;

public class ArrayElements {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		System.out.println("plz Enter Elements for your array :- ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array Elements are :- ");
		System.out.println(arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		
		sc.close();
		

	}
}
