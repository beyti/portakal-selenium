package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base){
        this.base=base;
    }

    @Before
    public void initializeTest(){
        System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
        base.driver=new FirefoxDriver();
   }
}
