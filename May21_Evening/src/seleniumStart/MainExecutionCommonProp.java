package seleniumStart;

public class MainExecutionCommonProp extends LeadsTo{
    public static void main(String[] args) throws InterruptedException {
    	LeadsTo s =new LeadsTo();
    	s.chromeLunch();
    	x.manage().window().maximize();
    	Thread.sleep(3000);
    	x.navigate().to(url1);//giving url path to open browser
    	Thread.sleep(3000);
    	x.navigate().to(url2);
    	Thread.sleep(3000);
    	x.navigate().back();//browser goes to backward
    	Thread.sleep(3000);
    	x.navigate().forward();//browser goes to forward
    	Thread.sleep(3000);
    	x.navigate().refresh();//browser gets refresh
    	Thread.sleep(3000);
    	x.close();
	}
    
}
