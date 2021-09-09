package introMethod;

public class NonStaticMethod {
public void demo1() {
	System.out.println("demo1 is running");
}
public void demo2() {
	System.out.println("demo2 is running");
}
public static void main(String[] args) {
	//standard Syntax of object creation
	//ClassName ObjectReferanceVariable=new Constructor/ClassName();
	NonStaticMethod x=new NonStaticMethod();
	x.demo1();  //calling nonstatic method
	x.demo2();
}
}
