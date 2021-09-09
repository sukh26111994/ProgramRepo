//execution main method
package seleniumStart;

public class CallGenProps extends GenPropsImplement{
	public static void main(String[] args) {
		GenPropsImplement x=new GenPropsImplement();
		x.chromeLaunch();
		ActUrl=s.getCurrentUrl();
		System.out.println(ActUrl);
		ActTitle=s.getTitle();
		System.out.print(ActTitle);
		x.UrlCompare();
		x.UrlCompare1();
		s.quit();
	}
}
