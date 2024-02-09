package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class ContactUs	extends CallingAutoExercise {
	WebDriver driver;

	public ContactUs(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[8]") WebElement contactus; //contactus tab
	@FindBy(xpath="//div[@class='contact-form']/child::h2") WebElement verifygetintch;
	@FindBy(xpath="//form[@id='contact-us-form']/child::div/child::input[@name='name']") WebElement name;
	@FindBy(xpath="//form[@id='contact-us-form']/child::div/child::input[@name='email']") WebElement email;
	@FindBy(xpath="//form[@id='contact-us-form']/child::div/child::input[@name='subject']") WebElement subject;
	@FindBy(xpath="//form[@id='contact-us-form']/child::div/child::textarea[@id='message']") WebElement message;
	@FindBy(xpath="//form[@id='contact-us-form']/child::div/child::input[@name='upload_file']") WebElement upload1;
	@FindBy(xpath="//form[@id='contact-us-form']/child::div/child::input[@name='submit']") WebElement submit;
	@FindBy(xpath="//div[@class='status alert alert-success']") WebElement successmsg;
	@FindBy(xpath="//span/child::i") WebElement home;


	public void clickContactUs()
	{
		contactus.click();
	}
	public void verifyGetInTouch()
	{
		String actualText=verifygetintch.getText();
		String expectedText ="GET IN TOUCH";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("Get In Touch is visible: - Verified");
	}
	public void enterName(String nm)
	{
		name.sendKeys(nm);
	}

	public void enterEmail(String mail)
	{
		email.sendKeys(mail);

	}
	public void enterSubject(String sub)
	{
		subject.sendKeys(sub);
	}

	public void enterMessage(String msg)
	{
		message.sendKeys(msg);

	}

	public void upFile(String upfl)
	{
		upload1.clear();
		upload1.sendKeys(upfl);

	}

	public void clickSubmit()
	{
		submit.click();
		System.out.println("Submit Clicked");
	}
	public void clickOK()
	{
		Alert a1=driver.switchTo().alert();
		a1.accept();
		System.out.println("OK Clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}
	public void verifySuccessMessage()
	{
		Assert.assertTrue(successmsg.isDisplayed());
		System.out.println(successmsg.getText()+" is visible: - Verified");
	}
	public void clickHome()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		home.click();
		System.out.println("Home clicked");
	}
	public void verifyHome()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		String actualURL=driver.getCurrentUrl();
		String expectedURL ="https://automationexercise.com/";
		Assert.assertEquals(actualURL, expectedURL);
		System.out.println("Landed to Home page successfully: - Verified");
		System.out.println("TEST CASE6 COMPLETED SUCCESSFULLY\n");
	}

}
