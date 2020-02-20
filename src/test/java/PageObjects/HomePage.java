package PageObjects;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    AndroidDriver<AndroidElement> ldriver;


    public HomePage(AndroidDriver<AndroidElement> driver)
    {
        this.ldriver = driver;
        PageFactory.initElements(ldriver,this);
    }

//    public HomePage(AndroidDriver<AndroidElement> driver)
//    {
//        PageFactory.initElements(new AppiumFieldDecorator(driver) ,this);
//    }

    IOSDriver<IOSElement> iOSdriver;

    public HomePage(IOSDriver<IOSElement> driver)
    {
        this.iOSdriver = driver;
        PageFactory.initElements(iOSdriver,this);
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView.[@text='Pray for Others']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[327,472][737,553]']"),
                    @AndroidBy(xpath = "(//android.widget.TextView)[0]")
                    //@AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeButton[@name='Settings, tab, 4 of 4']"),
            @iOSXCUITBy(accessibility = "Settings, tab, 4 of 4")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    @FindAll({
            @FindBy(id = "0db92e09-9351-47e5-959d-016196ef159d"),
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView"),
            @FindBy(xpath = "//XCUIElementTypeButton[@name='Settings, tab, 4 of 4']"),
            //@iOSXCUITBy(accessibility = "Settings, tab, 4 of 4")
    })
    @CacheLookup
    public WebElement PrayForOtherTitle;

    public String PrayForOtherTitleText()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String fff1 = PrayForOtherTitle.getAttribute("name");
        return fff1;
        //return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView.[@text='Pray for Others']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[327,472][737,553]']"),
                    @AndroidBy(xpath = "(//android.widget.TextView)[0]")
                    //@AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeButton[@name='Settings, tab, 4 of 4']"),
            @iOSXCUITBy(accessibility = "Settings, tab, 4 of 4")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    @FindAll({
            @FindBy(id = "d8c5a864-40de-41a6-b45b-9f294ac93653"),
            @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.HorizontalScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]"),
            @FindBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[151,609][231,656]']"),
            @FindBy(xpath = "//XCUIElementTypeButton[@name='Settings, tab, 4 of 4']"),
    })
    @CacheLookup
    public WebElement AllValue;

    public int getAllValue()
    {
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        String fff2 = AllValue.getAttribute("name");
        int num = Integer.parseInt(fff2);
        return num;
        //return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='I prayed for you!']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[368,1447][625,1494]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"I prayed for you!\"])[2]'")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']"),
            @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"I prayed for you!\"])[2]'")
    })
    @CacheLookup
    public WebElement IPrayedForzYouGetText;

    public HomePage getIPrayedForzYouGetText()
    {
        IPrayedForzYouGetText.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='I prayed for you!']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[368,1447][625,1494]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"I prayed for you!\"])[2]'")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text='I prayed for you!']"),
            @FindBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[368,1447][625,1494]']"),
            @FindBy(xpath = "(//XCUIElementTypeOther[@name='I prayed for you!'])[2]'")
    })
    @CacheLookup
    public WebElement IPrayedForzYou;

    public HomePage tapIPrayedForzYouCheckBox()
    {
        IPrayedForzYou.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Refer to Pastor']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[282,1582][519,1629]']"),
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Refer to Pastor\"]"),
            @iOSXCUITBy(accessibility = "Refer to Pastor")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']"),
            @FindBy( xpath = "//XCUIElementTypeOther[@name=\"Refer to Pastor\"]"),
    })
    @CacheLookup
    public WebElement ReferToPosterButton;

    public HomePage tapReferToPosterButton() throws InterruptedException {
        Thread.sleep(1000);
        ReferToPosterButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Skip ']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[620,1583][704,1627]']"),
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeOther[@name=\"Skip \"]"),
            @iOSXCUITBy(accessibility = "Skip")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']"),
            @FindBy( xpath = "//XCUIElementTypeOther[@name=\"Skip \"]"),
    })
    @CacheLookup
    public WebElement SkipButton;

    public HomePage tapSkipButton() throws InterruptedException {
        Thread.sleep(1000);
        SkipButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//*[@class='android.widget.ImageView' and @bounds='[896,488][946,538]']"),
            @AndroidBy(xpath = "(//android.widget.TextView)[2]"),
            //@AndroidBy(xpath = "(//android.view.ViewGroup)[9]")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Pray for Others\"]/XCUIElementTypeOther")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']"),
            @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Pray for Others\"]/XCUIElementTypeOther")
    })
    @CacheLookup
    public WebElement FilterButton;

    public HomePage tapFilterButton() throws InterruptedException {
        Thread.sleep(1000);
        FilterButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[10]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[151,609][231,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']"),
            @FindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    })
    @CacheLookup
    public WebElement AllButtonSize;

    public HomePage getAllButtonSize() throws InterruptedException {
        Thread.sleep(1000);
        AllButtonSize.getSize();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[10]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[151,609][231,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement AllButtonText;

    public HomePage getAllButtonText() throws InterruptedException {
        Thread.sleep(1000);
        AllButtonText.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='ALL']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[161,656][222,703]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 ALL\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement AllButton;

    public HomePage tapAllButton() throws InterruptedException {
        Thread.sleep(1000);
        AllButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[12]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[385,609][465,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Air1\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement AirButtonCount;

    public HomePage getAirButtonCount() throws InterruptedException {
        Thread.sleep(1000);
        AirButtonCount.getText();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView[@text='Air1']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[624,656][688,703]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Air1\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement AirButton;

    public HomePage tapAirButton() throws InterruptedException {
        Thread.sleep(1000);
        AirButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "(//android.widget.TextView)[14]"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[626,609][686,656]']"),
            })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Air1\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement Pray4OneButtonCount;

    public HomePage getPray4OneButtonCount() throws InterruptedException {
        Thread.sleep(1000);
        Pray4OneButtonCount.getText();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Pray4One']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[814,656][965,703]']"),
    })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 Pray4One\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement Pray4OneButton;

    public HomePage tapPray4OneButton() throws InterruptedException {
        Thread.sleep(1000);
        Pray4OneButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='K-LOVE']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[367,656][482,703]']"),
    })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 K-LOVE\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement KLoveButton;

    public HomePage tapKLoveButton() throws InterruptedException {
        Thread.sleep(1000);
        KLoveButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "(//android.widget.TextView)[3]"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[958,822][980,874]']")
    })
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeOther[@name=\"0 K-LOVE\"])[2]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement PrayingHands;

    public HomePage getPrayingHandSize() throws InterruptedException {
        Thread.sleep(1000);
        PrayingHands.getSize();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Pray4others']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[0,1999][270,2037]']"),
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Pray4others, tab, 1 of 4\"]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement ForOtherButton;

    public HomePage tapForOtherButton() throws InterruptedException {
        Thread.sleep(1000);
        ForOtherButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Pray4me']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[270,1999][540,2037]']"),
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Pray4me, tab, 2 of 4\"]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement ForMeButton;

    public HomePage tapForMeButton() throws InterruptedException {
        Thread.sleep(1000);
        ForMeButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='My Impact']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[270,1999][540,2037]']")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My Impact, tab, 3 of 4\"]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement MyImpactButton;

    public HomePage tapMyImpactButton() throws InterruptedException {
        Thread.sleep(1000);
        MyImpactButton.click();
        return this;
    }

    @AndroidFindAll
            ({
                    @AndroidBy(xpath = "//android.widget.TextView.[@text='Settings']"),
                    @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[810,1999][1080,2037]']"),
                    //@AndroidBy(xpath = "//*[@class='android.widget.EditText' and @bounds='[147,1019][971,1117]']")
            })
    @iOSXCUITFindAll({
            @iOSXCUITBy( xpath = "//XCUIElementTypeButton[@name=\"Settings, tab, 4 of 4\"]"),
            @iOSXCUITBy(accessibility = "Settings, tab, 4 of 4")
            //@iOSXCUITBy(iOSNsPredicate = "x == '37' AND y == '350'")
    })
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement SettingsButton;

    public HomePage tapSettingsButton()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SettingsButton.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Prayers I've prayed for today']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[173,1849][677,1903]']")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My Impact, tab, 3 of 4\"]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement PrayersIHavePrayedToday;

    public HomePage tapPrayersIHavePrayedToday() throws InterruptedException {
        Thread.sleep(1000);
        PrayersIHavePrayedToday.click();
        return this;
    }

    @AndroidFindAll({
            @AndroidBy(xpath = "//android.widget.TextView[@text ='Prayers I've prayed for today']"),
            @AndroidBy(xpath = "//*[@class='android.widget.TextView' and @bounds='[173,1849][677,1903]']")
    })
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"My Impact, tab, 3 of 4\"]")
    @FindAll({
            @FindBy(xpath = "//android.widget.TextView[@text ='START NOW']")
    })
    @CacheLookup
    public WebElement PrayersIHavePrayedTodaySize;

    public HomePage getPrayersIHavePrayedTodaySize() throws InterruptedException {
        Thread.sleep(1000);
        PrayersIHavePrayedTodaySize.getSize();
        return this;
    }





    //@AndroidFindBy(xpath = "//android.widget.ImageView[4]")
    //@AndroidFindBy(xpath = "//android.view.ImageView[1]/android.view.ImageView[3]")
    //findElement(By.xpath("//XCUIElementTypeApplication[1]..../XCUIElementTypeImage[1]"));
    //@AndroidFindBy(xpath = "//android.view.ViewGroup..../android.widget.ImageView")
    //@AndroidFindBy(xpath = "//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[@text = 'Help:']")
    //@AndroidFindBy(xpath = "//android.widget.ImageView//android.widget.TextView[@text = 'Help:']")
    //@AndroidFindBy(xpath = "//android.widget.ImageView/..../android.widget.TextView[@text = 'Help:']")
    //@AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Help:']") //itsworking
    //@AndroidFindBy(xpath = "(//android.view.ViewGroup)[9]") Selecting the filter instead of "how do i pray for this"


}
