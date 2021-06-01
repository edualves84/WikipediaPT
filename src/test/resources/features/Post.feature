
  #Funcionalidade: Consulta

    #Cenario: Consultar ovo de pascoa

     # Dado que acesso a Wikipedia em portugues
     # Quando pesquiso por "ovo de pascoa"
     # Entao exibe a expressao "ovo de pascoa" no titulo da guia






   Feature: Consulta
   Scenario: Consultar ovo de pascoa

    Given que acesso a Wikipedia em portugues
    When pesquiso por "ovo de pascoa"
    Then exibe a expressao "ovo de pascoa" no titulo da guia

