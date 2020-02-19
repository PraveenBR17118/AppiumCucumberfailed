package PageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    public AndroidDriver<AndroidElement> ldriver;

    public LoginPage()
    { }

//    public LoginPage(AndroidDriver<AndroidElement> driver)
//    {
//        ldriver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(this.ldriver) ,this);
//    }

    public LoginPage(AndroidDriver<AndroidElement> driver)
    {
        ldriver = driver;
        PageFactory.initElements(this.ldriver , this);

    }

//    IOSDriver<IOSElement> iosdriver1;
//
//    public LoginPage(IOSDriver<IOSElement> iosdriver1)
//    {
//        PageFactory.initElements(new AppiumFieldDecorator(iosdriver1) ,this);
//    }



    @AndroidFindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"START NOW\"])[11]")
    })
    public MobileElement StartButton;

    public LoginPage tapStartButton()
    {
        StartButton.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Email\"])[3]/XCUIElementTypeTextField")
    public MobileElement email1;

    public LoginPage sendEmail1()
    {
        email1.isEnabled();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Email\"])[3]/XCUIElementTypeTextField")
    public MobileElement email2;

    public LoginPage sendEmail2()
    {
        email2.click();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Email\"])[3]/XCUIElementTypeTextField")
    public MobileElement email;

    public LoginPage sendEmail(String a)
    {
        email.sendKeys(a);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.EditText[@text = 'Email']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1018][972,1118]']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeApplication[@name=\"Pray4One\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"),
            @iOSXCUITBy(iOSNsPredicate = "type == 'XCUIElementTypeTextField' AND visible == 'true'"),
            @iOSXCUITBy(iOSNsPredicate = "x == '56' AND y == '296'"),
            @iOSXCUITBy(id ="19000000-0000-0000-3E06-000000000000")
    })
    public MobileElement clearEmail;

    public LoginPage clrEmail()
    {
        clearEmail.clear();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Password']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"Password\"])[2]")

    })
    public MobileElement password1;

    public LoginPage sendPassword1()
    {
        password1.isEnabled();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Password']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"Password\"])[2]")

    })
    public MobileElement password2;

    public LoginPage sendPassword2()
    {
        password2.click();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Password']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"Password\"])[2]")

    })
    public MobileElement password;

    public LoginPage sendPassword(String a)
    {
        password.sendKeys(a);
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1197][972,1297]']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1156][972,1256]']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1198][971,1295]']"),
                    @AndroidBy(xpath = "(//android.widget.EditText)[1]"),
                    //@AndroidBy(xpath = "(//android.view.ViewGroup)[6]")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "//XCUIElementTypeApplication[@name=\"Pray4One\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"),
            @iOSXCUITBy(iOSNsPredicate = "type == 'XCUIElementTypeSecureTextField' AND visible == 'true'"),
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"Email\"])[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField\""),
            @iOSXCUITBy(id ="1B000000-0000-0000-3E06-000000000000")
    })
    public MobileElement clearPassword;

    public LoginPage clrPassword()
    {
        clearPassword.clear();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Login']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "Login"),
            @iOSXCUITBy(xpath ="//XCUIElementTypeOther[@name=\"Login\"]")
    })
    public MobileElement login1;

    public LoginPage tapLogin1()
    {
        login1.isEnabled();
        return this;
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Login']")
    //@iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"Login\"]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name='Login']")
//    @iOSXCUITFindAll({
//            @iOSXCUITBy(accessibility = "Login"),
//            @iOSXCUITBy(xpath ="//XCUIElementTypeOther[@name=\"Login\"]")
//    })

    public MobileElement login;

    public LoginPage tapLogin()
    {
        login.click();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Forgot Password ?']")
    //@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1018][972,1118]']")
    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[5]")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "Forgot Password ?"),
            @iOSXCUITBy(xpath ="//XCUIElementTypeOther[@name=\"Forgot Password ?\"]")
    })
    public MobileElement ForgotPassword;

    public LoginPage taoOnForgotPassword()
    {
        ForgotPassword.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text = 'New User']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "New User"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"New User\"]")
    })
    public MobileElement NewUserButton;

    public LoginPage tapNewUserButton()
    {
        NewUserButton.click();
        return this;
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text = 'New User']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "Request Prayer"),
            @iOSXCUITBy(xpath = "//XCUIElementTypeOther[@name=\"Request Prayer \"]")
    })
    public MobileElement RequestPrayer;

    public LoginPage tapRequestPrayer()
    {
        RequestPrayer.click();
        return this;
    }
}
