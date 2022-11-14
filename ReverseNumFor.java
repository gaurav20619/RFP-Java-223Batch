import java.util.Scanner;
public class ReverseNumFor{
    public static void main(String[] args){
        int reversed = 0;
        try (Scanner Inp = new Scanner(System.in)) {
            System.out.println("Enter any number to reverse:-");
            int number  = Inp.nextInt();
            int Entered_num = number;
            // run loop until num becomes 0
            for(;number != 0; number /= 10) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
            }
     
            System.out.println("Reverse of " + Entered_num +" is "+ reversed+".");
            
        }
      }
}
