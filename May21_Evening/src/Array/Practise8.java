package Array;

public class Practise8 {
	public static void main(String[] args) {
		String[] s = {"Amol", "Ankit", "Shubham","Priyanka","Amol", "Ankit", "Shubham"};

		for (int i = 0; i <s.length-1; i++) {
			for (int j = i+1; j<s.length;j++) {
				if(s[i].equals(s[j]) && (i!=j)){
					System.out.println("Duplicates Infomation is :- "+s[j]);
				}
			}
		}

	}
}
