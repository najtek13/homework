package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    protected WebDriver webDriver;

    public Page(WebDriver webDriver){

        this.webDriver = webDriver;
        webDriver.manage().window().fullscreen();
        PageFactory.initElements(webDriver, this);
    }
}
