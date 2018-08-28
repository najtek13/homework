package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends Page{

    private static final String URL = "https://www.f-secure.com/pl_PL/welcome";

    public WelcomePage(WebDriver webDriver){

        super(webDriver);
    }

    @FindBy(css = "#about > li:nth-child(4) > a")
    private WebElement careers;

    @FindBy(css = "#cookie-consent > span > a.btn.btn-primary")
    private WebElement cookiesOK;

    public WelcomePage open(){

        webDriver.get(URL);
        return this;
    }

    public CareersPage goToCareers(){

        careers.click();
        return new CareersPage(webDriver);
    }

    public WelcomePage acceptCookies(){

        cookiesOK.click();
        return this;
    }
}
