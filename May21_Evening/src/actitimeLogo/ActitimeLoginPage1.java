package actitimeLogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPage1 {
//declairation
	private WebElement un;
	private WebElement pwd;
	private WebElement login;
	WebDriver driver;
	//initialisation
	public ActitimeLoginPage1(WebDriver driver) {
		this.driver=driver;
		un=driver.findElement(By.xpath("//input[@id='username']"));
		pwd=driver.findElement(By.xpath("//input[@name='pwd']"));
		login=driver.findElement(By.xpath("//a[@id='loginButton']"));
	}
	//usage
	public void setActitimeUsername() {
		un.sendKeys("admin");
	}
	public void setActitimePassword() {
		pwd.sendKeys("manager");
	}
	public void verifyActitimeLoginButton() {
		login.click();
	}
}
