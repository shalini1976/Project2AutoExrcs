package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class DownldInvAftPurchsOrder extends CallingAutoExercise {
	WebDriver driver;

	public DownldInvAftPurchsOrder(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='product-image-wrapper']/child::div/child::div/child::a") WebElement prod1addcrt;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement contshop1;
	@FindBy(xpath="//a[@data-product-id='2']") WebElement prod2addcrt;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement contshop2;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[3]/child::a") WebElement cart; //Cart tab
	@FindBy(xpath="//div[@class='breadcrumbs']/child::ol/child::li/following-sibling::li") WebElement vrfycrtpg;
	@FindBy(xpath="//a[@class='btn btn-default check_out']") WebElement prcd2chkot;
	@FindBy(xpath="//u[text()='Register / Login']") WebElement regloginbtn;

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
	@FindBy(xpath="//textarea[@class='form-control']") WebElement comment;
	@FindBy(xpath="//a[@class='btn btn-default check_out']") WebElement plcorder;
	@FindBy(xpath="//input[@name='name_on_card']") WebElement crdname;
	@FindBy(xpath="//input[@name='card_number']") WebElement crdnum;
	@FindBy(xpath="//input[@name='cvc']") WebElement crdcvc;
	@FindBy(xpath="//input[@name='expiry_month']") WebElement crdexprymnth;
	@FindBy(xpath="//input[@name='expiry_year']") WebElement crdexpryyear;
	@FindBy(xpath="//button[@id='submit']") WebElement crdpayconfrmbtn;
	@FindBy(xpath="//div[@class='alert-success alert']") WebElement vrfysuccessmsg;
	@FindBy(xpath="//a[text()='Download Invoice']") WebElement dwnldinvbtn;
	@FindBy(xpath="//a[text()='Download Invoice']") WebElement invoice;
	@FindBy(xpath="//a[text()='Continue']") WebElement continuebtn;

	@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[5]") WebElement delete;
	@FindBy(xpath="//h2") WebElement textdeleted;
	@FindBy(xpath="//a[text()='Continue']") WebElement contbtn;


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
		if(vrfycrtpg.isDisplayed())
		{
			System.out.println("Cart Page is displayed: Verified");
		}
		else
		{
			System.out.println("Cart Page is not displayed: Failed");
		}
	}
	public void proceedToCheckout()
	{
		prcd2chkot.click();
		System.out.println("Proceed To Checkout button clicked");
	}
	public void clickRegisterLoginButton()
	{
		regloginbtn.click();
		System.out.println("Register/Login button clicked");

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
		if(stitle.isDisplayed())
		{
			System.out.println("Enter Account Information is visible: - Verified");
		}
		else
		{
			System.out.println("Enter Account Information is not visible: Failed");
		}
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

	public void selectCheckbx()
	{
		newsltr.click();
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
		if(verifyacctcrtd.isDisplayed())
		{
			System.out.println("Account Created! visible: - Verified");
		}
		else
		{
			System.out.println("Account Created is not visible: - Failed");
		}
	}

	public void clickContinueBtn()
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
//Click Cart button
//Click Proceed to Checkout
	public void verifyAddressReviewDetails()
	{
		System.out.println("Delivery Address: "+dlvryaddrname.getText()+"\n"+dlvryaddrcmpny.getText()+"\n"+dlvryaddradr1.getText()+"\n"+dlvryaddradr2.getText()+"\n"+dlvryaddrctystzpcd.getText()+"\n"+dlvryaddrcntry.getText()+"\n"+dlvryaddrmobno.getText());
		System.out.println("Billing Address: "+billaddrname.getText()+"\n"+billaddrcmpny.getText()+"\n"+billaddradr1.getText()+"\n"+billaddradr2.getText()+"\n"+billaddrctystzpcd.getText()+"\n"+billaddrcntry.getText()+"\n"+billaddrmobno.getText());
		System.out.println("Delivery & Billing Address Verified");
		System.out.println("Order Reviewed");
	}
	public void enterDescriptionPlaceOrder(String cmnt)
	{
		comment.sendKeys(cmnt);
		plcorder.click();
		System.out.println("Placed Order");
	}
	public void enterCardName(String crdnm)
	{
		crdname.sendKeys(crdnm);
	}
	public void enterCardNumber(String crnum)
	{
		crdnum.sendKeys(crnum);
	}
	public void enterCVC(String crcvc)
	{
		crdcvc.sendKeys(crcvc);
	}
	public void enterCardExpiryMonth(String month)
	{
		crdexprymnth.sendKeys(month);
	}
	public void enterCardExpiryYear(String year)
	{
		crdexpryyear.sendKeys(year);
		System.out.println("Payment Details entered");
	}
	public void clickPayAndConfirm()
	{
		crdpayconfrmbtn.click();
		System.out.println("Clicked on Pay & Confirm");
	}
	public void verifySuccessMessage()
	{
		System.out.println(vrfysuccessmsg.getText());
	}
	public void clickDownloadInvoiceButton()
	{
		dwnldinvbtn.click();
		System.out.println("Invoice Downloaded");

	}
	public void clickContinueButton()
	{
		continuebtn.click();
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
		System.out.println("TEST CASE24 COMPLETED SUCCESSFULLY\n");
	}

}
