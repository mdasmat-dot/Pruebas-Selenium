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

        driver.get("https://auth.wikimedia.org/eswiki/wiki/Especial:Crear_una_cuenta?useformat=desktop&usesul3=1&returnto=Selenium&centralauthLoginToken=8893a474fb57dbff9e099888a3484fc1");

        WebElement usuario = driver.findElement(By.id("wpName2"));
        usuario.sendKeys("usuario Automation");

        WebElement contraseña = driver.findElement(By.id("wpPassword2"));
        contraseña.sendKeys("contraseñaAutomation");

        WebElement contraseñar = driver.findElement(By.id("wpRetype"));
        contraseñar.sendKeys("contraseñaAutomation");

        WebElement correo = driver.findElement(By.id("wpEmail"));
        correo.sendKeys("correo1@gmail.com");


    }

}
