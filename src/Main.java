import org.jspecify.annotations.Nullable;
import org.openqa.selenium.*;
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

        driver.get("https://onecompiler.com/html/3xfmfsrwk");

        WebElement alertabutton = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[1]/div[3]/div/button[3]"));

        alertabutton.click();

        WebDriverWait esperar = new WebDriverWait(driver, Duration.ofSeconds(10));
        esperar.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();


    }

}
