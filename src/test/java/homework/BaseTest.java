package homework;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    WebDriver webDriver;

    @BeforeTest
    @Parameters({"browser"})
    public void test(String browser) throws MalformedURLException {

        DesiredCapabilities desiredCapabilities = null;

        switch (browser) {
            case "chrome":

                desiredCapabilities = DesiredCapabilities.chrome();
                desiredCapabilities.setBrowserName("chrome");
                desiredCapabilities.setVersion("68.0");
                desiredCapabilities.setPlatform(Platform.WINDOWS);
                break;
            case "firefox":

                desiredCapabilities = DesiredCapabilities.firefox();
                desiredCapabilities.setBrowserName("firefox");
                desiredCapabilities.setVersion("61.0.2");
                desiredCapabilities.setPlatform(Platform.WINDOWS);
            default: break;
        }


        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
    }

    @AfterTest
    public void close(){
        webDriver.close();
        webDriver.quit();
    }
}
