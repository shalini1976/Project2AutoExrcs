package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class AddReview extends CallingAutoExercise {
	WebDriver driver;

	public AddReview(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products; //Products tab
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement verifyprodpg;
	@FindBy(xpath="//div[@class='choose']/child::ul/child::li/child::a[1]") WebElement vwprod1;
	@FindBy(xpath="//li[@class='active']/child::a") WebElement wrtrev;

	@FindBy(xpath="//input[@id='name']") WebElement revname; //name in Review
	@FindBy(xpath="//input[@id='email']") WebElement revemail;//email in Review
	@FindBy(xpath="//textarea[@id='review']") WebElement review; //review
	@FindBy(xpath="//button[@id='button-review']") WebElement subrev; //submit review

	@FindBy(xpath="//div[@class='alert-success alert']/child::span") WebElement revmsg; //Success Message


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

	public void viewProduct()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", vwprod1);

		vwprod1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("View Product is clicked: Verified");

		Assert.assertTrue(wrtrev.isDisplayed());
		System.out.println(wrtrev.getText()+" is visible: - Verified");
	}

	public void enterName(String rvnm)
	{
		revname.sendKeys(rvnm);
	}

	public void enterEmail(String rvmail)
	{
		revemail.sendKeys(rvmail);
	}
	public void enterReview(String rv)
	{
		review.sendKeys(rv);
	}
	public void clickSubmit()
	{
		subrev.click();
	}
	public void successMessage()
	{
		Assert.assertTrue(revmsg.isDisplayed());
		System.out.println("success message '"+revmsg.getText()+".' is visible: - Verified");

		System.out.println("TEST CASE21 COMPLETED SUCCESSFULLY\n");
	}
}



