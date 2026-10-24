package gubbachi.pakshi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class texttemplate {
	
	@Test

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		////LandingPage
		driver.get("https://staging.chat360.io/login");
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email"))).sendKeys("divya+test00005@chat360.io");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("Diamond@12345");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/campaign']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Close']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Templates']"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Create New Template']"))).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Type Template Name']")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type Template Name']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type Template Name']"))).sendKeys("texttemp15");
	WebElement staticdropdown=driver.findElement(By.cssSelector("input[placeholder='Select Template Category']"));
	wait.until(ExpectedConditions.visibilityOf(staticdropdown));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Select Template Category']"))).click();
	//Thread.sleep(5000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mantine-zezovr56r' and text()='MARKETING']")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@role='option' and text()='MARKETING']"))).click();
	//System.out.println(driver.findElements(By.xpath("//*[contains(text(),'MARKETING')]")).size());
	//WebElement hiddenInput = driver.findElement(By.xpath("//*[contains(text(),'AUTHENTICATION')]"));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Choose Template Type']"))).click();	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Image']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type to select Language']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Type to select Language']"))).sendKeys("English");
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='English']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='ProseMirror']"))).click();
//	driver.findElement(By.xpath("//div[@data-placeholder='Enter Template Text']")).click();
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class*='ProseMirror']"))).sendKeys("we will travel this month");
	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//input[@placeholder='Select Business Number']")));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select Business Number']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Divya D']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Example Media']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.mantine-Group-root.mantine-vtlofq:nth-child(1)"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='two.png']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Send']"))).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']"))).click();
	
	//hiddenInput.click();
	
		//driver.quit();
	}

}
