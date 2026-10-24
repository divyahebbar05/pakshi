package gubbachi.pakshi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class templatecataloguetext extends abstractchat360{

	WebDriver driver;
	public templatecataloguetext(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	 By campaignfeature=By.cssSelector("a[href='/campaign']");
	 By close=By.xpath("//span[text()='Close']");
	 By Templates=By.xpath("//span[text()='Templates']");
	 By createNew =By.xpath("//span[text()='Create New Template']");
	 By templateName=By.cssSelector("input[placeholder='Type Template Name']");
	 By selectCategory=By.cssSelector("input[placeholder='Select Template Category']");
	 By type=By.xpath("//div[@role='option' and text()='MARKETING']");
	 By templateType=By.xpath("//input[@placeholder='Choose Template Type']");
	 By image=By.xpath("//div[text()='Image']");
	 By language=By.xpath("//input[@placeholder='Type to select Language']");
	 By english=By.xpath("//div[text()='English']");
	 By templateText=By.cssSelector("div[class*='ProseMirror']");
	 By number=By.xpath("//input[@placeholder='Select Business Number']");
	 By divya=By.xpath("//div[text()='Divya D']");
	 By next=By.xpath("//span[text()='Next']");
	 By media=By.xpath("//input[@placeholder='Example Media']");
	 By mantine=By.cssSelector("div.mantine-Group-root.mantine-vtlofq:nth-child(1)");
	 By png=By.xpath("//div[text()='two.png']");
	 By send=By.xpath("//span[text()='Send']");
	 By submit=By.xpath("//button[@type='submit']");
	 By closepopup=By.xpath("//span[text()='Close']");
	 
	 public void navigateToCampaignTab()
		{
			waitForWebElementToAppear(campaignfeature);
			driver.findElement(campaignfeature).click();
			waitForWebElementToAppear(closepopup);
			driver.findElement(closepopup).click();
		}
	 
	 public void createNewTemplate()
	 {
		 waitForWebElementToAppear(Templates);
driver.findElement(Templates).click();
		 waitForWebElementToAppear(createNew);
		 driver.findElement(createNew).click();
	 }
	 
public void templateName1()
{
	waitForWebElementToAppear(templateName);
	driver.findElement(templateName).click();
	driver.findElement(templateName).sendKeys("texttemp19");
}

public void templateCategory()
{
	WebElement staticdropdown=driver.findElement(selectCategory);
	waitForWebElementToAppear1(staticdropdown);
	waitForWebElementToAppear(selectCategory);
	driver.findElement(selectCategory).click();
	//Thread.sleep(5000);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='mantine-zezovr56r' and text()='MARKETING']")));
	waitForWebElementToAppear(type);
	driver.findElement(type).click();
}

public void templateType()
{
	waitForWebElementToAppear(templateType);
	driver.findElement(templateType).click();	
	
	waitForWebElementToAppear(image);
	driver.findElement(image).click();
}

public void selectLanguage()
{
	waitForWebElementToAppear(language);
	driver.findElement(language).click();
	waitForWebElementToAppear(language);
	driver.findElement(language).sendKeys("English");
	waitForWebElementToAppear(english);
	driver.findElement(english).click();
}

public void templateText()
{
	waitForWebElementToAppear(templateText);
	driver.findElement(templateText).click();
//	driver.findElement(By.xpath("//div[@data-placeholder='Enter Template Text']")).click();
	
	waitForWebElementToAppear(templateText);
	driver.findElement(templateText).sendKeys("we will travel this month");
}

public void selectNumber() {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(number));
	waitForWebElementToAppear(number);
	driver.findElement(number).click();
	waitForWebElementToAppear(divya);
	driver.findElement(divya).click();
	waitForWebElementToAppear(next);
	driver.findElement(next).click();
}

public void media1()
{
	waitForWebElementToAppear(media);
	driver.findElement(media).click();
	waitForWebElementToAppear(mantine);
	driver.findElement(mantine).click();
	waitForWebElementToAppear(png);
	driver.findElement(png).click();
	waitForWebElementToAppear(send);
	driver.findElement(send).click();
}

public void submit()
{
	waitForWebElementToAppear(submit);
	driver.findElement(submit).click();
}
}
