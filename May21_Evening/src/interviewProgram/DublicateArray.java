package interviewProgram;

import java.util.Arrays;

public class DublicateArray {
public static void main(String[] args) {
	int[] a= {1,2,3,3,4,5,6,6,6};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++) {
		int n=a[i];
		int count=0;
		for(int j=0;j<a.length;j++) {
			if(n==a[j]) {
				count++;
				
			}
			
			if(count>1) {
				System.out.println("Duplicate no is :"+a[i]);
				break;
			}
		}
	}
}
}
