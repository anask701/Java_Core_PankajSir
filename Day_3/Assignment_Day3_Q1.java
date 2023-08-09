package Day_3;

import java.util.Scanner;

public class Assignment_Day3_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 2 == 0 & num>0){
            System.out.println("Your number is : Even");
        }
        else if(num<=0){
            System.out.println("Enter a number greater than zero!");

        }
        else{
            System.out.println("Your number is : Odd");
        }

    }
}
