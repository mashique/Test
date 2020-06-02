import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowPopup {
	
	

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://www.popuptest.com/");
		
		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[1]/font[3]/b/a")).click();
		
		Set <String> handlers= driver.getWindowHandles();
		
		Iterator<String> it =handlers.iterator();
		
		String parent=it.next();
		
		System.out.println(parent);
		System.out.println(driver.getTitle());
		
		String child= it.next();
		System.out.println(child);
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		
		
		Thread.sleep(10000);
		
		
//		String parent = driver.getWindowHandle();
//		Set <String> allwindows= driver.getWindowHandles();
//		
//		for(String child:allwindows)
//		{
//			if(!parent.equalsIgnoreCase(child))
//			{
//				
//				driver.switchTo().window(child);
//			}
//		}
		
		
	}

}
