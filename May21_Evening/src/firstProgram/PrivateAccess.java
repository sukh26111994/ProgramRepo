//private access modifier accessible within class only.
//method,constructor be private.less accessible
package firstProgram;

public class PrivateAccess {
  private void bank() {
	  System.out.print("SBI Bank ");
  }
  private void accountno() {
	  System.out.print("1233456890 ");
  }
  public static void main(String[] args) {
	PrivateAccess x=new PrivateAccess();
	x.accountno();
	x.bank();
}
}
