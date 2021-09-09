//implementation class.
package seleniumStart;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropImplement implements DragDrop{
static WebDriver d;
	public void run() throws InterruptedException {
	System.setProperty(Key1, value1);
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.get(url1);
	d.switchTo().frame(0);
WebElement element1 = d.findElement(By.xpath("//div[@id='draggable']"));
WebElement element2 = d.findElement(By.xpath("//div[@id='droppable']"));
	Actions a=new Actions(d);
	Thread.sleep(2000);
	//a.clickAndHold(element1).moveToElement(element2).release().build().perform();
a.dragAndDrop(element1, element2).perform();
d.switchTo().defaultContent();
WebElement element3 = d.findElement(By.xpath("//input[@name='s']"));
a.sendKeys(element3,"hi").perform();
WebElement element4 = d.findElement(By.xpath("(//a[@title='jQuery UI'])[2]"));
a.contextClick(element4).perform();
	Thread.sleep(2000);
a.doubleClick(element4).perform();
	Thread.sleep(2000);
d.close();
	}
	public void demo() throws InterruptedException {
		System.setProperty(Key1, value1);
		d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to(url2);
		Thread.sleep(2000);
 WebElement ele = d.findElement(By.className("dropbtn"));
 Actions a=new Actions(d);
 Thread.sleep(2000);
 a.moveToElement(ele).perform();
 List<WebElement> elements = d.findElements(By.xpath("//div[@class='dropdown-content']//a"));
   int s=elements.size();
   System.out.println(s);
   for(int i=0;i<s;i++) {
	     WebElement f=elements.get(i);
		 String p=f.getAttribute("innerHTML");
		   System.out.println(p);
		   }
   for(int i=0;i<=s;i++) {
     WebElement g=elements.get(i);
	 String q=g.getAttribute("innerHTML");
	   System.out.println(q);
	   if(q.equalsIgnoreCase("testng")) {
		   g.click();
		   break;
		  
		   }
	   
   }
   d.close();
	}}
	   
   
	


