package actitimeLogo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeHomePage1 {
//declairation
	private WebElement logo;
	private WebElement logout;
	WebDriver driver;
	//initialisation
	public ActitimeHomePage1(WebDriver driver) {
		this.driver=driver;
		logo=driver.findElement(By.xpath("//img[@height='61']"));
		logout=driver.findElement(By.xpath("//a[@id='logoutLink']"));
	}
	//usage
	public void verifyActitimeLogo() {
		boolean res = logo.isDisplayed();
		if(res==true) {
			System.out.println("Test sinarios are passed");
		}else {
			System.out.println("Test sinarios are failed");
		}
	}
	public void verifyActitimeLogoutButton() {
		logout.click();
	}
}
