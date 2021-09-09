package loopStatement;

public class Loop8 {
public static void main(String[] args) {
	for(int i=0;i<=4;i++) {
		for(int j=0;j<=i;j++) {
			if(i>=1 && j<=i-1) {
				System.out.print(" ");
			}else {
				System.out.print("*");
			}
		}
		System.out.println(" ");
	}
}
}
