//implementation class.
package seleniumStart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AlertPopImplement implements AlertPop{
static WebDriver d;
	public void demo() throws InterruptedException{
	System.setProperty(key, value);
	d=new ChromeDriver();	
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get(url);
	}
	
	public void one() throws InterruptedException {
	d.findElement(By.id("alertButton")).click();
	Thread.sleep(2000);
	d.switchTo().alert().accept();
	}
	
	public void two() throws InterruptedException{
	d.findElement(By.id("confirmButton")).click();
	Thread.sleep(2000);
	d.switchTo().alert().dismiss();
	}
	
	public void three() throws InterruptedException{
	d.findElement(By.id("confirmButton")).click();
	String t = d.switchTo().alert().getText();
	System.out.println(t);
d.switchTo().alert().accept();
	}

	public void four() throws InterruptedException {
	d.findElement(By.id("promtButton")).click();
	String t = d.switchTo().alert().getText();
	System.out.println(t);
	Thread.sleep(2000);
	d.switchTo().alert().sendKeys("sukhada");
	d.switchTo().alert().accept();
	}
}
