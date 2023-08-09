package Day_3;
import java.util.Scanner;

public class Assignment_Day3_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Alphabet: ");

        char alphabet = sc.next().charAt(0);

        if(alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u' || alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U'){
            System.out.println("The given alphabet is a vowel: ");
        }else{
            System.out.println("The given alphabet is a consonent: ");
        }

        

    }
}
