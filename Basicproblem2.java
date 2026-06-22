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

// import java.util.*;

// public class Basicproblem2 {
//     public static void main(String[] args) {
//         int m1=89,m2=36,m3=44,m4=51,m5=62,m6=73,total=0;
        

// 		total=m1+m2+m3+m4+m5+m6;
// 		float average = (float)total/6;

// 		System.out.println("Total :"+total);
// 		System.out.printf("Average : %.2f \n",average);

// 		if(average>=70  && average<=100)
// 			System.out.println("Grade : A grade");
// 		else if(average >=50 && average<=69)
// 			System.out.println("Grade : B grade");
// 		else if(average >=35 && average <=49)
// 			System.out.println("Grade : C grade");
// 		else 
// 			System.out.println("Grade : Failed");

//     }
// }


// 14) Write a java program to accept week number (1-7) then display the day of the week?

// import java.util.*;

// public class Basicproblem2 {
//     public static void main(String[] args) {
// 	Scanner s = new Scanner(System.in);
// 	System.out.println("Enter the Week days");
// 	int week =s.nextInt();

// 	if(week==1)
// 		System.out.println("Monday");
// 	else if(week==2)
// 		System.out.println("Tuesaday");
// 	else if(week==3)
// 		System.out.println("Wednesday");
// 	else if(week==4)
// 		System.out.println("Thursday");
// 	else if(week==5)
// 		System.out.println("Friday");
// 	else if(week==6)
// 		System.out.println("Saturday");
// 	else if(week==7)
// 		System.out.println("Sunday");
// 	else
// 		System.out.println("Invalid week number");
//     }
// }

// 15) Write a java program to compare two dates?

// import java.time.LocalDate;

// public class Basicproblem2 {
//     public static void main(String[] args) {
// 	LocalDate Date1 = LocalDate.of(2025,02,23);
// 	LocalDate Data2 = LocalDate.now();

// 	if(Date1.compareTo(Data2)>0)
// 		System.out.println("Date1 is Greatest");
// 	else if(Date1.compareTo(Data2)<0)
// 		System.out.println("Data2 is Greatest");
// 	else
// 		System.out.println("Both are same");
//     }
		
// }

// 16) Road Traveling program 

// import java.util.*;;

// public class Basicproblem2 {
//     public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
// 		System.out.println("Enter the Distance travelled(in kms):");
// 		int distance =s.nextInt();

// 		double costCharges=0;

// 		if(distance==1){
// 			costCharges=5;
// 		}else if(distance<=20){
// 			costCharges=distance*2;
// 		}else if(distance>20){
// 			costCharges = distance*1.5d;
// 		}
// 		System.out.println("The total charge for traveling"+distance+"Km is:"+costCharges+"rupees");
//     }		
// }

// 17)

// Shipping Cost program  

// Write a java program to calculate costs based on user input. 
// The program should prompt users to enter the total weight of items 
// (in kilograms) and the shipping destination (domestic or international).
//  For domestic orders, the program should charge Rs.500 for weights up to 
// 5 kg and Rs.100 per additional kg. For international orders, it should 
// charge Rs.1000 for weights up to 5 kg, Rs.200 per additional kg, and an
//  Rs.500 surcharge for weights exceeding 10 kg. Print calculated shipping cost.

// Input:
// 	Enter total weight of items (in kilograms) : 11 
// 	Enter the shipping destination : domestic 

// Output:
	 
// 	Calculated shipping cost : 1100.0
// 	(11kg = Rs. 500 + 6*100(600))


// import java.util.*;;

// public class Basicproblem2 {
//     public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
// 			System.out.println("Enter total weight of items (in kilograms) :");
// 		int weight=s.nextInt(); // 11

// 		System.out.println("Enter the shipping destination :");
// 		String destination = s.next().toLowerCase();

// 		double costCharges=0;

// 		if(destination.equals("domestic"))
// 		{
// 			if(weight<=5)
// 			{
// 				costCharges= 500;
// 			}
// 			else 
// 			{
// 				costCharges= 500 + (weight-5)*100;
// 			}
// 		}
// 		else if(destination.equals("international"))
// 		{
// 			if(weight<=5)
// 			{
// 				costCharges=1000;
// 			}
// 			else if(weight>5 && weight<=10)
// 			{
// 				costCharges= 1000 + (weight-5)*200;
// 			}
// 			else if(weight>10)
// 			{
// 				costCharges= 1000 + (weight-5)*200 + 500;
// 			}

// 		}
// 		else
// 		{
// 			System.out.println("Invalid destination");
// 			return;
// 		}

// 		System.out.println("Calculated shipping cost :"+ costCharges);

//     }		
// }

//18) Write a java program to perform swapping of two numbers without using third variable?

import java.util.*;;

public class Basicproblem2 {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the first Number");
		int a =s.nextInt();

		System.out.println("Enter the Second Number");
		int b =s.nextInt();

		System.out.println("Before Swapping ");
		System.out.println("a ="+ a);
		System.out.println(" b = " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.err.println("b = "+b);

		s.close();
    }		
}