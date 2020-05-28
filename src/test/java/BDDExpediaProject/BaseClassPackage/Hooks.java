package BDDExpediaProject.BaseClassPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
    DriverFactory driverFactory = new DriverFactory();
    @Before
    public void setup(){
        driverFactory.openBrowser();
    }//@Before method end

    @After
    public void tearDown(){
        driverFactory.closeBrowser();
    }
}
