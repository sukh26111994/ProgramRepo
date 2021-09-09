package Array;

import java.util.Arrays;

public class Practise5 {
public static void main(String[] args) {
	String name[]= {"Sukhada","Anjali","Shruti","Ronnie"};
	for(String w:name) {
		System.out.println(w);
	}
	System.out.println("The desending order");
	Arrays.sort(name);
	for(int i=0;i<=name.length-1;i++) {
		System.out.println(name[i]);
	}
	System.out.println("Assending order no");
	for(int i=name.length-1;i>=0;i--) {
		System.out.println(name[i]);
	}
}
}
