package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCompletedBookings 
{
	@Test(priority=1)
	public void verifyRateHotelLink() throws InterruptedException
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
		
		
		driver.findElement(By.xpath("//span[@class=\"MuiButton-icon MuiButton-endIcon MuiButton-iconSizeMedium mui-pt151d\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.linkText("Booking")).click();
		driver.findElement(By.xpath("//button[text()='Completed']")).click();
		driver.findElement(By.xpath("(//button[text()='Rate Hotel'])[1]")).click();
		WebElement element = driver.findElement(By.xpath("(//button[text()='Rate Hotel'])[1]"));
		
		Assert.assertTrue(!element.isDisplayed());
		System.out.println("Rate Hotel Link is verified. ");
		driver.quit();
	}
	@Test(priority=2)
	public void verifyCheckWhetherCheckIndateIsVisiblew() throws InterruptedException
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
		
		driver.findElement(By.xpath("//span[@class=\"MuiButton-icon MuiButton-endIcon MuiButton-iconSizeMedium mui-pt151d\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.linkText("Booking")).click();
		driver.findElement(By.xpath("//button[text()='Completed']")).click();
		
		 WebElement checkinDate = driver.findElement(By.xpath("(//span[@class=\"MuiTypography-root MuiTypography-caption mui-1v2gfp5\"])[2]"));
		 Assert.assertTrue(checkinDate.isDisplayed());
		 System.out.println("Check in Date is verified. ");
		 driver.quit();
	}
	@Test
	public void verifyRoom() throws InterruptedException
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
		driver.findElement(By.xpath("//span[@class=\"MuiButton-icon MuiButton-endIcon MuiButton-iconSizeMedium mui-pt151d\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.linkText("Booking")).click();
		driver.findElement(By.xpath("//button[text()='Completed']")).click();
		
		WebElement noOfRooms = driver.findElement(By.xpath("(//span[contains(text(),' room(s)')])[1]"));
		Assert.assertTrue(noOfRooms.isDisplayed());
		System.out.println("Number of Rooms Are Verified.");
		driver.quit();
	}
}
