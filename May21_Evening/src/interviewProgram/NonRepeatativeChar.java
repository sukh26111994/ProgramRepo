package interviewProgram;

public class NonRepeatativeChar {
public static void main(String[] args) {
	String s="aaadddqggghhhh";
	char[] c=s.toCharArray();
	for(char ch:c) {
		if(s.indexOf(ch)==s.lastIndexOf(ch)) {
			System.out.print("Non repeate char is :"+ch);
			break;
		}
	}
	
}
}
