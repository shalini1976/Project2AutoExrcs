package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class LoginInvalidUser extends CallingAutoExercise {
	WebDriver driver;

	public LoginInvalidUser(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a/child::i") WebElement signup; //signup tab
	@FindBy(xpath="//div[@class='login-form']/child::h2") WebElement verifylogin;
	@FindBy(xpath="//form[@action='/login']/child::input[@name='email']") WebElement email3;
	@FindBy(xpath="//form[@action='/login']/child::input[@name='password']") WebElement pass3;
	@FindBy(xpath="//button[text()='Login']") WebElement clklogin;
	@FindBy(xpath="//p[text()='Your email or password is incorrect!']") WebElement texterror;

	public void clickSignUpButton()
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(verifylogin.isDisplayed())
		{
			System.out.println("Login to your account is visible: - Verified");
		}
		else
		{
			System.out.println("Login to your account is not visible: - Verified");
		}

	}
	public void enterEmail3(String mail3)
	{
		email3.sendKeys(mail3);
	}

	public void enterPassword(String ps3)
	{
		pass3.sendKeys(ps3);

	}

	public void clickLoginButton()
	{
		clklogin.click();

	}
	public void verifyLoginError()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(texterror.isDisplayed())
		{
			System.out.println("Error message is visible: - Verified");
		}
		else
		{
			System.out.println("Error message is not visible: - Failed");
		}
		System.out.println("TEST CASE3 COMPLETED SUCCESSFULLY\n");
	}


}
