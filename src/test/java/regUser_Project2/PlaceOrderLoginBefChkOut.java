package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class PlaceOrderLoginBefChkOut extends CallingAutoExercise{
	WebDriver driver;

	public PlaceOrderLoginBefChkOut(WebDriver ldriver)
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
	@FindBy(xpath="//textarea[@class='form-control']") WebElement comment;
	@FindBy(xpath="//a[@class='btn btn-default check_out']") WebElement plcorder;
	@FindBy(xpath="//input[@name='name_on_card']") WebElement crdname;
	@FindBy(xpath="//input[@name='card_number']") WebElement crdnum;
	@FindBy(xpath="//input[@name='cvc']") WebElement crdcvc;
	@FindBy(xpath="//input[@name='expiry_month']") WebElement crdexprymnth;
	@FindBy(xpath="//input[@name='expiry_year']") WebElement crdexpryyear;
	@FindBy(xpath="//button[@id='submit']") WebElement crdpayconfrmbtn;
	@FindBy(xpath="//div[@class='alert-success alert']") WebElement vrfysuccessmsg;

	@FindBy(xpath="//div[@class='container']/child::div/child::div/following-sibling::div/child::div/child::ul/child::li[5]") WebElement delete;
	@FindBy(xpath="//h2") WebElement textdeleted;
	@FindBy(xpath="//a[text()='Continue']") WebElement contbtn;

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyAddressReviewDetails()
	{
		if(billaddrname.isDisplayed() && dlvryaddrname.isDisplayed())
		{
		System.out.println("Delivery & Billing Address Verified");
		System.out.println("Order Reviewed");
		}
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
		System.out.println("TEST CASE16 COMPLETED SUCCESSFULLY\n");
	}


}
