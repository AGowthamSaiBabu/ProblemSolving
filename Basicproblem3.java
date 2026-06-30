import java.util.*;
public class Basicproblem3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = s.nextInt();

        if(number!=0){
            if(number>0){
                System.out.println("It is a positive number");
                System.exit(0);
            }
            System.out.println("It is a Negative number");
        }
    }
}