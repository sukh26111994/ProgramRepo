package seleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadsTo implements CommonProp{//here we performing implementation for superclass
  static WebDriver x;//here as we need to use WebDriver many time so will store it as datetype
 
  
  public void UrlCompare() {
	 
  }
  public void chromeLunch() {
	System.setProperty(key, value);//setproperty is being used to declare driver file n its path 
	x=new ChromeDriver();//initialising WebDriver path
	x.navigate().to(url1);//giving url path to open browser
	x.navigate().to(url2);
	}

}
