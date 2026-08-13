// 21) Write a java program to find out given number is positive or negative by using nested if stmt?

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the Number");
//         int number = s.nextInt();

//         if(number!=0){
//             if(number>0){
//                 System.out.println("It is a positive number");
//                 System.exit(0);
//             }
//             System.out.println("It is a Negative number");
//         }
//     }
// }

//22) Month names using switch case

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter The Number Days");
//         String days =s.nextLine();

//         switch(days){
//             case "one":
//                 System.out.println("Jan");
//                 break;
//             case "two":
//                 System.out.println("Feb"); 
//                 break;
//             case "three":
//                 System.out.println("Mar");
//                 break;  
//             default:
//                 System.out.println("coming soon");         
//         }
//         s.close();
//     }
// }

//23) Write a java program to display 10 natural numbers?

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//         int i=1;

//         while(i<=10){
//             System.out.println(i);
//             i++;
//         }
//     }
// }

// 24) Write a java program to display sum of 10 natural numbers?

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//         int i =1;
//         int sum =0;
//         while(i<=10){
//             sum = sum+i;
//             i++;
//         }
//         System.out.println(sum);
//     }
// }

// 25) Write a java program to display factorial of a given number?

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the Number"); 
//        int num =s.nextInt();
//         int fact =1;
//         while(num>=1){
//             fact = fact*num;
//             num--;
//         }
//         System.out.println(fact);
//         s.close();
//     }
// }

// 26) Write a java program to display multiplication table of a given number?

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//     Scanner s =new Scanner(System.in);
//     System.out.println("Enter the number");
//     int num =s.nextInt();

//     int i=1;
//     while(i<=10){
//         System.out.println(num+" * "+i+" = "+num*i);
//         i++;
//       }
//       s.close();
//     }
// }

// 27) Write a java program to perform sum of digits of a given number?

// import java.util.*;
// public class Basicproblem3{
//     public static void main(String[] args) {
//     Scanner s =new Scanner(System.in);
//     System.out.println("Enter Number ");
//     int number =s.nextInt();
//     int rem =0;
//     int sum =0;
//     while(number>0){
//       rem =number%10;
//       sum =sum+rem;
//       number =number/10;

//     }
//     System.err.println(sum);
//       s.close();
//     }
// }

// Q) Write a java program to find out given number is palindrome or not?

import java.util.*;
public class Basicproblem3{
    public static void main(String[] args) {
    Scanner s =new Scanner(System.in);
    System.out.println("Enter Number ");
    int number =s.nextInt();
    int original = number;
    int rev =0;

    while(number !=0){
      int digit =number%10;
      rev =(rev*10)+digit;
      number = number/10;
    }
    if(original == rev){
      System.out.println("palindrome");
    }else{
      System.out.println("Not palindrome");
    }
      s.close();
    }
}
