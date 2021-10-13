@author: Viviana Mora

Feature: Prueba del modulo login para aplicacion movil swaglabs

  @HaceLogin
  Scenario Outline: Intento de login exitoso en swaglabs

    Given Que Viviana quiere abrir la aplicacion de swaglabs para realizar la compra de un producto
    When Diligencia el formulario para iniciar sesion en la aplicacion swaglabs
      | user   | pass   |
      | <user> | <pass> |
    Then Vera los productos en pantalla: <mensaje>

    Examples:
      | user          | pass         |mensaje|
      | standard_user | secret_sauce |PRODUCTOS|