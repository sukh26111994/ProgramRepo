//interface is abstract in nature so it contain incomplete method.
//From java 8 we have default,static,private method in interface

package abstractionOOPS;

public interface CreditCard {  

   // int a=10;            //interface variable by default static & public
   abstract void ruppes(); //interface method by default public or abstract
   abstract void doller();
   abstract void pounds();
   
public static void thankYou() { //from java 8 by adding new functionalities we have static method.
	System.out.println("Thank u for visiting our bank");   
   }

/*case 1:cannot create object of interface
 * public static void main(String[] args) {  
	CreditCard x=new CreditCard(); 
}*/
}
