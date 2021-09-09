//implentation class.
package seleniumStart;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ImplicityWaitImplement implements ImpliciteWait{
static WebDriver d;
	public void recharge() {
	System.setProperty(key, value);
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get(url);
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	//implicity wait=waiting time only.
d.findElement(By.xpath("//span[text()='Prepaid/Postpaid']")).click();
WebElement w = d.findElement(By.xpath("//input[@id='radio1']"));
boolean res=w.isSelected();
	System.out.println(res);
	if(res==true) {
		System.out.println("Test Sinarios Passed");
	}
	else {
		System.out.println("Test Sinarios failed");
	}
	
WebElement h = d.findElement(By.xpath("//input[@id='radio0']"));
boolean res1=h.isSelected();
System.out.println(res1);
	if(res1==true) {
		System.out.println("Test Sinarios Passed");
	}
	else {
		System.out.println("Test Sinarios failed");
	}
	d.close();
	}

	public void fbLogin() {
		System.setProperty(key, value);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();	
d.navigate().to(url1);
WebElement w = d.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));	
boolean res = w.isDisplayed();
		if(res==true) {
			System.out.println("Test Sinarios Passed");
		}
		else {
			System.out.println("Test Sinarios failed");
		}
		d.close();
	}
	
	public void fbSignIn() {
		System.setProperty(key, value);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();	
d.navigate().to(url2);
WebElement w = d.findElement(By.xpath("//input[@name='firstname']"));
boolean res = w.isEnabled();
		if(res==true) {
			System.out.println("Test Sinarios Passed");
		}
		else {
			System.out.println("Test Sinarios failed");
		}
		d.close();
	}
}
