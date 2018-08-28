package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QualityEngineerPage extends Page{

    private static final String URL = "https://emp.jobylon.com/jobs/16654-f-secure-quality-engineer/";

    public QualityEngineerPage(WebDriver webDriver){

        super(webDriver);
    }

    @FindBy(css = "#canvas-ad-container > div.canvas-top-wrapper > div > div > div > div > ul > li:nth-child(2)")
    private WebElement location;

    public String getTitle(){

        return webDriver.getTitle();
    }

    public String getLocation(){

        return location.getText();
    }
}
