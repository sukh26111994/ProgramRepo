package operators;

public class LogicalORBitwiseOR {
	int a= 10;
    int b= 5;
    int c= 7;
    public void LogicOR1() {
   	 //it will only check first condition is false then it will be true
   	 System.out.println(a<b || c<b); //false && false=false
   	 System.out.println(a>b || c<b); //true && false=true
   	 System.out.println(a<b || c>b); //false && true=true
   	 System.out.println(a>b || c>b); //true && true=true
    }
    public void BitwiseOR1() {
   	 //it will only check both condition wheter first is true or false.
   	 System.out.println(a<b | c<b); //false && false=false
   	 System.out.println(a>b | c<b); //true && false=true
   	 System.out.println(a<b | c>b); //false && true=true
   	 System.out.println(a>b | c>b); //true && true=true
    }
    public static void main(String[] args) {
   	 LogicalORBitwiseOR x=new LogicalORBitwiseOR();
   	 x.LogicOR1();
   	 x.BitwiseOR1();
	}
}
