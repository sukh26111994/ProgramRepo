package controlStatment;

public class SwitchString {
   public void demo() {
	   String name="sukhada";
	   switch(name) {
	   case "sukhada":System.out.println("one");break;
	   case "akshata":System.out.println("two");break;
	   case "pranav":System.out.println("three");break;
	   case "kirti":System.out.println("four");break;
	   case "sham":System.out.println("five");break;
	   default:System.out.println();
	   }
   }
   public static void main(String[] args) {
	   SwitchString x=new SwitchString();
	   x.demo();
}
}
