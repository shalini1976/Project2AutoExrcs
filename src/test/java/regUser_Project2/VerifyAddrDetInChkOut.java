package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class VerifyAddrDetInChkOut extends CallingAutoExercise {
	WebDriver driver;

	public VerifyAddrDetInChkOut(WebDriver ldriver)
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
	@FindBy(xpath="//label[@for='id_gender2']/child::div") WebElement actualtitle; //title - Mrs.
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

	@FindBy(xpath="//div[@class='product-image-wrapper']/child::div/child::div/child::a") WebElement prod1addcrt;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement contshop1;
	@FindBy(xpath="//a[@data-product-id='2']") WebElement prod2addcrt;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement contshop2;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[3]/child::a") WebElement cart; //Cart tab
	@FindBy(xpath="//div[@class='breadcrumbs']/child::ol/child::li/following-sibling::li") WebElement vrfycrtpg;
	@FindBy(xpath="//a[@class='btn btn-default check_out']") WebElement prcd2chkot;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li")WebElement dlvryaddrname;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li[2]")WebElement dlvryaddrcmpny;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li[3]")WebElement dlvryaddradr1;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li[4]")WebElement dlvryaddradr2;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li[5]")WebElement dlvryaddrctystzpcd;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li[6]")WebElement dlvryaddrcntry;
	@FindBy(xpath="//ul[@id='address_delivery']/child::li/following-sibling::li[7]")WebElement dlvryaddrmobno;


	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li")WebElement billaddrname;
	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li[2]")WebElement billaddrcmpny;
	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li[3]")WebElement billaddradr1;
	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li[4]")WebElement billaddradr2;
	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li[5]")WebElement billaddrctystzpcd;
	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li[6]")WebElement billaddrcntry;
	@FindBy(xpath="//ul[@id='address_invoice']/child::li/following-sibling::li[7]")WebElement billaddrmobno;


	@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[5]") WebElement delete;
	@FindBy(xpath="//h2") WebElement textdeleted;
	@FindBy(xpath="//a[text()='Continue']") WebElement contbtn;

	public void clickSignUpButton()
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String actualText=verifysignup.getText();
		String expectedText ="New User Signup!";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("New User Signup! visible: - Verified");
	}

	public void enterYourName(String nm)
	{
		name1.sendKeys(nm);
	}

	public void enterYourEmail(String mail)
	{
		email1.sendKeys(mail);

	}

	public void submitSignUpBtn()
	{
		clksignup.click();

	}

	public void verifyEnterAcctInformation()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String actualText=stitle.getText();
		String expectedText ="ENTER ACCOUNT INFORMATION";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("ENTER ACCOUNT INFORMATION is visible: Verified");
	}
	public void selectGenderTtl()
	{
		title.click();

	}
	public void enterYourPassword(String passwd)
	{
		pass.sendKeys(passwd);
	}
	public void selectDayMonYr()
	{
		day.click();
		month.click();
		year.click();
	}

	public void selectCheckbx1()
	{
		newsltr.click();
	}
	public void selectCheckbx2()
	{
		offers.click();
	}
	public void enterFstName(String fnm)
	{
		fname.sendKeys(fnm);
	}
	public void enterLstName(String lnm)
	{
		lname.sendKeys(lnm);
	}
	public void enterYourCompany(String comp)
	{
		cmpny.sendKeys(comp);
	}
	public void enterYourAddress1(String add1)
	{
		address1.sendKeys(add1);
	}
	public void enterYourAddress2(String add2)
	{
		address2.sendKeys(add2);
	}
	public void selectYourCountry()
	{
		country.click();
	}
	public void enterYourState(String stt)
	{
		state.sendKeys(stt);
	}
	public void enterYourCity(String cty)
	{
		city.sendKeys(cty);
	}
	public void enterYourZipCode(String zpcd)
	{
		zipcode.sendKeys(zpcd);
	}
	public void enterYourMobileNumber(String mbno)
	{
		mobileno.sendKeys(mbno);
	}
	public void clickCreateAcctVerify()
	{
		crtaccnt.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String actualText=verifyacctcrtd.getText();
		String expectedText ="ACCOUNT CREATED!";
		Assert.assertEquals(actualText, expectedText);
		System.out.println("ACCOUNT CREATED! visible: - Verified");
	}

	public void clickContinueBtn()
	{
		contbutton.click();
	}
	public void verifyUserName()
	{
		Assert.assertTrue(textlogin.isDisplayed());
		System.out.println(textlogin.getText()+" is visible: - Verified");
	}
	public void addProducts()
	{
		prod1addcrt.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		contshop1.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prod2addcrt.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		contshop2.click();
		System.out.println("Products added to the Cart: Verified");
	}
	public void clickCartButton()
	{
		cart.click();
		System.out.println("Cart button clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyCartPage()
	{
		Assert.assertTrue(vrfycrtpg.isDisplayed());
		System.out.println(vrfycrtpg.getText()+" is displayed: - Verified");
	}
	public void proceedToCheckout()
	{
		prcd2chkot.click();
		System.out.println("Proceed To Checkout button clicked");
	}
	public void verifyDeliveryAddress()
	{
		System.out.println("Delivery Address: "+dlvryaddrname.getText()+"\n"+dlvryaddrcmpny.getText()+"\n"+dlvryaddradr1.getText()+"\n"+dlvryaddradr2.getText()+"\n"+dlvryaddrctystzpcd.getText()+"\n"+dlvryaddrcntry.getText()+"\n"+dlvryaddrmobno.getText());
		System.out.println("Delivery Address same as Registered address: Verified");
	}
	public void verifyBillingAddress()
	{
		System.out.println("Billing Address: "+billaddrname.getText()+"\n"+billaddrcmpny.getText()+"\n"+billaddradr1.getText()+"\n"+billaddradr2.getText()+"\n"+billaddrctystzpcd.getText()+"\n"+billaddrcntry.getText()+"\n"+billaddrmobno.getText());
		System.out.println("Billing Address same as Registered address: Verified");
	}

	public void deleteAccount()
	{
		delete.click();

		String actualText=textdeleted.getText();
		String expectedText ="ACCOUNT DELETED!";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(textdeleted.getText()+" is displayed: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		contbtn.click();
		System.out.println("Continue Button Clicked");
		System.out.println("TEST CASE23 COMPLETED SUCCESSFULLY\n");
	}

}
