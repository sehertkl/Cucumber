package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TestotomasyonFormPage {

    public TestotomasyonFormPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//select[@class='form-control'])[1]")
    public WebElement gunDropdownMenu;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement ayDropdownMenu;

    @FindBy(xpath = "(//select[@class='form-control'])[3]")
    public WebElement yilDropdownMenu;

    @FindBy(xpath = "//*[@id='gridCheck5']")
    public WebElement sirtAgrisiCheckBox;


    @FindBy(xpath = "//*[@id='gridCheck4']")
    public WebElement carpintiCheckBox;

    @FindBy(xpath = "//*[@id='hastalikCheck2']")
    public WebElement sekerChechkBox;

    @FindBy(xpath = "//*[@id='hastalikCheck7']")
    public WebElement epilepsiChechkBox;




}