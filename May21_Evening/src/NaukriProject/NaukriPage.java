package NaukriProject;

import java.awt.AWTException;

public interface NaukriPage {
	String key="webdriver.chrome.driver";
	String value="E:\\new chrome drive 92 version\\chromedriver_win32\\chromedriver.exe";
	String url="https://www.naukri.com/";
	
	public void page()throws InterruptedException, AWTException;
	public void search() throws InterruptedException;
	public void mouceover()throws InterruptedException;
}
