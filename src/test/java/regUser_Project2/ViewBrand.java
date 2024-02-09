package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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

		Assert.assertTrue(verifybrand.isDisplayed());
		System.out.println(verifybrand.getText()+" is visible on left side: - Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	public void clickBrandName()
	{
		clkbrndnm1.click();
		System.out.println("Brand name clicked");
	}
	public void verifyBrandProducts()
	{
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", clkbrndnm2);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertTrue(brndprods1.isDisplayed());
		System.out.println(brndprods1.getText()+" is visible: - Verified");
		System.out.println("User is navigated to brand page and brand products are displayed: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
		Assert.assertTrue(brndprods2.isDisplayed());
		System.out.println(brndprods1.getText()+" is visible: - Verified");
		System.out.println("User is navigated to brand page and brand products are displayed: Verified");

		System.out.println("TEST CASE19 COMPLETED SUCCESSFULLY\n");
	}
}
