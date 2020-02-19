package stepDefinitions;


import PageObjects.*;
import cucumber.api.java.en.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Pray4OneSteps extends BaseClass
{


    public Pray4OneSteps()
    {

    }


    @Before
    public void setup() throws IOException
    {
        logger= Logger.getLogger("SeleniumCucumber"); //Added logger
        PropertyConfigurator.configure("log4j.properties");//Added logger

        configProp=new Properties();
        FileInputStream configPropfile=new FileInputStream("config.properties");
        configProp.load(configPropfile);


    }

    @Given("Open the desired device")
    public void open_the_desired_device() throws MalformedURLException
    {
        //File AppLocation = new File("src");
        //File InstallAppLocation = new File(AppLocation, "app-release (1).apk");
        //File InstallAppLocation = new File(AppLocation, "/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/app/app1-release.apk");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("platformName","Android");
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3a XL API 29");
        capability.setCapability("platformVersion","10.0");
        //capability.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        capability.setCapability(MobileCapabilityType.APP, "/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/app/app1-release.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>
                (new URL("http://127.0.0.1:4723/wd/hub"), capability);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitVar = new WebDriverWait(driver,10);



    }

    @Then("Enter the login details")
    public void enter_the_login_details()
    {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //LoginPage lp = new LoginPage(driver);
        lp = new LoginPage(driver);
        lp.tapStartButton();
        lp.sendEmail("praveenbr.1991@gmail.com");
        lp.sendPassword("PPrrkk@1718");
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }



//        driver.findElementByXPath("//android.widget.TextView[@text ='START NOW']").click();
//        driver.findElementByXPath("//android.widget.EditText[@text = 'Email']").sendKeys("praveenbr.1991@gmail.com");
//        driver.findElementByXPath("//android.widget.EditText[@text = 'Password']").sendKeys("PPrrkk@1718");
    }

    @Then("Click on login")
    public void click_on_login()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        lp.tapLogin1();
        //driver.findElementByXPath("//android.widget.TextView[@text = 'Login']").click();
    }

    @Then("verify the HomePage")
    public void verify_the_HomePage()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        //hp.PrayForOtherTitleText();
        driver.findElementByXPath("//android.widget.TextView.[@text='Pray for Others']").isDisplayed();
    }
}
