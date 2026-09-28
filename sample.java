import java.util.Scanner;

public class sample{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        int score = sc.nextInt();
        sc.nextLine();

        String dept = sc.nextLine();
        
        

        System.out.println("My name is:" +name);
        System.out.println("My Score is:" +score / 10);
        System.out.println("My Department is:" +dept);
    }

}


