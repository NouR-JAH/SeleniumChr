

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class FaebookRegistration {
	
	static WebDriver driver;
	
	public static void main(String[] ar) {
		
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\Admin\\workspace\\Selenium Chrome\\exefiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://facebook.com");
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).sendKeys("MyName");  
		Select sel = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel.selectByIndex(3);
		driver.findElement(By.xpath(".//*@[id='u_0_w']")).click();  
	}

}
