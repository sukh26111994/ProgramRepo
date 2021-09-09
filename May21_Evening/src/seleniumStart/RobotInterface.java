package seleniumStart;

import java.awt.AWTException;

public interface RobotInterface {
	String key="webdriver.chrome.driver";
	String value="E:\\\\new chrome drive 92 version\\\\chromedriver_win32\\\\chromedriver.exe";
	String url="https://en-gb.facebook.com/";
	
	public void demo()throws InterruptedException, AWTException;

	
}
