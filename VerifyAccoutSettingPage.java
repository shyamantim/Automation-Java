package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAccoutSettingPage 
{/*
	@Test(priority=1)
	public void verifySaveButton() throws InterruptedException
	{
		String expectedFullName = "Shyam Sundar";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Login / Signup")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type=\"number\"][1]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type=\"number\"][2]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type=\"number\"][3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[@type=\"number\"][4]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@type=\"number\"][5]")).sendKeys("5");
		driver.findElement(By.xpath("//input[@type=\"number\"][6]")).sendKeys("6");
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault mui-5tp8uj\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.xpath("//span[@class=\"flex items-center gap-2 font-medium text-dark \"]")).click();
		driver.findElement(By.linkText("Account Settings")).click();
		
		driver.findElement(By.name("fullName")).clear();
		driver.findElement(By.name("fullName")).sendKeys("Shyam Sundar");
		
		driver.findElement(By.name("phoneNumber")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("+918896770988");
		
		driver.findElement(By.name("emailAddress")).clear();
		driver.findElement(By.name("emailAddress")).sendKeys("patelsujeet@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		String updatedFullName = driver.findElement(By.name("fullName")).getAttribute("value");
		System.out.println(updatedFullName);
		
		Assert.assertTrue(updatedFullName.equals(expectedFullName));
		System.out.println("Save Button is verified. ");
		
		driver.quit();
		
	}
	@Test(priority=2)
	public void verifyCancelButton() throws InterruptedException
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
		
		driver.findElement(By.xpath("//span[@class=\"flex items-center gap-2 font-medium text-dark \"]")).click();
		driver.findElement(By.linkText("Account Settings")).click();
		
		driver.findElement(By.name("fullName")).clear();
		driver.findElement(By.name("fullName")).sendKeys("Shyam Sundar");
		
		driver.findElement(By.name("phoneNumber")).clear();
		driver.findElement(By.name("phoneNumber")).sendKeys("+918348508945");
		
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		String fullName = driver.findElement(By.name("fullName")).getAttribute("value");
		Assert.assertTrue(fullName.contains("Rohit Kumar"));
		System.out.println("Cancel Button is verified. ");
		
		driver.quit();	
	}*/
	@Test 
	public void verifyDeleteButton() throws InterruptedException
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
		
		driver.findElement(By.xpath("//span[@class=\"flex items-center gap-2 font-medium text-dark \"]")).click();
		driver.findElement(By.linkText("Account Settings")).click();
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		
		driver.findElement(By.xpath("//button[text()='Delete Account']")).click();
		driver.findElement(By.xpath("//button[text()='Yes, delete it!']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		driver.findElement(By.xpath("//button[text()='Delete Account']")).click();
		WebElement element = driver.findElement(By.xpath("//button[text()='Yes, delete it!']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Delete Account Button is verified");
		
		driver.quit();
	}
}
