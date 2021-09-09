package introMethod;

public class MCIC {
      public static void addition() {
    	  int a=10;
    	  int b=20;
    	  System.out.println("The value is ="+(a+b));
      }
      public void minus() {
    	  int a=60;
    	  int b=40;
    	  System.out.println("The value is ="+(a-b));
      }
      public static void main(String[] args) {
    	  MCIC c=new MCIC();
    	  addition();
    	  c.minus();
	}
}
