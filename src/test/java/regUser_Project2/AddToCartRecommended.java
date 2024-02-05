package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import callingAutomationExercise.CallingAutoExercise;

public class AddToCartRecommended extends CallingAutoExercise {
	WebDriver driver;

	public AddToCartRecommended(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[@class='recommended_items']") WebElement recomitm;
	@FindBy(xpath="//div[@class='recommended_items']/child::h2") WebElement recomhead;
	@FindBy(xpath="//div[@class='recommended_items']/descendant::a[@data-product-id='4']") WebElement addtocrt;
	@FindBy(xpath="//div[@class='modal-body']/descendant::a") WebElement vwcrt;
	@FindBy(xpath="//tr[@id='product-4']") WebElement crtdetail;

	public void scrollDown()
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", recomitm);
	}
	public void verifyRecommendedItemsVisible()
	{
		System.out.println(recomhead.getText());
		if(recomhead.isDisplayed())
		{
			System.out.println("RECOMMENDED ITEMS are visible: Verified");
		}
		else
		{
			System.out.println("RECOMMENDED ITEMS are not visible: Failed");
		}
	}
	public void clickAddToCart()
	{
		addtocrt.click();
		System.out.println("Add to Cart clicked for recommended product: Verified");
	}
	public void clickViewCart()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		vwcrt.click();
		System.out.println("View Cart clicked for recommended product: Verified");
	}
	public void verifyProductDispInCart()
	{
		System.out.println(crtdetail.getText());
		if(crtdetail.isDisplayed())
		{
			System.out.println("Product is displayed in cart: Verified");
		}
		else
		{
			System.out.println("Product is not displayed in cart: Failed");
		}
		System.out.println("TEST CASE22 COMPLETED SUCCESSFULLY\n");
	}
}
