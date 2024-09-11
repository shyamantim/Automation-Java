package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyRegisterAsHotelierPage 
{/*
	@Test(priority=1)
	public void verifyGetStartedButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("List Your Property")).click();
		
		driver.findElement(By.id("name")).sendKeys("Krishna");
		driver.findElement(By.id("phoneNumber")).sendKeys("7318425625");
		driver.findElement(By.id("email")).sendKeys("patelsujeet123@gmail.com ");
		driver.findElement(By.xpath("//div[text()='Our Agreement ']")).click();
		
		
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		//driver.findElement(By.xpath("//button[text()='Download']")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		WebElement confMSG = driver.findElement(By.xpath("//h2[contains(text(),'Could not create')]"));
		Assert.assertTrue(!confMSG.isDisplayed());
		System.out.println("Register As Hotelier Link is verified");
		driver.quit();
	}
	@Test(priority=2)
	public void verifyFindStayTextLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("List Your Property")).click();
		driver.findElement(By.linkText("Find Stay")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("All Hotels, resorts"));
		System.out.println("Find Stay Link is verified");
		
		driver.quit();
	}*/
	@Test(priority=3)
	public void verifyAboutUsTextLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("List Your Property")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		WebElement element = driver.findElement(By.xpath("//h1[text()='About Us']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("About Us Text Link is Verified. ");
		driver.quit();
	}
	@Test(priority=4)
	public void verifyContactUsTextLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("List Your Property")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		
		WebElement element = driver.findElement(By.xpath("//h3[text()='Get In Touch']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Contact Us Text Link Is Verified.");
		driver.quit();
	}
	@Test(priority=5)
	public void verifyLoginSignUpButton() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("List Your Property")).click();
		driver.findElement(By.linkText("Login / Signup")).click();
		
		Thread.sleep(500);
		WebElement element = driver.findElement(By.xpath("//h4"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Login / Signup Button is Verified. ");
		driver.quit();
	}
	
}
