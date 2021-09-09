//Super Keyword is used to call global variable from superclass.
//Super keyword is used for variable overriding.
package firstProgram;

public class SuperKeyword extends ThisKeyword{
      int a=10;
      int b=20;
      public void add() {
    	  int a=60;
    	  int b=90;
    	  System.out.println(a);
    	  System.out.println(b);
    	  System.out.println(super.a+super.b);
      }
      public static void main(String[] args) {
    	  SuperKeyword c=new SuperKeyword();
    	  c.add();
	}
}
