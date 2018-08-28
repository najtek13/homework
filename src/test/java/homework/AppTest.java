package homework;

import org.testng.annotations.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class AppTest extends BaseTest{

    @Test
    public void homework(){

        QualityEngineerPage qualityEngineerPage = new WelcomePage(webDriver)
                .open()
                .acceptCookies()
                .goToCareers()
                .goToJobOpenings()
                .selectCity("Poznań")
                .goToQualityEngineerPage();

        assertThat(qualityEngineerPage.getTitle())
                .as("Verify page title")
                .isEqualTo("Quality Engineer - F-Secure | Jobylon");
        assertThat(qualityEngineerPage.getLocation())
                .as("Verify location")
                .isEqualTo("Poznań");
    }
}
