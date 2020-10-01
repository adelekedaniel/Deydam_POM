package login;

import org.testng.annotations.Test;
import pageObjects.DashboardPage;
import setup.SetupTests;

public class LoginTests extends SetupTests {
    //TestNG annotation
    @Test
    //This class extends to the SetupTests as a SetupTests class contains all the setup requirements to run our test
    public void testLogin() throws InterruptedException
    {
        String username = "Ihamlord";
        loginPage.enterUsername(username);
        loginPage.enterPassword("Adeleke123");

        //Handler for dashboard page
        DashboardPage dashboardPage = loginPage.clickLoginBtn();
        dashboardPage.clickIhamlord();
        loginPage = dashboardPage.clickLogOut();
    }
}