package Array;

public class Practise6 {
public static void main(String[] args) {
	//datatype[][] VariableName;
	//datatype [][] variableName;
	//datatype variablename[][];
	//datatype []variablename[];
	int a[][]=new int[3][3];
	a[0][0]=1;
	a[0][1]=2;
	a[0][2]=3;
	a[1][0]=4;
	a[1][1]=5;
	a[1][2]=6;
	a[2][0]=7;
	a[2][1]=8;
	a[2][2]=9;
	System.out.println(a[2][2]);
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			System.out.println(a[i][j]);
		}
	}
}
}
