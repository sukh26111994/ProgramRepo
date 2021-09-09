package controlStatment;

public class IfStatement {
public static void main(String[] args) {
	check1();
	int a=5;
	if(a>=0) {
		int w=10;
		int b=120;
		int c=w+b;
		System.out.println("The value of C is "+ c);
		System.out.println("You have entered positive number");
	}
	System.out.println("You have entered negative number");
}
public static void check1() {
	int a=100;
	int b=200;
	if(a>b && a<b) {
		System.out.println("Combination is nice");
	}
}
}
