package introMethod;

public class MCICArgument {
  public static void mood() {
	  System.out.println("I LOVE U");
  }
  public static void mood(String song) {//method overloading
	  System.out.println("I HATE U");
  }
  public void ipl(String winner) {
	  System.out.println("The winner team is ="+"MI");
  }
  public void ipl(String looser,int player) {//method overloading
	  System.out.println("The looser team is ="+"CSK");
  }
  public static void main(String[] args) {
	  MCICArgument c=new MCICArgument();
	  mood();
	  mood("Dhinchak");
	  c.ipl("MI");
	  c.ipl("CSK", 12);
}
}
