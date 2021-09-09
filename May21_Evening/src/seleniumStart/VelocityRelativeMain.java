//relativexpath
package seleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VelocityRelativeMain implements VelocityGenProp{

	static WebDriver d;
	public void chromeLaunch() {
		System.setProperty(key, value);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get(url);
		//1.tagName
		   d.findElement(By.tagName("input")).sendKeys("Sukhada");
		//2.(//tagname)[index]
		   d.findElement(By.xpath("(//input)[2]")).sendKeys("sukh@1234");
		//3.//tagname[@AttributeName='AttributeValue']
		   d.findElement(By.xpath("//input[@placeholder='EmailId']")).sendKeys("sukhadasjirole@gmail.com");
		//4.//tagname[text()='textvalue'] it can be use for link
		   
		   //s.findElement(By.xpath(("//a[text()='Velocity']"))).click();
		   //s.navigate().back();
		//5.//tagname[contain(@AttributeName,'AttributeValue')]
		   d.findElement(By.xpath("//input[contains(@id,'female')]")).click();
		//6.//tagname[contains(text(),'textValue')]-it can be used for link
		   d.findElement(By.xpath("//a[contains(text(),'Velocity')]")).click();
		
	}

	
}   
	   
	


