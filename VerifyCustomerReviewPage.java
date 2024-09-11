package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCustomerReviewPage 
{
	@Test
	public void verifySubmitReviewBeforeLogin() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		//JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2000)");
		//Thread.sleep(500);
		WebElement element =driver.findElement(By.linkText("Testimonials"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		
		driver.findElement(By.id("title")).sendKeys("Shyam Sundar");
		
		WebElement rating = driver.findElement(By.id("rating"));
		Select select=new Select(rating);
		select.selectByValue("4");
		
		driver.findElement(By.id("comment")).sendKeys("Stay Was Beyond the Expectations. ");
		
		//driver.findElement(By.xpath("//button[text()='Submit Comment']"));
		WebElement element1 =driver.findElement(By.xpath("//button[text()='Submit Comment']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element1);
		WebElement element3 = driver.findElement(By.xpath("//h2[contains(text(),'Please login')]"));
		Assert.assertTrue(element3.isDisplayed());
		System.out.println("Submit Review is verified Before Login. ");
		
		driver.quit();
	}
	@Test
	public void verifySubmitReviewButtonAfterLogin() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type='number'][1]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type='number'][2]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type='number'][3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[@type='number'][4]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@type='number'][5]")).sendKeys("5");
		driver.findElement(By.xpath("//input[@type='number'][6]")).sendKeys("6");
		
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		WebElement review = driver.findElement(By.linkText("Testimonials"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", review);
		
		driver.findElement(By.id("title")).sendKeys("Radhey Krishna");
		
		WebElement rating = driver.findElement(By.id("rating"));
		Select select=new Select(rating);
		select.selectByVisibleText("4 Star");
		
		driver.findElement(By.id("comment")).sendKeys("Stay Was Beyond The Expectation.");
		
		WebElement commentButton = driver.findElement(By.xpath("//button[text()='Submit Comment']"));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",commentButton);
		
		WebElement errorMSG = driver.findElement(By.xpath("//h2[contains(text(),'Failed to')]"));
		Assert.assertTrue(!errorMSG.isDisplayed());
		System.out.println("Submit Review After Login is verified. ");
		
		driver.quit();
	}
}
