package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class LoginValidUser extends CallingAutoExercise{
	WebDriver driver;

	public LoginValidUser(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a/child::i") WebElement signup; //signup tab
	@FindBy(xpath="//div[@class='login-form']/child::h2") WebElement verifylogin;
	@FindBy(xpath="//form[@action='/login']/child::input[@name='email']") WebElement email2;
	@FindBy(xpath="//form[@action='/login']/child::input[@name='password']") WebElement pass2;
	@FindBy(xpath="//button[text()='Login']") WebElement clklogin;
	@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[10]") WebElement vrfylogin;
	@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[5]") WebElement dltlogin;
	@FindBy(xpath="//h2") WebElement textdeleted;

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
	public void enterEmail2(String mail2)
	{
		email2.sendKeys(mail2);
	}

	public void enterPassword(String ps2)
	{
		pass2.sendKeys(ps2);

	}

	public void clickLoginButton()
	{
		clklogin.click();

	}
	public void verifyLogin()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(vrfylogin.isDisplayed())
		{
			System.out.println("Logged in as username is visible: - Verified");
		}
		else
		{
			System.out.println("Logged in as username is not visible: - Failed");
		}
	}
	public void deleteLogin()
	{
		dltlogin.click();

		if(textdeleted.isDisplayed())
		{
			System.out.println("Account Deleted is visible: - Verified");

		}
		else
		{
			System.out.println("Account Deleted is not visible: - Failed");
		}
		System.out.println("TEST CASE2 COMPLETED SUCCESSFULLY\n");
	}

}
