package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class RemoveProdsFromCart extends CallingAutoExercise {
	WebDriver driver;

	public RemoveProdsFromCart(WebDriver ldriver)
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
	@FindBy(xpath="//td[@class='cart_delete']/child::a/child::i[1]") WebElement clckcross;
	@FindBy(xpath="//tbody/child::tr[1]") WebElement cartprods1;


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
		System.out.println(vrfycrtpg.getText()+" is visible: - Verified");
	}
	public void clickXButton()
	{
		clckcross.click();
		System.out.println("X Button clicked for product1: Verified");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void verifyRemovedProduct()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Assert.assertTrue(!cartprods1.isDisplayed());
		System.out.println("Product1 removed from Cart: Verified");

		System.out.println("TEST CASE17 COMPLETED SUCCESSFULLY\n");
	}

}
