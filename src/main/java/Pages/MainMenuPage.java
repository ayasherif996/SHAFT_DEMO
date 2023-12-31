package Pages;

import Pages.FirstSignUpPage;
import Pages.HomePage;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class MainMenuPage {

    private SHAFT.GUI.WebDriver driver;

    public MainMenuPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    ///Locators
    public By SignUp_Login= By.xpath("//i[@class='fa fa-lock']");

    By deleteAccountButton = By.xpath("//a[@href='/delete_account']");
    ////////Actions\\\\\\\\

    public FirstSignUpPage ClickOnSignUpButton(){

        driver.element().click(SignUp_Login);
        return new FirstSignUpPage(driver);
    }
    public HomePage ClickOnDeleteButton(){

        driver.element().click(deleteAccountButton);
        return new  HomePage(driver);
    }



}
