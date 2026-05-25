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

// 12) Write a java program to check given alphabet is a uppercase letter, lowercase letter, digit or a special symbol?

// import java.util.*;

// public class Basicproblem2 {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.println("Enter the alphabet");
//         char ch =s.next().charAt(0);

//         if(ch>='A' && ch<='Z'){
//             System.out.println("It is Upper Case");
//         }else if(ch>='a' && ch<='z'){
//             System.out.println("It is Lower Case");
//         }else if(ch>='0' && ch<='9'){
//             System.out.println("It is a Number");
//         }else{
//             System.out.println("It is a Special Symbol");
//         }

//         s.close();
//     }
// }

// 13) Write a java program to accept six marks of a student then find out total, average and grade?

import java.util.*;

public class Basicproblem2 {
    public static void main(String[] args) {
        int m1=89,m2=36,m3=44,m4=51,m5=62,m6=73,total=0;

		total=m1+m2+m3+m4+m5+m6;
		float average = (float)total/6;

		System.out.println("Total :"+total);
		System.out.printf("Average : %.2f \n",average);

		if(average>=70  && average<=100)
			System.out.println("Grade : A grade");
		else if(average >=50 && average<=69)
			System.out.println("Grade : B grade");
		else if(average >=35 && average <=49)
			System.out.println("Grade : C grade");
		else 
			System.out.println("Grade : Failed");

    }
}