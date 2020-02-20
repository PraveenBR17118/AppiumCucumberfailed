package stepDefinitions;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import cucumber.api.java.*;
import cucumber.api.java.en.*;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Pray4OneiOSSteps
{
    public Pray4OneiOSSteps()
    {

    }

    public IOSDriver iOSdriver;
    private static Logger logger;
    private LoginPage lp;

    @Before("@IOSAppium")
    public void setup()
    {
        logger= Logger.getLogger("SeleniumCucumber"); //Added logger
        PropertyConfigurator.configure("log4j.properties");//Added logger

    }

    @Given("Open the IOS device")
    public void open_the_IOS_device() throws MalformedURLException
    {
        //File AppLocation = new File("src");
        //File InstallAppLocation = new File(AppLocation, "app-release (1).apk");
        //File InstallAppLocation = new File(AppLocation, "/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/app/app1-release.apk");
        DesiredCapabilities capability = new DesiredCapabilities();
        capability.setCapability("platformName","iOS");
        capability.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
        capability.setCapability("platformVersion","12.0");
        capability.setCapability(MobileCapabilityType.APP, "/Users/praveen/Documents/IntelliJidea/Cucumber/AppiumCucumber/app/Pray4One 2.zip");
        //capability.setCapability(MobileCapabilityType.APP, InstalliOSAppLocation.getAbsolutePath());
        iOSdriver = new IOSDriver<IOSElement>
                (new URL("http://127.0.0.1:4723/wd/hub"), capability);
        iOSdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Appium Connection is establishing");
        //WebDriverWait waitVar = new WebDriverWait(driver, 10);

    }

    @Then("Enter the IOS login details")
    public void enter_the_IOS_login_details()
    {
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info(">>>>>>>>>>>>Opened The iOS Application<<<<<<<<<<<<<<<<");

        lp = new LoginPage(iOSdriver);
        lp.tapStartButton();
        lp.sendEmail("praveenbr.1991@gmail.com");
        lp.sendPassword("PPrrkk@1718");
        logger.info("Endered the login details");

    }

    @Then("Click on IOS login")
    public void click_on_IOS_login()
    {
        //lp = new LoginPage(driver);
        lp.tapLogin1();
        logger.info("Clicked iOS Login1");
        lp.tapLogin1();
        logger.info("Clicked iOS Login2");
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

    @Then("verify the IOS HomePage")
    public void verify_the_IOS_HomePage()
    {
        HomePage hp = new HomePage(iOSdriver);
        String iff = hp.PrayForOtherTitleText();
        System.out.println(iff);
        logger.info(">>>>>>>>>Got iOS Home page Text<<<<<<<<<");
        int iffnum = hp.getAllValue();
        System.out.println(iffnum);
        logger.info(">>>>>>>>>Got All Value<<<<<<<<<");
        hp.tapIPrayedForzYouCheckBox();
        logger.info("Clicked on i prayed for you");
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
        logger.info(">>>>>>>>>Got All Value<<<<<<<<<");
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

    @After("@IOSAppium")
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
        iOSdriver.quit();
    }
}
