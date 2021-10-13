package com.choucair.moviles.app.stepsdefinitios;

import com.choucair.moviles.app.exceptions.CompraException;
import com.choucair.moviles.app.models.DatosCompraModel;
import com.choucair.moviles.app.models.DatosLoginModel;
import com.choucair.moviles.app.questions.ValidaCompra;
import com.choucair.moviles.app.tasks.HaceCompra;
import com.choucair.moviles.app.tasks.RealizarLogin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraDefnitions {

    @When("^Encuentra el producto que desea$")
    public void compra_el_producto(List<DatosCompraModel> datos){
        theActorInTheSpotlight().attemptsTo(HaceCompra.exitoso(datos.get(0)));
    }

    @Then("^Vera el mensaje de pago exitoso: (.*)$")
    public void vera_el_mensaje_de_pago_exitoso(String mensaje){
        theActorInTheSpotlight().should(
                seeThat(ValidaCompra.conTexto(mensaje))
                        .orComplainWith(CompraException.class, CompraException.ErrorCompra()));
    }
}