package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    //Create a webDriver for this class
    private WebDriver driver;

    //Create a constructor
    public DashboardPage(WebDriver driver)
    {
        this.driver = driver;
    }

    //Locate elements
    private By Ihamlord = By.xpath("//*[@id=\"root\"]/div/div/div/main/div/div[1]/div[1]/div/div[2]/div[3]/button/p");
    private By logOut = By.linkText("Log Out");

    //Functions to interact with the element
    public void clickIhamlord() throws InterruptedException
    {
        //Wait for 10 seconds before executing the action
        Thread.sleep(10000);
        driver.findElement(Ihamlord).click();
    }

    public LoginPage clickLogOut() throws InterruptedException
    {
        //Wait for 3 seconds before executing the actions
        Thread.sleep(3000);
        driver.findElement(logOut).click();
        return new LoginPage(driver);
    }
}
