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

import java.util.*;
public class Basicproblem3{
    public static void main(String[] args) {
        int i =1;
        int sum =0;
        while(i<=10){
            sum = sum+i;
            i++;
        }
        System.out.println(sum);
    }
}