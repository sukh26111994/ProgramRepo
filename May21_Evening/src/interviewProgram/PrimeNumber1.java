package interviewProgram;
import java.util.Scanner;
public class PrimeNumber1 {
	public static void main(String[] args) {
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number -> ");
		int n = sc.nextInt();
		for(int i=2;i<n;i++){
			int rem = n%i;
			if(rem==0){
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	 
}}
