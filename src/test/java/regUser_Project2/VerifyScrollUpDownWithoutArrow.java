package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class VerifyScrollUpDownWithoutArrow extends CallingAutoExercise {
	WebDriver driver;

	public VerifyScrollUpDownWithoutArrow(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='single-widget']/child::h2") WebElement substxt; //Text Subscription
	@FindBy(xpath="//div[@class='col-sm-6']/child::h2") WebElement fulltxt;

	public void scrollDown()
	{
		//Scrolling down to the bottom of the page till Subscription is visible

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", substxt);

		System.out.println("Scrolled down to the bottom of the page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	public void verifyTextSubs()
	{
		String actualText=substxt.getText();
		String expectedText ="SUBSCRIPTION";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Text 'SUBSCRIPTION' is displayed: Verified");
	}
	public void scrollUp()
	{
		//Scrolling up to the top of the page

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", fulltxt);

		System.out.println("Scrolled up to the top of the page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyFullText()
	{
		Assert.assertTrue(fulltxt.isDisplayed());
		System.out.println("Page is scrolled up and '"+fulltxt.getText()+"' is visible: - Verified");

		System.out.println("TEST CASE26 COMPLETED SUCCESSFULLY\n");
	}

}
