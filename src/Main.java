import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.time.Duration;



// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");



        WebElement Lupa = driver.findElement(By.xpath("//*[@id=\"p-search\"]/a/span[1]"));
        Lupa.click();


        WebElement searchbox = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchform\"]/div/div/div[1]/input"))
        );
        searchbox.click();
        searchbox.sendKeys("Selenium");

        searchbox.submit();
    }

}
