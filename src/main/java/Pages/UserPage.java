package Pages;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class UserPage extends PageObject {

    private WebDriverWait wait;

    @FindBy(className = "interstial-close")
    private WebElement modal_window_close;

    @FindBy(className = "main-tile-heading")
    private WebElement title_heading;

    @FindBy(className = "prof_add_avatar")
    private WebElement add_avatar_button;

    @FindBy(xpath = "//*[@id='photo']")
    private WebElement add_photo_button;

    @FindBy(css = "#Dialog .add-ava-go-btn")
    private WebElement add_avatar_go_button;

    @FindBy(xpath = "//*[@class='prof-ava']/div")
    private WebElement avatar_placeholder;

    public UserPage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, 20);
    }

    public void closeModalWindow(){
        WebElement modalWindowClose = wait.until(ExpectedConditions.visibilityOf(modal_window_close));
        modalWindowClose.click();
    }

    public String getTitleHeading(){
        WebElement titleHeading = wait.until(ExpectedConditions.visibilityOf(title_heading));
        return titleHeading.getText();
    }

    public void uploadAvatar(){
        WebElement addAvatarButton = wait.until(ExpectedConditions.visibilityOf(add_avatar_button));
        addAvatarButton.click();

        File file = new File("./src/main/resources/Avatar.jpg");
        WebElement element = wait.until
                (ExpectedConditions.elementToBeClickable(By.cssSelector("#Dialog p:nth-child(1)")));
        add_photo_button.sendKeys(file.getAbsolutePath());
        Tools.waitSec();
        add_avatar_go_button.click();
    }

    public String getAvaPlaceholderClass(){
        WebElement avatarPlaceholder = wait.until(ExpectedConditions.visibilityOf(avatar_placeholder));
        return avatarPlaceholder.getAttribute("class");
    }
}
