//This keyword is used to declare local variable as global variable
//This keyword is used for variable overloading.
package firstProgram;

public class ThisKeyword {
   int a=10;
   int b=20;
   
   public void add() {
	   int a=30;
	   int b=40;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(this.a);
	   System.out.println(this.b);   
   }
   public static void main(String[] args) {
	   ThisKeyword h=new ThisKeyword();
	   h.add();
}
}
