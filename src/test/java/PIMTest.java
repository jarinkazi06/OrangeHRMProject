import browser.Browser;
import browser.Info;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class PIMTest extends TestBase{

   // WebDriver driver;

    @Test
    public void test1() throws InterruptedException {
        startLoginPage().
                loginToPIMPage()
                .searchEmployeeId("0083")
                .validateFirstAndLastName("Joe","Root");


        Thread.sleep(5000);
    }

    @Test
    public void test2(){

    }

}
