import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        login("admin");
    }

    @After
    public void stop (){
       //driver.quit();
    }

    public void login(String admin) {
        driver.get("http://litecart-2.0.1/admin/");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys(admin);
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

    public void setings() {
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
}
