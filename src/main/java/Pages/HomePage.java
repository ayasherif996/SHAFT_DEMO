package Pages;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {

    private SHAFT.GUI.WebDriver driver;
    // SoftAssert sa;

    public HomePage(SHAFT.GUI.WebDriver driver){
        this.driver=driver;
        //  this.sa=sa;

    }
    //locators
    By title = By.xpath("(//h1)[1]");


    //////////Actions\\\\\\\\\
    public HomePage navigate(){
        driver.browser().navigateToURL("http://automationexercise.com");
        return this;
    }


    /////Assertions\\\\\\

    public HomePage AssertOnHomePage(String ExpectedTitle){
       // String ActualTitle =driver.element().getText(title);
        driver.element().assertThat(title).text().isEqualTo(ExpectedTitle).perform();
      //  Assert.assertEquals(ActualTitle,ExpectedTitle);
        return this;

    }
}
