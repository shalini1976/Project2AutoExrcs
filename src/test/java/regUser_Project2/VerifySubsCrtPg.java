package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class VerifySubsCrtPg extends CallingAutoExercise {
	WebDriver driver;

	public VerifySubsCrtPg(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='shop-menu pull-right']/child::ul/child::li[3]") WebElement cart;  //Cart Button
	@FindBy(xpath="//div[@class='single-widget']/child::h2") WebElement substxt; //Text Subscription
	@FindBy(xpath="//input[@id='susbscribe_email']") WebElement subsemail;
	@FindBy(xpath="//button[@id='subscribe']") WebElement subsbtn;
	@FindBy(xpath="//div[@id='success-subscribe']/child::div") WebElement successmsg;

	public void clickCartButton()
	{
		cart.click();
		System.out.println("Cart button clicked");
	}

	public void verifyTextSubs()
	{
		if(substxt.isDisplayed())
		{
			System.out.println("Text 'SUBSCRIPTION' is displayed: Verified");
		}
		else
		{
			System.out.println("Text 'SUBSCRIPTION' is not displayed: Failed");
		}
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
		if(successmsg.isDisplayed())
		{
			System.out.println(" 'You have been successfully subscribed!' is visible: Verified");
		}
		else
		{
			System.out.println(" 'You have been successfully subscribed!' is visible: Failed");
		}
		System.out.println("TEST CASE11 COMPLETED SUCCESSFULLY\n");
	}


}
