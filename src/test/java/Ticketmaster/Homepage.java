package Linkedin;

import org.openqa.selenium.By; //Estrategias de busqueda
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver; //Manejador del driver
import org.openqa.selenium.WebElement; //Elementos Web (ej boton)
import org.openqa.selenium.chrome.ChromeDriver; //Instancia del driver de Chrome
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

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

        WebDriverWait wait = new WebDriverWait(driver,6);

        driver.get("https://www.ticketmaster.cl/");

        //muestra la pantalla completa
        driver.manage().window().maximize();

        //Ingresar / Registrarse

        WebElement btnIngresarRegistrarse =
                driver.findElement(By.xpath("//a[contains(text(),'Ingresar / Registrarse')]"));

        btnIngresarRegistrarse.click();

        Thread.sleep(4000);

        //Registrarte ahora
        WebElement btnRegistrateahora =
                driver.findElement(By.xpath("//a[contains(text(),'Registrate ahora')]"));

        btnRegistrateahora.click();

        Thread.sleep(4000);

        // Introducir datos

        driver.findElement(By.id("email")).sendKeys("frueba_carol12345@gmail.com");

        //crea uan contraseña
        driver.findElement(By.id("password")).sendKeys("Farol123$");

        //repetir contraseña
        driver.findElement(By.id("passwordConfirm")).sendKeys("Farol123$");

        //nombre
        driver.findElement(By.id("firstName")).sendKeys("Familo");

        //Apellido
        driver.findElement(By.id("lastName")).sendKeys("Teiva");

        //Pais
        Select selectorPais = new Select(driver.findElement(By.name("country")));

        selectorPais.selectByVisibleText("Chile");

        //Telefono
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("940601010");

        //Rut
        driver.findElement(By.xpath("//input[@id='dni']")).sendKeys("15372165-3");

        //Nacimiento

        driver.findElement(By.xpath("//input[@id='birthDate']")).sendKeys("01/02/1991");

        //ejecutar el Scroll
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Boton Registrate
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);

        //Si el registro es exitoso, Continuar
        WebElement btnContinuar = driver.findElement(By.xpath("//*[@id='ok']"));
        btnContinuar.click();






    }
}
