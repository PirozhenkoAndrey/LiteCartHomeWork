import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by piroz on 29.05.2017.
 */
public class LiteCartTest extends TestBase {

    @Test
    public void TestTask1() throws InterruptedException {
       appearance();
       catalog();
       countries();
       currencies();
       customers();
       geoZones();
       languages();
       modules();
       orders();
       pages();
       reports();
       setings();
       slides();
       tax();
       translation();
       users();
       vqmods();
    }

    @Test
    public void TestTask2 () {
        System.setProperty("selenide.browser", "Chrome");
        open("http://litecart-2.0.1/");
        //$(By.cssSelector("#box-campaign-products a")).pressEnter().shouldHave(text("Yellow Duck"));
        $(By.cssSelector("[title*='Yellow Duck']")).pressEnter().shouldHave(text("Yellow Duck"));
        $(By.cssSelector("[class*=campaign-price]")).shouldHave(text("18"));

    }

    @Test
    public void TestTask3 (){
        newCustomerCreation();
    }



}
