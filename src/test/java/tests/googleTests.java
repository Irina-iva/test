package tests;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTests {
@Test
    public void test1() {
   System.setProperty("webdriver.chromedriver", "src/test/resources/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://google.com");
    driver.quit();
    }
}
