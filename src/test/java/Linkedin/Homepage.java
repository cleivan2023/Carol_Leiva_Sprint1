package Falabella;

import org.openqa.selenium.By; //Estrategias de busqueda
import org.openqa.selenium.JavascriptExecutor; //Scroll
import org.openqa.selenium.WebDriver; //Manejador del driver
import org.openqa.selenium.WebElement; //Elementos Web (ej boton)
import org.openqa.selenium.chrome.ChromeDriver; //Instancia del driver de Chrome
import org.openqa.selenium.support.ui.Select; //DDL

import java.util.List;

public class Homepage {
    public static void main(String[] args) throws InterruptedException {
        //obtencion de ruta del proyecto
        String rutaProyecto = System.getProperty("user.dir");

        //obtencion de ruta del driver
        String rutaDriver = rutaProyecto +
                "\\src\\test\\resources\\Drivers\\Chromedriver.exe";

        //Enrutar al driver con el browser
        System.setProperty("webdriver.chrome.driver",rutaDriver);

        //creacion de objeto tipo driver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.linkedin.com/");

        //muestra la pantalla completa
        driver.manage().window().maximize();
        //espera

        Thread.sleep(3000);

        //Objeto de tipo Elemento Web
        WebElement btnUnirseahora = driver.findElement(By.linkText("Unirse ahora"));

        btnUnirseahora.click();
        Thread.sleep(3000);


        // Introducir el correo electrónico

        driver.findElement(By.id("email-address")).sendKeys("prueba12345@gmail.com");

        //crea uan contraseña
        driver.findElement(By.id("password")).sendKeys("1234567");

        //Boton Registrate
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //button[@id='join-form-submit']

    }
}
