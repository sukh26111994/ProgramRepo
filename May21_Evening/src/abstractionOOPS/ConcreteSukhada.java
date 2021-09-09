//concrete class means what??
//1.A class which provide defination to unimplemented method which present in abstract class which complete abstract method by hierarchical inheritance with the help of extends keyword is concrete class.
//2.if 4 incomplete method present in abstract class then subclass(ConcreteSukhada) should provide defination of all 4 abstract method then subclass(ConcreteSkhada) is considered as concrete class
//3.there is multiple concrete class depend on requirement.

package abstractionOOPS;
public class ConcreteSukhada extends FormDetail{
     final public void name() {//force subclass(ConcrteSukhada) not to change the body of method
    	System.out.println("Sukhada"); 
       }
     public void mobNo() {//defination of abstract method
     	System.out.println("1234567890"); 
        }
     public void accountNo() {//defination of abstract method
     	System.out.println("1234567890"); 
        }
     public void accountType() {//defination of abstract method
     	System.out.println("Saving"); 
        }
     public static void main(String[] args) {
		ConcreteSukhada x=new ConcreteSukhada();
		x.welcome();
		x.name();
		x.mobNo();
		x.accountNo();
		x.accountType();
		x.thankYou();
	}
}
