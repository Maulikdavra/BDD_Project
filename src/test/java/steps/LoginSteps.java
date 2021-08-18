package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BankCashPage;
import page.BasePage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginSteps extends BasePage {

	WebDriver driver;
	LoginPage loginpage;
	BankCashPage bankcashpage;

	@Before
	public void beforeTest() {

		driver = BrowserFactory.init();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		bankcashpage = PageFactory.initElements(driver, BankCashPage.class);
	}

	@Given("^User is on the Techfios login page$")
	public void User_is_on_the_Techfios_login_page() {
		driver.get("https://www.techfios.com/billing/?ng=admin/");
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String userName) throws Throwable {
		loginpage.enterUserName(userName);
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) throws Throwable {
		loginpage.login(userName, password);
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginpage.enterPassword(password);
	}

	@When("^User clicks on sigin button$")
	public void user_clicks_on_sigin_button() throws Throwable {
		loginpage.submit();
	}

	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page() throws Throwable {
		String ExpectedTitle = "Dashboard- iBilling";
		String ActualTitle = loginpage.getPageTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		// loginpage.takeScreenshotAtEndofTest(driver);
	}

	@When("^User should able to click on Bank and Cash option on dashboard$")
	public void User_should_able_to_click_on_Bank_and_Cash_option_on_dashboard() throws Throwable {
		bankcashpage.BankCashElement();
	}

	@When("^User should able to click on New Account element under Bank and Cash element$")
	public void User_should_able_to_click_on_New_Account_element_under_Bank_and_Cash_element() throws Throwable {
		bankcashpage.NewAccountElementOnBankCashElement();
	}

	@When("^User should be able to enter data in Account Title field \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Account_Title_field(String AccountTitle) throws Throwable {
		bankcashpage.AccountTitleElementOnBankCashElement(AccountTitle);
	}

	@When("^User should be able to enter data in Description feild \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Description_feild(String Description) throws Throwable {
		bankcashpage.DescriptionElementOnBankCashElement(Description);
	}

	@When("^User should be able to enter data in Intial Balance field \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Intial_Balance_field(String IntialBalance) throws Throwable {
		bankcashpage.InitialBalanceElementOnBankCashElement(IntialBalance);
	}

	@When("^User should be able to enter data in Account Number field \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Account_Number_field(String AccountNumber) throws Throwable {
		bankcashpage.AccountNumberElementOnBankCashElement(AccountNumber);
	}
	
	@When("^User should be able to enter data in Contact Person field \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Contact_Person_field(String ConactPerson) throws Throwable {
		bankcashpage.ContactPersonElementOnBankCashElement(ConactPerson);
	}
	
	@When("^User should be able to enter data in Contact Phone field \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Contact_Phone_field(String ContactPhone) throws Throwable {
		bankcashpage.ContactPhoneElementOnBankCashElement(ContactPhone);
	}
	
	@When("^User should be able to enter data in Banking Url field \"([^\"]*)\"$")
	public void user_should_be_able_to_enter_data_in_Banking_Url_field(String BankingUrl) throws Throwable {
		bankcashpage.BankingUrlOnBankCashElement(BankingUrl);
		Thread.sleep(5000);
	}
	
	@Then("^User should be able to click on Submit button$")
	public void user_should_be_able_to_click_on_Submit_button() throws Throwable {
		bankcashpage.SubmitButtonOnBankCashElement();
		Thread.sleep(3000);
	}
		
	@After
	public void tearDown() {
		driver.close();
		driver.quit();

	}

}
