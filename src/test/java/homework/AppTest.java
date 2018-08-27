package homework;

import org.testng.annotations.Test;

public class AppTest extends BaseTest{
    @Test
    public void test1(){

        new WelcomePage(webDriver)
                .acceptCookies()
                .goToCareers()
                .goToJobOpenings();
    }
}
