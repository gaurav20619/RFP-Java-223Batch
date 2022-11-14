import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args){
        int reversed = 0;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter any number to reverse:-");
        int number  = myInput.nextInt();
        int Entered_num = number;
        // run loop until num becomes 0
        while(number>0) {
        
            
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number/10;
      
            
        } 
        if(Entered_num==reversed)
        System.out.println("This no. is a Palindrome.");
        else
        System.out.println("This no. is not a Palindrome.");

        myInput.close();
      }
}
