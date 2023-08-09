package Day_3;

import java.util.Scanner;

public class Assignment_Day3_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter Number 3: ");
        int num3 = sc.nextInt();

        if(num1>num2){
            System.out.println("Largest Number is: " + num1);
        }
        else if(num2>num3){
            System.out.println("Largest Number is: " + num2);
        }
        else{
            System.out.println("Largest number is: " + num3);
        }

    }
}
