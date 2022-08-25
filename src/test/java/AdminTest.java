import org.testng.annotations.Test;

public class AdminTest extends TestBase{


    @Test
    public void test2(){
        startLoginPage().
                loginToPIMPage()
                .navigateToAdminPage()
                .searchUserName("Aaliyah.Haq")
                .validateUserName("Aaliyah.Haq");
    }




}
