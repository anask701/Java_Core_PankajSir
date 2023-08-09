package Day_5;

public class Assignment_Day5_Q4 {
    public static void main(String[] args) {
        
        for(int i=0; i<=5; i++){
            for(int j=0; j<i; j++){
                char alph = 'A';
                alph += i-1;
                System.out.print(alph);
            }
            System.out.println(" ");
        }

    }
}
