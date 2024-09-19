package bidInnWebApp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyHotelDetailsPage
{
	@Test(priority=1)
	public void verifyOverviewButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Noida");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Noida']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Lime Tree Hotel & Banquet']")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.equals(parentId))
			{
				driver.switchTo().window(ids);
				driver.findElement(By.xpath("//button[text()='Rooms']")).click();
				driver.findElement(By.xpath("//button[text()='OverView']")).click();
				WebElement element = driver.findElement(By.xpath("//h4[text()='Lime Tree Hotel & Banquet']"));
				Assert.assertTrue(element.isDisplayed());
				System.out.println("Overview Button is verified");
			}
		}
		driver.quit();
	}
	
	@Test(priority=2)
	public void verifyRoomsLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Noida");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Noida']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Lime Tree Hotel & Banquet']")).click();
		
		String parentID = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.equals(parentID))
			{
				driver.switchTo().window(ids);
				//System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//button[text()='Rooms']")).click();
				WebElement element = driver.findElement(By.xpath("//h5[text()='Room types']"));
				Assert.assertTrue(element.isDisplayed());
				System.out.println("Rooms Button is verified. ");
				break;
			}
		}
		driver.quit();
	}
	@Test(priority=3)
	public void verifyFacilityButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Noida");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Noida']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Lime Tree Hotel & Banquet']")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.equals(parentId))
			{
				driver.switchTo().window(ids);
				driver.findElement(By.xpath("//button[text()='Facility']")).click();
				WebElement element = driver.findElement(By.xpath("//h5[text()='Hotel Facility']"));
				Assert.assertTrue(element.isDisplayed());
				System.out.println("Facility Button is verified. ");
				break;
			}
		}
		driver.quit();
	}
	@Test(priority=4)
	public void verifyReviewButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Noida");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Noida']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Lime Tree Hotel & Banquet']")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.equals(parentId))
			{
				driver.switchTo().window(ids);
				driver.findElement(By.xpath("//button[text()='Review']")).click();
				WebElement element = driver.findElement(By.xpath("//h5[text()='Guest Reviews & Ratings']"));
				Assert.assertTrue(element.isDisplayed());
				System.out.println("Review Button is verified. ");
				break;
			}
			
		}
		driver.quit();
	}
	@Test(priority=5)
	public void verifyMapButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Noida");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Noida']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Lime Tree Hotel & Banquet']")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		
		for(String ids:allIds)
		{
			if(!ids.equals(parentId))
			{
				driver.switchTo().window(ids);
				driver.findElement(By.xpath("//button[text()='Map']")).click();
				WebElement element = driver.findElement(By.id("map"));
				Assert.assertTrue(element.isDisplayed());
				System.out.println("Map Button is verified. ");
				break;
			}
		}
		driver.quit();
	}
	@Test(priority=6)
	public void verifyPolicyButton()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Noida");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Noida']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//h5[text()='Lime Tree Hotel & Banquet']")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		
		for(String ids:allIds)
		{
			if(!ids.equals(parentId))
			{
				driver.switchTo().window(ids);
				driver.findElement(By.xpath("//button[text()='Policy']")).click();
				WebElement element = driver.findElement(By.xpath("//h6[text()='Rules And Policies']"));
				Assert.assertTrue(element.isDisplayed());
				System.out.println("Policies button is verified. ");
				
				driver.findElement(By.xpath("//span[text()='See All photos']")).click();
				driver.findElement(By.xpath("(//button[text()='Rooms'])[2]")).click();
				driver.findElement(By.xpath("(//button[text()='Reception'])")).click();
				driver.findElement(By.xpath("(//button[text()='All Media'])")).click();
				driver.findElement(By.xpath("(//button[@class=\"image-gallery-icon image-gallery-right-nav\"])")).click();
				driver.findElement(By.xpath("(//button[@class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium mui-16bv9va\"])")).click();
				WebElement element1 = driver.findElement(By.xpath("//button[text()='Policy']"));
				Assert.assertTrue(element1.isDisplayed());
				System.out.println("See All Photos link is verified. ");
				break;
			}
		}
		driver.quit();
	}

}
