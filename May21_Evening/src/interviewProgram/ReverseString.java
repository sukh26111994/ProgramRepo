package interviewProgram;

public class ReverseString {
public static void main(String[] args) {
	
		//using string concatentation operator
		
		String str = "sukhada";
		String rev = "";
		
		int len =str.length();//8
		for(int i = len-1;i>=0;i--) {//7 6 5 4 3 2 1 0 -1
			rev = rev + str.charAt(i);//a k n k 
		}
		System.out.println(rev);
	
}
}
