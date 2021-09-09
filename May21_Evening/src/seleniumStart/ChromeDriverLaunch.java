package seleniumStart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","E:\\new chrome drive 92 version\\chromedriver_win32\\chromedriver.exe");
    WebDriver b=new ChromeDriver();
    b.manage().window().maximize();
    b.get("https://www.facebook.com/");
    b.quit();
}
}
