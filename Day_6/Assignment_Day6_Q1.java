package Day_6;

import java.util.Scanner;

public class Assignment_Day6_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();


        int data[] = new int[size];

        for(int i=0; i<size; i++){
            data[i] = sc.nextInt();
        }
        
        int avg = 0;
        int sum = 0;

        for(int i=0; i<size; i++){
            
            sum += data[i];

            avg = sum/size;
            
        }
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + avg);
    }
}
