package actitimeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimeLogo.ActitimeHomePage1;
import actitimeLogo.ActitimeLoginPage1;

public class ActitimeTest1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\new chrome drive 92 version\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://localhost:8008/login.do");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	ActitimeLoginPage1 login=new ActitimeLoginPage1(driver);
	login.setActitimeUsername();
	login.setActitimePassword();
	login.verifyActitimeLoginButton();
	
	Thread.sleep(2000);
	ActitimeHomePage1 logout=new ActitimeHomePage1(driver);
	logout.verifyActitimeLogo();
	logout.verifyActitimeLogoutButton();
	Thread.sleep(2000);
	driver.close();
}
}
