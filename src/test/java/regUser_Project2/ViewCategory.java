package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class ViewCategory extends CallingAutoExercise {
	WebDriver driver;

	public ViewCategory(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a") WebElement home;
	@FindBy(xpath="//div[@class='left-sidebar']/child::h2") WebElement verifycategry; //Category
	@FindBy(xpath="//div[@id='accordian']/child::div/child::div/child::h4/child::a") WebElement women;
	@FindBy(xpath="//div[@id='Women']/child::div/child::ul/child::li/child::a") WebElement dress;
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement vrfydresshd;
	@FindBy(xpath="//div[@id='accordian']/child::div/following-sibling::div/child::div/child::h4/child::a") WebElement men;
	@FindBy(xpath="//div[@id='Men']/child::div/child::ul/child::li/following-sibling::li/child::a") WebElement jeans;
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement vrfyjeanshd;
	public void verifyCategoryOnLeftSdBar()
	{
		home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Assert.assertTrue(verifycategry.isDisplayed());
		System.out.println(verifycategry.getText()+" is visible: - Verified");
	}
	public void clickWomen()
	{
		women.click();
		System.out.println("Clicked on 'Women' category");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", dress);

	}
	public void clickDress()
	{
		dress.click();
		System.out.println("Clicked on dress");
	}
	public void verifyHeadingDress()
	{
		String actualText=vrfydresshd.getText();
		String expectedText ="WOMEN - DRESS PRODUCTS";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Category page is displayed and 'WOMEN - DRESS PRODUCTS' is visible: Verified");
	}
	public void clickMen()
	{
		men.click();
		System.out.println("Clicked on men");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickJeans()
	{
		jeans.click();
		System.out.println("Clicked on Jeans");
	}
	public void verifyHeadingJeans()
	{
		String actualText=vrfyjeanshd.getText();
		String expectedText ="MEN - JEANS PRODUCTS";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Category page is displayed and 'MEN - JEANS PRODUCTS' is visible: Verified");

		System.out.println("TEST CASE18 COMPLETED SUCCESSFULLY\n");
	}
}
