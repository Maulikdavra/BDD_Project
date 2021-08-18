package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCashPage extends BasePage {

	WebDriver driver;

	public BankCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]")
	WebElement BankCash_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccount_Element;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_TITLE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement CONTACT_PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement BANKING_URL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button")
	WebElement SUBMIT_BUTTON;

	public void BankCashElement() {
		BankCash_ELEMENT.click();
	}

	public void NewAccountElementOnBankCashElement() {
		NewAccount_Element.click();
	}

	public void AccountTitleElementOnBankCashElement(String AccountTitle) {
		ACCOUNT_TITLE_ELEMENT.sendKeys(AccountTitle + randomGenretaor(999));
	}

	public void DescriptionElementOnBankCashElement(String Description) {
		DESCRIPTION_ELEMENT.sendKeys(Description + randomGenretaor(999));
	}

	public void InitialBalanceElementOnBankCashElement(String IntialBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(IntialBalance + randomGenretaor(999));
	}

	public void AccountNumberElementOnBankCashElement(String AccountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(AccountNumber + randomGenretaor(999));
	}

	public void ContactPersonElementOnBankCashElement(String ContactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(ContactPerson + randomGenretaor(999));
	}

	public void ContactPhoneElementOnBankCashElement(String ContactPhone) {
		CONTACT_PHONE_ELEMENT.sendKeys(ContactPhone + randomGenretaor(999));
	}

	public void BankingUrlOnBankCashElement(String BankingUrl) {
		BANKING_URL.sendKeys(BankingUrl);
	}
	
	public void SubmitButtonOnBankCashElement() {
		SUBMIT_BUTTON.click();
	}

}
