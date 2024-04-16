package ReactApp_Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;

import java.time.Duration;

import static ReactApp_Base.TestBase.driver;

public class HomePage {
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/main/div[2]/div/div/div/input")
    WebElement searchbar;
    @FindBy(xpath = "/html/body/div/div/div/main/div[4]/div[2]/div/div/div[2]/button")
    WebElement addCart;

    public HomePage()
    {
        PageFactory.initElements(driver, this);
    }
    public void searchBar(String s) {
        searchbar.sendKeys(s);
    }
    public void addToCart() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//        // Scroll the element into view
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(true);", addCart);
//
//        // Wait for the element to be clickable
//        WebElement addCartButton = wait.until(ExpectedConditions.elementToBeClickable(addCart));
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(5000);
        // Click the element
        addCart.click();
    }
}
