import java.util.Scanner;
public class NaturalNoSumWhile {
    public static void main(String[] args) {  
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter n :-");
        int n = myInput.nextInt();
        int i = 1, sum = 0;  
        //executes until the condition returns true  
        while(i <= n)  
        {  
        //adding the value of i into sum variable  
        sum = sum + i;  
        //increments the value of i by 1  
        i++;  
        }
        System.out.println("Sum of first "+ n +" Numbers is " + sum+".");
        myInput.close();
    }
    
}  

