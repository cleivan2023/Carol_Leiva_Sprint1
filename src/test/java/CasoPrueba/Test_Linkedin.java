package Linkedin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.StandardCharsets;
import java.util.List;
public class Test_Linkedin {
    private WebDriver driver;

    @BeforeEach
    public void preCondiciones() {
        //Parametriza la ruta del driver
        String rutaDriver = "C:\\Users\\carol.leiva\\Desktop\\BC14\\app\\src\\test\\resources\\Drivers\\chromedriver.exe";

        //Enlazar el Webdriver de Chrome al browser
        System.setProperty("webdriver.chrome.driver", rutaDriver);

        //Instanciar un objeto de tipo webdriver de google Chrome
        driver = new ChromeDriver(); //Levanta el browser

        driver.manage().window().maximize();

        driver.get("https://www.linkedin.com"); //cargar el browser
    }

    @AfterEach
    public void posCondiciones() {
        driver.quit(); //se cierra el browser
    }

    @Test
    public void CP001_creacion_cta_linkedin() throws InterruptedException {
        // Abrir la página de LinkedIn
        driver.get("https://www.linkedin.com");


        // Hacer clic en "Unirse ahora"
        WebElement joinNowButton = driver.findElement(By.xpath("//a[text()='Unirse ahora']"));
        joinNowButton.click();;

        // Esperar a que se cargue la página de registro
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

        // Rellenar el formulario de registro

        //driver.findElement(By.id("email-address")).sendKeys("prueba12345@gmail.com");

        //crea uan contraseña
        //driver.findElement(By.id("password")).sendKeys("1234567");

        //Boton Registrate
        //driver.findElement(By.xpath("//button[@type='submit']")).click();



    }
}
