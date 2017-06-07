import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by piroz on 29.05.2017.
 */
public class LiteCartTest extends TestBase {

    @Test
    public void testAdminMenu() throws InterruptedException {
        testAdminLoginAndAdminMenu();
    }

    @Test
    public void testSizeAndPrice () throws InterruptedException {
        testYelowDuckForSizeAndPrice();
    }

    @Test
    public void testNewCustomerCreation () throws InterruptedException {
        newCustomerCreation();
    }
    @Test
    public void testWaiteSelenideYellowDuckCart () throws InterruptedException {
        System.setProperty("selenide.browser", "Chrome");
        open("http://litecart-2.0.1/");
        //находим желтую утку и кликаем на нее, проверка по тексту Yellow Duck.
        $(By.cssSelector("[title*='Yellow Duck']")).pressEnter();
//        // ajax не подтягивает данные со страницы, по этому указываем на drop-menu размеров желаемой утки,
//        // и перемещаемся клавишей ARROW_DOWN.
//        $(By.cssSelector("#box-product select")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//        // и кликаем на нужный размер.
//        $(By.cssSelector("#box-product option:nth-child(2)")).shouldHave(value("Small")).click();
//        $(By.cssSelector("[name='add_cart_product']")).pressEnter();
//        $(By.cssSelector("[aria-label='Close']")).pressEnter();
//        $(By.cssSelector("#cart")).click();
        $(By.xpath("//*[@id='box-product']/div[1]/div[1]/div/a/img")).click();
        $(By.cssSelector("[aria-label='Close']")).click();
    }
}
