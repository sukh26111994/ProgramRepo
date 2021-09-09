//implementation class
package seleniumStart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConcreteClass extends Chrome1{
static WebDriver b;
	public void chromeDriver() {
		System.setProperty(key, value);
	   b=new ChromeDriver();
	   b.navigate().to(url);
}
}
