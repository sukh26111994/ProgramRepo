//Dropdown class
package seleniumStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbDropdown implements FacebookLog{
static WebDriver b;
	public void fb() throws InterruptedException {
	System.setProperty(key1, value1);
	b=new ChromeDriver();
	b.manage().window().maximize();
	b.manage().deleteAllCookies();
	b.get(url2);	
	WebElement day = b.findElement(By.xpath("//select[@id='day']"));
	  Select q=new Select(day);
	q.selectByVisibleText("26");
	
	WebElement month = b.findElement(By.xpath("//select[@id='month']"));
	 Select q1=new Select(month);
	q.selectByIndex(10);
	
	WebElement year = b.findElement(By.xpath("//select[@id='year']"));
	 Select q3=new Select(year);
	q3.selectByValue("1994");
	Thread.sleep(2000);
	b.quit();
	}}
