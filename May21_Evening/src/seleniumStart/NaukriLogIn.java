//implementation class
package seleniumStart;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NaukriLogIn implements NaukriLog{
static WebDriver b;
	public void naukri() throws InterruptedException  {
    System.setProperty(key1,value1);
	b=new ChromeDriver();
	b.manage().window().maximize();
	b.manage().deleteAllCookies();
	b.get(url1);
	String parent=b.getWindowHandle();
	System.out.println(parent);
	//Thread.sleep(2000);
	Set<String> pc =b.getWindowHandles();
	int count=pc.size();
	System.out.println("Total count: "+count);
	
	for(String child:pc)
	{
		if(!parent.equalsIgnoreCase(child))
		{
		b.switchTo().window(child);
		System.out.println("Child Window title: "+b.getTitle());
		Thread.sleep(2000);
		b.close();
		}
	}
	b.switchTo().window(parent);
	Thread.sleep(1000);
	b.findElement(By.xpath("//input[contains(@name,'location')]")).sendKeys("Akkalkot");
	Thread.sleep(2000);
	b.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
	b.close();
	}
}
