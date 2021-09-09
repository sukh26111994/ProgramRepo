package interviewProgram;

public class ArmstrongNumber {
 public static void main(String[] args) {
	int n=153;
	int temp=n;
	 int r;
      int s=0;
	
	while(n>0) {
		r=n%10;//
		s=r*r*r+s;//
		n=n/10;//
	
	}
	if(temp==s) {
		System.out.println("ARMSTRONG NUMBER");
	}
	else {
		System.out.println("not armstrong number");
	}
}
}
