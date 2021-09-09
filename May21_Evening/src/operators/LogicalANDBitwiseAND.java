package operators;

public class LogicalANDBitwiseAND {
	 int a= 10;
     int b= 5;
     int c= 7;
     public void LogicAND1() {
    	 //it will only check first condition is false then it will be false
    	 System.out.println(a<b && c<b); //false && false=false
    	 System.out.println(a>b && c<b); //true && false=false
    	 System.out.println(a<b && c>b); //false && true=false
    	 System.out.println(a>b && c>b); //true && true=true
     }
     public void BitwiseAND1() {
    	 //it will only check both condition wheter first is true or false.
    	 System.out.println(a<b & c<b); //false && false=false
    	 System.out.println(a>b & c<b); //true && false=false
    	 System.out.println(a<b & c>b); //false && true=false
    	 System.out.println(a>b & c>b); //true && true=true
     }
     public static void main(String[] args) {
    	 LogicalANDBitwiseAND x=new LogicalANDBitwiseAND();
    	 x.LogicAND1();
    	 x.BitwiseAND1();
	}
}
