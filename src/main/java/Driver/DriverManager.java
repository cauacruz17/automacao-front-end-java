package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
        // Evita a instância externa
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            // Defina o caminho para o ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\PHX COMERCIAL\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

            // Configurar opções do Chrome (opcional)
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized"); // Maximiza a janela

            // Inicializar o WebDriver
            driver = new ChromeDriver(options);
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}