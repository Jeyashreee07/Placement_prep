import java.util.Scanner;

public class factorial{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        if(num < 0){

            System.out.println("Sorry value can't be calculated");

        } else{
                long fact = 1;
    
                for(int i = 1; i <= num; i++){
                    fact *= i;
                }
                System.out.println("The calculated factorial is" +fact);
        }
    }       
}
