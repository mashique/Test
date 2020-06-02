import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");

		
		Alert al= driver.switchTo().alert();
		al.accept();
		
		
		System.out.println("Ashique");

	}

}
