package Day_4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2: ");
        
        int num2 = sc.nextInt();

        System.out.println("Select Operator + , - , x , / , %");

        char Op = sc.next().charAt(0);

        switch(Op){
            case '+' :
            System.out.println(num1+num2);
            break;

            case '-' :
            System.out.println(num1-num2);
            break;

            case '/' :
            System.out.println(num1/num2);
            break;

            case 'x' :
            System.out.println(num1*num2);
            break;

            case '%' :
            System.out.println(num1%num2);
            break;

            default:
            System.out.println("Please select an operator given above");
            break;

        }

        
    }
}
