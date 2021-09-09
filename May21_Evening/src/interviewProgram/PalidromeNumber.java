package interviewProgram;
import java.util.Scanner;
public class PalidromeNumber {
	public static void main(String[] args) {
		 
		 Scanner z = new Scanner(System.in);
		 System.out.println("Enter the no");
		int n=z.nextInt();
		System.out.println("The no is " +n);
		 
		 int k=n;
		 int b=0;
		 int c;
		 while(n>0) {
			 c=n%10;   //4,3,4 remender
			 b=b*10+c;//4,43,434 //reverse
			 n=n/10;  //43,4,0
		 }
		 
		 if(k==b) {
			 System.out.println("palidrome no");
		 }
		 else {
			 System.out.println("not palidrome no");
		 }
	}
   
}
