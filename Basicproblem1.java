// 1) write a java program to find out greatest of two numbers?
// import java.util.*;
// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);

//         System.out.println("Enter the first number");
//         int a =s.nextInt();

//         System.out.println("Enter the second number");
//         int b =s.nextInt();

//         if(a>b)
//             System.out.println(a+"is greatest number");
//         if(a<b)
//             System.out.println(b+"is greatest number");

//         s.close();
//     }
// }

// 2) Write a java program to find out greatest of three numbers?

// import java.util.*;
// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);

//         System.out.println("Enter the first numbers");
//         int a =s.nextInt();

//         System.out.println("Enter the second number");
//         int b =s.nextInt();

//         System.out.println("Enter the third number");
//         int c =s.nextInt();

//         if((a>b) && (a>c))
//             System.out.println(a+"is Greatest");
//         if((b>a) &&(b>c))
//             System.out.println(b+"is Greatest");
//         if((c>a) &&(c>b))
//             System.out.println(c+"is Greatest");
//         s.close();
//     }
// }

// 3 Write a java program to find out given age is eligible to vote or not?

import java.util.*;

public class Basicproblem1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = s.nextInt();

        if (age >= 18) {
            System.out.println("eligible to vote");
        } else {
            System.out.println("u not eligible to vote");
        }
        s.close();
    }
}
