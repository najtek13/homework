package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends Page{

    private static final String URL = "https://www.f-secure.com/pl_PL/welcome";

    public WelcomePage(WebDriver webDriver){

        super(webDriver, URL);
    }

    @FindBy(linkText = "Kariera")
    private WebElement careers;

    @FindBy(linkText = "OK")
    private WebElement cookiesOK;

    public CareersPage goToCareers(){

        careers.click();
        return new CareersPage(webDriver);
    }

    public WelcomePage acceptCookies(){

        cookiesOK.click();
        return new WelcomePage(webDriver);
    }
}
