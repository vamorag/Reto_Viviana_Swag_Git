package com.choucair.moviles.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.moviles.app.ui.UIIngresarInformacion.LBL_COMPLETADO;

public class ValidaCompra implements Question<Boolean> {

    private String mensaje;

    public ValidaCompra(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ValidaCompra conTexto(String mensaje) {
        return new ValidaCompra(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
            WaitUntil.the(LBL_COMPLETADO,
            WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds()
        );
        return Text.of(LBL_COMPLETADO).viewedBy(actor).asString().contains(mensaje);
    }
}