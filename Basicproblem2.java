// 11) Write a java program to find out greatest of three numbers ?

import java.util.*;

public class Basicproblem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the FirstNumber");
        int first =s.nextInt();

        System.out.println("Enter the SecondNumber");
        int second =s.nextInt();

        System.out.println("Enter the ThiredNumber");
        int thired =s.nextInt();

        int max = (first > second)
        ? ((first > thired) ? first : thired)
        : ((second > thired) ? second : thired);
        System.out.println(max+"is Greatest");

    }
}
