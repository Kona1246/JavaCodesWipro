package DemoWebShop;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class Practice_DemoShop {
    private WebDriver driver;
    private WebDriverWait wait;
    private final String baseUrl = "https://demowebshop.tricentis.com/";
    private final String email = "marval01@gmail.com"; // Change or randomize to avoid duplicate registration
    private final String password = "IronMan";

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver(); // Chrome will open automatically with Selenium Manager
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get(baseUrl);
    }

    @Test(priority = 1)
    public void testRegister() {
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-male")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Tony");
        driver.findElement(By.id("LastName")).sendKeys("Stark");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(password);
        driver.findElement(By.id("register-button")).click();

        try {
            WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("result")));
            Assert.assertTrue(result.getText().contains("Your registration completed"));
            driver.findElement(By.linkText("Log out")).click();
        } catch (TimeoutException e) {
            // If email already exists, skip registration
            driver.findElement(By.linkText("Log in")).click();
            driver.findElement(By.id("Email")).sendKeys(email);
            driver.findElement(By.id("Password")).sendKeys(password);
            driver.findElement(By.cssSelector("input.button-1.login-button")).click();
        }
    }

    @Test(priority = 2)
    public void testLoginAndLogout() {
        if (!driver.findElements(By.linkText("Log out")).isEmpty()) {
            driver.findElement(By.linkText("Log out")).click();
        }
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        Assert.assertTrue(driver.findElement(By.linkText("Log out")).isDisplayed());

        driver.findElement(By.linkText("Log out")).click();
        Assert.assertTrue(driver.findElement(By.linkText("Log in")).isDisplayed());
    }

    @Test(priority = 3)
    public void testJewelrySectionAndAddToCart() {
        // Login first
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.cssSelector("input.button-1.login-button")).click();

        // Navigate to Jewelry section
        driver.findElement(By.linkText("Jewelry")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry"));

        // Find all "Add to cart" buttons
        List<WebElement> addToCartButtons = driver.findElements(By.cssSelector("input[value='Add to cart']"));

        for (WebElement button : addToCartButtons) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", button);
            wait.until(ExpectedConditions.elementToBeClickable(button)).click();

            // Wait for success notification
            WebElement notif = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bar-notification.success")));
            Assert.assertTrue(notif.getText().contains("The product has been added"));

            // Close notification before next click
            WebElement closeBtn = notif.findElement(By.cssSelector(".close"));
            closeBtn.click();
            wait.until(ExpectedConditions.invisibilityOf(notif));
        }
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}