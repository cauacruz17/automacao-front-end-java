#language: pt

Funcionalidade: : Login

  Cenario: Login falhou
    Dado que o usuario entre na pagina de login
    Quando ele digitar as credenciais invalidas
    Entao Deve manter na tela

    Cenario: Login sucesso
      Dado que o usuario entre na tela pra logar
      Quando ele digitar as credenciais validas
      Entao Deve logar na conta
