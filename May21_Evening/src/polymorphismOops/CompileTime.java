//method overloading is example of complipe time polymorphism
//method overloading occur within same class
package polymorphismOops;

public class CompileTime {
     public void addition(int a) {
    	 System.out.println(a);
     }
     public void addition(int a,int b) {//method overloading
    	 int c=a+b;
    	 System.out.println(c);
     }
     public void addition(int d,int e,int f) {//method overloading
    	 int g=d+e+f;
    	 System.out.println(g);
     }
     public static void main(String[] args) {
    	 CompileTime x=new CompileTime();
    	 x.addition(1);
    	 x.addition(2, 3);
    	 x.addition(4, 5, 6);
	}
}
