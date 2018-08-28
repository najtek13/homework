package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class JobOpeningsPage extends Page{

    private static final String URL = "https://www.f-secure.com/en/web/about_global/careers/job-openings";

    public JobOpeningsPage(WebDriver webDriver){

        super(webDriver);
    }

    @FindBy(id = "job-city")
    public WebElement jobCity;

    @FindBy(css = "#job-ads > article > a")
    public List<WebElement> articles;

    public JobOpeningsPage selectCity(String city){

        new Select(jobCity).selectByValue(city);
        return this;
    }

    public WebElement getJobOfferElement(String name){

        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        WebElement w = articles
                .stream()
                .filter(webElement ->
                        String.format("Jobylon - %s", name).equals(webElement.getAttribute("data-track-name")))
                .findAny()
                .orElse(null);

        return wait.until(
                ExpectedConditions.visibilityOf(w));
    }

    public QualityEngineerPage goToQualityEngineerPage(){


        getJobOfferElement("Quality Engineer").click();
        Utils.switchToLatestPopupWindow(webDriver);

        return new QualityEngineerPage(webDriver);
    }
}
