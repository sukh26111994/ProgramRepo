package introMethod;

public class ComboMethod {
	//static method
  public static void demo1() {
	  System.out.println("demo1 is running");
  }
  //non-static method
  public void demo2() {
	  System.out.println("demo2 is running");
  }
  public static void main(String[] args) {
	  ComboMethod x=new ComboMethod();
	  demo1();  //calling static method
	  x.demo2(); //calling non-static method
  }
}
