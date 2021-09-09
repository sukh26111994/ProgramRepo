//encpasulation is nothing but it is process of binding variable & its corrosponding method togheter is called as encapsulation
//java class & bin folder configured by jre is example of encapsulation.

package encapsulationOops;

public class EncapsulTest1 {
    
	private double balance;//variable is decalred as private to provide security.
	
	public double getBalance() {//geter method to read the value of variable.
		return balance;
		}
	public void setBalance(double balance) {
		this.balance=balance; //declare local variable to global variable
		
	}
	public static void main(String[] args) {
		EncapsulTest1 g=new EncapsulTest1();
		g.setBalance(100000);
		//double t=g.getBalance();
		System.out.println(g.getBalance());
	}
}
