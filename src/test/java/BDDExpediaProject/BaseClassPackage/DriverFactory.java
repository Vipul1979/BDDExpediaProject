package BDDExpediaProject.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;
//java.lang.NullPointerException without constructor it will through this exception
        public DriverFactory(){ //java.lang.NullPointerException
       PageFactory.initElements(driver,this);
    }

    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.expedia.co.uk/?pwaLob=wizard-hotel-pwa-v2");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }//openBrowser method end

    public void closeBrowser(){
        //driver.quit();
    }
}
