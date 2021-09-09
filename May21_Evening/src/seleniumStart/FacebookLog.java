//interface class
package seleniumStart;

import java.io.IOException;

public interface FacebookLog {
       
	String key1="webdriver.chrome.driver";
	String value1="E:\\new chrome drive 92 version\\chromedriver_win32\\chromedriver.exe";
	String url1="https://en-gb.facebook.com/";
	String url2="https://en-gb.facebook.com/r.php?locale=en_GB";

	public void fb() throws IOException,InterruptedException;
}
