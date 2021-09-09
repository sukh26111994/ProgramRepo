//Implementation class
package seleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenPropsImplement implements GenProps_1{

	static WebDriver s;
	static String ActUrl="https://www.amazon.com";
	static String ExpUrl="https://www.amazon.com/";
	static String ActTitle;
	static String ExpTitle="Amazon.com. Spend less. Smile more.";
	public void UrlCompare() {
		if(ExpUrl.equals(ActUrl)){
			System.out.println("Sinarioes executed successfully");
		}
		else {
			System.out.println("Sinarioes execution failed");
		}
	}
	public void UrlCompare1() {
		if(ExpTitle.equals(ActTitle)){
			System.out.println("Sinarioes executed successfully");
		}
		else {
			System.out.println("Sinarioes execution failed");
		}
	}
	
	public void chromeLaunch() {
		// TODO Auto-generated method stub
		System.setProperty(key, value);
		s=new ChromeDriver();
		s.manage().window().maximize();
		s.navigate().to(url);
	}

}
