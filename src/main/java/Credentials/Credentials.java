package Credentials;

public class Credentials {

    // Variáveis privadas para armazenar as credenciais válidas
    private String validEmail;
    private String validPassword;

    // Variáveis privadas para armazenar as credenciais inválidas
    private String invalidEmail;
    private String invalidPassword;

    // Construtor para inicializar as credenciais
    public Credentials(String validEmail, String validPassword, String invalidEmail, String invalidPassword) {
        this.validEmail = validEmail;
        this.validPassword = validPassword;
        this.invalidEmail = invalidEmail;
        this.invalidPassword = invalidPassword;
    }

    // Métodos getter para acessar as credenciais válidas
    public String getValidEmail() {
        return validEmail;
    }

    public String getValidPassword() {
        return validPassword;
    }

    // Métodos getter para acessar as credenciais inválidas
    public String getInvalidEmail() {
        return invalidEmail;
    }

    public String getInvalidPassword() {
        return invalidPassword;
    }

    // Métodos setter (opcional) se você precisar alterar as credenciais em tempo de execução
    public void setValidEmail(String validEmail) {
        this.validEmail = validEmail;
    }

    public void setValidPassword(String validPassword) {
        this.validPassword = validPassword;
    }

    public void setInvalidEmail(String invalidEmail) {
        this.invalidEmail = invalidEmail;
    }

    public void setInvalidPassword(String invalidPassword) {
        this.invalidPassword = invalidPassword;
    }
}
