package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class SearchProdsVerfyCartAfterLogin extends CallingAutoExercise {
	WebDriver driver;

	public SearchProdsVerfyCartAfterLogin(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products; //Products tab
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement verifyprodpg;
	@FindBy(xpath="//input[@id='search_product']")WebElement srchprd; //search box
	@FindBy(xpath="//button[@id='submit_search']") WebElement sbmtsrchbtn;//search button
	@FindBy(xpath="//div[@class='features_items']/child::h2") WebElement srchprod;
	@FindBy(xpath="//div[@class='features_items']") WebElement srchprodlist;

	@FindBy(xpath="//a[@data-product-id='3']/child::i") WebElement prd3;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement continueshp;
	@FindBy(xpath="//a[@data-product-id='4']/child::i") WebElement prd4;
	@FindBy(xpath="//a[@data-product-id='16']/child::i") WebElement prd16;
	@FindBy(xpath="//a[@data-product-id='19']/child::i") WebElement prd19;
	@FindBy(xpath="//a[@data-product-id='20']/child::i") WebElement prd20;
	@FindBy(xpath="//a[@data-product-id='21']/child::i") WebElement prd21;
	@FindBy(xpath="//a[@data-product-id='22']/child::i") WebElement prd22;
	@FindBy(xpath="//a[@data-product-id='23']/child::i") WebElement prd23;
	@FindBy(xpath="//a[@data-product-id='38']/child::i") WebElement prd38;
	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[3]/child::a") WebElement cart; //Cart tab
	@FindBy(xpath="//tbody") WebElement cartprods;

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[4]/child::a/child::i") WebElement signup; //signup tab
	@FindBy(xpath="//form[@action='/login']/child::input[@name='email']") WebElement email2;
	@FindBy(xpath="//form[@action='/login']/child::input[@name='password']") WebElement pass2;
	@FindBy(xpath="//button[text()='Login']") WebElement clklogin;


	public void clickProducts()
	{
		products.click();
		System.out.println("Products Tab clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(verifyprodpg.isDisplayed())
		{
			System.out.println("User is navigated to ALL PRODUCTS page successfully: - Verified");
		}
		else
		{
			System.out.println("ALL PRODUCTS page is not visible: Failed");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void enterItemInSearchbox(String srch)
	{
		srchprd.sendKeys(srch);
	}
	public void clickSearchButton()
	{
		sbmtsrchbtn.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifySearchedProducts()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		if(srchprod.isDisplayed())
		{
			System.out.println("'SEARCHED PRODUCTS' is visible: Verified");
		}
		else
		{
			System.out.println("'SEARCHED PRODUCTS' is not visible: Failed");
		}
	}
	public void verifySearchedProductsList()
	{

		System.out.println(srchprodlist.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		if(srchprodlist.isDisplayed())
		{
			System.out.println("All the products related to search are visible: Verified");
		}
		else
		{
			System.out.println("All the products related to search are not visible: Failed");
		}
	}
	public void clickAddToCart()
	{
		prd3.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prd4.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prd16.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prd19.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prd20.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prd21.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prd22.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		prd23.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		continueshp.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		prd38.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		continueshp.click();
		System.out.println("Searched products are added to cart");

	}
	public void clickCartButton()
	{
		cart.click();
		System.out.println(cartprods.getText());
		System.out.println("All the searched products are visible in cart");

	}
	public void clickSignUpButton()
	{
		signup.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
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
		System.out.println("Login button clicked");
		System.out.println("TEST CASE20 COMPLETED SUCCESSFULLY\n");
	}
//Click Cart button and verify same products are listed in cart


}
