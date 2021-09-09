package interviewProgram;

import java.util.Arrays;

public class NonRepeatedNo {
public static void main(String[] args) {
	int[] a = {4,9,4,8,7,8,9};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++){
		int n = a[i];
		int counter =0;
		for(int j=0;j<a.length;j++){
			if(n==a[j])
				counter++;
		}
		if(counter==1){
			System.out.println("Non-Repeat Number = "+a[i]);
			break;
		}
	}
}}