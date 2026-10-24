package gubbachi.pakshi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractchat360 {
	
	WebDriver driver;
	public abstractchat360(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void waitForWebElementToAppear(By findBy)
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	public void waitForWebElementToAppear1(WebElement findBy)	
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(findBy));
		
	}
	
public void waitForWebElementToAppear2(WebElement element)
	
	{
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(element));
	}	

public void waitForWebElementToAppear3(List<WebElement> element)

{
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.visibilityOfAllElements(element));
}	

	
	
	public void waitForWebElementTodisAppear(By findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findBy));
		}
		
	public void waitForWebElementTodisappear1(WebElement findBy)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(findBy));
}
	
	public void waitForWebElementTodisappear2(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
		
		public void switchToLastWindow() {
	        for (String handle : driver.getWindowHandles()) {
	            driver.switchTo().window(handle);
	            System.out.println("✅ Now Selenium is in the latest opened window: " + driver.getCurrentUrl());
	        }
		}
	        
	        public void switchToIframe(int index) {
	            driver.switchTo().frame(index);
	        }
	        
	     // ✅ Print number of iframes on the current page
	        public int printIframeCount() {
	            List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
	            System.out.println("🖼️ Iframes found: " + iframes.size());
	            return iframes.size();
}
	        
	     // Example: wait for element in new page
	        public WebElement webElementToAppearwait2(By findBy) {
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement prew = wait2.until(
			        ExpectedConditions.visibilityOfElementLocated(findBy));
			return prew;
	        }
	        
	        public WebElement webElementToAppearwait3(By findBy) {  
		        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		        WebElement inputBox = wait3.until(
		            ExpectedConditions.elementToBeClickable(findBy));
		        return inputBox;
		        }
	        public WebElement webElementToAppearwait4(WebElement findBy) {  
	        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
	        WebElement inputBox1 = wait3.until(
	            ExpectedConditions.elementToBeClickable(findBy));
	        return inputBox1;
	        }
			
			
}
	       
		

