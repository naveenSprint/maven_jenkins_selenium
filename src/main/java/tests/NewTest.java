package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver; 
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

	public WebDriver driver;
	 
	  @Test
	  public void openMyBlog() {
		  System.out.println("Hello, This is Selenium Demo");
		  driver.navigate().to("https://www.amazon.in");
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike shoes");
		  driver.findElement(By.xpath("//input[@type='submit']")).click();
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  driver.navigate().to("https://amazon.in");
		  String title = driver.getTitle();
		  System.out.println("Page Title is:-" + title);
		  System.out.println("Amazon Test is Successful");
		  driver.navigate().to("https://www.facebook.com");
		  driver.findElement(By.name("email")).sendKeys("mnaveenk85@gmail.com");
		  driver.findElement(By.name("pass")).sendKeys("mnaveenk");
		  driver.findElement(By.id("loginbutton")).click();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  System.out.println("Facebook Test is success");
		  System.out.println("Browser will exit");
}
	  
	  @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\NaveenKumarMuppala\\chromedriver\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver(); 
	   
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
	 
}
