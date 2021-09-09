//implementation class
package seleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VelocityImplement implements VelocityGenProp{

	static WebDriver s;
	
	public void chromeLaunch() {
		System.setProperty(key, value);
		s=new ChromeDriver();
		s.manage().window().maximize();
		s.get(url);
	
	}

}
