package bidInnWebApp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class VerifyHotelDetailsPage
{
	@Test
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
				System.out.println(driver.getTitle());
			}
		}
		
	}
}
