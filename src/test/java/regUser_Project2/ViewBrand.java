package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class ViewBrand extends CallingAutoExercise {
	WebDriver driver;

	public ViewBrand(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products; //Products tab
	@FindBy(xpath="//div[@class='brands_products']/child::h2") WebElement verifybrand;
	@FindBy(xpath="//div[@class='brands-name']/child::ul/child::li/following-sibling::li/child::a/child::span") WebElement clkbrndnm1;
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement brndprods1;
	//@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement brndprods2;
	@FindBy(xpath="//div[@class='brands-name']/child::ul/child::li[6]/child::a/child::span") WebElement clkbrndnm2;
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement brndprods2;

	public void clickProducts()
	{
		products.click();
		System.out.println("Products Tab clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyBrandOnLeft()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", verifybrand);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		if(verifybrand.isDisplayed())
		{
			System.out.println("BRANDS is visible on left side: Verified");
		}
		else
		{
			System.out.println("BRANDS is not visible on left side: Failed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void clickBrandName()
	{
		clkbrndnm1.click();
		System.out.println("Brand name clicked");
	}
	public void verifyBrandProducts() throws InterruptedException
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", clkbrndnm2);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		System.out.println(brndprods1.getText());
		if(brndprods1.isDisplayed())
		{
			System.out.println("User is navigated to brand page and brand products are displayed: Verified");
		}
		else
		{
			System.out.println("User is not navigated to brand page and brand products are not displayed: Failed");
		}
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
	}
	public void clickBrandName2()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clkbrndnm2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		clkbrndnm2.click();
		System.out.println("Brand name clicked");
	}
	public void verifyBrandProducts2()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		if(brndprods2.isDisplayed())
		{
			System.out.println("User is navigated to brand page and brand products are displayed: Verified");
		}
		else
		{
			System.out.println("User is not navigated to brand page and brand products are not displayed: Failed");
		}
		System.out.println("TEST CASE19 COMPLETED SUCCESSFULLY\n");
	}
}
