package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.Tap;
import com.choucair.moviles.app.models.DatosLoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.moviles.app.ui.UILogin.*;

public class RealizarLogin implements Task {

    DatosLoginModel model;

    public RealizarLogin(DatosLoginModel model) {
        this.model = model;
    }

    public static RealizarLogin exitosoConCredenciales(DatosLoginModel datosLoginModel) {
        return Tasks.instrumented(RealizarLogin.class,datosLoginModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(model.getUser()).into(TXT_USER),
                Enter.theValue(model.getPass()).into(TXT_PASS),
                Tap.on(BTN_LOGIN),
                TakeScreenshot.asEvidence()
        );
    }
}