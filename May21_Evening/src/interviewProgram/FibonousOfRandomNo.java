package interviewProgram;

public class FibonousOfRandomNo {
	public static void main(String[] args) {
		
		  int n=38790;
		  int r=0;
		  int sum=0;
		 
		   while(n>0) {
			  r=n%10;//remender=8,7,6
			  n=n/10;//diveder=67,6,0
			  sum=r+sum;//8,15(8+7),21(15+6)
			
			  System.out.println(sum);
//			   sum=n+r;
//			   if(sum>=n) 
//				   break;
//				   System.out.println(sum);
//				   n=r;
//				r=sum;
//				
		   }		  
		  }
	}
	  
