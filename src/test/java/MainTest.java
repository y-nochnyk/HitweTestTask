import org.testng.annotations.Test;
import static org.testng.Assert.*;
import Pages.RegistrationPage;

public class MainTest extends TestStarter {

    @Test (priority = 1)
    public void doRegister(){
        driver.get(RegistrationPage.BASE_PAGE);
        registrationPage.chooseGirl();
        registrationPage.submitRegistrationForm
                (Credentials.getUsername(), Credentials.getEmail());
    }

    @Test (priority = 2)
    public void verifyRegister(){
        userPage.closeModalWindow();
        assertEquals(userPage.getTitleHeading(), "Я", "WRONG USER PAGE HEADING TITLE:");
    }

    @Test (priority = 3)
    public void uploadPhotoTest(){
        userPage.uploadAvatar();
        assertNotEquals
                (userPage.getAvaPlaceholderClass(),
                        "avatar-placeholder no-photo","WRONG AVATAR PLACEHOLDER CLASS ATTRIBUTE:");
    }
}
