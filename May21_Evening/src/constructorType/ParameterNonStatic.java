package constructorType;

public class ParameterNonStatic {
     
	String Item;
	int Qty;
	float price;
	public ParameterNonStatic(String Item1,int Qty1,float price1) {
		Item=Item1;
		Qty=Qty1;
		price=price1;
		System.out.println(Item + Qty + price);
	}
	public ParameterNonStatic(String Item2,float price2,int Qty2) {
		Item=Item2;
		Qty=Qty2;
		price=price2;
		System.out.println(Item + Qty + price);
	}
	public void Grocery(){
		new ParameterNonStatic("wheat ",5 , 4.5f);
		new ParameterNonStatic("rice ",7 , 5.5f);
	}
	public static void main(String[] args) {
		ParameterNonStatic x=new ParameterNonStatic("chk ",1 ,10f);
		x.Grocery();
	}
}
