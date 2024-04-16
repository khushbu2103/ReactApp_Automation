package TestCases;

import ReactApp_Base.TestBase;
import ReactApp_Pages.HomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static ReactApp_Base.TestBase.initialization;
import static ReactApp_Base.TestBase.prop;

public class HomePageTest extends TestBase {
    HomePage homePage;
    @BeforeMethod
    public void setUp1()
    {
        initialization();
        homePage =new HomePage();
    }
    @Test
    public void searchBar_Test() throws InterruptedException {
        Thread.sleep(3000);
        homePage.searchBar(prop.getProperty("bookName"));
        Thread.sleep(3000);
    }
    @Test
    public void addToCartTest() throws InterruptedException {
        Thread.sleep(5000);
        homePage.searchBar(prop.getProperty("bookName"));
        Thread.sleep(3000);
//        JavascriptExecutor jsx = (JavascriptExecutor)driver;
//        Thread.sleep(7000);
//        jsx.executeScript("window.scrollBy(0,1000)");
        homePage.addToCart();
    }
}
