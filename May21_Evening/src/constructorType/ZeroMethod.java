package constructorType;

public class ZeroMethod {
//declaration
	int b =30;   //instance variable
	//initialisation
	public static void ZeroMethod1() {//static method with zero argument.
		int c=20;      //local variable
		System.out.println(c);
	}
	public static void ZeroMethod2(long c) {//static method with parameter argument.
		c=30;     //local variable
		System.out.println(c);
	}
	public void ZeroMethod3() {//non static method with zero argument.
		System.out.println(b);
	}
	public void ZeroMethod4(int b) {//non static method with parameter argument.
		 System.out.println(b);
	}
	public static void main(String[] args) {
	  ZeroMethod x=new ZeroMethod();
	  ZeroMethod1();
	  ZeroMethod2(1000000l);
	  x.ZeroMethod3();
	  x.ZeroMethod4(5);
	  System.out.println(x.b);
	}
}
