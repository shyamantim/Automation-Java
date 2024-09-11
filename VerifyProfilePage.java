package bidInnWebApp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyProfilePage 
{
	@Test(priority=1)
	public void exploreNowTextLink() throws InterruptedException
	{
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
		driver.findElement(By.linkText("Explore now")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("All Hotels, resorts"));
		System.out.println("Explore Now Text Link is Verified. ");
		driver.quit();
	}
	@Test(priority=2)
	public void verifyBidNowImageLink() throws InterruptedException
	{
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
		
		driver.findElement(By.xpath("//img[@src=\"/images/home/deal2.png\"]")).click();
		String title1 = driver.getTitle();
		Assert.assertTrue(title1.contains("All Hotels, resorts"));
		System.out.println("Bid Now Image Link is verified. ");
		driver.quit();
	}
	@Test(priority=3)
	public void verifyBookingTextLinkFromMainMenu() throws InterruptedException
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
		
		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault mui-5tp8uj\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		driver.findElement(By.linkText("Booking")).click();
		WebElement webElement = driver.findElement(By.xpath("//button[text()='Upcoming']"));
		Assert.assertTrue(webElement.isDisplayed());
		System.out.println("Booking Link is Verified. ");
		driver.quit();
	}
	
	@Test(priority=4)
	public void verifyPrifileLinkFromMainMenu() throws InterruptedException
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
		
		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault mui-5tp8uj\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//a[text()='Profile']")).click();
		WebElement element = driver.findElement(By.xpath("//p[text()='customer']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Profile Link Of Main Menu Is Verified.");
		driver.quit();
	}
	@Test(priority=5)
	public void verifyViewProfileTextLinkOfProfileDropDown() throws InterruptedException
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
		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault mui-5tp8uj\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.xpath("//span[@class=\"flex items-center gap-2 font-medium text-dark \"]")).click();
		driver.findElement(By.linkText("View profile")).click();
		
		WebElement element = driver.findElement(By.xpath("//p[text()='customer']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("View Profile Text link is Verified. ");
		driver.quit();
	
	}
	@Test(priority=6)
	public void verifyAccountSeetingTextLink() throws InterruptedException
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
		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault mui-5tp8uj\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.xpath("//span[@class=\"flex items-center gap-2 font-medium text-dark \"]")).click();
		driver.findElement(By.linkText("Account Settings")).click();
		WebElement element = driver.findElement(By.xpath("//h3[text()='Personal Information']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Account Settings Text Link is Verified. ");
		driver.quit();
	}
	@Test(priority=7)
	public void verifyLogoutButton() throws InterruptedException
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
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class=\"MuiAvatar-root MuiAvatar-circular MuiAvatar-colorDefault mui-5tp8uj\"]")).click();
		driver.findElement(By.linkText("Profile")).click();
		
		driver.findElement(By.xpath("//span[@class=\"flex items-center gap-2 font-medium text-dark \"]")).click();
		driver.findElement(By.xpath("//button[text()='Logout']")).click();
		driver.quit();
	}
}
