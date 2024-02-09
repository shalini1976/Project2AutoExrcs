package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class VerifySubsHmPg extends CallingAutoExercise {
	WebDriver driver;

	public VerifySubsHmPg(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='single-widget']/child::h2") WebElement substxt; //Text Subscription
	@FindBy(xpath="//input[@id='susbscribe_email']") WebElement subsemail;
	@FindBy(xpath="//button[@id='subscribe']") WebElement subsbtn;
	@FindBy(xpath="//div[@id='success-subscribe']/child::div") WebElement successmsg;

	public void verifyTextSubs()
	{
		String actualText=substxt.getText();
		String expectedText ="SUBSCRIPTION";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Text 'SUBSCRIPTION' is displayed: Verified");
	}
	public void enterEmail(String mail)
	{
		subsemail.sendKeys(mail);
		System.out.println("Email Id entered");
	}
	public void clickArrow()
	{
		subsbtn.click();
		System.out.println("Arrow clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifySuccessMessage()
	{
		String actualText=successmsg.getText();
		String expectedText ="You have been successfully subscribed!";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(" 'You have been successfully subscribed!' is visible: Verified");
		System.out.println("TEST CASE10 COMPLETED SUCCESSFULLY\n");
	}
}
