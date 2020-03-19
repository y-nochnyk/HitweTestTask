import Pages.RegistrationPage;
import Pages.UserPage;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MainTest extends WebDrivers {

    @Test
    public void registrationTest(){
        driver.get("https://m.hitwe.com/landing/inter?p=15276");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.chooseGirl();
        registrationPage.submitRegistrationFrom
                (Credentials.getUsername(), Credentials.getEmail());

        UserPage userPage = new UserPage(driver);
        userPage.closeModalWindow();
        assertEquals(userPage.getTitleHeading(), "Я", "WRONG USER PAGE HEADING TITLE:");

        userPage.uploadAvatar();
        assertNotEquals
                (userPage.getAvaPlaceholderClass(),
                        "avatar-placeholder no-photo","WRONG AVATAR PLACEHOLDER CLASS ATTRIBUTE:");
    }
}
