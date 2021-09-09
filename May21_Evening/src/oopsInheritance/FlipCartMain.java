//hierarchical Inheritence
//main class
package oopsInheritance;

public class FlipCartMain {
public static void main(String[] args) {
	Shooping s=new Shooping();
	s.username();
	s.password();
	s.loggedin();
	s.submit();
	s.top();
	
	Grocery g=new Grocery();
	g.username();
	g.password();
	g.loggedin();
	g.submit();
	g.sugar();
}
}
