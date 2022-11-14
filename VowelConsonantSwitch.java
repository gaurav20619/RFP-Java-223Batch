import java.util.Scanner;
public class VowelConsonantSwitch {
    public static void main(String[] args) {
		
		boolean vowel=false;;
		Scanner chInp = new Scanner(System.in);
		System.out.print("Enter a Letter : ");
		char ch = chInp.next().charAt(0);
		
		switch(ch) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' : vowel = true;
		}
		if(vowel == true) {
			System.out.println(ch +" is a Vowel.");
		}
		else {
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
				System.out.println(ch +" is a Consonant.");
			else 
				System.out.println("Input is not an Alphabet");
		}
        chInp.close();
    }
}
