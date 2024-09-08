package pages;

import Credentials.Credentials;
import Driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class loginPage {


    private WebDriver driver;

    // Localizadores
    private By searchBox = By.id("username");
    private By passwordBox = By.id("password");
    private By buttonEnter = By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button");
    private By verification = By.id("error-for-password");
    private By verificarLogar = By.id("launchpadV2-title");

    private Credentials credentials;



    // Construtor
    public loginPage() {
        this.driver = DriverManager.getDriver(); // Obtém o WebDriver do DriverManager
        PageFactory.initElements(driver, this);// Inicializa os elementos da página
        this.credentials = new Credentials(
                "4qatestercau@gmail.com",     // E-mail válido
                "P+LbNw@fee7G8@R",            // Senha válida
                "invalid.email@example.com",   // E-mail inválido
                "invalidPassword"              // Senha inválida
        );
    }

    // Métodos de ação
    public void navigateTolinkedinpage() {
        driver.get("https://linkedin.com/login/pt"); // Navega para a página de login do LinkedIn
    }

    public void enterEmailInvalid() {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(credentials.getInvalidEmail()); // Insere o e-mail
    }

    public void enterPasswordInvalid() {
        WebElement passwordInput = driver.findElement(passwordBox);
        passwordInput.sendKeys(credentials.getInvalidPassword()); // Insere a senha
    }

    public void buttonClick() {
        WebElement button = driver.findElement(buttonEnter);
        button.click(); // Clica no botão de login
    }


    public void enterValidEmail() {
        WebElement searchInput = driver.findElement(searchBox);
        searchInput.sendKeys(credentials.getValidEmail()); // Usando o e-mail válido das credenciais
    }

    public void enterValidPassword() {
        WebElement passwordInput = driver.findElement(passwordBox);
        passwordInput.sendKeys(credentials.getValidPassword()); // Usando a senha válida das credenciais
    }

    public void verificandoNaologou() {

       String currentUrl = driver.getCurrentUrl();
       if (currentUrl != "https://www.linkedin.com/feed/"){
           System.out.println("Não logado com sucesso a url é diferente de: " + currentUrl);
       }

    }

    public void verificarselogou(){
        WebElement verificandoselogou = driver.findElement(verificarLogar);
        System.out.println("Texto encontrado: " + verificandoselogou.getText());

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.linkedin.com/feed/";

        if (currentUrl.equals(expectedUrl)) {
            System.out.println("Logado");
        }

    }
    }
