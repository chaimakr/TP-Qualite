import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        // go to tunisianet
        driver.get("https://www.tunisianet.com.tn/");
        Thread.sleep(5000);

        // select the authentification icon
        WebElement userButton = driver.findElement(By.cssSelector("#_desktop_user_info > div > div > svg"));
        userButton.click();
        Thread.sleep(3000);

        // open the dropdown
        WebElement authentificationdropdown = driver.findElement(By.cssSelector("#_desktop_user_info > ul > li > a"));
        authentificationdropdown.click();
        Thread.sleep(3000);


        //fill the authentification form
        WebElement emailInput = driver.findElement(By.cssSelector(".form-group > div > input"));
        emailInput.sendKeys("chaima050@gmail.com");
        Thread.sleep(3000);

        WebElement passwordInput = driver.findElement(By.cssSelector(".form-group > div > div > input"));
        passwordInput.sendKeys("Selenium");
        Thread.sleep(3000);

        // sign in
        WebElement submitButton = driver.findElement(By.id("submit-login"));
        submitButton.click();
        Thread.sleep(3000);

        // search product
        WebElement searchInput = driver.findElement(By.className("search_query"));
        searchInput.sendKeys("laptop PC portable MacBook M1 13.3 ");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.cssSelector("#sp-btn-search > button"));
        searchButton.click();
        Thread.sleep(1000);

        List<WebElement> productsTitleList = driver.findElements(By.className("product-title"));
        productsTitleList.get(0).click();
        Thread.sleep(2000);

        // finish the purchase process
        WebElement addProductButton = driver.findElement(By.className("add-to-cart"));
        addProductButton.click();
        Thread.sleep(1000);

        WebElement orderButton = driver.findElement(By.cssSelector("a.btn-block"));
        orderButton.click();
        Thread.sleep(1000);

    }
}
