package Array;

public class Practise7 {
public static void main(String[] args) {
	int a[][]= {{1,2,3},{4,5,6}};
	System.out.println(a[1][2]);
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length+1;j++) {
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}
}
}
