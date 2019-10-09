package Noppcommerce2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod

    public void setUpBrowser(){
        browserSelector.setUpBrowser();

        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://demo.nopcommerce.com");
    }

    @AfterMethod

   public void closeBrowser(){
        getScreenShot();
     driver.quit();
    }
}
