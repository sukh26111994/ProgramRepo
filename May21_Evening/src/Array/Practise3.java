package Array;

import java.util.Arrays;

public class Practise3 {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=70;
	a[1]=10;
	a[2]=40;
	a[3]=30;
	a[4]=20;
	for(int w:a) {
		System.out.println(w);
	}
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}
	System.out.println("Sorted no is");
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++) {
		System.out.println(a[i]);
	}
	System.out.println("Sorted no in desending no");
	for(int i=a.length-1;i>=0;i--) {
		System.out.println(a[i]);
	}
}
}
