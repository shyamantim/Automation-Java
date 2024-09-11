package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyCancelledBookingPage
{	/*
	@Test
	public void verifyRateHotelButton() throws InterruptedException
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
		
		
		driver.findElement(By.xpath("//button[text()='Cancelled']")).click();
		driver.findElement(By.xpath("(//button[text()='Rate Hotel'])[1]")).click();
		WebElement rateHotel = driver.findElement(By.xpath("//h4[contains(text(),'Rate Hotel')]"));
		Assert.assertTrue(rateHotel.isDisplayed());
		System.out.println("Rate Hotel For Cancelled Hotel is verified. ");
		driver.quit();
		
	}
	
	@Test
	public void verifyHotelName() throws InterruptedException
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
		
		
		driver.findElement(By.xpath("//button[text()='Cancelled']")).click();
		WebElement hotelName = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-zq6grw\"])[1]"));
		Assert.assertTrue(hotelName.isDisplayed());
		System.out.println(hotelName.getText());
		System.out.println("Hotel Name Is Displayed. ");
		driver.quit();
	}*/
	@Test
	public void verifyCancelBookingButton() throws InterruptedException
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
		
		
		driver.findElement(By.xpath("//button[text()='Cancelled']")).click();
		WebElement cancelBooking = driver.findElement(By.xpath("(//button[text()='Cancel Booking'])[1]"));
		Assert.assertTrue(cancelBooking.isEnabled());
		System.out.println("Cancel Booking Button is Disabled. ");
		driver.quit();
		
	}
}
