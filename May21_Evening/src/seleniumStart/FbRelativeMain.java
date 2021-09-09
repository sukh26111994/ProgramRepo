//relative xpath
package seleniumStart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FbRelativeMain implements FacebookLog{

	static WebDriver b;
	public void fb() throws InterruptedException{
		 
		 //1.//tagname[text()='textvalue'] it can be use for link
		   //b.findElement(By.xpath("//a[text()='Create New Account']")).click();
		   b.findElement(By.xpath("//a[text()='Create New Account']")).click();
		   //b.findElement(By.partialLinkText("Create")).click();
			Thread.sleep(3000);
		   //1.(//tagname)[index]
		   b.findElement(By.xpath("(//input)[9]")).sendKeys("Sukhada");
		 //2.//tagname[@AttributeName='AttributeValue']
		   b.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jirole"); 
		 //4.//tagname[contain(@AttributeName,'AttributeValue')]
		   b.findElement(By.xpath("//input[contains(@data-type,'password')]")).sendKeys("sukh@1234");
		  
		 //6.//tagname[contains(text(),'textValue')]-it can be used for link
		 b.findElement(By.xpath("//a[contains(text(),'Data Policy')]")).click(); 
		
		
	}
  
	 
}

