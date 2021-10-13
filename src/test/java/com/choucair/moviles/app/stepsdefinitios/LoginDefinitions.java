package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.models.DatosLoginModel;
import com.choucair.moviles.app.questions.ValidaMensaje;
import com.choucair.moviles.app.tasks.AbreLaApp;
import com.choucair.moviles.app.tasks.RealizarLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginDefinitions {

    @Given("^Que (.*) quiere abrir la aplicacion de swaglabs para realizar la compra de un producto$")
    public void abrirSwaglabs (String actor){
        theActorCalled(actor).wasAbleTo(AbreLaApp.swaglabs());
    }

    @When("^Diligencia el formulario para iniciar sesion en la aplicacion swaglabs$")
    public void ingresar(List<DatosLoginModel> datos){
        theActorInTheSpotlight().attemptsTo(RealizarLogin.exitosoConCredenciales(datos.get(0)));
    }

    @Then("^Vera los productos en pantalla: (.*)$")
    public void verficarPantalla(String mensaje){
        theActorInTheSpotlight().should(
                seeThat(ValidaMensaje.conTexto(mensaje)));
    }
}