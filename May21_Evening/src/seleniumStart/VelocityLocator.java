//Locator & absolute Xpath
package seleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VelocityLocator implements VelocityGenProp {

	static WebDriver d;
	public void chromeLaunch() throws InterruptedException {
		System.setProperty(key, value);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get(url);
		d.findElement(By.tagName("input")).sendKeys("Sukhada");
	    Thread.sleep(2000);
	    d.findElement(By.id("password")).sendKeys("sukh@1234");
	    Thread.sleep(2000);
	    d.findElement(By.name("EmailID")).sendKeys("sukhadasjirole@gmail.com");
	    Thread.sleep(2000);
	    d.findElement(By.className("MobNo")).sendKeys("9850048140");
	    Thread.sleep(2000);
	    d.findElement(By.id("female")).click();
	    Thread.sleep(2000);
	    d.findElement(By.className("checkbox")).click();
		/* s.findElement(By.linkText("Google link")).click(); s.navigate().back(); */
		 
	    d.findElement(By.partialLinkText("Velocity")).click();
	    d.navigate().back();
	    
	    d.findElement(By.xpath("/html/body/div[3]/select")).sendKeys("Cannada");
	    Thread.sleep(3000);
	    d.close();
	}

}
