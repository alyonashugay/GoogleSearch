import com.gargoylesoftware.htmlunit.html.DomNode;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;


public class GoogleSearch {

    public DomNode luckyButton;

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

    @Step("Verify Lucky button")
    public void verifyLuckyButton() {
        WebElement luckyButton = Driver.driver.findElement(By.name("btnI"));
        luckyButton.isDisplayed();

    }

    @Step("Enter <Hello World> in search field")
    public void enterText(String text) throws InterruptedException {
        WebElement searchField = Driver.driver.findElement(By.name("q"));
        searchField.sendKeys(text);
        searchField.submit();
        Thread.sleep(2000);

    }
}
