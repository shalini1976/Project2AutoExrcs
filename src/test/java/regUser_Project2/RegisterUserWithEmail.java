package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class RegisterUserWithEmail extends CallingAutoExercise {
	WebDriver driver;

	public RegisterUserWithEmail(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a/child::i") WebElement signup; //signup tab
	@FindBy(xpath="//div[@class='signup-form']/child::h2") WebElement verifysignup;
	@FindBy(xpath="//input[@name='name']") WebElement name1; //name in signup
	@FindBy(xpath="//form[@action='/signup']/child::input[@name='email']") WebElement email1;//email in signup
	@FindBy(xpath="//button[text()='Signup']") WebElement clksignup; //signup button
	@FindBy(xpath="//p[text()='Email Address already exist!']") WebElement txterror;  //error in signup with existing email

	public void clickSignUpButton()
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(verifysignup.isDisplayed())
		{
			System.out.println("New User Signup! visible: - Verified");
		}
		else
		{
			System.out.println("New User Signup! not visible: Failed");
		}

	}

	public void enterName(String nm)
	{
		name1.sendKeys(nm);
	}

	public void enterEmail(String mail)
	{
		email1.sendKeys(mail);

	}

	public void submitSignUp()
	{
		clksignup.click();

	}
	public void verifySignUpError() throws InterruptedException
	{
		if(txterror.isDisplayed())
		{
			System.out.println("Error message is visible: - Verified");

		}
		else
		{
			System.out.println("Error message is not visible: - Failed");
		}
		System.out.println("TEST CASE5 COMPLETED SUCCESSFULLY\n");
	}

}
