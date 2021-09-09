package controlStatment;

import java.util.Scanner;

public class ComboStatement {
	
	public void check() {
		System.out.println("Welcome To SBI");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Username");
		  String s=sc.nextLine();
		
	if(s.equals("Sukhada")) {
			
	System.out.println("Your registered Username is ="+s);
	System.out.println("Enter Your registered Password");
	String pwd=sc.nextLine();
			   
	if(pwd.equals("Sukhada@26")) 
	{
	System.out.println("Your registered password is ="+pwd);
	System.out.println("Enter ur age");
		int age=sc.nextInt();
	System.out.println("You Eligible age is ="+age);
		if(age>=18) {
	System.out.println("You Can Open Account");
					  
	System.out.println("Enter The Day");
	   int day=sc.nextInt();
						  
	switch(day) {
	case 1:System.out.println("Monday");break;
	case 2:System.out.println("Tuesday");break;
	case 3:System.out.println("Wednseday");break;
	case 4:System.out.println("Thursday");break;
	case 5:System.out.println("Friday");break;
	case 6:System.out.println("Saturday");break;
	case 7:System.out.println("Sunday");break;
	default:System.out.println("Wrong day");
	System.out.println("Your registered Day is ="+day);break;
	}
 }
	else {  
    System.out.println("You Cannot Open Account");
		 }
	}
	else {
	System.out.println("You entered wrong password");
		}
}
else {
	System.out.println("You entered wrong username");
	}
}
	
	public static void main(String[] args) {
	  ComboStatement x=new ComboStatement();
	  x.check();
	}
}
