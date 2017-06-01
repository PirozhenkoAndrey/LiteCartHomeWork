import org.junit.Test;
import org.openqa.selenium.By;

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
    public void TestTask2 (){
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

    @Test
    public void TestTask3 () {

    }

}
