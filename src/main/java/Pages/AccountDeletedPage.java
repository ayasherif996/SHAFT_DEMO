package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AccountDeletedPage {


    private SHAFT.GUI.WebDriver driver;
    // private SoftAssert sa;

    public AccountDeletedPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    // By deleteAccountButton = By.xpath("//a[@href='/delete_account']");
    By AccountDelected = By.cssSelector("h2>b");

    //    public void ClickOnDeleteButton(){
//
//        driver.findElement(deleteAccountButton).click();
//    }
    public HomePage AssertOnDeletionAnAccount(String ExpectedStatment) {
       driver.element().assertThat(AccountDelected).text().isEqualTo(ExpectedStatment);
        // sa.assertTrue(driver.findElement(continueButton).isDisplayed());
        return new HomePage(driver);
    }

}