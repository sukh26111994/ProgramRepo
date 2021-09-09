//Abstraction is process of hiding implementation code & providing only functionaly to end user.

package abstractionOOPS;

//abstract class contain complete as well as incomplete class.
//if method declaire as abstract then class must be abstract otherwise it shows error.

public abstract class FormDetail {   //abstract class
	   /* case 2:
	     FormDetail()  {       //constructor declaration
	    
		   System.out.println("Constructor");
	   }*/
	     
	public void welcome() {    //complete class
    	 System.out.println("Welcome To Our Bank");
     }
     
     //abstract method:-conatain incomplete method means which have semicolon rather block.
     
     abstract void name();//incomplete method
     abstract void mobNo();  //declairation of abstract class.
     abstract void accountNo();
     abstract void accountType();
     
     public void thankYou() {//complete method
    	 System.out.println("Thank You For Visting Our Bank");
     }
     
   /*case 1:error because constructor cannot body of incomplete method to overcome we use concrete class.
     public static void main(String[] args) {
    	 FormDetail x=new FormDetail();
    case 2:error because of constructor cannot call in main Method
    	 new FormDetail();
       }*/
}
