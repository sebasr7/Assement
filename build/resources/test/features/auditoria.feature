@Auditoria
Feature: automatizar la auditoria de un analista

  @Repositorio

  Scenario: Existencia del repositorio
    Given que el "lider" ingresa en VSTS
    When busca el repositorio
    Then el deberia ver que si exista el repo


  @NombramientoRepo
  Scenario: Nombramiendo adecuado repositorio
    Given que el lider ingresa en VSTS
    When busca el repositori0
    Then el deberia ver que tenga el nombramiento adecuado
