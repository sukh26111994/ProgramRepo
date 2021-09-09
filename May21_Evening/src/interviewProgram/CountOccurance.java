package interviewProgram;

public class CountOccurance {
public static void main(String[] args) {
	String s="Java is Programming langiage";
	
	int count=s.length();
	int count_afteremovea=s.replaceAll("a", "").length();
	int totalcount=count-count_afteremovea;
	System.out.println(totalcount);
}
}
