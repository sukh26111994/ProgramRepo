//main method
package oopsInheritance;

public class UpcastingMain {
public static void main(String[] args) {
	//acquiring subclass property into superclass 
	SuperClass s= new SubClass(); //Upcasting
	s.car();
	s.house();
     s.run();//ovrriding gives subclass method calling
	}
}
