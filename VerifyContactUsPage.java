package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyContactUsPage 
{/*
	@Test(priority=1)
	public void verifyContactNumber()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Contact Us")).click();
		WebElement contactNumber = driver.findElement(By.xpath("//p[text()='+919717692555']"));
		Assert.assertTrue(contactNumber.isDisplayed());
		System.out.println("Contact Number is Verified. ");
		driver.quit();
	}
	@Test(priority=2)
	public void verifyMailId()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Contact Us")).click();
		WebElement email = driver.findElement(By.xpath("//p[text()='Info@bidinn.in']"));
		Assert.assertTrue(email.isDisplayed());
		System.out.println("Email Address Is Verified. ");
		driver.quit();
	}*/
	@Test(priority=3)
	public void VerifyGetInTouchForm() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
	
		driver.findElement(By.linkText("Contact Us")).click();
		
		driver.findElement(By.name("name")).sendKeys("Shyam Sundar");
		driver.findElement(By.name("email")).sendKeys("shyamsundar987@gmail.com");
		driver.findElement(By.name("phone")).sendKeys("8578996857");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		
		WebElement reason=driver.findElement(By.xpath("//div[@role=\"combobox\"]"));
		Actions action=new Actions(driver);
		action.sendKeys(reason, "option 5").sendKeys(Keys.ENTER).perform();
		
		driver.findElement(By.name("message")).sendKeys("Cancellation Process");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[normalize-space(.)='Submit']")).click();
		
		WebElement msg = driver.findElement(By.xpath("//div[@class=\"swal2-icon swal2-error swal2-icon-show\"]"));
		Assert.assertTrue(msg.isDisplayed());
		System.out.println("Get In touch Form Submission is verified. ");
		driver.quit();
	}
}
