//decalairing value of local variable in instance variable
package constructorType;

public class ParameterConstructor {
      //declairation
	String name; //instance variable
	String id;   //instance variable
	int age;     //instance variable
	public ParameterConstructor() {//zero argument
		name="Sukhada";
		id=" sukh26 ";
		age= 26;
	  System.out.println( name + id +age);	
	}
	public ParameterConstructor(String name1,String id1,int age1) {//parameter constructor
		name=name1;   //local variable
		id=id1;       //local variable
		age=age1;     //local variable
		System.out.println(name + id + age);
	}
	public static void main(String[] args) {
		new ParameterConstructor();
		new ParameterConstructor("suchitra "," suchi21 ", 45);
	}
}
