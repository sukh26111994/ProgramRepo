package operators;

public class ShiftOperator {
     int a= 10;
     int b=-20;
     public void rightShift() {
    System.out.println(a<<2); //10*(2^2)=40
    System.out.println(a<<4); //10*(2^4)=160
    System.out.println(b<<2); //-20*(2^2)=-80
     }
     public void leftShift() {
    	 System.out.println(a>>2); // 10/(2^2)=2
    	 System.out.println(a>>5); // 10/(2^5)=0
    	 System.out.println(b>>2); //-20/(2^2)=-5
     }
     public static void main(String[] args) {
    	 ShiftOperator x=new ShiftOperator();
    	 x.rightShift();
    	 x.leftShift();
	}
}
