package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		System.out.println("TEST CASE10 COMPLETED SUCCESSFULLY\n");
	}

}
