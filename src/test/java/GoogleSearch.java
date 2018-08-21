import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class GoogleSearch {

    @Step("Navigate to <https://www.google.com>")
    public void navigateTo(String url) {
        WebDriver driver = Driver.driver;
        driver.get(url);
    }

    @Step("Verify search button")
    public void verifySearchButton() {
        WebElement searchButton = Driver.driver.findElement(By.name("btnK"));
        searchButton.isDisplayed();
    }
}
