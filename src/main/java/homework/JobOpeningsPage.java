package homework;

import org.openqa.selenium.WebDriver;

public class JobOpeningsPage extends Page{

    private static final String URL = "https://www.f-secure.com/en/web/about_global/careers/job-openings";

    public JobOpeningsPage(WebDriver webDriver){

        super(webDriver, URL);
    }
}
