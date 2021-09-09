//implement class
package PuneUniversityProject;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
public class ImplementClass implements CommonProp{
static WebDriver d;
	public void demo() throws InterruptedException, IOException {
	System.setProperty(key, value);
	d=new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to(url);
	d.switchTo().frame(0);
    d.findElement(By.xpath("//span[@id='books']")).click();
   String parent = d.getWindowHandle();
   Set<String> pc = d.getWindowHandles();
   for(String e:pc) {
   if(!parent.equalsIgnoreCase(e)) {
	d.switchTo().window(e);
    Thread.sleep(2000);
	WebElement year = d.findElement(By.xpath("//select[@id='FromYear']"));
	Select s=new Select(year);
	s.selectByVisibleText("2017");
	List<WebElement> y = s.getOptions();
	int total=y.size();
	System.out.println(total);
	for(int i=0;i<total;i++) {
	String o = y.get(i).getText();
	System.out.println(o);
 }
	d.findElement(By.xpath("//select[@id='ToYear']")).sendKeys("2020");
	d.findElement(By.xpath("//button[@type='Submit']")).click();
	d.close();
 }
 }
  d.switchTo().window(parent);
  d.switchTo().defaultContent();
  Thread.sleep(2000);
  File source = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
  String path="E:\\Screenshot\\University.png";
  File destination = new File(path);
  FileHandler.copy(source, destination);
  JavascriptExecutor j = ((JavascriptExecutor)d);
  j.executeScript("scroll(0,2500)");
  Thread.sleep(2000);
  JavascriptExecutor s = ((JavascriptExecutor)d);
  s.executeScript("scroll(0,-2500)");
  Thread.sleep(2000);
  d.close();
}
}
