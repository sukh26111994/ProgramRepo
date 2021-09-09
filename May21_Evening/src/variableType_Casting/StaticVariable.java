//A Variable declaired as Static is Known as Static Variable.
package variableType_Casting;

public class StaticVariable {
 static int a =10;
 static int b= 20;
  public static void addition() {
	  System.out.println("The value is ="+ (a+b));
  }
  public void minus() {
	  System.out.println("The value is ="+ (b-a));
  }
  public static void main(String[] args) {
	  StaticVariable x=new StaticVariable();
	  addition();
	  x.minus();
  }
}
