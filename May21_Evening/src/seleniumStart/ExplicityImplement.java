package seleniumStart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityImplement implements ExplicityWait{

	static WebDriver d;
	static String ExpUrl="https://www.phonepe.com/";
	static String ExpTitle="PhonePe: UPI Payments, Investment, Insurance, Recharges, DTH & More | PhonePe India's Payments App - PhonePe.com";
	public void phone() {
	System.setProperty(key, value);
	d=new ChromeDriver();
	d.manage().window().maximize();
	 WebDriverWait w = new WebDriverWait(d,10);//explicit step1
	d.navigate().to(url);
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	String actUrl = d.getCurrentUrl();
	System.out.println("Actual Url is="+actUrl);
	if(actUrl.equals(ExpUrl)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");	
	}
	String actTitle = d.getTitle();
	System.out.println("Actual Title is="+actTitle);
	if(actTitle.equals(ExpTitle)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");	
	}
	WebElement Link;
	Link=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@class,'active')])[1]")));
	Link.click();
    d.close();
	}
}
