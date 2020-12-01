package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.openqa.selenium.support.PageFactory.initElements;

public class SearchPage {
    @FindBy (css="input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy (css="#search .g")
    public List<WebElement> results;

    public SearchPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys( text, Keys.ENTER);
    }
}
