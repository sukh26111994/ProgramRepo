package variableType_Casting;

public class StaticCase {
      short a =10;   //instance variable
      static byte b =20; //static variable
      public static void AllInOneVariable() { //static method
    	  long f=100000;  //local variable
    	  System.out.println(b);
      }
      public void AllInOneVariable1() { //non static method
    	  System.out.println(a);
      }
     public static void main(String[] args) {
		StaticCase x=new StaticCase();
		AllInOneVariable(); //calling static method
		x.AllInOneVariable1(); //calling non static method
		System.out.println(x.a); //printing instance varible with object in static method.
	}
}
