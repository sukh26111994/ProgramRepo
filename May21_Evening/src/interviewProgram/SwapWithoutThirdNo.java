package interviewProgram;

public class SwapWithoutThirdNo {
public static void main(String[] args) {
	int a=300;
	int b=100;
	a=a+b;//400
	b=a-b;//400-100=300
	a=a-b;//400-300=100
	System.out.println(a);
	System.out.println(b);
}
}
