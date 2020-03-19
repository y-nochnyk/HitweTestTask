package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends PageObject {

    public static final String BASE_PAGE = "https://m.hitwe.com/landing/inter?p=15276";
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@id='slide-01']/div/div/a")
    private WebElement girls_button;

    @FindBy(xpath = "//*[@id='slide-02-f']/div/div/a")
    private WebElement hair_button;

    @FindBy(xpath = "//*[@id='slide-03-f']/div/div/a")
    private WebElement eyes_button;

    @FindBy(xpath = "//*[@id='slide-04-f']/div/div/a")
    private WebElement body_button;

    @FindBy(name = "name")
    private WebElement form_field_name;

    @FindBy(name = "email")
    private WebElement form_field_email;

    @FindBy(name = "gender")
    private WebElement form_dropdown_gender;

    @FindBy(name = "age")
    private WebElement form_dropdown_age;

    @FindBy(xpath = "//*[@type='submit']")
    private WebElement form_submit_button;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 20);
    }

    public void chooseGirl(){
        WebElement girlsButton = wait.until(ExpectedConditions.visibilityOf(girls_button));
        girlsButton.click();
        WebElement hairButton = wait.until(ExpectedConditions.visibilityOf(hair_button));
        hairButton.click();
        WebElement eyesButton = wait.until(ExpectedConditions.visibilityOf(eyes_button));
        eyesButton.click();
        WebElement bodyButton = wait.until(ExpectedConditions.visibilityOf(body_button));
        bodyButton.click();
    }

    public void submitRegistrationForm(String username, String email){
        WebElement formFieldName = wait.until(ExpectedConditions.elementToBeClickable(form_field_name));
        formFieldName.sendKeys(username);
        WebElement formFieldEmail = wait.until(ExpectedConditions.elementToBeClickable(form_field_email));
        formFieldEmail.sendKeys(email);

        WebElement formDropdownGender = wait.until(ExpectedConditions.elementToBeClickable(form_dropdown_gender));
        Select male = new Select(formDropdownGender);
        male.selectByValue("m");
        WebElement formDropdownAge = wait.until(ExpectedConditions.elementToBeClickable(form_dropdown_age));
        Select age = new Select(formDropdownAge);
        age.selectByValue("18");

        WebElement formSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(form_submit_button));
        formSubmitButton.click();
    }
}
