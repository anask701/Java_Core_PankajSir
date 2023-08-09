package Day_2;

import java.util.Scanner;

public class Assignment_day2_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number to check odd or even: ");
        int num = sc.nextInt();

        if(num % 2 == 0 & num > 0){
            System.out.println("Your number is Even: ");
        }
        else if(num <=0 ){
            System.out.println("Please enter number greater than zero: ");
        }
        else{
            System.out.println("Number is Odd: ");
        }
        
    }
}
