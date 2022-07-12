package allpages;

import java.io.IOException;


import static io.general.base.Browser.launchBrowser;
import static io.general.base.DriverContext.driver;

public class Common extends BaseObj<Common>{

    /**
     * This loads signup page
     * To launch login page switch signup string in line 19 to login
     * Allows switching between environments
     * Generally, it's best to point url to login
     */
    public Common visit() throws IOException {
        launchBrowser();
        //driver.navigate().to(getQaEnv() );
        driver.navigate().to(getEbuyerEnv() );
        //driver.navigate().to(getStagingEnv() + "/signup/");
        return this;
    }
}
