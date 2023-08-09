package Day_5;

import java.util.Scanner;

public class Assignment_Day5_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Start Loop Number : ");
        
        int start = sc.nextInt();

        System.out.println("Enter End Loop Number : ");
        int end = sc.nextInt();

        for(int i = start; i <= end; i++){
            System.out.println("A");
        }
        
    }
}
