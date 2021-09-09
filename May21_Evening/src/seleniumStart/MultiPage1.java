//implementation class.
package seleniumStart;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiPage1 implements Selenium_Multi_Page{
static WebDriver s;
	public void google() throws InterruptedException {
	System.setProperty(key1, value1);
	s=new ChromeDriver();
	s.manage().window().maximize();
	s.manage().deleteAllCookies();
	s.get(url);
	s.findElement(By.xpath("//a[contains(text(),'Click this link to start new Tab')][1]")).click();
	String parentId=s.getWindowHandle();
	System.out.println("Parent window id:="+parentId);
	Set<String> allwindow = s.getWindowHandles();
	int size=allwindow.size();
	System.out.println("total window id is:="+size);
	for(String e:allwindow) {
    if(!parentId.equalsIgnoreCase(e)) {
	s.switchTo().window(e);
    Thread.sleep(2000);
    s.findElement(By.xpath("//input[@jsaction='paste:puy29d;']")).sendKeys("jobs in pune");
	Thread.sleep(2000);
	s.findElement(By.xpath("//input[@aria-label='Google Search'][1]")).click();	  
	Thread.sleep(2000);
	s.close();
	//  s.switchTo().window(parentId);
}
    s.switchTo().window(parentId);
    Thread.sleep(2000);
}
}
	public void yahoo() throws InterruptedException {
s.findElement(By.xpath("//a[text()=' Click this link to start new Tab '][3]")).click();
	String parentId=s.getWindowHandle();
	Set<String> allwindow = s.getWindowHandles();
	for(String b:allwindow) {
	if(!parentId.equalsIgnoreCase(b)) {
	s.switchTo().window(b);
    s.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("news");
		Thread.sleep(3000);
    s.findElement(By.xpath("//input[@type='submit']")).click();
	     Thread.sleep(2000);
	s.close();
    s.switchTo().window(parentId);
	  }
	  //s.switchTo().window(parentId);
	}}
	public void facebook() throws InterruptedException {
	Thread.sleep(2000);
	s.findElement(By.xpath("//a[text()=' Click this link to start  Session in same window']")).click();
	Thread.sleep(2000);
	String parentId=s.getWindowHandle();
	Set<String> allwindow = s.getWindowHandles();
	for(String e:allwindow) {
	 if(!parentId.equalsIgnoreCase(e)) {
	 s.switchTo().window(e);
	 s.findElement(By.xpath("//input[@class='inputtext_55r1_6luy']")).sendKeys("sukhada@1232");
	Thread.sleep(2000);
	s.close();
}
}
s.switchTo().window(parentId);
}}
		
	

	
