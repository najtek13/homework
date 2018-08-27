package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Page {

    protected WebDriver webDriver;

    public Page(WebDriver webDriver, String url){

        this.webDriver = webDriver;
        webDriver.get(url);
        PageFactory.initElements(webDriver, this);
    }
}
