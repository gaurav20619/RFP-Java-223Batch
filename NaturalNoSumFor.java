import java.util.Scanner;
public class NaturalNoSumFor {
    public static void main(String[] args) {  
        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("Enter n :-");
            int n = myInput.nextInt();
            int i = 1, sum = 0;  
            //executes until the condition returns true  
            for(i = 1; i <= n; i++)  
            {  
            //adding the value of i into sum variable  
            sum = sum + i;  
            }  
            System.out.println("Sum of first "+ n +" Numbers is " + sum+".");
        
        }
    }
}

