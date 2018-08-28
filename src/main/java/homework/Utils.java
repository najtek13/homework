package homework;

import org.openqa.selenium.WebDriver;

import java.util.Iterator;

public class Utils {

    public static void switchToLatestPopupWindow(WebDriver driver)
    {
        Iterator<String> handleIterator = driver.getWindowHandles().iterator();
        while (handleIterator.hasNext())
        {
            String handle = handleIterator.next();
            if (!handleIterator.hasNext())
            {
                driver.switchTo().window(handle);
            }
        }
    }
}
