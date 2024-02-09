package regUser_Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import callingAutomationExercise.CallingAutoExercise;

public class TestCasesPage extends CallingAutoExercise {
	WebDriver driver;

	public TestCasesPage(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//button[text()='Test Cases']") WebElement testcases;
	@FindBy(xpath="//h2[@class='title text-center']") WebElement verifytestcs;
	@FindBy(xpath="//section[@id='form']/child::div") WebElement testcslist;

	public void clickTestCasesButton()
	{
	testcases.click();
	System.out.println("Clicked on Test cases");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void verifyTestCasesPage()
	{
		System.out.println(testcslist.getText());

		String actualURL=driver.getCurrentUrl();
		String expectedURL ="https://automationexercise.com/test_cases";
		Assert.assertEquals(actualURL, expectedURL);
		System.out.println("Landed to Test Case page successfully: - Verified");
		System.out.println("TEST CASE7 COMPLETED SUCCESSFULLY\n");
	}
}
