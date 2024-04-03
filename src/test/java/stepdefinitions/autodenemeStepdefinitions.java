package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomosyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class autodenemeStepdefinitions {

    AutomosyonPage automosyonPage=new AutomosyonPage();

    @Given("user {string} web sayfasinda")
    public void user_web_sayfasinda(String string) {Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));}

    @Given("user sign up linkine tiklar")
    public void user_sign_up_linkine_tiklar() {automosyonPage.signupButon.click();}

    @Given("new user sign up bölümüne isim girer")
    public void new_user_sign_up_bölümüne_isim_girer() {automosyonPage.namebutonu.sendKeys("seher");}

    @Given("new user sign up bölümüne email girer")
    public void new_user_sign_up_bölümüne_email_girer() {automosyonPage.emailbutonu.sendKeys("deniz.toklu@gmail.com");}


    @And("signUp butonuna basar")
    public void sign_up_butonuna_basar() {automosyonPage.signup2buton.click();}


    @And("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions=new Actions(Driver.getDriver());
        ReusableMethods.bekle(2);
        automosyonPage.cinsiyet.click();
       actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("160912de").sendKeys(Keys.TAB).sendKeys(Keys.ENTER).sendKeys("3").sendKeys(Keys.TAB)
               .sendKeys("May").sendKeys(Keys.TAB).sendKeys("2020").sendKeys(Keys.TAB).click().sendKeys(Keys.TAB).
               click().perform();
    ReusableMethods.bekle(3);}





}
