package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.*;
import pages.loginPage; // Corrija o nome do pacote e a classe conforme necessário
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loginPageSteps {

    public WebDriver driver;
    public loginPage loginPage;

    @Before
    public void setUp() {
        // Configurar o caminho do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PHX COMERCIAL\\Documents\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");

        // Configurar opções do ChromeDriver (opcional)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // Exemplo de argumento

        // Inicializar o ChromeDriver
        driver = new ChromeDriver(options);

        // Inicializar a página de login com o WebDriver
        loginPage = new loginPage();
    }

    @After
    public void tearDown() {
        // Fechar o navegador após os testes
        if (driver != null) {
            driver.quit();
        }
    }
    @Dado("que o usuario entre na pagina de login")
    public void que_o_usuario_entre_na_pagina_de_login() {
        loginPage.navigateTolinkedinpage();

    }
    @Quando("ele digitar as credenciais invalidas")
    public void ele_digitar_as_credenciais_invalidas() {

        loginPage.enterEmailInvalid(); // Exemplo de email invalido
        loginPage.enterPasswordInvalid(); // Exemplo de senha
        loginPage.buttonClick();
    }
    @Entao("Deve manter na tela")
    public void naodeve_logar_na_conta() {
        loginPage.verificandoNaologou();

    }

    @Dado("que o usuario entre na tela pra logar")
    public void que_o_usuario_entre_na_tela_pra_logar() {
        loginPage.navigateTolinkedinpage();

    }
    @Quando("ele digitar as credenciais validas")
    public void ele_digitar_as_credenciais_validas() {
        loginPage.enterValidEmail();
        loginPage.enterValidPassword();
        loginPage.buttonClick();

    }
    @Entao("Deve logar na conta")
    public void deve_logar_na_conta() {
       loginPage.verificarselogou();

    }

}
