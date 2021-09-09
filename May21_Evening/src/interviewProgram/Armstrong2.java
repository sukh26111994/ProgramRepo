package interviewProgram;

public class Armstrong2 {
	//1634=1^4+6^4+3^4+4^4
	//    =1+1296+81+256
	//    =1634
public static void main(String[] args) {
	int n=1634;
	int temp=n;
	int c=0;
	int d=0;
	int s=0;
	while(n>0) {
		c=n%100; //34,63,16,1
		d=c%10;//4,3,6,1
		s=d*d*d*d+s;//256,337(256+81),1633(337+1296),1634(1633+1)
		n=n/10;//163,16,1		
	}
	if(temp==s) {
		System.out.println("Armstrong no");
	}
	else {
		System.out.println("not armstrong number");
	}
}
}
