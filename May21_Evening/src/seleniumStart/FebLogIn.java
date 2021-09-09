package seleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FebLogIn implements FacebookLog{

	static WebDriver b;

	public void fb() {
	System.setProperty(key1, value1);
	b=new ChromeDriver();
	b.manage().window().maximize();
	b.manage().deleteAllCookies();
	b.get(url1);
	
	}

}
