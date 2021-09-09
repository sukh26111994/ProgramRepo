package operators;

public class UnaryOperator {
	public void demo() {
		int s=10;
		System.out.println(s);   //10
		System.out.println(s++);  //10 (10+1=11)
		System.out.println(s--);  //11 (11-1=10)
		System.out.println(--s);  //10-1=9
		System.out.println(++s);   //9+1=10
		System.out.println(+s);    //10
		System.out.println(-s);    //-10
		System.out.println(s--);   //10 (10-1=9)
		System.out.println(--s);   //9-1=8
		System.out.println(~s); //-1-8=-9
	}
	public static void main(String[] args) {
		UnaryOperator x=new UnaryOperator();
		x.demo();
	}
}
	
