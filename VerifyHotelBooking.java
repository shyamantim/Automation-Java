package bidInnWebApp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyHotelBooking
{
	@Test
	public void verifyHotelBookingByUser() throws InterruptedException
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
		
		driver.findElement(By.xpath("//INPUT[@role='combobox']")).sendKeys("Hotel Eterna Primavera(Test_Hotel)");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Hotel Eterna Primavera(Test_Hotel)']")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[@class=\"flex-grow\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@class=\"rdrNextPrevButton rdrNextButton\"])[1]")).click();
		driver.findElement(By.xpath("(//button[@class=\"rdrNextPrevButton rdrNextButton\"])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='18']")).click();
		driver.findElement(By.xpath("//span[text()='22']")).click();
		
		driver.findElement(By.xpath("(//button[@class=\"flex-grow\"])[3]")).click();
		driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='Done'])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		driver.findElement(By.xpath("//div[@class=\"MuiStack-root mui-uq7dtg\"]")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.equals(parentId))
			{
				driver.switchTo().window(ids);
				driver.findElement(By.xpath("(//button[@class=\"flex-grow\"])[1]")).click();
				driver.findElement(By.xpath("(//button[@class=\"rdrNextPrevButton rdrNextButton\"])[1]")).click();
				driver.findElement(By.xpath("(//button[@class=\"rdrNextPrevButton rdrNextButton\"])[1]")).click();
				
				driver.findElement(By.xpath("//span[text()='18']")).click();
				driver.findElement(By.xpath("//span[text()='22']")).click();
				driver.findElement(By.xpath("(//button[@class=\"flex-grow\"])[3]")).click();
				driver.findElement(By.xpath("(//button[text()='Done'])[1]")).click();
				
				
				driver.findElement(By.xpath("(//div[@class=\"relative w-full\"])[3]")).click();
				driver.findElement(By.xpath("//button[text()='+'][1]")).click();
				WebElement doneButton = driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", doneButton);
				
				//Bid Now)
				Object bidNow = driver.findElement(By.xpath("//button[text()='Bid Now']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", bidNow);
				WebElement bidIncrement = driver.findElement(By.xpath("//span[text()='+']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", bidIncrement);
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", bidIncrement);
				
				Thread.sleep(500);
				WebElement bidDecrement = driver.findElement(By.xpath("//span[text()='-']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", bidDecrement);
				
				WebElement placeBid = driver.findElement(By.xpath("//button[text()='Place Bid']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", placeBid);
				
				WebElement proceedToPayButton = driver.findElement(By.xpath("//button[text()='Proceed to Pay']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", proceedToPayButton);
				
				driver.findElement(By.xpath("//input[@type='name']")).clear();
				//driver.findElement(By.xpath("//input[@type='name']")).sendKeys("Shyam Sundar");
				
				driver.findElement(By.xpath("//input[@type=\"email\"]")).clear();
				//driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("shyamsundar567@gmail.com");
				driver.findElement(By.xpath("//button[text()='Update']")).click();
				
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				
				WebElement payNow = driver.findElement(By.xpath("//button[text()='Pay Now']"));
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", payNow);
				
				WebElement paymentOption = driver.findElement(By.xpath("//div[@class=\"relative flex h-full flex-col overflow-auto bg-primary text-base font-normal quick-buy:bg-transparent d:flex-row d:overflow-hidden d:p-2\"]"));
				Assert.assertTrue(paymentOption.isDisplayed());
				System.out.println("Hotel Booking is verified. ");
				break;
				
			}
			
		}
		
	}
}
