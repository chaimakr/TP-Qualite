import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //WebDriverWait waiter = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.get("https://www.tunisianet.com.tn/");
        //waiter.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("_desktop_user_info")));
        Thread.sleep(5000);
        WebElement userButton = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
        userButton.click();
        Thread.sleep(8000);
        WebElement authentificationButton = driver.findElement(By.cssSelector("#_desktop_user_info > ul > li > a"));
        authentificationButton.click();
    }
}
