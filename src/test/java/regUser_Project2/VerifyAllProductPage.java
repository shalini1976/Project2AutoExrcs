package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class VerifyAllProductPage extends CallingAutoExercise {
	WebDriver driver;

	public VerifyAllProductPage(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products; //Products tab
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement verifyprodpg;
	@FindBy(xpath="//div[@class='features_items']") WebElement prdlist;
	@FindBy(xpath="//div[@class='choose']/child::ul/child::li/child::a[1]") WebElement vwprod1;
	@FindBy(xpath="//div[@class='product-information']") WebElement proddetail;

	public void clickProducts()
	{
		products.click();
		System.out.println("Products Tab clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String actualText=verifyprodpg.getText();
		String expectedText ="ALL PRODUCTS";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("User is navigated to ALL PRODUCTS page successfully: - Verified");
	}
	public void verifyList()
	{
		Assert.assertTrue(prdlist.isDisplayed());
		System.out.println(prdlist.getText()+" is visible: - Verified");
	}
	public void viewProduct()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		vwprod1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("View Product of first product list is clicked: Verified");

		Assert.assertTrue(proddetail.isDisplayed());
		System.out.println(proddetail.getText()+" is visible: - Verified");
		System.out.println("TEST CASE8 COMPLETED SUCCESSFULLY\n");
	}

}
