package callingAutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
	public void LaunchBrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser Launched");
		driver.get("https://automationexercise.com");
		Thread.sleep(2000);
	}
	@Test
	public void VerifyAutomationExerciseWebPage() throws InterruptedException
	{
		//Verifying Home Page
		String actualTitle=driver.getTitle();
		String expectedTitle ="Automation Exercise";
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Home Page displayed successfully");

		//Automating Test Cases


		RegisterUser reg_user=new RegisterUser(driver);//TC1
		LoginValidUser login_vld_user=new LoginValidUser(driver);//TC2
		LoginInvalidUser login_invld_user=new LoginInvalidUser(driver);//TC3
		LogoutUser logout_user =new LogoutUser(driver);//TC4
		RegisterUserWithEmail reg_usr_wth_email =new RegisterUserWithEmail(driver);//TC5
		ContactUs cntus=new ContactUs(driver);//TC6
		TestCasesPage tstcspg =new TestCasesPage(driver);//TC7
		VerifyAllProductPage vprodpg=new VerifyAllProductPage(driver);//TC8
		SearchProduct srchprd =new SearchProduct(driver);//TC9
		VerifySubsHmPg vsubshmpg=new VerifySubsHmPg(driver);//TC10
		VerifySubsCrtPg vsubscrtpg =new VerifySubsCrtPg(driver);//TC11
		AddProductsInCart adprdcrt=new AddProductsInCart(driver);//TC12
		VerifyProdQtyInCrt vrfyprodqincrt=new VerifyProdQtyInCrt(driver);//TC13
		PlaceOrderRegWhlChkOut plcordwhlchkot=new PlaceOrderRegWhlChkOut(driver); //TC14
		PlaceOrderRegBefChkOut plcordbefchkot =new PlaceOrderRegBefChkOut(driver); //TC15
		PlaceOrderLoginBefChkOut plcordloginbefchkot=new PlaceOrderLoginBefChkOut(driver); //TC16
		RemoveProdsFromCart rmvprdcrt=new RemoveProdsFromCart(driver);//TC17
		ViewCategory vwctgry =new ViewCategory(driver);//TC18
		ViewBrand vwbrnd=new ViewBrand(driver);//TC19
		SearchProdsVerfyCartAfterLogin srchprodvrfyaftlogin=new SearchProdsVerfyCartAfterLogin(driver); //TC20
		AddReview adrev=new AddReview(driver);//TC21
		AddToCartRecommended adcrtrecom=new AddToCartRecommended(driver);//TC22
		VerifyAddrDetInChkOut vrfyaddrinchkot=new VerifyAddrDetInChkOut(driver);//TC23
		DownldInvAftPurchsOrder dnldinvprchord=new DownldInvAftPurchsOrder(driver);//TC24
		VerifyScrollUpDownWithArrow vscrlwitharr=new VerifyScrollUpDownWithArrow(driver);//TC25
		VerifyScrollUpDownWithoutArrow vscrlwoutarr =new VerifyScrollUpDownWithoutArrow(driver);//TC26
		
		
		//Test Case1
		reg_user.clickSignUpButton();
		reg_user.enterName("Mithilesh");
		reg_user.enterEmail("mithi@yahoo.com");
		reg_user.submitSignUp();
		reg_user.verifyEnterAccountInformation();

		reg_user.selectGenderTitle();
		reg_user.enterPassword("passwd");
		reg_user.selectDay();
		reg_user.selectMonth();
		reg_user.selectYear();
		reg_user.selectCheckbox1();
		reg_user.selectCheckbox2();
		reg_user.enterFName("Mithilesh");
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
	
		//Test Case2
		login_vld_user.clickSignUpButton();
		login_vld_user.enterEmail2("paavni@yahoo.com");
		login_vld_user.enterPassword("passwd");
		login_vld_user.clickLoginButton();
		login_vld_user.verifyLogin();
		login_vld_user.deleteLogin();
	
		
		//Test Case3
		
		login_invld_user.clickSignUpButton();
		login_invld_user.enterEmail3("xyz@gmail.com");
		login_invld_user.enterPassword("wordpass");
		login_invld_user.clickLoginButton();
		login_invld_user.verifyLoginError();
	
		//Test Case4
		logout_user.clickSignUpButton();
		logout_user.enterEmail2("michelle@gmail.com");
		logout_user.enterPassword("passwd");
		logout_user.clickLoginButton();
		logout_user.verifyLogin();
		logout_user.clickLogoutButton();
		logout_user.verifyLoginPage();
		
		
		//Test Case5
		reg_usr_wth_email.clickSignUpButton();
		reg_usr_wth_email.enterName("Michelle");
		reg_usr_wth_email.enterEmail("michelle@gmail.com");
		reg_usr_wth_email.submitSignUp();
		reg_usr_wth_email.verifySignUpError();
		
		
		//Test Case6
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

		//Test Case7
		tstcspg.clickTestCasesButton();
		tstcspg.verifyTestCasesPage();
	

		//Test Case8
		vprodpg.clickProducts();
		vprodpg.verifyList();
		vprodpg.viewProduct();
		
		
		//Test Case9
		srchprd.clickProducts();
		srchprd.enterItemInSearchbox("dress");
		srchprd.clickSearchButton();
		srchprd.verifySearchedProducts();
		srchprd.verifySearchedProductsList();
		
		
		//Test Case10
		vsubshmpg.verifyTextSubs();
		vsubshmpg.enterEmail("shalini@yahoo.com");
		vsubshmpg.clickArrow();
		
				
		//Test Case11
		vsubscrtpg.clickCartButton();
		vsubscrtpg.verifyTextSubs();
		vsubscrtpg.enterEmail("shikha@gmail.com");
		vsubscrtpg.clickArrow();
		vsubscrtpg.verifySuccessMessage();
		
		
		//Test Case12
		adprdcrt.clickProducts();
		adprdcrt.firstProduct();
		adprdcrt.clickContinueShoppingButton();
		adprdcrt.secondProduct();
		adprdcrt.clickViewCart();
		adprdcrt.verifyCartProducts();
		adprdcrt.verifyPrcQtyTprc();
		
		
		//Test Case13
		vrfyprodqincrt.clickViewCart();
		vrfyprodqincrt.verifyDetailsPage();
		vrfyprodqincrt.increaseQuantity();
		vrfyprodqincrt.clickAddToCartButton();
		vrfyprodqincrt.clickViewCartButton();
		vrfyprodqincrt.verifyQuantity();
		
		
		//Test Case14
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
		
		
		//Test Case15
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
		
		 
		 //Test Case16
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
	
		//Test Case17
		rmvprdcrt.addProducts();
		rmvprdcrt.clickCartButton();
		rmvprdcrt.verifyCartPage();
		rmvprdcrt.clickXButton();
		rmvprdcrt.verifyRemovedProduct();
		
		//Test Case18
		vwctgry.verifyCategoryOnLeftSdBar();
		vwctgry.clickWomen();
		vwctgry.clickDress();
		vwctgry.verifyHeadingDress();
		vwctgry.clickMen();
		vwctgry.clickJeans();
		vwctgry.verifyHeadingJeans();
				
		//Test Case19
		vwbrnd.clickProducts();
		vwbrnd.verifyBrandOnLeft();
		vwbrnd.clickBrandName();
		vwbrnd.verifyBrandProducts();
		vwbrnd.clickBrandName2();
		vwbrnd.verifyBrandProducts2();
		
		//Test Case20
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

		 		
		//Test Case21
		adrev.clickProducts();
		adrev.viewProduct();
		adrev.enterName("Shalini");
		adrev.enterEmail("shalini@gmail.com");
		adrev.enterReview("Product is good");
		adrev.clickSubmit();
		adrev.successMessage();
		
		//Test Case22
		adcrtrecom.scrollDown();
		adcrtrecom.verifyRecommendedItemsVisible();
		adcrtrecom.clickAddToCart();
		adcrtrecom.clickViewCart();
		adcrtrecom.verifyProductDispInCart();
		
		
		//Test Case23
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
		
		
		//Test Case24
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
		
		//Test Case25
		vscrlwitharr.scrollDown();
		vscrlwitharr.verifyTextSubs();
		vscrlwitharr.scrollUp();
		vscrlwitharr.verifyFullText();
		
		//Test Case26
		vscrlwoutarr.scrollDown();
		vscrlwoutarr.verifyTextSubs();
		vscrlwoutarr.scrollUp();
		vscrlwoutarr.verifyFullText();
	}
}

