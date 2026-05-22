// 11) Write a java program to find out greatest of three numbers ?

// import java.util.*;

// public class Basicproblem2 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the FirstNumber");
//         int first =s.nextInt();

//         System.out.println("Enter the SecondNumber");
//         int second =s.nextInt();

//         System.out.println("Enter the ThiredNumber");
//         int thired =s.nextInt();

//         int max = (first > second)
//         ? ((first > thired) ? first : thired)
//         : ((second > thired) ? second : thired);
//         System.out.println(max+"is Greatest");
//         s.close();
//     }
// }

// Q) Write a java program to check given alphabet is a uppercase letter, lowercase letter, digit or a special symbol?

import java.util.*;

public class Basicproblem2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the alphabet");
        char ch =s.next().charAt(0);

        if(ch>='A' && ch<='Z'){
            System.out.println("It is Upper Case");
        }else if(ch>='a' && ch<='z'){
            System.out.println("It is Lower Case");
        }else if(ch>='0' && ch<='9'){
            System.out.println("It is a Number");
        }else{
            System.out.println("It is a Special Symbol");
        }

        s.close();
    }
}