import java.util.Scanner;
public class NumToWord {
    public static void main(String[] args){
        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("Enter a  single digit no:- ");
            int number = myInput.nextInt();
            if(number==0){
                System.out.println("Zero");
            }
            if(number==1){
                System.out.println("One");
            }
            if(number==2){
                System.out.println("Two");
            }
            if(number==3){
                System.out.println("Three");
            }
            if(number==4){
                System.out.println("Four");
            }
            if(number==5){
                System.out.println("Five");
            }
            if(number==6){
                System.out.println("Six");
            }
            if(number==7){
                System.out.println("Seven");
            }
            if(number==8){
                System.out.println("Eight");
            }
            if(number==9){
                System.out.println("Nine");
            }
            else{
                System.out.println("please enter only single digit no.");
            }
        }
    }
}
