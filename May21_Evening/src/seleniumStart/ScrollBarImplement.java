//implentation class.
package seleniumStart;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScrollBarImplement implements ScrollBar{
static WebDriver b;
	public void run() throws InterruptedException {
	System.setProperty(key, value);
	b=new ChromeDriver();
	b.manage().window().maximize();
	b.manage().deleteAllCookies();
	b.get(Url);
	JavascriptExecutor j = ((JavascriptExecutor)b);
	j.executeScript("scroll(0,2100)");
	Thread.sleep(3000);
	b.switchTo().frame("a077aa5e");
	b.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
	Thread.sleep(3000);
	b.quit();
	}
}
