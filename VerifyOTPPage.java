package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOTPPage 
{
	@Test(priority=1)
	public void verifyOtpButton() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"number\"][1]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type=\"number\"][2]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type=\"number\"][3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[@type=\"number\"][4]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@type=\"number\"][5]")).sendKeys("5");
		driver.findElement(By.xpath("//input[@type=\"number\"][6]")).sendKeys("6");
		
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		WebElement confMSG = driver.findElement(By.xpath("//button[text()='OK']"));
		Assert.assertTrue(confMSG.isDisplayed());
		System.out.println("Otp Button is verified. ");
		driver.quit();
	}
	
	@Test(priority=2)
	public void verifyInvalidOTP() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"number\"][1]")).sendKeys("6");
		driver.findElement(By.xpath("//input[@type=\"number\"][2]")).sendKeys("5");
		driver.findElement(By.xpath("//input[@type=\"number\"][3]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@type=\"number\"][4]")).sendKeys("3");
		driver.findElement(By.xpath("//input[@type=\"number\"][5]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type=\"number\"][6]")).sendKeys("1");
		
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		WebElement errorMSG = driver.findElement(By.xpath("//div[contains(text(),'Invalid')]"));
		Assert.assertTrue(errorMSG.isDisplayed());
		System.out.println("Invalid OTP is Verified. ");
		driver.quit();
	}
	@Test(priority=3)
	public void verifyEditNumberButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		driver.findElement(By.xpath("//button[text()='Edit Number']")).click();
		//String pageTitle = driver.getTitle();
		WebElement loginPage = driver.findElement(By.xpath("//h4[text()='Login']"));
		Assert.assertTrue(loginPage.isDisplayed());
		System.out.println("Edit Number Button is verified. ");
		
		driver.quit();
	}
	@Test(priority=4)
	public void verifyResendOtpButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		WebElement resendOtp = driver.findElement(By.xpath("//button[text()='Resend OTP']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(62));
		wait.until(ExpectedConditions.elementToBeClickable(resendOtp));
		resendOtp.click();
		
		WebElement timer = driver.findElement(By.xpath("//span[contains(text(),'Resend OTP in')]"));
		Assert.assertTrue(timer.isDisplayed());
		System.out.println("Resend OTP Button is verified. ");
		driver.quit();
	}
}
