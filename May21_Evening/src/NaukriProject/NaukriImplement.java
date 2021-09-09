package NaukriProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriImplement implements NaukriPage{
    static WebDriver d;
    static String ExpUrl="https://www.naukri.com/";
    static String ExtTitle="Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
	public void page() throws InterruptedException, AWTException {
	System.setProperty(key, value);
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get(url);
	String actUrl = d.getCurrentUrl();
	System.out.println("Actual Url is ="+actUrl);
	if(actUrl.equals(ExpUrl)) {
	System.out.println("Test sinarios is passed");	
	}
	else {
	System.out.println("Test sinarios is failed");	
	}
	String actTitle = d.getTitle();
	System.out.println("Actual Title is ="+actTitle);
	
	if(actTitle.equals(ExtTitle)) {
	System.out.println("Test sinarios is passed");	
	}
	else {
	System.out.println("Test sinarios is failed");	
	}
	 String parent = d.getWindowHandle();
	System.out.println(parent);
	Set<String> child = d.getWindowHandles();
	int count = child.size();
	System.out.println(count);
	for(String e:child) {
	   if(!parent.equalsIgnoreCase(e)) {
		   d.switchTo().window(e);
		  // d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		   Thread.sleep(2000);
		   System.out.println("The title of child window:"+d.getTitle());
		   Thread.sleep(3000);
		   d.close();
}
	 d.switchTo().window(parent);
	 }}

	public void mouceover() throws InterruptedException {
	Thread.sleep(2000);
	WebElement w = d.findElement(By.xpath("(//div[@class='mTxt'])[2]"));
	Actions a=new Actions(d);
	Thread.sleep(2000);
	a.moveToElement(w).perform();
	List<WebElement> w1 = d.findElements(By.xpath("//div[@class=\"subMenu\"]//a"));
	int count = w1.size();
	System.out.println(count);
	Thread.sleep(2000);
	for(int i=0;i<count;i++) {
		 WebElement g=w1.get(i);
		 String q=g.getAttribute("innerHTML");
		   System.out.println(q);
		   Thread.sleep(2000);
		   if(q.equalsIgnoreCase("Browse All Recruiters")) {
			   g.click();
			   break;	
	}
	}
	}

	public void search() throws InterruptedException {
		Thread.sleep(2000);
		 JavascriptExecutor j = ((JavascriptExecutor)d);
		   j.executeScript("scroll(0,3000)");
			 Thread.sleep(2000);
			 JavascriptExecutor s = ((JavascriptExecutor)d);
			 s.executeScript("scroll(0,-3000)");
			 Thread.sleep(2000);
	     d.findElement(By.xpath("//input[@id='qsb-keyword-sugg']")).sendKeys("Java Developer");
	     Thread.sleep(2000);
	     d.findElement(By.xpath("//input[@id='qsb-location-sugg']")).sendKeys("Pune");
	     Thread.sleep(2000);
	     d.findElement(By.xpath("(//button[@class='btn'])[1]")).click();
	     Thread.sleep(2000);
	     d.close();
}}

