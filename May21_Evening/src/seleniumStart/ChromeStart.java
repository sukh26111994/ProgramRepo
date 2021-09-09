package seleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeStart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","E:\\MSNewVersion\\edgedriver.exe");
	    WebDriver b=new EdgeDriver();	
	    
	}
}
