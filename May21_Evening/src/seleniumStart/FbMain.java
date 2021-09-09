//main execution class
package seleniumStart;
import java.io.IOException;
import org.openqa.selenium.By;
public class FbMain extends FebLogIn{
     public static void main(String[] args) throws InterruptedException,IOException {
		FbMain d=new FbMain();
		d.fb();
		FbAbsoluteXpath j=new FbAbsoluteXpath();
		j.fb();
		FbRelativeMain x=new FbRelativeMain();
		x.fb();
		FbDiamention c=new FbDiamention();
		c.fb();
		FbScreenshot f=new FbScreenshot();
		f.fb();
		FbDropdown p=new FbDropdown();
		p.fb();
}}
