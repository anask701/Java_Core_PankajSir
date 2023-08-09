package Day_2;

import java.util.Scanner;

public class Assignment_day2_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Date of Birth ");

        System.out.print("Enter Birth Year : ");
        int year = sc.nextInt();

        System.out.print("Enter Birth Month : ");
        int month = sc.nextInt();

        System.out.print("Enter Birth Day : ");
        int day = sc.nextInt();

        System.out.println("--- Current Date");

        System.out.print("Enter Birth Year : ");
        int year2 =sc.nextInt();

        System.out.print("Enter Birth Month : ");
        int month2 = sc.nextInt();

        System.out.print("Enter Birth Day : ");
        int day2 = sc.nextInt();


        if(month2>month){
            year = year + 1;
        }

        System.out.println();


        



    }
}
