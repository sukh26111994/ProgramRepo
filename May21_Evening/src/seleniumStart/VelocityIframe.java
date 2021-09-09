package seleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VelocityIframe implements VelocityGenProp{

	static WebDriver s;
	public void chromeLaunch() throws InterruptedException {
		System.setProperty(key, value);
	s=new ChromeDriver();
	s.manage().window().maximize();
	//s.manage().deleteAllCookies();
	s.get(url);
	s.findElement(By.tagName("input")).sendKeys("Sukhada");
    Thread.sleep(2000);
    s.findElement(By.id("password")).sendKeys("sukh@1234");
    Thread.sleep(2000);
	s.switchTo().frame(0);
	s.findElement(By.name("EmailID")).sendKeys("sukhadasjirole@gmail.com");
    Thread.sleep(2000);
    s.findElement(By.className("MobNo")).sendKeys("9850048140");
    Thread.sleep(2000);
	s.switchTo().defaultContent();
	s.findElement(By.id("female")).click();
    Thread.sleep(2000);
    s.quit();
	}

}
