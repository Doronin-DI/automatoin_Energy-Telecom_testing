import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","D:\\job\\automation\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("http://www.energy-telecom.portnov.com/qa/");


        WebElement firstName= driver.findElement(By.xpath("//input[@name='firstName']"));
        WebElement lastName= driver.findElement(By.xpath("//input[@name='lastName']"));
        WebElement address= driver.findElement(By.xpath("//input[@name='address']"));
        WebElement city= driver.findElement(By.xpath("//input[@name='city']"));
        WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
        WebElement state= driver.findElement(By.xpath("//option[@value='NY']"));
        WebElement zip = driver.findElement(By.xpath("//input[@name='zip']"));
        WebElement phone1 = driver.findElement(By.xpath("//input[@name='phone1']"));
        WebElement phone2 = driver.findElement(By.xpath("//input[@name='phone2']"));
        WebElement phone3 = driver.findElement(By.xpath("//input[@name='phone3']"));
        WebElement contact = driver.findElement(By.xpath("//option[@value='Phone']"));
        WebElement refferedBy = driver.findElement(By.xpath("//input[@name='refferedBy']"));
        WebElement submit= driver.findElement(By.xpath("//input[@name='submitData']"));

        firstName.sendKeys("Dmitrii");
        lastName.sendKeys("Doronin");
        address.sendKeys("Elm, 32");
        city.sendKeys("Tokio");
        zip.sendKeys("56645");
        email.sendKeys("Doronin@gmail.com");
        phone1.sendKeys("456");
        phone2.sendKeys("362");
        phone3.sendKeys("2525");
        refferedBy.sendKeys("Obama B");

        contact.click();
        state.click();
        submit.click();

        WebElement finish= driver.findElement(By.xpath("//font['Thank you for your participation!']"));

            System.out.println(finish.getText());

            driver.navigate().back();

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,-1950)", "");

    }
}