package interviewProgram;

import java.util.Arrays;

public class CommonElement {
public static void main(String[] args) {
	int[] a= {1,2,3,4,5};
	Arrays.sort(a);
	int[] b= {5,6,7,8,9};
	Arrays.sort(b);
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<b.length;j++) {
			if(a[i]==b[j]) {
				System.out.println("Common Things is :"+b[j]);
			}
		}
	}
}
}
