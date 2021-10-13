package com.choucair.moviles.app.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.choucair.moviles.app.ui.UIHome.LBL_PRODUCTO;

public class ValidaMensaje implements Question<Boolean> {

    private String mensaje;

    public ValidaMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ValidaMensaje conTexto(String mensaje) {
        return new ValidaMensaje(mensaje);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       actor.attemptsTo(
               WaitUntil.the(LBL_PRODUCTO,
               WebElementStateMatchers.isPresent()).forNoMoreThan(30).seconds()
       );
       return Text.of(LBL_PRODUCTO).viewedBy(actor).asString().contains(mensaje);
    }
}