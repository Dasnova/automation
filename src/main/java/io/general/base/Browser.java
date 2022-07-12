package io.general.base;
import io.general.config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.chrome.ChromeDriver;



import java.io.IOException;

import static io.general.base.DriverContext.driver;

public class Browser {

    @Before
    public static void launchBrowser() throws IOException {
        ConfigReader.populateSettings();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void closeBrowser() throws IOException {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
