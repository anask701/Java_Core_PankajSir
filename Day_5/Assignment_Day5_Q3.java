package Day_5;

import java.util.Scanner;

public class Assignment_Day5_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");

        
        int num[] = new int[4];

        for(int i=0; i < num.length; i++){
            num[i] = sc.nextInt();

        }

        System.out.print("Your reverse number is: ");

        for(int i = num.length-1; i >= 0; i--){
            System.out.print(num[i]);
        }
        
    }
}
