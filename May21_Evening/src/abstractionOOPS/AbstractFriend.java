//what is abstract class???
//class which fails to provide defination to abstarct method then subclass(AbstractFriend) should be deaclared as abstract class.
//there is no realation of final keyword because of hierachical inheritenace there is no realtion between ConcreteSukhada class & AbstractFriend
package abstractionOOPS;

public abstract class AbstractFriend extends FormDetail {
	//we doesnt provide defination to name method present in abstract class because od this we deaclare sublclass(AbstractFriend) as abstract.
	/*public void name() {//defination of abstract method
     	System.out.println("Pappa"); 
        }*/
	public void mobNo() {//defination of abstract method
     	System.out.println("1234567890"); 
        }
	public void accountNo() {//defination of abstract method
     	System.out.println("1234567890"); 
        }
	public void accountType() {//defination of abstract method
     	System.out.println("Saving"); 
        }
	/*  case 1:-we know we cannot create object of abstract class
	 * public static void main(String[] args) {
		AbstractFriend s=new AbstractFriend();
		
	}*/
}
