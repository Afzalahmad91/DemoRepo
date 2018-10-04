package alerthand;


import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TC_002 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		FirefoxDriver firedriver=new FirefoxDriver();
		firedriver.manage().window().maximize();
		firedriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		firedriver.get("http://demo.guru99.com/popup.php");
		firedriver.findElementByXPath("//*[contains(@href,'popup.php')]").click();
		String MainWindow=firedriver.getWindowHandle();
		Set<String> s1=firedriver.getWindowHandles();
		Iterator<String> itr=s1.iterator();
		while(itr.hasNext())
		{
			String ChildWindow=itr.next();
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				firedriver.switchTo().window(ChildWindow);
				firedriver.findElementByXPath("//input[@name='emailid']").sendKeys("afzalahmad0011@gmail.com");
				firedriver.findElementByXPath("//input[@name='btnLogin']").click();
				firedriver.close();
			}
		}
		firedriver.switchTo().window(MainWindow);
	}
}
