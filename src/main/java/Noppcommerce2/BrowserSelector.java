package Noppcommerce2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserSelector extends Utils {

    LoadProps loadProps = new LoadProps();

     @Test
    public void setUpBrowser() {
        String browser = loadProps.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty(("webdriver.IE.driver"), "src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            // driver = new IEDriver();

        } else {
            System.out.println("Browser name is empty or typed wrong " + browser );
        }
    }
}