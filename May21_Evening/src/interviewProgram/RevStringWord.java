package interviewProgram;

public class RevStringWord {
public static void main(String[] args) {
	String s = "life is beautiful enjoy it";
	String[] parts = s.split(" ");
	for(int i=parts.length-1;i>=0;i--)
		System.out.print(parts[i]+" ");
}
}
