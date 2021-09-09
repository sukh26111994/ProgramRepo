//A Variable declared inside the class but outside the body of method is called instance variable.
//it cannot defined with static keyword.
package variableType_Casting;

public class InstanceVariable {
   int a = 5;   //instance variable
   int b = 10;   //instance variable

   public void multiply() {   //non static method.
	   System.out.println("The value is ="+ (a*b));
   }
   
   /* error occur because we cannot make non static method referance in static field.
   public static void div() {
	   System.out.println("The value is ="+ (b/a));
   }*/
   
   public static void main(String[] args) {
	   InstanceVariable x=new InstanceVariable();
	   x.multiply();
	   
   }
}
