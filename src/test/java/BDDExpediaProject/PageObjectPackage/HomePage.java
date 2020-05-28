package BDDExpediaProject.PageObjectPackage;

import BDDExpediaProject.BaseClassPackage.DriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends DriverFactory {

    @FindBy(xpath = "//button[@id='tab-flight-tab-hp']//span[@class='uitk-icon uitk-icon-flights']")
    WebElement flightButton;

    @FindBy(xpath = "//input[@id='flight-departing-hp-flight']")
    WebElement departureDate;

    @FindBy(xpath = "//div[3]//table[1]")
    WebElement juneMonthCalander;

    @FindBy(xpath = "//button[@data-month=5]")
    List<WebElement> junemonthDates;


    public void clickonJuneMonth(){
        juneMonthCalander.click();
        System.out.println(juneMonthCalander.isDisplayed());
    }
    public void juneMonthDatesList() throws InterruptedException {
        for (WebElement jundate : junemonthDates
        ) {
            //jundate.getText();

            Thread.sleep(2000);
            if (jundate.getAttribute("data-day").contains("25")) ;

            jundate.click();
        }//for block end
         }//juneMonthDatesList method end


            public void clickOnFlight () throws InterruptedException {
                Thread.sleep(2000);
                flightButton.click();
            }//clickonFlight method end

            public void clickondeparture () throws InterruptedException {
                Thread.sleep(3000);
                departureDate.click();
            }//clickondeparture method end
        }//Class end


