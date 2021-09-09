package controlStatment;

public class NestedIfStatment {
  public static void main(String[] args) {
	check2();
	int age=43;
	if(age>18) {
		if(age<44) {
			System.out.println("Eligible for vaccine");
		}
	}
}
  public static void check2() {
	  int s=43;
	  int t=42;
	  if(s>18 || s<44) {
		  if(t>18 | t<44) {
			  System.out.println("Both are Eligible");
		  }
	  }
  }
}
