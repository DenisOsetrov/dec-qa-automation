package base.config;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeClass(alwaysRun = true)
    public void configuration() {
        Configuration.browser = "chrome";
        Configuration.startMaximized = false;
//        Configuration.browserSize = "300x200";
        Configuration.headless = true;
        Configuration.holdBrowserOpen = false;
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "normal";
        Configuration.screenshots = true;
        Configuration.savePageSource = false;
        Configuration.pageLoadTimeout = 10000;
    }

    @BeforeMethod
    public void setUp() {
        // https://www.stats.govt.nz/large-datasets/csv-files-for-download/ - URL TO DOWNLOAD FILE
//    https://ps.uci.edu/~franklin/doc/file_upload.html - URL TO UPLOAD FILE
        //https://checkcps.com/double-click/ - URL TO DOUBLE CLICK
//    "https://faculty.washington.edu/chudler/java/boxes.html" - URL WITH CHECKBOXES
//        https://www.youtube.com/ - CONTROL CHECK
        //https://demoqa.com/frames - iframes
        // http://uitestingplayground.com/shadowdom - shadow css
//        https://demoqa.com/progress-bar - progress bar test
        Selenide.open("https://www.saucedemo.com/");
    }

//    @AfterMethod(alwaysRun = true)
//    public void cleanWebDriver(){
//        Selenide.clearBrowserCookies();
//        Selenide.refresh();
//        Selenide.open("about:blank");
//    }
//    @AfterClass
//    public void tearDown(){
//        Selenide.closeWebDriver();
//    }


}
