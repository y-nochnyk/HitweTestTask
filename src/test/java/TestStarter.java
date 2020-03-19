import Pages.RegistrationPage;
import Pages.UserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestStarter {
    static WebDriver driver;
    static RegistrationPage registrationPage;
    static UserPage userPage;

    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/drivers/chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "./src/main/resources/drivers/geckodriver.exe");

        String browser = System.getProperty("browser");
        System.out.println(browser);

        if (browser.equals("chrome")){
            driver = new ChromeDriver();
        }else if (browser.equals("firefox")){
            driver = new FirefoxDriver();
        }

        registrationPage = new RegistrationPage(driver);
        userPage = new UserPage(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown(){
        driver.quit();
    }
}
