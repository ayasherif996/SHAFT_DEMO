package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class SecondSignUpPage {
    private SHAFT.GUI.WebDriver driver;

    public SecondSignUpPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }


    //Locators

    By gender = By.xpath("//input[@id='id_gender2']");
    By password = By.xpath("//input[@data-qa='password']");
    By select_Day= By.id("days");
    By select_Month = By.id("months");
    By select_year = By.id("years");
    By check1= By.xpath("//input[@name='newsletter']");
    By check2 = By.id("optin");
    By FirstName = By.id("first_name");
    By LastName = By.id("last_name");
    By Address = By.id("address1");
    By country = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By Zipcode = By.id("zipcode");
    By phnoneNumber =By.id("mobile_number");
    By createAccountButton = By.xpath("//button[@data-qa='create-account']");

    //////Actions \\\\\\\\\\\
    public SecondSignUpPage EnterAccountInformation(String pass,int days,String Months,String years){
        driver.element().click(gender);
        driver.element().type(password,pass);
        driver.element().select(select_Day, String.valueOf(days));
        driver.element().select(select_Month,Months);
        driver.element().select(select_year,years);
        driver.element().click(check1);
        driver.element().click(check2);
        return new SecondSignUpPage(driver);
    }



    public AccountCreatedPage EnterAddressInformation(String firstName1, String lastName1, String Address1, String country1,
                                                      String state1, String city1, String Zipcode1, String phoneNumber1){
        driver.element().type(FirstName,firstName1);
        driver.element().type(LastName,lastName1);
        driver.element().type(Address,Address1);
        driver.element().select(country,country1);
        driver.element().type(state,state1);
        driver.element().type(city,city1);
        driver.element().type(Zipcode,Zipcode1);
        driver.element().type(phnoneNumber,phoneNumber1);
        driver.element().click(createAccountButton);
        return new AccountCreatedPage(driver);
    }


    public SecondSignUpPage AssertOnUrlOnSignUpPage(String URL){
        String  ActualURL = driver.browser().getCurrentURL();
        driver.browser().assertThat().url().isEqualTo(URL).perform();
        return new SecondSignUpPage(driver);
        //Assert.assertEquals(ActualURL,URL);
    }
}
