@autor: Viviana Mora

Feature: Prueba del modulo Compra para aplicacion movil swaglabs

  Background:
    Given Que Viviana quiere abrir la aplicacion de swaglabs para realizar la compra de un producto
    And Diligencia el formulario para iniciar sesion en la aplicacion swaglabs
        | user          | pass   |
        | standard_user | secret_sauce |
  @HacerCompra
  Scenario Outline: Intento de compra de un producto

    When Encuentra el producto que desea
      | producto   | nombre   | apellido   | codigo   |
      | <producto> | <nombre> | <apellido> | <codigo> |
    Then Vera el mensaje de pago exitoso: <mensaje>

    Examples:
      | producto                          | nombre  | apellido | codigo  | mensaje     |
      | Camisa Test.allTheThings() (Roja) | Viviana | Mora     | 1113111 | COMPLETADO! |