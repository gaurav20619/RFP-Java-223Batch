import java.util.Scanner;
public class ReadANum {
    public static void main(String[] args){
        try (Scanner myInput = new Scanner(System.in)) {
            System.out.println("Enter 1,10,100,1000 ");
            int number = myInput.nextInt();
            if(number==1){
                System.out.println("Unit");
            }
            if(number==10){
                System.out.println("Ten");
            }
            if(number==100){
                System.out.println("Hundred");
            }
            if(number==1000){
                System.out.println("Thousand");
            }
            
        }
    }
}
