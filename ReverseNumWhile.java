import java.util.Scanner;
public class ReverseNumWhile {
    public static void main(String[] args){
    int reversed = 0;
    Scanner myInput = new Scanner(System.in);
    System.out.println("Enter any number to reverse:-");
    int number  = myInput.nextInt();
    int Entered_num = number;
    // run loop until num becomes 0
    while(number != 0) {
    
        // get last digit from num
        int remainder = number % 10;
        reversed = reversed * 10 + remainder;
  
        // remove the last digit from num
        number = number/10;
    } 
    System.out.println("Reverse of " + Entered_num +" is "+ reversed+".");
    myInput.close();
  }
}
