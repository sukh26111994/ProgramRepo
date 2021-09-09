package interviewProgram;

public class DublicateString {
public static void main(String[] args) {
	String s ="Java is Programming Language";
	
	int Totallength =s.length();
	
	int TotalCount_AfterRemove=s.replace("g", "").length();
	
	int count = Totallength - TotalCount_AfterRemove;
	
	System.out.println("Duplicate letter count is "+count);
}
}
