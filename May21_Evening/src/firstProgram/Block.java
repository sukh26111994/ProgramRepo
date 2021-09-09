package firstProgram;

public class Block {
    static {//static block
    	String name="sukhada";
    	System.out.println("Name:"+name);
    }
    {
    	String name1="Jirole";
    	System.out.println("Name:"+name1);
    }
    {
    	String place="Akkalkot";
    	System.out.println("Native Place:"+place);
    }
    public static void name2() {
    	String name="Kiran";
    	System.out.println("Name:"+name);
    }
    public Block() {
    	int a=123456789;
    	System.out.println("Mobile No:"+a);
    }
    public void mob() {
    	int a=123456789;
    	System.out.println("Alternate Mobile No:"+a);
    }
    public static void main(String[] args) {
		name2();
		Block b=new Block();
		b.mob();
	}
}
