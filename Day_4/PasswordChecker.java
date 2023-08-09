package Day_4;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Set Your Password: ");

        String setpass = sc.next();

        System.out.println("Check Your Password: ");

        String checkpass = sc.next();


        if(setpass.equals(checkpass)){
            System.out.println("1. Who invented Java Programming?\r\n" + //
                    "1. ) Guido van Rossum\r\n" + //
                    "2. ) James Gosling\r\n" + //
                    "3. ) Dennis Ritchie\r\n" + //
                    "4. ) Bjarne Stroustrup");

                    int n = sc.nextInt();
                    if(n==1){
                        System.out.println("2. Which component is used to compile, debug and execute the java programs?\r\n" + //
                                "1. ) JRE\r\n" + //
                                "2. ) JIT\r\n" + //
                                "3. ) JDK\r\n" + //
                                "4. ) JVM");
                        int n2 = sc.nextInt();
                        if(n2==4){
                            System.out.println("Your answer is right");
                        }else{
                            System.out.println("Please choose the right option");
                        }
                    }else{
                        System.out.println("Please choose right option");
                    }
            }
            else{
                System.out.println("Wrong Password: try 2 more times...");
                
                }
            


        }
}
