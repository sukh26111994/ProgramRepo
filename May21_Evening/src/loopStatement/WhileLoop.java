package loopStatement;

public class WhileLoop {
public static void main(String[] args) {
	int n=234;
	int t=0;
	int s=0;
	while(n>0) {
		t=n%10;
		s=s*10+t;
		n=n/10;
		System.out.println(s);
	}
}
}
