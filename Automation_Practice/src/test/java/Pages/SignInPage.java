package Pages;

import TestBase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends TestBase {
    WebDriver driver;

    @FindBy(linkText = "Sign in")
    WebElement signInBtn;
    @FindBy(id = "email_create")
    WebElement createAccountEmail;
    @FindBy(id = "SubmitCreate")
    WebElement submitBtn;
    @FindBy(id = "id_gender1")
    WebElement selectGender;
    @FindBy(id = "customer_firstname")
    WebElement customerFirstName;
    @FindBy(id = "customer_lastname")
    WebElement customerLastName;
    @FindBy(id = "passwd")
    WebElement pwd;
    @FindBy(id = "days")
    WebElement days;
    @FindBy(id = "months")
    WebElement months;
    @FindBy(id = "years")
    WebElement years;
    @FindBy(id = "firstname")
    WebElement firstName;
    @FindBy(id = "lastname")
    WebElement lastName;
    @FindBy(id = "company")
    WebElement comapanyName;
    @FindBy(id = "address1")
    WebElement address;
    @FindBy(id ="city")
    WebElement city;
    @FindBy(id = "id_state")
    WebElement state;
    @FindBy(id = "postcode")
    WebElement postCode;
    @FindBy(id = "id_country")
    WebElement country;
    @FindBy(id = "phone_mobile")
    WebElement mobileNumber;
    @FindBy(id = "submitAccount")
    WebElement submitAccount;


    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void signinPage()
    {
        signInBtn.click();
        createAccountEmail.sendKeys(prop.getProperty("email"));
        submitBtn.click();
        selectGender.click();
        customerFirstName.sendKeys(prop.getProperty("username"));
        customerLastName.sendKeys(prop.getProperty("lastname"));
        pwd.sendKeys(prop.getProperty("password"));
        days.sendKeys("19");
        months.sendKeys("12");
        years.sendKeys("1999");
        firstName.sendKeys(prop.getProperty("username"));
        lastName.sendKeys(prop.getProperty("lastname"));
        comapanyName.sendKeys(prop.getProperty("companyName"));
        address.sendKeys(prop.getProperty("companyAddress"));
        city.sendKeys(prop.getProperty("city"));
        state.sendKeys(prop.getProperty("state"));
        postCode.sendKeys(prop.getProperty("postcode"));
        country.sendKeys(prop.getProperty("country"));
        mobileNumber.sendKeys(prop.getProperty("mob"));
        submitAccount.click();

    }
}
