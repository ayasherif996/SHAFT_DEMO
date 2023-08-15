import com.shaft.driver.SHAFT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegisterUser_pom {
   SHAFT.GUI.WebDriver  driver;

    //  SoftAssert sa;

    @BeforeMethod
    public void setup() {
        driver = new SHAFT.GUI.WebDriver();
       driver.browser().navigateToURL("https://automationexercise.com/");

    }

    @Test
    public void registerUer() {
        new HomePage(driver).AssertOnHomePage("AutomationExercise");
        new MainMenuPage(driver).ClickOnSignUpButton();
        new FirstSignUpPage(driver).AssertOnNewUserSignupStatment("New User Signup!");
        new FirstSignUpPage(driver).SignUpUser("Aya Sherif", "ayasherif@gmail.com");
        new SecondSignUpPage(driver).AssertOnUrlOnSignUpPage("https://automationexercise.com/signup");
        new SecondSignUpPage(driver).EnterAccountInformation("12345", 3, "March", "2001");
        new SecondSignUpPage(driver).EnterAddressInformation("Aya", "Sherif",
                "8 El7las street,cairo", "Canada",
                "Haram11", "cairo", "234521", "0107079982");
        new AccountCreatedPage(driver).AssertOnCreatedAccount("ACCOUNT CREATED!");
        new AccountCreatedPage(driver).ClickOnContinueButton();
        new  MainMenuPage(driver).ClickOnDeleteButton();
        new AccountDeletedPage(driver).AssertOnDeletionAnAccount("ACCOUNT DELETED!");


    }
}
