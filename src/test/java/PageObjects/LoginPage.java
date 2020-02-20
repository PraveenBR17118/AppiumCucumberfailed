package PageObjects;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    public AndroidDriver<AndroidElement> lacier;

//    public LoginPage(AndroidDriver<AndroidElement> driver)
//    {
//        ldriver = driver;
//        PageFactory.initElements(new AppiumFieldDecorator(this.ldriver) ,this);
//    }

    public LoginPage(AndroidDriver<AndroidElement> driver)
    {
        this.lacier = driver;
        PageFactory.initElements(lacier,this);
    }

    IOSDriver<IOSElement> iOSdriver;

    public LoginPage(IOSDriver<IOSElement> driver)
    {
        this.iOSdriver = driver;
        PageFactory.initElements(iOSdriver,this);
    }



    @AndroidFindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"START NOW\"])[11]")
    })
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']"),
            @FindBy(xpath = "(//XCUIElementTypeOther[@name='START NOW'])[11]")
    })
    @CacheLookup
    public WebElement StartButton;

    public LoginPage tapStartButton()
    {
        StartButton.click();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Email']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"Email\"])[3]/XCUIElementTypeTextField")
    @FindAll({
            @FindBy(xpath = "//android.widget.EditText[@text = 'Email']"),
            @FindBy(xpath = "(//XCUIElementTypeOther[@name='Email'])[3]/XCUIElementTypeTextField")
    })
    @CacheLookup
    public WebElement email;

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
    @FindAll({
            @FindBy(xpath = "//android.widget.EditText[@text = 'Email']"),
            @FindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1018][972,1118]']"),
            @FindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")

    })
    @CacheLookup
    public WebElement clearEmail;

    public LoginPage clrEmail()
    {
        clearEmail.clear();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.EditText[@text = 'Password']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(xpath = "(//XCUIElementTypeOther[@name=\"Password\"])[2]")

    })
    @FindAll({
            @FindBy(xpath = "//android.widget.EditText[@text = 'Password']"),
            @FindBy(xpath = "(//XCUIElementTypeOther[@name='Password'])[2]"),


    })
    @CacheLookup
    public WebElement password;

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
    @FindAll({
            @FindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1197][972,1297]']"),
            @FindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1156][972,1256]']"),
            @FindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1198][971,1295]']"),
            @FindBy(xpath = "(//android.widget.EditText)[1]"),
    })
    @CacheLookup
    public WebElement clearPassword;

    public LoginPage clrPassword()
    {
        clearPassword.clear();
        return this;
    }


    @AndroidFindBy(xpath = "//android.widget.TextView[@text ='Login']")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "Login"),
            @iOSXCUITBy(xpath ="//XCUIElementTypeOther[@name=\"Login\"]")
    })
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='Login']"),
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView"),
            @FindBy(id = "8e07b8da-a1e8-41d4-a7d9-bec4db524bcc"),
            @FindBy(xpath = "(//android.view.ViewGroup)[8]"),
            @FindBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[699,1355][792,1399]']"),
            //@FindBy(accessibility = "Login"),
            @FindBy(xpath ="//XCUIElementTypeOther[@name='Login']")

    })
    @CacheLookup
    public WebElement login1;

    public LoginPage tapLogin1()
    {
        login1.click();
        return this;
    }
    


    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Forgot Password ?']")
    //@AndroidFindBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[146,1018][972,1118]']")
    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[5]")
    @iOSXCUITFindAll({
            @iOSXCUITBy(accessibility = "Forgot Password ?"),
            @iOSXCUITBy(xpath ="//XCUIElementTypeOther[@name=\"Forgot Password ?\"]")
    })
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text = 'Forgot Password ?']")
    })
    @CacheLookup
    public WebElement ForgotPassword;

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
    @FindAll({
            @FindBy(xpath = "//android.view.ViewGroup/android.widget.TextView[@text = 'New User']")
    })
    @CacheLookup
    public WebElement NewUserButton;

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
    public WebElement RequestPrayer;

    public LoginPage tapRequestPrayer()
    {
        RequestPrayer.click();
        return this;
    }
}
