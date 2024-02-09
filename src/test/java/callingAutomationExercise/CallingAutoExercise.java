package callingAutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import regUser_Project2.AddProductsInCart;
import regUser_Project2.AddReview;
import regUser_Project2.AddToCartRecommended;
import regUser_Project2.ContactUs;
import regUser_Project2.DownldInvAftPurchsOrder;
import regUser_Project2.LoginInvalidUser;
import regUser_Project2.LoginValidUser;
import regUser_Project2.LogoutUser;
import regUser_Project2.PlaceOrderLoginBefChkOut;
import regUser_Project2.PlaceOrderRegBefChkOut;
import regUser_Project2.PlaceOrderRegWhlChkOut;
import regUser_Project2.RegisterUser;
import regUser_Project2.RegisterUserWithEmail;
import regUser_Project2.RemoveProdsFromCart;
import regUser_Project2.SearchProdsVerfyCartAfterLogin;
import regUser_Project2.SearchProduct;
import regUser_Project2.TestCasesPage;
import regUser_Project2.VerifyAddrDetInChkOut;
import regUser_Project2.VerifyAllProductPage;
import regUser_Project2.VerifyProdQtyInCrt;
import regUser_Project2.VerifyScrollUpDownWithArrow;
import regUser_Project2.VerifyScrollUpDownWithoutArrow;
import regUser_Project2.VerifySubsCrtPg;
import regUser_Project2.VerifySubsHmPg;
import regUser_Project2.ViewBrand;
import regUser_Project2.ViewCategory;

public class CallingAutoExercise {
WebDriver driver;

