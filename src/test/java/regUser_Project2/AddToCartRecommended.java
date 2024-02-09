package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
		String actualText=recomhead.getText();
		String expectedText ="RECOMMENDED ITEMS";
		Assert.assertEquals(actualText, expectedText);
		System.out.println(recomhead.getText()+" are visible: Verified");
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
		Assert.assertTrue(crtdetail.isDisplayed());
		System.out.println(crtdetail.getText()+" is displayed un cart: - Verified");
		System.out.println("TEST CASE22 COMPLETED SUCCESSFULLY\n");
	}
}
