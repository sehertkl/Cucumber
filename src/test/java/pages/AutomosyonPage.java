package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomosyonPage {

    public AutomosyonPage() {PageFactory.initElements(Driver.getDriver() , this);}

    @FindBy(xpath = "//*[@class='fa fa-lock']")
    public WebElement signupButon;

    @FindBy(xpath = "//*[@data-qa='signup-name']")
    public WebElement namebutonu;

    @FindBy(xpath = "//*[@data-qa='signup-email']")
    public WebElement emailbutonu;

    @FindBy (xpath = "//*[@data-qa='signup-button']")
    public WebElement signup2buton;

    @FindBy (id = "id_gender2")
    public WebElement cinsiyet;

}
