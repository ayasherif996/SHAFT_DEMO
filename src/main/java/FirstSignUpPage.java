import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FirstSignUpPage {

    private SHAFT.GUI.WebDriver driver;

    public FirstSignUpPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    //  private  SoftAssert sa;

    //locators

    By new_user_statment = By.xpath("//div[@class='signup-form']/h2");
    By name = By.xpath("//input[@placeholder='Name']");
    By email = By.xpath("(//input[@placeholder='Email Address'])[2]");
    By SignUpButton = By.xpath("(//button[@type='submit'])[2]");

    ///////Actions\\\\\\\\\\

    public SecondSignUpPage SignUpUser(String name1 , String email1){

        driver.element().type(name,name1);
        driver.element().type(email,email1);
        driver.element().click(SignUpButton);
        return new SecondSignUpPage(driver);
    }

    //////////Assertions\\\\\\\\\\\

    public  FirstSignUpPage AssertOnNewUserSignupStatment(String ExpectedNewUser){
     //   String ActualNewUserStatment = driver.element().getText(new_user_statment);
        driver.element().assertThat(new_user_statment).text().isEqualTo(ExpectedNewUser);
      //  Assert.assertEquals(ActualNewUserStatment,ExpectedNewUser);
        return new FirstSignUpPage(driver);
    }


}
