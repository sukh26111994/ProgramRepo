package actitimePageFactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPF1 {
//declairation
	@FindBy(xpath="//input[@id='username']")
	private WebElement un;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement login;
	
	WebDriver driver;
	
	public ActitimeLoginPF1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//usage
		public void setActitimeUsernamePF1() {
			un.sendKeys("admin");
		}
		public void setActitimePasswordPF1() {
			pwd.sendKeys("manager");
		}
		public void verifyActitimeLoginButtonPF1() {
			login.click();
		}
}
