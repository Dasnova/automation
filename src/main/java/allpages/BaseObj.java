package allpages;

import io.general.config.Settings;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static io.general.base.DriverContext.driver;
import static org.junit.Assert.assertEquals;


public class BaseObj<T> {

    protected String getQaEnv(){return Settings.qa_siteUrl;}
    protected String getEbuyerEnv(){return Settings.ebuyer_siteUrl;}

    protected String getStagingEnv(){return Settings.staging_siteUrl;}

    protected T click(By element){
        waitForPresenceOfElement(element);
        driver.findElement(element).click();
        return (T) this;
    }

    protected T clear(By element){
        waitForPresenceOfElement(element);
        driver.findElement(element).clear();
        return (T) this;
    }

    protected T setText(By element, String text){
        waitForPresenceOfElement(element);
        driver.findElement(element).sendKeys(text);
        return (T) this;
    }

    public T getText(String expected, By element){
        waitForPresenceOfElement(element);
        String ele = driver.findElement(element).getText();
        assertEquals(expected, ele);
        return (T) this;
    }

    public T getPageTitle(String expected) {
        String actual = driver.getTitle();
        assertEquals(expected, actual);
        return (T) this;
    }

    protected T waitForPresenceOfElement(By element){
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(element));
        return (T) this;
    }
}
