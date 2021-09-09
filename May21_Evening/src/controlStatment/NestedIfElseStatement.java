package controlStatment;

public class NestedIfElseStatement {
public static void main(String[] args) {
	String un="Sukhada26";
	String pwd="26you";
	
	if(un=="sukhada25") {
		if(pwd=="26tu") {
			System.out.println("User logged successfully");
		}
		else {
			System.out.println("You have entered wrong password");
		}
		}
	else {
		System.out.println("You have entered wrong username");
	}
}
}
