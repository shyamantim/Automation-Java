package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAboutUsPage
{
	@Test(priority=1)
	public void verifyWhyChooseBidinn()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("About Us")).click();
		WebElement element = driver.findElement(By.xpath("//h5[text()='Why Choose Bidinn?']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("About Us Page is Verified. ");
		driver.quit();
	}
	@Test(priority=2)
	public void verifyCustomerSupportLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("About Us")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.findElement(By.xpath("//p[text()='Customer support']")).click();
		WebElement getInTouch = driver.findElement(By.xpath("//h3[text()='Get In Touch']"));
		
		Assert.assertTrue(getInTouch.isDisplayed());
		System.out.println("Customer Support Link is Verified. ");
		driver.quit();
	}
	@Test(priority=3)
	public void verifyBidNowImageLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("About Us")).click();
		driver.findElement(By.xpath("//img[@src=\"/images/about-us/Frontbanner2.png\"]")).click();
		
		Assert.assertTrue(driver.getTitle().contains("All Hotels,resorts"));
		System.out.println("Bid Now Image Link Is Verified. ");
	}
}
