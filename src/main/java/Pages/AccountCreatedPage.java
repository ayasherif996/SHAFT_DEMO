package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class AccountCreatedPage {

    private SHAFT.GUI.WebDriver driver ;
    public AccountCreatedPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    //  private SoftAssert sa;

    //Locators
    By AccountCreated = By.xpath("//h2[@data-qa='account-created']");
    By continueButton = By.xpath("//div/a[@data-qa='continue-button']");
    By loggedInUserStatment = By.xpath("//ul/li/a/b");



    ////////Actions\\\\\\
    public HomePage ClickOnContinueButton(){

        driver.element().click(continueButton);
        return new HomePage(driver);
    }



    ////////////Assertions \\\\\\\\\\


    public AccountCreatedPage AssertOnCreatedAccount(String ExpectedAccountCreated){

        driver.element().assertThat(AccountCreated).text().isEqualTo(ExpectedAccountCreated).perform();
        return new AccountCreatedPage(driver);
    }
}
