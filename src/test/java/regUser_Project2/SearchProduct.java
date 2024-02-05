package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class SearchProduct extends CallingAutoExercise {
	WebDriver driver;

	public SearchProduct(WebDriver ldriver)
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
	}
	public void enterItemInSearchbox(String srch)
	{
		srchprd.sendKeys(srch);
	}
	public void clickSearchButton()
	{
		sbmtsrchbtn.click();
	}
	public void verifySearchedProducts()
	{
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
		if(srchprodlist.isDisplayed())
		{
			System.out.println("All the products related to search are visible: Verified");
		}
		else
		{
			System.out.println("All the products related to search are not visible: Failed");
		}
		System.out.println("TEST CASE9 COMPLETED SUCCESSFULLY\n");
	}

}
