//At the time of implementation public access modifier is compulsory.
//we use implementation class 1.for communication between class & interface 
//2.for providing defination to abstract method present in interface.
package abstractionOOPS;

public class BankAccount implements MasterCard{
    public void welcome() {
    	System.out.println("Welcome to HDFC bank");
    }
	public void cash() {
	    System.out.println("you can take cash");
	}
    public void ruppes() {
    	System.out.println("you can take ruppes");
	}
	public void doller() {
		System.out.println("you can take doller");
	}
    public void pounds() {
    	System.out.println("you can take pounds");
	}
    public void euro() {
    	System.out.println("you can take euro");
	}
    public void thanks() {
    	System.out.println("visit again");
    }
public static void main(String[] args) {
	 BankAccount b=new  BankAccount();
	 b.welcome();
	 b.ruppes();
	 b.doller();
	 b.pounds();
	 b.cash();
	 b.euro();
	 CreditCard.thankYou();
	 b.thanks();
}
}
