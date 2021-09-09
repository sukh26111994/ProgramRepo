//variable which is only used in block of method either it is static,non-static & main method
//local variable cannot define with "static" keyword.
package variableType_Casting;

public class LocalVariable {
	public static void addition() {
		int a = 10;
		int b = 20;
		//int c= 0;
		System.out.println("The Value is="+ (a+b));
	}
	public void minus() {
		int a= 60;
		int b= 40;
		System.out.println("The Value is="+ (a-b));
		//System.out.println(c);we cannot use local variable outside method block
	}
	public static void main(String[] args) {
		LocalVariable x=new LocalVariable();
		addition();
		x.minus();
		//System.out.println(c); we cannot use local variable outside method block
	}
}
