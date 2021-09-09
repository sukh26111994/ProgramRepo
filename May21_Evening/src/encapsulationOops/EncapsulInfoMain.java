package encapsulationOops;

public class EncapsulInfoMain {
public static void main(String[] args) {
	EncapsulInfo x=new EncapsulInfo();
	x.setName("sukhada");
	x.setId("sukh@26");
	x.setAge(26);
	String s=x.getName();
	String h=x.getId();
	int p=x.getAge();
	System.out.println("Name:"+s+"\n"+"Id:"+h+"\n"+"Age:"+p);
}
}
