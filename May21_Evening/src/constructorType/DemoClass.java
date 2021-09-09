package constructorType;

public class DemoClass {
 //declairation
	float pie;
	float r;
	 
	//initialisation
	public DemoClass() {
		pie= 3.14f;
		r=4.5f;
		double area=pie*r*r;
		System.out.println("The value of area is ="+ area);
	}
	public DemoClass(float pie,float r) {
		double area=pie*r*r;
		System.out.println("The value of area is ="+ area);
	}
	public static void main(String[] args) {
		new DemoClass();
		new DemoClass(3.14f,5.5f);
	}
}
