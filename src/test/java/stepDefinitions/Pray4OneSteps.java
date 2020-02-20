package stepDefinitions;


import PageObjects.*;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Pray4OneSteps
{


    public Pray4OneSteps()
    {

    }

    private AndroidDriver driver;
    private static Logger logger;
    private LoginPage lp;


    @Before("@androidAppium")
    public void setup()
    {
        logger= Logger.getLogger("SeleniumCucumber"); //Added logger
        PropertyConfigurator.configure("log4j.properties");//Added logger

    }

    @Given("Open the Android device")
    public void open_the_Android_device() throws MalformedURLException
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
        driver = new AndroidDriver<AndroidElement>
                (new URL("http://127.0.0.1:4723/wd/hub"), capability);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Appium Connection is establishing");
        //WebDriverWait waitVar = new WebDriverWait(driver, 10);



    }

    @Then("Enter the login details")
    public void enter_the_login_details()
    {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info(">>>>>>>>>>>>Opened The Application<<<<<<<<<<<<<<<<");

        lp = new LoginPage(driver);
        lp.tapStartButton();
        lp.sendEmail("praveenbr.1991@gmail.com");
        lp.sendPassword("PPrrkk@1718");
        logger.info(">>>>>>>>>>>>>>>Endered the login details<<<<<<<<<<<<<<<<<<<<<<");

    }

    @Then("Click on login")
    public void click_on_login()
    {
        //lp = new LoginPage(driver);
        lp.tapLogin1();
        logger.info("Clicked Login");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    @Then("verify the HomePage")
    public void verify_the_HomePage()
    {
        HomePage hp = new HomePage(driver);
       String iff = hp.PrayForOtherTitleText();
       System.out.println(iff);
       logger.info(">>>>>>>>>Got Home page Text<<<<<<<<<");
       int iffnum = hp.getAllValue();
       System.out.println(iffnum);
       hp.tapIPrayedForzYouCheckBox();
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        int iffnum1 = hp.getAllValue();
        System.out.println(iffnum1);
        if(iffnum-1 == iffnum1)
       {
            logger.info("Count has been decreased");
            Assert.assertTrue(true,"condition is passed");
       }
       else
           {
               Assert.assertFalse(false,"Conditon is failed");
           }

    }

    @After("@androidAppium")
    public void tearDown()
    {
        try
        {
            Thread.sleep(4000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        driver.quit();
    }


}
