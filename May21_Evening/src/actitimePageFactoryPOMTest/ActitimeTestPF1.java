package actitimePageFactoryPOMTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimePageFactoryPOM.ActitimeHomePF1;
import actitimePageFactoryPOM.ActitimeLoginPF1;

public class ActitimeTestPF1  {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\new chrome drive 92 version\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("http://localhost:8008/login.do");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	ActitimeLoginPF1 v=new ActitimeLoginPF1(driver);
	v.setActitimeUsernamePF1();
	v.setActitimePasswordPF1();
	v.verifyActitimeLoginButtonPF1();
	
	Thread.sleep(2000);
	ActitimeHomePF1 f=new ActitimeHomePF1(driver);
	f.verifyActitimeLogoPF1();
	f.verifyActitimeLogoutButtonPF1();
	
	Thread.sleep(2000);
	driver.quit();
}
}

