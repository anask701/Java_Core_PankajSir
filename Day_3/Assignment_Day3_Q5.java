package Day_3;

import java.util.Scanner;

public class Assignment_Day3_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num<0){
            System.out.println("The number is negative: " + num);
        }
        else if(num == 0){
            System.out.println("The number is Zero: " + num);
        }
        else{
            System.out.println("The number is positive: " + num);
        }
    }
}
