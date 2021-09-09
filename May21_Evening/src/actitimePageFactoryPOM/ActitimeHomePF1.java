package actitimePageFactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePF1 {
	//declairation
	@FindBy(xpath="//img[@height='61']")
		private WebElement logo;
	
	@FindBy(xpath="//a[@id='logoutLink']")
		private WebElement logout;
	
		WebDriver driver;
		
		public ActitimeHomePF1(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		//usage
		public void verifyActitimeLogoPF1() {
			boolean res = logo.isDisplayed();
			if(res==true) {
				System.out.println("Test sinarios are passed");
			}else {
				System.out.println("Test sinarios are failed");
			}
		}
		public void verifyActitimeLogoutButtonPF1() {
			logout.click();
		}
}
