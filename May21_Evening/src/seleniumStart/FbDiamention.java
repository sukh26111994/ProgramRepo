//diamention class
package seleniumStart;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbDiamention implements FacebookLog{

	static WebDriver b;
	public void fb()  {
		System.setProperty(key1, value1);
		b=new ChromeDriver();
		b.manage().window().maximize();
		b.manage().deleteAllCookies();
		b.get(url1);
		
		Dimension a=new Dimension(1000,800);//gives the diamension/resized the size
		b.manage().window().setSize(a);//setSize is method of browser to set the size.
		
		Point p=new Point(200,100);//to set the different origin or to give the different reference of start/to change the position.
		b.manage().window().setPosition(p);
		
	}
	
}

