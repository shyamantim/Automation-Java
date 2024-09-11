package bidInnWebApp;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyHomePage 
{
	@Test(priority=1)
	public void verifyBiddInLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		WebElement logoImg = driver.findElement(By.xpath("//img[@alt=\" Logo\"]"));
		Assert.assertTrue(logoImg.isDisplayed());
		System.out.println("Bidinn Official Link is Verified");
		driver.quit();
	}
	
	@Test(priority=2)
	public void verifyFacebookIconLink() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("(//a[@href=\"https://www.facebook.com/share/h62inyo2LrNSMiTf/?mibextid=qi2Omg\"])[1]")).click();
		Thread.sleep(2000);
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.contains(parentId))
			{
				driver.switchTo().window(ids);
				//System.out.println(driver.getTitle());
				String facebookPage = driver.findElement(By.xpath("(//span[text()='See more on Facebook'])[1]")).getText();
				Assert.assertTrue(facebookPage.contains("Facebook"));
				System.out.println("Facebook Icon Link is verified. ");
			}
		}
		driver.quit();
	}
	
	@Test(priority=3)
	public void verifyTwitterIconLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("(//a[@href=\"https://twitter.com/Bidinn_official\"])[1]")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String> allIds=driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.contains(parentId))
			{
				driver.switchTo().window(ids);
				WebElement twitterLogo = driver.findElement(By.xpath("//div[@class=\"css-175oi2r r-1awozwy r-1pz39u2 r-6koalj r-16y2uox r-1777fci r-4wgw6l\"]"));
				Assert.assertTrue(twitterLogo.isDisplayed());
				System.out.println("Twitter Icon Link is verified. ");
			}
		}
		driver.quit();
	}
	
	@Test(priority=4)
	public void verifyInstaIconLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("(//a[@href=\"https://www.instagram.com/bidinnofficial/\"])[1]")).click();
		
		String parentId = driver.getWindowHandle();
		Set<String>allIds=driver.getWindowHandles();
		for(String ids:allIds)
		{
			if(!ids.contains(parentId))
			{
				driver.switchTo().window(ids);
				WebElement title = driver.findElement(By.xpath("//*[local-name()='svg' and @aria-label='Instagram']"));
				//System.out.println(driver.getTitle());
				Assert.assertTrue(title.isDisplayed());
				System.out.println("Instagram Icon link is verified ");
			}
		}
		driver.quit();
	}
	
	@Test(priority=5)
	public void verifyLinkedInIconLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//a[@href=\"https://linkedin.com/in/bidinn-accommodations-89b9252b7\"]")).click();
		String parentId = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		for(String ids:allIds)
		{
			//System.out.println("ParentId :"+parentId);
			if(!ids.contains(parentId))
			{
				driver.switchTo().window(ids);
				System.out.println(driver.getTitle());
				WebElement linkedInLogo = driver.findElement(By.xpath("//p[contains(text(),'New to LinkedIn')]"));
				Assert.assertTrue(linkedInLogo.isDisplayed());
				System.out.println("LinkedIn Icon link is verified. ");
			}
		}
		driver.quit();
	}
	
	
	@Test(priority=6)
	public void verifyFindStayTextLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Find Stay")).click();
		String title = driver.getTitle();
		//System.out.println(title);
		Assert.assertTrue(title.contains("All Hotels"));
		System.out.println("Find Stay Link is verified.");
		
		driver.quit();
	}
	@Test(priority=7)
	public void verifyAboutUsTextLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("About Us")).click();
		WebElement aboutUsPage = driver.findElement(By.xpath("//h1[text()='About Us']"));
		Assert.assertTrue(aboutUsPage.isDisplayed());
		System.out.println("About Us Text Link is Verified.");
		driver.quit();
	}
	@Test(priority=8)
	public void verifyContactUsTextLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();
		WebElement contactUs = driver.findElement(By.xpath("//h3[text()='Get In Touch']"));
		Assert.assertTrue(contactUs.isDisplayed());
		System.out.println("Contact Us Text Link is verified.");
		driver.quit();
	}
	@Test(priority=9)
	public void verifyTopDestinationCityLink() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//DIV[contains(@class,'max-w-sm md:max-w-xs overflow-hidden cursor-pointer mx-auto')]/descendant::P[.='Mumbai'])[1]")).click();
		
		WebElement cityHotel = driver.findElement(By.xpath("(//p[text()='Mumbai'])[1]"));
		Assert.assertTrue(!cityHotel.isDisplayed());
		System.out.println("Top Destination City Link is verified. ");
		driver.quit();
	}
	@Test(priority=10)
	public void verifyBidNowImageLink()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		driver.findElement(By.xpath("//HTML[contains(@lang,'en')]/BODY/DIV[3]/DIV[4]/DIV[1]/A[2]/DIV/DIV/IMG")).click();
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("All Hotels"));
		System.out.println("Bid Now Image Link is verified. ");
		driver.quit();
	}
	@Test(priority=11)
	public void verifyHotelRecommendedByOurExpertHotelLink() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1800)");
		WebElement element = driver.findElement(By.xpath("//h6[text()='Bel la monde']"));
		element.click();
		
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertTrue(title.contains("Hotel Detail"));
		System.out.println("Recommended Hotel Link is verified. ");
		driver.quit();
	}
	@Test(priority=12)
	public void verifyGetItOnGoogleLink() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@src=\"/images/download/Playstore.png\"]")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='google_logo Play']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Get It On Google Link is Verified. ");
		
		driver.quit();
	}
	@Test(priority=13)
	public void verifyDownloadOnAppStoreImageLink() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(500);
		driver.findElement(By.xpath("//img[@src=\"/logo/apple1.png\"]")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='App Store']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Download It On App Store Image Link is verified. ");
		driver.quit();
		
	}
	@Test(priority=14)
	public void verifyApplyForHotelier()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.linkText("Apply for Hotelier")).click();
		driver.findElement(By.id("name")).sendKeys("Krishna");
		driver.findElement(By.id("phoneNumber")).sendKeys("7518425668");
		driver.findElement(By.id("email")).sendKeys("slpatel123211@gmail.com");
		
		driver.findElement(By.xpath("//div[text()='Our Agreement ']")).click();
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.xpath("//button[text()='Get Started']")).click();
		
		WebElement ErrMSG = driver.findElement(By.xpath("//h2[text()='Could not create Hotelier Account']"));
		Assert.assertTrue(ErrMSG.isDisplayed());
		System.out.println("Apply for Hotelier Is Verified.");
		driver.quit();
	}
	
	@Test(priority=15)
	public void verifyLoginOrSignUp() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		driver.findElement(By.linkText("Login / Signup")).click();
		
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9874651232");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		
		driver.findElement(By.xpath("//button[text()='Edit Number']")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).clear();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9988776655");
		driver.findElement(By.xpath("//button[text()='Send OTP']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type=\"number\"][1]")).sendKeys("1");
		driver.findElement(By.xpath("//input[@type=\"number\"][2]")).sendKeys("2");
		driver.findElement(By.xpath("//input[@type=\"number\"][3]")).sendKeys("3");
		driver.findElement(By.xpath("//input[@type=\"number\"][4]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@type=\"number\"][5]")).sendKeys("5");
		driver.findElement(By.xpath("//input[@type=\"number\"][6]")).sendKeys("6");
		
		driver.findElement(By.xpath("//button[text()='Verify OTP']")).click();
		WebElement confMSG = driver.findElement(By.xpath("//h2[text()='Success']"));
		Assert.assertTrue(confMSG.isDisplayed());
		System.out.println("Login Button Verified Successfully. ");
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.quit();
	}
	
	@Test(priority=16)
	public void verifySearchHotelButton() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mu");
		//List<WebElement> citiesList = driver.findElements(By.className("class=\"MuiAutocomplete-endAdornment mui-mxlkbn\""));
		//System.out.println(citiesList.size());
		//for(WebElement citi:citiesList)
		//{
			//if(citi.getText().contains("Mumbai"))
		//	{
			//	citi.click();
			//	break;
			//}}
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//p[@class=\"py-2 text-gray-700 flex-grow\"]")).click();
		driver.findElement(By.xpath("(//span[text()='29'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='30'])[2]")).click();
		
		driver.findElement(By.xpath("(//div[@id=\"status\"])[2]")).click();
		driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		
		driver.findElement(By.xpath("//button[text()='Search']")).click(); 
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertTrue(title.contains("All Hotels"));
		System.out.println("Hotel Search Button is Verified. ");
		
		driver.quit();
		
	}
}
