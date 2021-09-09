package constructorType;

public class DefaultConstructor {
      //declaration
	int a;
	//Initialisation
	public DefaultConstructor() {//constructor without parameter.
		a=10;
		System.out.println(a);
	}
	// case 1:-if we not provide value of float at calling of constructor in main method then it didnt get the value of parameter or variable in constructor. 
	public DefaultConstructor(int c) {
		c=40;  //didnt get value of c in output because we cant pass parameter in constructor it shows above constructor value.
		System.out.println(c);
	}
	//case 2:-we can use same parameter but with alternative type with same variable.
	public DefaultConstructor(int b,String s) {
		a=10;
		System.out.println(a);
		System.out.println(b +"\n"+ s);
	}
	public DefaultConstructor(String s,int b) {
		a=10;
		System.out.println(a);
		System.out.println(s + "\n" +b);
	}
	/*case 3:-if we use parameter in same sequence with same variable or different it shows error.
	public DefaultConstructor(String s,int b) {
		a=10;
		System.out.println(a);
	}*/
	public static void main(String[] args) {
		DefaultConstructor x=new DefaultConstructor();//or u can use this to call constructor.
		System.out.println(x.a);
		new DefaultConstructor();//by using new keyword we call constructor.
		new DefaultConstructor();//case 1
		new DefaultConstructor(25,"sukhada"); //case2
		new DefaultConstructor("chimni",50);  //case 2
	}
}
