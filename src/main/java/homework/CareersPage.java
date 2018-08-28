package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CareersPage extends Page{

    private static final String URL = "https://www.f-secure.com/en/web/about_global/careers";

    public CareersPage(WebDriver webDriver){

        super(webDriver);
    }

    @FindBy(css = "#p4-section-subnav > li.second-level.dropdown.active > a")
    public WebElement careers;

    @FindBy(css = "#p4-section-subnav > li.second-level.dropdown.active.open > ul > li:nth-child(2) > a")
    public WebElement jobOpenings;

    public CareersPage hoverCarreers(){

        new Actions(webDriver)
                .moveToElement(careers)
                .build()
                .perform();

        return this;
    }

    public JobOpeningsPage goToJobOpenings(){

        hoverCarreers();
        jobOpenings.click();
        return new JobOpeningsPage(webDriver);
    }

}
