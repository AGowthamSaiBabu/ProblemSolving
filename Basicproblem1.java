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

// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the age");
//         int age = s.nextInt();

//         if (age >= 18) {
//             System.out.println("eligible to vote");
//         } else {
//             System.out.println("u not eligible to vote");
//         }
//         s.close();
//     }
// }

// 4) Write a java program to find out given number is even or odd?
// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the number");
//         int number =s.nextInt();

//         if(number%2==0){
//             System.out.println("Even Number");
//         }else{
//             System.out.println("Odd Number");
//         }
//         s.close();
//     }
// }

// 5) Write a java program to find out given number is odd or not?

// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the number!");
//         int number =s.nextInt();

//         if(number%2!=0){
//             System.out.println("It is odd number");
//         }else{
//             System.out.println("It is not a odd number");
//         }
//         s.close();
//     }
// }

// 6) Write a java program to check given number is positive or negative?

// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the number");
//         int number =s.nextInt();

//         if(number==0){
//             System.out.println("This is Not positive or negative number");
//             System.exit(0);
//         }

//         if(number>0)
//             System.out.println("It is positive number");
//         else
//             System.err.println("It is negative number");

//         s.close();
//     }
// }

// 7) Write a java program to find out given year is a leap year or not?

// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the Year :");
//         int year =s.nextInt();

//         if(year%4==0 && year%100!=0 || year%400==0)
//             System.out.println("It is a leap");
//         else
//             System.out.println("It is not a leap year");
//         s.close();
//     }
// }

// 8) Write a java program to display given alphabet is a vowel or consonant

// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the alphabet");
//         char ch =s.next().charAt(0);

//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//             System.out.println("It is a Vowel");
//         else
//             System.out.println("It is a consonent");

//         s.close();
//     }
// }

// 9) John went to shoe showroom to buy a pair of shows. But he has a myth that 
// if shoe price divisible by 3 and 5 then only he can purchase that show. Write 
// a java program to enter the shoe price and display John can buy that show or 
// not?


// import java.util.*;

// public class Basicproblem1 {
//     public static void main(String[] args) {
//         Scanner s =new Scanner(System.in);
//         System.out.println("Enter the shoe price :");
//         int price =s.nextInt();

//         if(price%3==0 && price%5==0){
//             System.out.println("jone can buy the shoe");
//         }else{
//             System.out.println("jone can't buy the shoe");
//         }
//     }
// }

// 10) Write a java program to find out greatest of two numbers?

import java.util.*;

public class Basicproblem1 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter the First number");
    int firstnumber =s.nextInt();

    System.out.println("Enter the Second number");
    int secondnumber =s.nextInt();

    int max =(firstnumber>secondnumber)?firstnumber:secondnumber;
    System.out.println(max+"Greatest Number");
    s.close();
    }
}
