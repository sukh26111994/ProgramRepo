package firstProgram;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		   System.out.println("Self Introduction");
		    System.out.println("enter your name");
		    String a=t.nextLine();
		    System.out.println("Your name is ="+a);
		    System.out.println("enter your college name");
		    String b=t.nextLine();
		    System.out.println("Your college name is ="+b);
		    System.out.println("enter your Qualification");
		    String c=t.nextLine();
		    System.out.println("Your Qualification is ="+c);
		    System.out.println("enter your blood group");
		    String d=t.nextLine();
		    System.out.println("Your blood group is ="+d);
		    }
}
