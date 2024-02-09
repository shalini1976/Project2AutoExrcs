package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class VerifyProdQtyInCrt extends CallingAutoExercise {
	WebDriver driver;

	public VerifyProdQtyInCrt(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[1]/child::a") WebElement home;
	@FindBy(xpath="//div[@id='cartModal']/following-sibling::div[3]/child::div/child::div[@class='choose']/child::ul/child::li/child::a/child::i") WebElement vwprdincrt;
	@FindBy(xpath="//input[@id='quantity']") WebElement qty;
	@FindBy(xpath="//button[@class='btn btn-default cart']") WebElement addtocartbtn;
	@FindBy(xpath="//div[@class='modal-body']/child::p[2]/child::a") WebElement viewcrtbtn;
	@FindBy(xpath="//tr[@id='product-3']/descendant::button") WebElement qtyincrt;

	String num="4";

	public void clickViewCart()
	{
		home.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		vwprdincrt.click();
		System.out.println("View Cart is clicked: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyDetailsPage()
	{
		String actualURL="https://automationexercise.com/product_details/3";
		String currentURL=driver.getCurrentUrl();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertEquals(actualURL, currentURL);
		System.out.println("Product detail is opened: Verified");
	}
	public void increaseQuantity()
	{
		qty.clear();
		qty.sendKeys(num);
		System.out.println("Quantity increased");
	}
	public void clickAddToCartButton()
	{
		addtocartbtn.click();
		System.out.println("Add to Cart Button clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickViewCartButton()
	{
		viewcrtbtn.click();
		System.out.println("View Cart button is clicked");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyQuantity()
	{
		String actualQty=qtyincrt.getText();
		String expectedQty=num;
		Assert.assertEquals(actualQty, expectedQty);
		System.out.println("Product is displayed in cart page with exact quantity: Verified");

		System.out.println("TEST CASE13 COMPLETED SUCCESSFULLY\n");
	}


}