	@BeforeSuite
	public void launchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		driver.get("https://automationexercise.com");
		Thread.sleep(2000);
	}
	@BeforeMethod
	public void verifyAutomationExerciseWebPage()
	{
		//Verifying Home Page
		String actualTitle=driver.getTitle();
		String expectedTitle ="Automation Exercise";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Home Page displayed successfully");
	}
	@Test//(priority=1)
	public void verifyRegisterUserTC1() 
	{
		//Test Case1
		RegisterUser reg_user=new RegisterUser(driver);
		
		reg_user.clickSignUpButton();
		reg_user.enterName("Sahiita");
		reg_user.enterEmail("sahiya@yahoo.com");
		reg_user.submitSignUp();
		reg_user.verifyEnterAccountInformation();

		reg_user.selectGenderTitle();
		reg_user.enterPassword("passwd");
		reg_user.selectDay();
		reg_user.selectMonth();
		reg_user.selectYear();
		reg_user.selectCheckbox1();
		reg_user.selectCheckbox2();
		reg_user.enterFName("Sahita");
		reg_user.enterLName("S");
		reg_user.enterAddress1("Akshayanagar");
		reg_user.enterAddress2("Classic Layout");
		reg_user.enterCompany("ExcelR");
		reg_user.selectCountry();
		reg_user.enterState("Karnataka");
		reg_user.enterCity("Bangalore");
		reg_user.enterZipCode("230098");
		reg_user.enterMobileNumber("987654322");
		reg_user.clickCreateAccountVerify();
		reg_user.clickContinueButton();
		reg_user.verifyUserName();
		reg_user.deleteAccount();
	}
	@Test(priority=2)
	public void verifyLoginValidUserTC2() 
	{
		//Test Case2
		LoginValidUser login_vld_user=new LoginValidUser(driver);
		
		login_vld_user.clickSignUpButton();
		login_vld_user.enterEmail2("paavni@yahoo.com");
		login_vld_user.enterPassword("passwd");
		login_vld_user.clickLoginButton();
		login_vld_user.verifyLogin();
		login_vld_user.deleteLogin();
	}
	
	@Test(priority=3)
	public void verifyLoginInvalidUserTC3() 
	{
		//Test Case3
		LoginInvalidUser login_invld_user=new LoginInvalidUser(driver);		
		
		login_invld_user.clickSignUpButton();
		login_invld_user.enterEmail3("xyz@gmail.com");
		login_invld_user.enterPassword("wordpass");
		login_invld_user.clickLoginButton();
		login_invld_user.verifyLoginError();
	}
	@Test(priority=4)
	public void verifyLogoutUserTC4() 
	{
		//Test Case4
		LogoutUser logout_user =new LogoutUser(driver);				
		
		logout_user.clickSignUpButton();
		logout_user.enterEmail2("michelle@gmail.com");
		logout_user.enterPassword("passwd");
		logout_user.clickLoginButton();
		logout_user.verifyLogin();
		logout_user.clickLogoutButton();
		logout_user.verifyLoginPage();
	}
	@Test(priority=5)
	public void verifyRegisterWithEmailTC5() 
	{
		//Test Case5
		RegisterUserWithEmail reg_usr_wth_email =new RegisterUserWithEmail(driver);		
		
		reg_usr_wth_email.clickSignUpButton();
		reg_usr_wth_email.enterName("Michelle");
		reg_usr_wth_email.enterEmail("michelle@gmail.com");
		reg_usr_wth_email.submitSignUp();
		reg_usr_wth_email.verifySignUpError();
	}
		
	@Test(priority=6)
	public void verifyContactUsTC6() 
	{
		//Test Case6
		ContactUs cntus=new ContactUs(driver);	
		
		cntus.clickContactUs();
		cntus.verifyGetInTouch();
		cntus.enterName("Nyonika");
		cntus.enterEmail("naini@gmail.com");
		cntus.enterSubject("Product quality not good");
		cntus.enterMessage("Refund");
		cntus.upFile("C:\\Users\\hp\\Desktop\\Shalini_ExcelR\\Selenium\\Automation Project2_AutomationExercise\\ContactUs.txt");
		cntus.clickSubmit();
		cntus.clickOK(); 
		cntus.verifySuccessMessage();
		cntus.clickHome();
		cntus.verifyHome();
	}
	@Test(priority=7)
	public void verifyTestCasesTC7() 
	{
		//Test Case7
		TestCasesPage tstcspg =new TestCasesPage(driver);	
		
		tstcspg.clickTestCasesButton();
		tstcspg.verifyTestCasesPage();
	}
	@Test(priority=8)
	public void verifyAllProductsTC8() 
	{	
		//Test Case8
		VerifyAllProductPage vprodpg=new VerifyAllProductPage(driver);	
		
		vprodpg.clickProducts();
		vprodpg.verifyList();
		vprodpg.viewProduct();
	}	
	@Test(priority=9)
	public void verifySearchProductTC9() 
	{
		//Test Case9
		SearchProduct srchprd =new SearchProduct(driver);
			
		srchprd.clickProducts();
		srchprd.enterItemInSearchbox("dress");
		srchprd.clickSearchButton();
		srchprd.verifySearchedProducts();
		srchprd.verifySearchedProductsList();
	}
	@Test(priority=10)
	public void verifyHomeSubscriptionTC10() 
	{
	
		//Test Case10
		VerifySubsHmPg vsubshmpg=new VerifySubsHmPg(driver);	
		
		vsubshmpg.verifyTextSubs();
		vsubshmpg.enterEmail("shalini@yahoo.com");
		vsubshmpg.clickArrow();
	}
	@Test(priority=11)
	public void verifyCartSubscriptionTC11() 
	{
		//Test Case11
		VerifySubsCrtPg vsubscrtpg =new VerifySubsCrtPg(driver);				
		
		vsubscrtpg.clickCartButton();
		vsubscrtpg.verifyTextSubs();
		vsubscrtpg.enterEmail("shikha@gmail.com");
		vsubscrtpg.clickArrow();
		vsubscrtpg.verifySuccessMessage();
	}	
	@Test(priority=12)
	public void verifyAddProductsTC12() 
	{	
		//Test Case12
		AddProductsInCart adprdcrt=new AddProductsInCart(driver);	
		
		adprdcrt.clickProducts();
		adprdcrt.firstProduct();
		adprdcrt.clickContinueShoppingButton();
		adprdcrt.secondProduct();
		adprdcrt.clickViewCart();
		adprdcrt.verifyCartProducts();
		adprdcrt.verifyPrcQtyTprc();
	}
	@Test(priority=13)
	public void verifyProductQuantityTC13() 
	{	
		//Test Case13
		VerifyProdQtyInCrt vrfyprodqincrt=new VerifyProdQtyInCrt(driver);	
		
		vrfyprodqincrt.clickViewCart();
		vrfyprodqincrt.verifyDetailsPage();
		vrfyprodqincrt.increaseQuantity();
		vrfyprodqincrt.clickAddToCartButton();
		vrfyprodqincrt.clickViewCartButton();
		vrfyprodqincrt.verifyQuantity();
	}	
	@Test(priority=14)
	public void verifyPlaceOrder1TC14() 
	{	
		//Test Case14
		PlaceOrderRegWhlChkOut plcordwhlchkot=new PlaceOrderRegWhlChkOut(driver); 
		
		plcordwhlchkot.addProducts();
		plcordwhlchkot.clickCartButton();
		plcordwhlchkot.verifyCartPage();
		plcordwhlchkot.proceedToCheckout();
		plcordwhlchkot.clickRegisterLoginButton();
		plcordwhlchkot.enterYourName("Pariniti");
		plcordwhlchkot.enterYourEmail("pari@gmail.com");
		plcordwhlchkot.submitSignUpBtn();
		plcordwhlchkot.verifyEnterAcctInformation();
		plcordwhlchkot.selectGenderTtl();
		plcordwhlchkot.enterYourPassword("passwd");
		plcordwhlchkot.selectDayMonYr();
		plcordwhlchkot.selectCheckbx();
		plcordwhlchkot.enterFstName("Pariniti");
		plcordwhlchkot.enterLstName("S");
		plcordwhlchkot.enterYourCompany("ExcelR");
		plcordwhlchkot.enterYourAddress1("Classic Layout");
		plcordwhlchkot.enterYourAddress2("Akshayanagar");
		plcordwhlchkot.selectYourCountry();
		plcordwhlchkot.enterYourState("Karnataka");
		plcordwhlchkot.enterYourCity("Mysore");
		plcordwhlchkot.enterYourZipCode("230045");
		plcordwhlchkot.enterYourMobileNumber("9876543218");
		plcordwhlchkot.clickCreateAcctVerify();
		plcordwhlchkot.clickContinueBtn();
		plcordwhlchkot.verifyUserName();
		plcordwhlchkot.clickCartButton();
		plcordwhlchkot.proceedToCheckout();
		plcordwhlchkot.verifyAddressReviewDetails();
		plcordwhlchkot.enterDescriptionPlaceOrder("Nice Products");
		plcordwhlchkot.enterCardName("Pariniti s");
		plcordwhlchkot.enterCardNumber("2304 9876 4567 4532");
		plcordwhlchkot.enterCVC("413");
		plcordwhlchkot.enterCardExpiryMonth("03");
		plcordwhlchkot.enterCardExpiryYear("2026");
		plcordwhlchkot.clickPayAndConfirm();
		plcordwhlchkot.verifySuccessMessage();
		plcordwhlchkot.deleteAccount();
	}
	@Test(priority=15)
	public void verifyPlaceOrder2TC15() 
	{
		//Test Case15
		PlaceOrderRegBefChkOut plcordbefchkot =new PlaceOrderRegBefChkOut(driver);
				
		plcordbefchkot.clickSignUpButton();
		plcordbefchkot.enterYourName("Praveena");
		plcordbefchkot.enterYourEmail("veena@gmail.com");
		plcordbefchkot.submitSignUpBtn();
		plcordbefchkot.selectGenderTtl();
		plcordbefchkot.enterYourPassword("passwd");
		plcordbefchkot.selectDayMonYr();
		plcordbefchkot.selectCheckbx();
		plcordbefchkot.enterFstName("Praveena");
		plcordbefchkot.enterLstName("S");
		plcordbefchkot.enterYourCompany("ExcelR");
		plcordbefchkot.enterYourAddress1("Classic Layout");
		plcordbefchkot.enterYourAddress2("Akshayanagar");
		plcordbefchkot.selectYourCountry();
		plcordbefchkot.enterYourState("Karnataka");
		plcordbefchkot.enterYourCity("Mysore");
		plcordbefchkot.enterYourZipCode("230045");
		plcordbefchkot.enterYourMobileNumber("9876543218");
		plcordbefchkot.clickCreateAcctVerify();
		plcordbefchkot.verifyUserName();
		plcordbefchkot.addProducts();
		plcordbefchkot.clickCartButton();
		plcordbefchkot.verifyCartPage();
		plcordbefchkot.proceedToCheckout();
		plcordbefchkot.verifyAddressReviewDetails();
		plcordbefchkot.enterDescriptionPlaceOrder("Nice Products");
		plcordbefchkot.enterCardName("Praveena s");
		plcordbefchkot.enterCardNumber("2304 9876 4567 4532");
		plcordbefchkot.enterCVC("413");
		plcordbefchkot.enterCardExpiryMonth("03");
		plcordbefchkot.enterCardExpiryYear("2026");
		plcordbefchkot.clickPayAndConfirm();
		plcordbefchkot.verifySuccessMessage();
		plcordbefchkot.deleteAccount();
	}
	@Test(priority=16)
	public void verifyPlaceOrder3TC16() 
	{	
		//Test Case16
		PlaceOrderLoginBefChkOut plcordloginbefchkot=new PlaceOrderLoginBefChkOut(driver);		 
		 
		plcordloginbefchkot.clickSignUpButton();
		plcordloginbefchkot.enterEmail2("sharanya@gmail.com");
		plcordloginbefchkot.enterPassword("passwd");
		plcordloginbefchkot.clickLoginButton();
		plcordloginbefchkot.verifyLogin();
		plcordloginbefchkot.addProducts();
		plcordloginbefchkot.clickCartButton();
		plcordloginbefchkot.verifyCartPage();
		plcordloginbefchkot.proceedToCheckout();
		plcordloginbefchkot.verifyAddressReviewDetails();
		plcordloginbefchkot.enterDescriptionPlaceOrder("Nice Products");
		plcordloginbefchkot.enterCardName("Sharanya Lal");
		plcordloginbefchkot.enterCardNumber("4532 9876 2304 4567");
		plcordloginbefchkot.enterCVC("296");
		plcordloginbefchkot.enterCardExpiryMonth("05");
		plcordloginbefchkot.enterCardExpiryYear("2028");
		plcordloginbefchkot.clickPayAndConfirm();
		plcordloginbefchkot.verifySuccessMessage();
		plcordloginbefchkot.deleteAccount();
	}
	@Test(priority=17)
	public void verifyRemoveProductsTC17() 
	{
		//Test Case17
		RemoveProdsFromCart rmvprdcrt=new RemoveProdsFromCart(driver);	
		
		rmvprdcrt.addProducts();
		rmvprdcrt.clickCartButton();
		rmvprdcrt.verifyCartPage();
		rmvprdcrt.clickXButton();
		rmvprdcrt.verifyRemovedProduct();
	}
	@Test(priority=18)
	public void verifyCategoryTC18() 
	{
		//Test Case18
		ViewCategory vwctgry =new ViewCategory(driver);	
		
		vwctgry.verifyCategoryOnLeftSdBar();
		vwctgry.clickWomen();
		vwctgry.clickDress();
		vwctgry.verifyHeadingDress();
		vwctgry.clickMen();
		vwctgry.clickJeans();
		vwctgry.verifyHeadingJeans();
	}
	@Test(priority=19)
	public void verifyBrandTC19() 
	{
		//Test Case19
		ViewBrand vwbrnd=new ViewBrand(driver);	
	
		vwbrnd.clickProducts();
		vwbrnd.verifyBrandOnLeft();
		vwbrnd.clickBrandName();
		vwbrnd.verifyBrandProducts();
		vwbrnd.clickBrandName2();
		vwbrnd.verifyBrandProducts2();
	}
	@Test(priority=20)
	public void verifyCartAfterLoginTC20() 
	{	
		//Test Case20
		SearchProdsVerfyCartAfterLogin srchprodvrfyaftlogin=new SearchProdsVerfyCartAfterLogin(driver);	
		
		srchprodvrfyaftlogin.clickProducts();
		srchprodvrfyaftlogin.enterItemInSearchbox("dress");
		srchprodvrfyaftlogin.clickSearchButton();
		srchprodvrfyaftlogin.verifySearchedProducts();
		srchprodvrfyaftlogin.verifySearchedProductsList();
		srchprodvrfyaftlogin.clickAddToCart();
		srchprodvrfyaftlogin.clickCartButton();
		srchprodvrfyaftlogin.clickSignUpButton();
		srchprodvrfyaftlogin.enterEmail2("vaishali@yahoo.com");
		srchprodvrfyaftlogin.enterPassword("passwd");
		srchprodvrfyaftlogin.clickLoginButton();
		srchprodvrfyaftlogin.clickCartButton();
	}
	@Test(priority=21)
	public void verifyAddReviewTC21() 
	{
		//Test Case21
		AddReview adrev=new AddReview(driver);		 		
		
		adrev.clickProducts();
		adrev.viewProduct();
		adrev.enterName("Shalini");
		adrev.enterEmail("shalini@gmail.com");
		adrev.enterReview("Product is good");
		adrev.clickSubmit();
		adrev.successMessage();
	}
	@Test(priority=22)
	public void verifyAddRecommendedItemsTC22() 
	{
		//Test Case22
		AddToCartRecommended adcrtrecom=new AddToCartRecommended(driver);	
	
		adcrtrecom.scrollDown();
		adcrtrecom.verifyRecommendedItemsVisible();
		adcrtrecom.clickAddToCart();
		adcrtrecom.clickViewCart();
		adcrtrecom.verifyProductDispInCart();
	}	
	@Test(priority=23)
	public void verifyAddressDetailsTC23() 
	{
		//Test Case23
		VerifyAddrDetInChkOut vrfyaddrinchkot=new VerifyAddrDetInChkOut(driver);	
		
		vrfyaddrinchkot.clickSignUpButton();
		vrfyaddrinchkot.enterYourName("Bhakti");
		vrfyaddrinchkot.enterYourEmail("bhakti@gmail.com");
		vrfyaddrinchkot.submitSignUpBtn();
		vrfyaddrinchkot.verifyEnterAcctInformation();

		vrfyaddrinchkot.selectGenderTtl();
		vrfyaddrinchkot.enterYourPassword("passwd");
		vrfyaddrinchkot.selectDayMonYr();
		vrfyaddrinchkot.selectCheckbx1();
		vrfyaddrinchkot.selectCheckbx2();
		vrfyaddrinchkot.enterFstName("Bhakti");
		vrfyaddrinchkot.enterLstName("T");
		vrfyaddrinchkot.enterYourAddress1("Akshayanagar");
		vrfyaddrinchkot.enterYourAddress2("Classic Layout");
		vrfyaddrinchkot.enterYourCompany("ExcelR");
		vrfyaddrinchkot.selectYourCountry();
		vrfyaddrinchkot.enterYourState("Karnataka");
		vrfyaddrinchkot.enterYourCity("Bangalore");
		vrfyaddrinchkot.enterYourZipCode("230098");
		vrfyaddrinchkot.enterYourMobileNumber("987654322");
		
		vrfyaddrinchkot.clickCreateAcctVerify();
		vrfyaddrinchkot.clickContinueBtn();
		vrfyaddrinchkot.verifyUserName();
		vrfyaddrinchkot.addProducts();
		vrfyaddrinchkot.clickCartButton();
		vrfyaddrinchkot.verifyCartPage();
		vrfyaddrinchkot.proceedToCheckout();
		vrfyaddrinchkot.verifyDeliveryAddress();
		vrfyaddrinchkot.verifyBillingAddress();
		vrfyaddrinchkot.deleteAccount();
	}
	@Test(priority=24)
	public void verifyDownloadInvoiceTC24() 
	{
		//Test Case24
		DownldInvAftPurchsOrder dnldinvprchord=new DownldInvAftPurchsOrder(driver);
		
		dnldinvprchord.addProducts();
		dnldinvprchord.clickCartButton();
		dnldinvprchord.verifyCartPage();
		dnldinvprchord.proceedToCheckout();
		dnldinvprchord.clickRegisterLoginButton();
		dnldinvprchord.enterYourName("Ahilya");
		dnldinvprchord.enterYourEmail("ahilya@gmail.com");
		dnldinvprchord.submitSignUpBtn();
		dnldinvprchord.verifyEnterAcctInformation();
		dnldinvprchord.selectGenderTtl();
		dnldinvprchord.enterYourPassword("passwd");
		dnldinvprchord.selectDayMonYr();
		dnldinvprchord.selectCheckbx();
		dnldinvprchord.enterFstName("Ahilya");
		dnldinvprchord.enterLstName("S");
		dnldinvprchord.enterYourCompany("ExcelR");
		dnldinvprchord.enterYourAddress1("Classic Layout");
		dnldinvprchord.enterYourAddress2("Akshayanagar");
		dnldinvprchord.selectYourCountry();
		dnldinvprchord.enterYourState("Karnataka");
		dnldinvprchord.enterYourCity("Mysore");
		dnldinvprchord.enterYourZipCode("230045");
		dnldinvprchord.enterYourMobileNumber("9876543218");
		dnldinvprchord.clickCreateAcctVerify();
		dnldinvprchord.clickContinueBtn();
		dnldinvprchord.verifyUserName();
		dnldinvprchord.clickCartButton();
		dnldinvprchord.proceedToCheckout();
		dnldinvprchord.verifyAddressReviewDetails();
		dnldinvprchord.enterDescriptionPlaceOrder("Nice Products");
		dnldinvprchord.enterCardName("Ahilya K");
		dnldinvprchord.enterCardNumber("2304 9876 4567 4532");
		dnldinvprchord.enterCVC("769");
		dnldinvprchord.enterCardExpiryMonth("08");
		dnldinvprchord.enterCardExpiryYear("2025");
		dnldinvprchord.clickPayAndConfirm();
		dnldinvprchord.verifySuccessMessage();
		dnldinvprchord.clickDownloadInvoiceButton();
		dnldinvprchord.clickContinueButton();
		dnldinvprchord.deleteAccount();
	}
	@Test(priority=25)
	public void verifyScrollUpUsingArrowTC25() 
	{
		//Test Case25
		VerifyScrollUpDownWithArrow vscrlwitharr=new VerifyScrollUpDownWithArrow(driver);
		
		vscrlwitharr.scrollDown();
		vscrlwitharr.verifyTextSubs();
		vscrlwitharr.scrollUp();
		vscrlwitharr.verifyFullText();
	}
	@Test(priority=26)
	public void verifyScrollUpWithoutArrowTC26() 
	{
		//Test Case26
		VerifyScrollUpDownWithoutArrow vscrlwoutarr =new VerifyScrollUpDownWithoutArrow(driver);
		
		vscrlwoutarr.scrollDown();
		vscrlwoutarr.verifyTextSubs();
		vscrlwoutarr.scrollUp();
		vscrlwoutarr.verifyFullText();
	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Inside close");
		//driver.close();
	}
	@AfterSuite
	public void exitBrowser()
	{
		System.out.println("Inside exit");
		driver.quit();
	}
	
}

