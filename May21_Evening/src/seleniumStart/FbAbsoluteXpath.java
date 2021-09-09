package seleniumStart;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbAbsoluteXpath implements FacebookLog{

	static WebDriver b;
	public void fb() throws IOException, InterruptedException {
		System.setProperty(key1, value1);
		b=new ChromeDriver();
		b.manage().window().maximize();
		b.manage().deleteAllCookies();
		b.get(url1);
		b.findElement(By.partialLinkText("Create")).click();
		Thread.sleep(3000);
		b.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("sukhada");
		//b.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input")).sendKeys("sukhada");
        Thread.sleep(2000);
		//1.(//tagname)[index]
		//b.findElement(By.tagName("//input)[33]")).sendKeys("Sukhada");
		b.close();
		
	}

}
