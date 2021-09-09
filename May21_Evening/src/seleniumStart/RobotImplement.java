package seleniumStart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotImplement implements RobotInterface{

	static WebDriver d;
	public void demo() throws InterruptedException, AWTException {
    System.setProperty(key, value);
	d=new ChromeDriver();	
	d.manage().window().maximize();
	d.get(url);
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='email']")).sendKeys("sukhadasjirole@gmail.com");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@id='pass']")).sendKeys("9403007489");
	Thread.sleep(2000);
	d.findElement(By.xpath("//button[@type='submit']")).click();

	 Robot s = new Robot();
	
	Thread.sleep(2000);
	s.keyPress(KeyEvent.VK_TAB);
	s.keyRelease(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	s.keyPress(KeyEvent.VK_ENTER);
	
	Thread.sleep(5000);
	d.findElement(By.xpath("(//div[contains(@class, 's45kfl79 ')])[4]")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("(//div[contains(@data-visualcompletion, 'ignore-dynamic')])[18]")).click();
	Thread.sleep(2000);
	d.close();

	}
}
