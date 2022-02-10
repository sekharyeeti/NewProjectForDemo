package Test.QA;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
	

//@Test
public class Login {

	private static final String Timeunit = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:\\Users\\Encore1\\Downloads\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");

 	//WebDriver driver = new ChromeDriver();
		
WebDriver driver = new FirefoxDriver();
		//thread.sleep(1100);
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
//		driver.findElement(By.xpath("//input[@id='email'] and [#name='pass']")).sendKeys("test222"); //


  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


driver.get("https://www.facebook.com/");  //launch facaebook


//	driver.findElement(By.cssSelector("#email")).sendKeys("abcd123");
			
//	driver.findElement(By.id("u_0_2_AH")).click();
	driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
//*[@id="u_0_2_tm"]
	
	
	WebElement element=driver.findElement(By.xpath("//*[@name='birthday_month']"));

	Select s = new Select(element);
	//s.selectByValue('Dec');


	s.selectByIndex(2);
	
	s.selectByVisibleText("Dec");

System.out.print(s.getWrappedElement());	

//s	s.sele 

//	s.selectByVisibleText("16");
//	s.selectByVisibleText("20");
//	s.selectByVisibleText("7");
	
	
//	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("test222");
		
		
		
	//*[@id="day"]
		
		//driver.get("https://www.google.com/");
       //driver.findElement(By.name("q")).sendKeys("Youtube");

  //     driver.findElement(By.xpath()
       //driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
    		
       
    		
    		
//    		   /html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]
       
       
    				   
    				   
    				   
       
       
 

		
	}

}
