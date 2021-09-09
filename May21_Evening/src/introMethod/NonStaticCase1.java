//with declairation of reference
package introMethod;

public class NonStaticCase1 {
	//static method
 public static void myClass1() {
	 System.out.println("my class1 is running");
 }
     //Non-Static Method
 public void myClass2() {
	 System.out.println("my class2 is running");
 }
 public static void main(String[] args) {
	 myClass1();
	 //myClass2();
 }
}
