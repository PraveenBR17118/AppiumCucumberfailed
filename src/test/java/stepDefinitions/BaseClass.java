package stepDefinitions;

import PageObjects.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;


public class BaseClass
{


    public AndroidDriver driver;
    public static Logger logger;
    public Properties configProp;
    public LoginPage lp;
    public static WebDriverWait waitVar = null;


}
