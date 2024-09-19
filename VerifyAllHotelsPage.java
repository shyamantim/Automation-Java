package bidInnWebApp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyAllHotelsPage
{/*
	@Test(priority=1)
	public void verifySearchButton() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		String parentid = driver.getWindowHandle();
		Set<String> allIds = driver.getWindowHandles();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hotel Eterna");
		driver.findElement(By.xpath("//LI[normalize-space(.)='Hotel Eterna Primavera(Test_@Hotel)']")).click();
		
		driver.findElement(By.xpath("//button[@class=\"flex-grow\"]")).click();
		driver.findElement(By.xpath("//span[text()='29']")).click();
		driver.findElement(By.xpath("//span[text()='30']")).click();
		
		driver.findElement(By.xpath("//div[@class=\"flex items-center MuiBox-root mui-1guk29\"]")).click();
		driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
		driver.findElement(By.xpath("(//button[text()='+'])[1]")).click();
		
		Thread.sleep(500);
		driver.findElement(By.xpath("(//button[text()='+'])[2]")).click();
		driver.findElement(By.xpath("(//button[text()='-'])[1]")).click();
		
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
		WebElement element = driver.findElement(By.xpath("//h5[text()='Hotel Eterna Primavera(Test_@Hotel)']"));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Search Button is verified. ");
		
		driver.quit();
	}
	
	@Test(priority=2)
	public void verifySortByPriceHighToLowFilter()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		WebElement sortBy = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		
		Select select=new Select(sortBy);
		select.selectByVisibleText("Price High to Low");
		driver.findElement(By.xpath("//button[text()='Apply filter']")).click();
		String element1 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[1]")).getText().replaceAll("[^\\d.]", "");
		//String priceWithoutCurrency = element1.replaceAll("[^\\d.]", "");
		String element2 = (driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[2]")).getText().replaceAll("[^\\d.]", ""));
		String element3 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[3]")).getText().replaceAll("[^\\d.]", "");
		String element4 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[4]")).getText().replaceAll("[^\\d.]", "");
		String element5 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[5]")).getText().replaceAll("[^\\d.]", "");
		String element6 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[6]")).getText().replaceAll("[^\\d.]", "");
		String element7 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[7]")).getText().replaceAll("[^\\d.]", "");
		String element8 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[8]")).getText().replaceAll("[^\\d.]", "");
		String element9 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[9]")).getText().replaceAll("[^\\d.]", "");
		String element10 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[10]")).getText().replaceAll("[^\\d.]", "");
		String element11= driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[11]")).getText().replaceAll("[^\\d.]", "");
		String element12= driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[12]")).getText().replaceAll("[^\\d.]", "");
		
		//element1 = element1.trim();
		double p1 =Double.parseDouble(element1);
		double p2 =Double.parseDouble(element2);
		double p3 =Double.parseDouble(element3);
		double p4 =Double.parseDouble(element4);
		double p5 =Double.parseDouble(element5);
		double p6 =Double.parseDouble(element6);
		double p7 =Double.parseDouble(element7);
		double p8 =Double.parseDouble(element8);
		double p9 =Double.parseDouble(element9);
		double p10 =Double.parseDouble(element10);
		double p11=Double.parseDouble(element11);
		double p12 =Double.parseDouble(element12);
		
		System.out.println(p1);
		System.out.println(p2);
		boolean price = (p1>=p2)&&(p2>=p3)&&(p3>=p4)&&(p4>=p5)&&(p5>=p6)&&(p6>=p7)&&(p7>=p8)&&(p8>=p9)&&(p9>=p10)&&(p10>=p11)&&(p11>=p12);
		Assert.assertTrue(price);
		System.out.println("Sort By Price High to Low Filter Button is verified.");
		driver.quit();
		
	}
	@Test(priority=3)
	public void verifySortByPriceLowToHighFFilter()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		WebElement sortBy = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		
		Select select=new Select(sortBy);
		select.selectByVisibleText("Price Low to High");
		driver.findElement(By.xpath("//button[text()='Apply filter']")).click();
		
		String element1 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[1]")).getText().replaceAll("[^\\d.]", "");
		String element2 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[2]")).getText().replaceAll("[^\\d.]", "");
		String element3 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[3]")).getText().replaceAll("[^\\d.]", "");
		String element4 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[4]")).getText().replaceAll("[^\\d.]", "");
		String element5 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[5]")).getText().replaceAll("[^\\d.]", "");
		String element6 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[6]")).getText().replaceAll("[^\\d.]", "");
		String element7 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[7]")).getText().replaceAll("[^\\d.]", "");
		String element8 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[8]")).getText().replaceAll("[^\\d.]", "");
		String element9 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[9]")).getText().replaceAll("[^\\d.]", "");
		String element10 = driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[10]")).getText().replaceAll("[^\\d.]","");
		String element11= driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[11]")).getText().replaceAll("[^\\d.]", "");
		String element12= driver.findElement(By.xpath("(//h5[@class=\"MuiTypography-root MuiTypography-h5 mui-1csc1nd\"])[12]")).getText().replaceAll("[^\\d.]", "");
		
		double p1=Double.parseDouble(element1);
		double p2=Double.parseDouble(element2);
		double p3=Double.parseDouble(element3);
		double p4=Double.parseDouble(element4);
		double p5=Double.parseDouble(element5);
		double p6=Double.parseDouble(element6);
		double p7=Double.parseDouble(element7);
		double p8=Double.parseDouble(element8);
		double p9=Double.parseDouble(element9);
		double p10=Double.parseDouble(element10);
		double p11=Double.parseDouble(element11);
		double p12=Double.parseDouble(element12);
		
		boolean price = (p1<=p2)&&(p2<=p3)&&(p3<=p4)&&(p4<=p5)&&(p5<=p6)&&(p6<=p7)&&(p7<=p8)&&(p8<=p9)&&(p9<=p10)&&(p11<=p12);
		Assert.assertTrue(price);
		System.out.println("Sort By Price Low to high Filter is verified. ");
		
		driver.quit();
	}
	@Test(priority=4)
	public void verifySortByRatingsLowToHigh() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		WebElement sortBy = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		
		Select select=new Select(sortBy);
		select.selectByVisibleText("Ratings Low to High");
		driver.findElement(By.xpath("//button[text()='Apply filter']")).click();
		
		String rating1 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[1]")).getText().replaceAll(" ⭐","");
		//System.out.println(rating1);
		String rating2 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[2]")).getText().replaceAll(" ⭐","");
		String rating3 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[3]")).getText().replaceAll(" ⭐","");
		String rating4 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[4]")).getText().replaceAll(" ⭐","");
		String rating5 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[5]")).getText().replaceAll(" ⭐","");
		String rating6 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[6]")).getText().replaceAll(" ⭐","");
		String rating7 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[7]")).getText().replaceAll(" ⭐","");
		String rating8 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[8]")).getText().replaceAll(" ⭐","");
		String rating9 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[9]")).getText().replaceAll(" ⭐","");
		String rating10 =driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[10]")).getText().replaceAll(" ⭐","");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(500);
		String rating11= driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[11]")).getText().replaceAll(" ⭐","");
		String rating12= driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[12]")).getText().replaceAll(" ⭐","");
		
		double r1=Double.parseDouble(rating1);
		double r2=Double.parseDouble(rating2);
		double r3=Double.parseDouble(rating3);
		double r4=Double.parseDouble(rating4);
		double r5=Double.parseDouble(rating5);
		double r6=Double.parseDouble(rating6);
		double r7=Double.parseDouble(rating7);
		double r8=Double.parseDouble(rating8);
		double r9=Double.parseDouble(rating9);
		double r10=Double.parseDouble(rating10);
		double r11=Double.parseDouble(rating11);
		double r12=Double.parseDouble(rating12);
		
		boolean ratingsComparision = (r1<=r2)&&(r2<=r3)&&(r3<=r4)&&(r4<=r5)&&(r5<=r6)&&(r6<=r7)&&(r7<=r8)&&(r8<=r9)&&(r9<=r10)&(r10<=r11)&&(r11<=r12);
		Assert.assertTrue(ratingsComparision);
		System.out.println("Sort By Ratings Low to High Filter IS verified. ");
		
		driver.quit();
		
	}
	@Test(priority=5)
	public void verifySortByRatingsHighToLow()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		WebElement sortBy = driver.findElement(By.xpath("//select[@class=\"form-select\"]"));
		Select select=new Select(sortBy);
		select.selectByVisibleText("Ratings High to Low");
		
		driver.findElement(By.xpath("//button[text()='Apply filter']")).click();
		String rating1 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[1]")).getText().replaceAll(" ⭐","");
		String rating2 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[2]")).getText().replaceAll(" ⭐","");
		String rating3 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[3]")).getText().replaceAll(" ⭐","");
		String rating4 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[4]")).getText().replaceAll(" ⭐","");
		String rating5 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[5]")).getText().replaceAll(" ⭐","");
		String rating6 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[6]")).getText().replaceAll(" ⭐","");
		String rating7 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[7]")).getText().replaceAll(" ⭐","");
		String rating8 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[8]")).getText().replaceAll(" ⭐","");
		String rating9 = driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[9]")).getText().replaceAll(" ⭐","");
		String rating10= driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[10]")).getText().replaceAll(" ⭐","");
		String rating11= driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[11]")).getText().replaceAll(" ⭐","");
		String rating12= driver.findElement(By.xpath("(//h6[@class=\"MuiTypography-root MuiTypography-subtitle2 mui-11jljh6\"])[12]")).getText().replaceAll(" ⭐","");
		
		double r1=Double.parseDouble(rating1);
		double r2=Double.parseDouble(rating2);
		double r3=Double.parseDouble(rating3);
		double r4=Double.parseDouble(rating4);
		double r5=Double.parseDouble(rating5);
		double r6=Double.parseDouble(rating6);
		double r7=Double.parseDouble(rating7);
		double r8=Double.parseDouble(rating8);
		double r9=Double.parseDouble(rating9);
		double r10=Double.parseDouble(rating10);
		double r11=Double.parseDouble(rating11);
		double r12=Double.parseDouble(rating12);
		
		boolean rating = (r1>=r2)&&(r2>=r3)&&(r3>=r4)&&(r4>=r5)&&(r5>=r6)&&(r6>=r7)&&(r7>=r8)&&(r8>=r9)&&(r9>=r10)&&(r10>=r11)&&(r11>=r12);
		Assert.assertTrue(rating);
		System.out.println("Sort By Ratings High to Low Is verified. ");
		
		driver.quit();
	}
	@Test(priority=6)
	public void verifyBudgetRange() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		WebElement e1 = driver.findElement(By.xpath("//span[@data-index=\"0\"]"));
		WebElement e2 = driver.findElement(By.xpath("//span[@data-index=\"1\"]"));
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.clickAndHold(e1).moveByOffset(70, 363).click().perform();
		action.clickAndHold(e2).moveByOffset(100, 363).click().perform();
		
		driver.findElement(By.xpath("//button[text()='Apply filter']")).click();
		WebElement element = driver.findElement(By.xpath("//h5[text()='7750']"));
		int p=Integer.parseInt((element.getText().replaceAll("[^\\d.]", "")));
		Assert.assertTrue(element.isDisplayed());
		System.out.println("Budget Link is verified. ");
		
		driver.quit();
		
	}
	@Test(priority=6)
	public void verifyStarFilter()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bidinn.in/");
		
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@value=\"4\"]")).click();
		driver.findElement(By.xpath("//button[text()='Apply filter']")).click();
		
		
		
	}*/
}
 