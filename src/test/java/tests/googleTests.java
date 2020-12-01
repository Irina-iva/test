package tests;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class googleTests {
    private static WebDriver driver;
    private static SearchPage searchPage;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chromedriver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maxinixed");
        driver= new ChromeDriver(options);
        searchPage = new SearchPage(driver);
}

    @Test
    public void test1() {

    driver.get("http://google.com");
    searchPage.search( "selenium");
    assertEquals(9,searchPage.results.size());
    }


    @AfterAll
    public static void teardown() {
        driver.quit();
    }
}
