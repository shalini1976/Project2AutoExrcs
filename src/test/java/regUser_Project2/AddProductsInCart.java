package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class AddProductsInCart extends CallingAutoExercise {
	WebDriver driver;

	public AddProductsInCart(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//ul[@class='nav navbar-nav']/child::li[2]/child::a") WebElement products; //Products tab
	@FindBy(xpath="//div[@class='product-image-wrapper']/child::div/child::div") WebElement movemouse1;
	@FindBy(xpath="//div[@class='product-image-wrapper']/child::div/child::div/child::a") WebElement prod1addcrt;
	@FindBy(xpath="//button[@class='btn btn-success close-modal btn-block']") WebElement contshop;
	@FindBy(xpath="//div[@id='cartModal']/following-sibling::div[2]") WebElement movemouse2;
	@FindBy(xpath="//a[@data-product-id='2']") WebElement prod2addcrt;
	@FindBy(xpath="//div[@class='modal-body']/child::p/child::a/child::u") WebElement vwcrt;
	@FindBy(xpath="//tbody/child::tr[1]") WebElement cartprods1;
	@FindBy(xpath="//tbody/child::tr[2]") WebElement cartprods2;

	@FindBy(xpath="//tr[@id='product-1']/child::td/following-sibling::td/child::h4/child::a") WebElement desc1;
	@FindBy(xpath="//div[@class='single-products']/child::div/child::h2[1]") WebElement price1;
	@FindBy(xpath="//tr[@id='product-1']/child::td[@class='cart_price']/child::p") WebElement crtprice1;
	@FindBy(xpath="//tr[@id='product-1']/child::td[@class='cart_quantity']/child::button") WebElement qnty1;
	@FindBy(xpath="//tr[@id='product-1']/child::td[@class='cart_total']/child::p") WebElement totalprc1;

	@FindBy(xpath="//tr[@id='product-2']/child::td/following-sibling::td/child::h4/child::a") WebElement desc2;
	@FindBy(xpath="//div[@class='features_items']/child::h2/following-sibling::div[3]/child::div/child::div/child::div/child::h2") WebElement price2;
	@FindBy(xpath="//tr[@id='product-2']/child::td/following-sibling::td[2]/child::p") WebElement crtprice2;
	@FindBy(xpath="//tr[@id='product-2']/child::td[@class='cart_quantity']/child::button") WebElement qnty2;
	@FindBy(xpath="//tr[@id='product-2']/child::td[@class='cart_total']/child::p") WebElement totalprc2;

	String prc1,prc2;
	public void clickProducts()
	{
		products.click();
		System.out.println("Products Tab clicked: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void firstProduct()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", prod1addcrt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Actions action =new Actions(driver);
		action.moveToElement(movemouse1);
		action.perform();
		System.out.println("Mouse hover performed: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		prc1=price1.getText();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prod1addcrt.click();
		System.out.println("Add to Cart clicked for first product: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickContinueShoppingButton()
	{
		contshop.click();
		System.out.println("Continue Shopping button clicked: Verified");
	}
	public void secondProduct()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", prod2addcrt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Actions action =new Actions(driver);
		action.moveToElement(movemouse2);
		action.perform();
		System.out.println("Mouse hover performed: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
		prc2=price2.getText();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		prod2addcrt.click();
		System.out.println("Add to Cart clicked for second product: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void clickViewCart()
	{
		vwcrt.click();
		System.out.println("View Cart clicked: Verified");
	}
	public void verifyCartProducts()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(cartprods1.getText());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println(cartprods2.getText());

		Assert.assertTrue(cartprods1.isDisplayed() && cartprods2.isDisplayed());
		System.out.println(cartprods1.getText()+cartprods2.getText()+" are added to the cart: - Verified");
	}
	public void verifyPrcQtyTprc()
	{
		System.out.println(desc1.getText());
		//For Product1
		String actualPrice1=crtprice1.getText();
		String expectedPrc1=prc1;
		String qty1=qnty1.getText();
		String totprc1=totalprc1.getText();
		//Checking price
		Assert.assertEquals(actualPrice1, expectedPrc1);
		System.out.println("Cart price of product1 is same as product price: Verified");

		//checking total price
		Assert.assertEquals(actualPrice1, totprc1);
		Assert.assertEquals(qty1, "1");
		System.out.println("Total price of product1 is correct: Verified");
		System.out.println("Price, quantity and total price for product1: Verified");

		System.out.println(desc2.getText());
		//For Product2
		String actualPrice2=crtprice2.getText();
		String expectedPrc2=prc2;
		String qty2=qnty2.getText();
		String totprc2=totalprc2.getText();
		//Checking price
		Assert.assertEquals(actualPrice2, expectedPrc2);
		System.out.println("Cart price of product2 is same as product price: Verified");

		//checking total price
		Assert.assertEquals(actualPrice2, totprc2);
		Assert.assertEquals(qty2, "1");
		System.out.println("Total price of product2 is correct: Verified");
		System.out.println("Price, quantity and total price for product2: Verified");
		System.out.println("TEST CASE12 COMPLETED SUCCESSFULLY\n");
	}
}
