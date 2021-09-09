package operators;

public class ArithmaticOperator {
	public void arithmaticOperation() {
		int a=10;
		int b=5;
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2 divider
		System.out.println(a%b); //0 Remender
	}
	public static void main(String[] args) {
		ArithmaticOperator x=new ArithmaticOperator();
		x.arithmaticOperation();
	}
}
