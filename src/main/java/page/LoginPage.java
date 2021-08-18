package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements

	// IN any cases we can not use WebElement or By class to store data as it is not
	// appropriate in Pagelayout
	// WebElement USER_NAME_ELEMENT =
	// driver.findElement(By.xpath("//*[@id=\"username\"]"));
	// By USER_NAME_LCATOR = By.xpath("//*[@id=\"username\"]");

	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
	WebElement USER_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button")
	WebElement SUBMIT_BUTTON;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]")
	WebElement DASHBOARD_TITLE_ELEMENT;
	

	// Interactive method
	public void enterUserName(String userName) {
		USER_NAME_ELEMENT.sendKeys(userName);
	}

	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public void submit() {
		SUBMIT_BUTTON.click();
	}

	public void login(String userName, String password) {
		USER_NAME_ELEMENT.sendKeys(userName);
		PASSWORD_ELEMENT.sendKeys(password);
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	
	public void takeScreenshotAtEndofTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver; // TakesScreenshot is an interface so we cannot create an object
														// of interface
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourceFile,
				new File(currentDirectory + "/screenshot/" + System.currentTimeMillis() + ".png"));
	}

}
