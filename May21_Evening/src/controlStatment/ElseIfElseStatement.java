package controlStatment;

public class ElseIfElseStatement {
public static void main(String[] args) {
	int marks=69;
	if(marks>65) {
		System.out.println("First Class with Distinction");
	}
	else if(marks>=60 && marks<65) {
		System.out.println("First Class");
	}
	else if(marks>=55 && marks<60) {
		System.out.println("Higher second class");
	}
	else if(marks>=50 && marks<55) {
		System.out.println("Second Class");
	}
	else if(marks>=40 && marks<50) {
		System.out.println("pass");
	}
	else {
       System.out.println("fail");
		}
}
}
