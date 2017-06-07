import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by User on 6/1/2017.
 */
public class TestBase {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 50);
    }

    @After
    public void stop (){
       driver.quit();
    }

    public void login(){
        driver.get("http://litecart-2.0.1/admin/");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("admin");
        driver.findElement(By.cssSelector("#box-login button")).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
    }

    public void vqmods() {
        driver.findElement(By.cssSelector("a[href*=vqmods]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void users() {
        driver.findElement(By.cssSelector("a[href*=users]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void translation() {
        driver.findElement(By.cssSelector("a[href*=search]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=scan]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void tax() {
        driver.findElement(By.cssSelector("a[href*=tax_rates]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=tax_classes]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void slides() {
        driver.findElement(By.cssSelector("a[href*=slides]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void settings() {
        driver.findElement(By.cssSelector("a[href*=store_info]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=defaults]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=general]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=listings]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=images]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=checkout]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=advanced]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=security]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void reports() {
        driver.findElement(By.cssSelector("a[href*=monthly_sales]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=most_sold_products]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=most_shopping_customers]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void pages() {
        driver.findElement(By.cssSelector("a[href*=pages]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void orders() {
        driver.findElement(By.cssSelector("a[href*=orders]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=order_statuses]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void modules() {
        driver.findElement(By.cssSelector("a[href*=jobs]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-customer")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-shipping")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-payment")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-order")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-order_total")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void languages() {
        driver.findElement(By.cssSelector("a[href*=languages]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=storage_encoding]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void geoZones() {
        driver.findElement(By.cssSelector("a[href*=geo_zones]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void customers() {
        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-newsletter")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void currencies() {
        driver.findElement(By.cssSelector("a[href*=currencies]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void countries() {
        driver.findElement(By.cssSelector("a[href*=countries]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void catalog() {
        driver.findElement(By.cssSelector("a[href*=catalog]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=product_groups]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=option_groups]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=manufacturers]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=suppliers]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=delivery_statuses]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=sold_out_statuses]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=quantity_units]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=csv]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void appearance() {
        driver.findElement(By.cssSelector("a[href*=appearance]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=logotype]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    public void newCustomerCreation() {
        driver.get("http://litecart-2.0.1/");
        driver.findElement(By.cssSelector("#box-account-login a")).click();
        driver.findElement(By.cssSelector("[name=tax_id]")).sendKeys("1234567890");
        driver.findElement(By.cssSelector("[name=company]")).sendKeys("Some Company");
        driver.findElement(By.cssSelector("[name=firstname]")).sendKeys("Clark");
        driver.findElement(By.cssSelector("[name=lastname]")).sendKeys("Sant");
        driver.findElement(By.cssSelector("[name=address1]")).sendKeys("UA");
        driver.findElement(By.cssSelector("[name=address2]")).sendKeys("USA");
        driver.findElement(By.cssSelector("[name=postcode]")).sendKeys("04080");
        driver.findElement(By.cssSelector("[name=city]")).sendKeys("Kiev");
        driver.findElement(By.cssSelector("#box-create-account option:nth-child(227)")).click();
        driver.findElement(By.cssSelector("#box-create-account [data-type='email']")).sendKeys("piro@gmail.com");
        driver.findElement(By.cssSelector("#box-create-account [data-type='phone']")).sendKeys("+380930656360");
        driver.findElement(By.cssSelector("#box-create-account [data-type='password']")).sendKeys("password");
        driver.findElement(By.cssSelector("#box-create-account [name='confirmed_password']")).sendKeys("password");
        driver.findElement(By.cssSelector("#box-create-account [type='checkbox']")).click();
        driver.findElement(By.cssSelector("#box-create-account button")).click();
        driver.findElement(By.cssSelector("a[href*=logout]")).click();
        driver.findElement(By.cssSelector("#box-account-login [data-type='email']")).sendKeys("piro@gmail.com");
        driver.findElement(By.cssSelector("#box-account-login [data-type='password']")).sendKeys("password");
        driver.findElement(By.cssSelector("#box-account-login [value='Sign In']")).click();
        driver.findElement(By.cssSelector("a[href*=logout]")).click();
    }

    public void testYelowDuckForSizeAndPrice() {
        System.setProperty("selenide.browser", "Chrome");
        open("http://litecart-2.0.1/");
        //находим желтую утку и кликаем на нее, проверка по тексту Yellow Duck.
        $(By.cssSelector("[title*='Yellow Duck']")).pressEnter().shouldHave(text("Yellow Duck"));
        // ajax не подтягивает данные со страницы, по этому указываем на drop-menu размеров желаемой утки,
        // и перемещаемся клавишей ARROW_DOWN.
        $(By.cssSelector("#box-product select")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        // и кликаем на нужный размер.
        $(By.cssSelector("#box-product option:nth-child(2)")).shouldHave(value("Small")).click();
        // проверяем поле цены с указанием скидки ($18).
        $(By.cssSelector("#box-product strong")).shouldBe(visible).shouldHave(text("$18"));
        // чтобы изменить размер утки повторям предыдущую операцию.
        $(By.cssSelector("#box-product select")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        $(By.cssSelector("#box-product option:nth-child(3)")).shouldHave(value("Medium")).click();
        // проверяем цену на утку разрером Medium - $20.50.
        $(By.cssSelector("#box-product strong")).shouldBe(visible).shouldHave(text("$20.50"));
        //чтобы изменить размер утки на размер Large, повторям предыдущую операцию.
        $(By.cssSelector("#box-product select")).sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
        $(By.cssSelector("#box-product option:nth-child(4)")).shouldBe(visible).shouldHave(value("Large")).click();
        // проверяем цену на утку разрером Large - $23.
        $(By.cssSelector("#box-product strong")).shouldHave(text("$23"));
    }

    public void testAdminLoginAndAdminMenu() {
        login();
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
        settings();
        slides();
        tax();
        translation();
        users();
        vqmods();
    }
}
