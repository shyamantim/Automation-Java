package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyLoginPage
{/*
	@Test(priority=1)
	public void verifysendOTPButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		WebElement otpPage = driver.findElement(By.xpath("//span[contains(text(),'You have sent you an OTP to ')]"));
		Assert.assertTrue(otpPage.isDisplayed());
		System.out.println("Login Page is Verified. ");
		driver.quit();  
	}*/
	@Test(priority=2)
	public void verifyWhetherSendOtpButtonIsEnableOrNotBeforeEnteringNumber()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		WebElement sendOtpButton = driver.findElement(By.xpath("//button[text()='Send OTP']"));
		Assert.assertTrue(!sendOtpButton.isEnabled());
		System.out.println("Send Otp Button is Verified Before Entering Mobile Number.");
		driver.quit();
	}
}
