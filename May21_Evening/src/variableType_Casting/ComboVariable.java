package variableType_Casting;

public class ComboVariable {
     int a = 20;  //instance variable
     int b =30;   //instance variable
     static int c =5; //static variable
     static int d =6; //static variable
     public static void addition() { //static method
    	 int e =30;  //local variable
    	 int f =10;   //local variable
    	 System.out.println("The value is ="+ (e+f));
    	 System.out.println("The value is ="+ (c+d));
     }
     public void multiply() {  //non static method
    	 int g =7;   //local variable
    	 int h =10;   //local variable
    	 System.out.println("The value is ="+ (g*h));
    	 System.out.println("The value is ="+ (a*b));
    	 System.out.println("The value is ="+ (c*d));
   }
     public static void main(String[] args) { //main method
    	 ComboVariable x=new ComboVariable();
    	 addition();   //calling static method
    	 x.multiply();  //calling non static method
     }
}
