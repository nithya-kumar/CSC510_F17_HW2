package selenium.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebTest
{
	private static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception 
	{
		//driver = new HtmlUnitDriver();
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}
	
	@AfterClass
	public static void  tearDown() throws Exception
	{
		driver.close();
		driver.quit();
	}
	
	/*
	 * The participant count of "Frustration of Software Developers" is 55
	 */
	
	@Test
	public void Count() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String titlepath = "//div[@class='span8']//span[.='Frustration of Software Developers']";
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(titlepath)));
		WebElement title = driver.findElement(By.xpath(titlepath));
		assertNotNull(titlepath);
		WebElement next = title.findElement(By.xpath("../../following-sibling::div//span[@class='backers']"));
		assertNotNull(next);
		assertEquals(next.getText(),"55");
	}
	
	/*
	 * The total number of studies closed is 5
	 */
	
	@Test
	public void Closed() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		List<WebElement> spans = driver.findElements(By.xpath("//a[@class='status']/span[.='CLOSED']"));
		assertNotNull(spans);
		assertEquals(5, spans.size());
	}	

	/*
	 * If a status of a study is open, you can click on a "Participate" button
	 */
	
	@Test
	public void Participate() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='span4']//a[@class='status']/span[.='OPEN']/../following-sibling::div/button[.='Participate']")));
		List<WebElement> spans = driver.findElements(By.xpath("//div[@class='span4']//a[@class='status']/span[.='OPEN']/../following-sibling::div/button[.='Participate']"));
		assertNotNull(spans);
	}
	
	/*
	 * Check if the "Software Changes Survey" has a Amazon reward image
	 */
	
	@Test
	public void AmazonImage() throws Exception
	{
		driver.get("http://www.checkbox.io/studies.html");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='span8']//span[.='Software Changes Survey']/../following-sibling::div[@class='award']/div/span/img")));
		WebElement span = driver.findElement(By.xpath("//div[@class='span8']//span[.='Software Changes Survey']/../following-sibling::div[@class='award']/div/span/img"));
		assertNotNull(span);
		assertEquals(span.getAttribute("src"), "http://www.checkbox.io/media/amazongc-micro.jpg");
	}
}
