// 1) write a java program to find out greatest of two numbers?
import java.util.*;
public class Basicproblem1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("Enter the first number");
        int a =s.nextInt();

        System.out.println("Enter the second number");
        int b =s.nextInt();

        if(a>b)
            System.out.println(a+"is greatest number");
        if(a<b)
            System.out.println(b+"is greatest number");

        s.close();
    }
}
