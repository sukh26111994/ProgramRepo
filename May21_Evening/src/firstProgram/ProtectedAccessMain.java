//protected access modifier within same package
//more accessible than default modifier
package firstProgram;

public class ProtectedAccessMain {
public static void main(String[] args) {
	ProtectedAccess1 x=new ProtectedAccess1();
	x.father();
	x.mother();
}
}
