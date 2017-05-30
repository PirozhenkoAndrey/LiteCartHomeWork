import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by piroz on 29.05.2017.
 */
public class LiteCartTest {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 50);
    }
    @Test
    public void testLiteCart() throws InterruptedException {
        driver.get("http://litecart-2.0.1/admin/");
        driver.findElement(By.cssSelector("[name=username]")).sendKeys("admin");
        driver.findElement(By.cssSelector("[name=password]")).sendKeys("admin");
        driver.findElement(By.cssSelector("#box-login button")).click();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("a[href*=appearance]")));
        //Appearance
        driver.findElement(By.cssSelector("a[href*=appearance]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=logotype]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Catalog
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
        //Countries
        driver.findElement(By.cssSelector("a[href*=countries]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Currencies
        driver.findElement(By.cssSelector("a[href*=currencies]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Customers
        driver.findElement(By.cssSelector("a[href*=customers]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-newsletter")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Geo Zones
        driver.findElement(By.cssSelector("a[href*=geo_zones]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Languages
        driver.findElement(By.cssSelector("a[href*=languages]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=storage_encoding]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Modules
        //probably bag with drop-list item position
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

//        driver.findElement(By.cssSelector("doc-jobs")).click();
//        driver.findElement(By.cssSelector("#main > h1"));
        //Orders
        driver.findElement(By.cssSelector("a[href*=orders]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=order_statuses]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Pages
        driver.findElement(By.cssSelector("a[href*=pages]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Reports
        driver.findElement(By.cssSelector("a[href*=monthly_sales]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=most_sold_products]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=most_shopping_customers]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Setings
        driver.findElement(By.cssSelector("a[href*=store_info]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

//        driver.findElement(By.cssSelector("#doc-store_info")).click();
//        driver.findElement(By.cssSelector("#main > h1"));

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
        //Slides
        driver.findElement(By.cssSelector("a[href*=slides]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Tax
        driver.findElement(By.cssSelector("a[href*=tax_rates]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=tax_classes]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Translation
        driver.findElement(By.cssSelector("a[href*=search]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("a[href*=scan]")).click();
        driver.findElement(By.cssSelector("#main > h1"));

        driver.findElement(By.cssSelector("#doc-csv")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //Users
        driver.findElement(By.cssSelector("a[href*=users]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
        //vQmods
        driver.findElement(By.cssSelector("a[href*=vqmods]")).click();
        driver.findElement(By.cssSelector("#main > h1"));
    }

    @After
    public void stop (){
       //driver.quit();
    }

}
