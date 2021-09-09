package seleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VelocityMain extends VelocityImplement{
	public static void main(String[] args) throws InterruptedException {
		VelocityMain x=new VelocityMain();
	    x.chromeLaunch();
	    VelocityLocator v=new VelocityLocator();
	    v.chromeLaunch();
	    VelocityRelativeMain p=new VelocityRelativeMain();
		   p.chromeLaunch();
		   VelocityIframe c=new VelocityIframe();
		   c.chromeLaunch();
	}
}
