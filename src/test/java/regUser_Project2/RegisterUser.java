package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class RegisterUser extends CallingAutoExercise {
WebDriver driver;

public RegisterUser(WebDriver ldriver)
{
	driver=ldriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a/child::i") WebElement signup; //signup tab
@FindBy(xpath="//div[@class='signup-form']/child::h2") WebElement verifysignup;
@FindBy(xpath="//input[@name='name']") WebElement name1; //name in signup
@FindBy(xpath="//form[@action='/signup']/child::input[@name='email']") WebElement email1;//email in signup
@FindBy(xpath="//button[text()='Signup']") WebElement clksignup; //signup button

@FindBy(xpath="//div[@class='login-form']/child::h2") WebElement stitle; //title of signup/login page

@FindBy(xpath="//input[@id='id_gender2']") WebElement title; //title - Mr. or Mrs.
@FindBy(xpath="//input[@id='password']") WebElement pass; //password in signup page

@FindBy(xpath="//select[@id='days']/child::option[@value='1']") WebElement day; //day in dob
@FindBy(xpath="//select[@id='months']/child::option[@value='9']") WebElement month; //month in dob
@FindBy(xpath="//select[@id='years']/child::option[@value='1980']") WebElement year; //year in dob

@FindBy(xpath="//input[@id='newsletter']") WebElement newsltr; //checkbox1
@FindBy(xpath="//input[@id='optin']") WebElement offers; //checkbox2

@FindBy(xpath="//input[@id='first_name']") WebElement fname; //First Name
@FindBy(xpath="//input[@id='last_name']") WebElement lname; //Last Name
@FindBy(xpath="//input[@id='company']") WebElement cmpny; //Company
@FindBy(xpath="//input[@id='address1']") WebElement address1; //Address1
@FindBy(xpath="//input[@id='address2']") WebElement address2; //Address2

@FindBy(xpath="//select[@id='country']/child::option[@value='India']") WebElement country; //Country
@FindBy(xpath="//input[@id='state']") WebElement state; //state
@FindBy(xpath="//input[@id='city']") WebElement city; //City
@FindBy(xpath="//input[@id='zipcode']") WebElement zipcode; //Zipcode
@FindBy(xpath="//input[@id='mobile_number']") WebElement mobileno; //Mobile Number
@FindBy(xpath="//button[@type='submit']") WebElement crtaccnt; //Submit Create Account Button

@FindBy(xpath="//h2") WebElement verifyacctcrtd;
@FindBy(xpath="//a[@data-qa='continue-button']") WebElement contbutton;
@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[10]") WebElement textlogin;
@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[5]") WebElement delete;
@FindBy(xpath="//h2") WebElement textdeleted;
@FindBy(xpath="//a[text()='Continue']") WebElement contbtn;

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

public void verifyEnterAccountInformation()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	if(stitle.isDisplayed())
	{
		System.out.println("Enter Account Information is visible: - Verified");
	}
	else
	{
		System.out.println("Enter Account Information is not visible: Failed");
	}
}
public void selectGenderTitle()
{
	title.click();

}
public void enterPassword(String passwd)
{
	pass.sendKeys(passwd);
}
public void selectDay()
{
	day.click();
}
public void selectMonth()
{
	month.click();
}
public void selectYear()
{
	year.click();
}
public void selectCheckbox1()
{
	newsltr.click();
}
public void selectCheckbox2()
{
	offers.click();
}
public void enterFName(String fnm)
{
	fname.sendKeys(fnm);
}
public void enterLName(String lnm)
{
	lname.sendKeys(lnm);
}
public void enterCompany(String comp)
{
	cmpny.sendKeys(comp);
}
public void enterAddress1(String add1)
{
	address1.sendKeys(add1);
}
public void enterAddress2(String add2)
{
	address2.sendKeys(add2);
}
public void selectCountry()
{
	country.click();
}
public void enterState(String stt)
{
	state.sendKeys(stt);
}
public void enterCity(String cty)
{
	city.sendKeys(cty);
}
public void enterZipCode(String zpcd)
{
	zipcode.sendKeys(zpcd);
}
public void enterMobileNumber(String mbno)
{
	mobileno.sendKeys(mbno);
}
public void clickCreateAccountVerify()
{
	crtaccnt.click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	if(verifyacctcrtd.isDisplayed())
	{
		System.out.println("Account Created! visible: - Verified");
	}
	else
	{
		System.out.println("Account Created is not visible: - Failed");
	}
}
public void clickContinueButton()
{
	contbutton.click();
}
public void verifyUserName()
{
	if(textlogin.isDisplayed())
	{
		System.out.println("Logged in as username is visible: - Verified");

	}
	else
	{
		System.out.println("Logged in as username is not visible: - Failed");
	}
}
public void deleteAccount()
{
	delete.click();

	if(textdeleted.isDisplayed())
	{
		System.out.println("Account Deleted is visible: - Verified");

	}
	else
	{
		System.out.println("Account Deleted is not visible: - Failed");
	}
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	contbtn.click();
	System.out.println("Continue Button Clicked");
	System.out.println("TEST CASE1 COMPLETED SUCCESSFULLY\n");
}
}
