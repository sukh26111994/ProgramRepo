package Array;

public class Practise2 {
public static void main(String[] args) {
	int a[]=new int[5];
	a[0]=50;
	a[1]=20;
	a[2]=40;
	a[3]=10;
	a[4]=30;
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
	for(int i=a.length-1;i>=0;i--) {
		System.out.println("The reverse no is");
		System.out.println(a[i]);
	}
}
}
