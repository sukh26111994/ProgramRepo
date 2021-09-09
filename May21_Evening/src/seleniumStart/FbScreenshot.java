//screenshot class
package seleniumStart;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
public class FbScreenshot implements FacebookLog{
static WebDriver b;
	public void fb() throws IOException {
	System.setProperty(key1, value1);
	b=new ChromeDriver();
	b.manage().window().maximize();
	b.manage().deleteAllCookies();
	b.get(url1);	
	File source = ((TakesScreenshot)b).getScreenshotAs(OutputType.FILE);
	String path = "E:\\Screenshot.png";
	File destination = new File(path);
	FileHandler.copy(source, destination);
	}}
