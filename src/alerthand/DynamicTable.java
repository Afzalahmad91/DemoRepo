package alerthand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		WebDriver crdriver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		crdriver=new ChromeDriver();
		crdriver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		List<WebElement> li=crdriver.findElements(By.xpath("//div[@id='leftcontainer']//tr//th"));
		System.out.println("Number of Column :"+ li.size());
		List<WebElement> li1=crdriver.findElements(By.xpath("//div[@id='leftcontainer']//tbody//tr"));
		System.out.println("Number of Rows :" + li1.size());
		List<WebElement> li2=crdriver.findElements(By.cssSelector("*"));
		System.out.println("Number of webelement :" + li2.size());
		for( WebElement e : li2)
		{
			String st=e.getTagName();
			System.out.println(st);
		}
	}
}
