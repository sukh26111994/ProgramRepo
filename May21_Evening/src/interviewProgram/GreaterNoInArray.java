package interviewProgram;

public class GreaterNoInArray {
public static void main(String[] args) {
	int a[]= {10,50,40,70};
	int g1=0;
	int g2=0;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		if(a[i]>g1) {
			g2=g1;
			g1=a[i];
		}
	}
	System.out.println(g1);
	System.out.println(g2);
}
}
