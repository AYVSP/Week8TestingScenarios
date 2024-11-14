package registration_form_validation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Name_Email_PasswordCheck {
    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the registration page
        driver.get("https://authv2.prestashop.com/register");

        // Initialize WebDriverWait with a 5-second timeout
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Wait for the First name field to be visible and enter a value
        WebElement Firstname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
        Firstname.sendKeys("Ayobami");

        // Wait for the Last name field to be visible and enter a value
        WebElement Lastname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastname")));
        Lastname.sendKeys("Adebowale");

        // Wait for the Email field to be visible and enter a value
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailField.sendKeys("joyman@yopmail.com");

        // Wait for the Password field to be visible and enter a value
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passwordField.sendKeys("Joyman_0590");
    }
}