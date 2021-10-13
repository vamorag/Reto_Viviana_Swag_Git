package com.choucair.moviles.app.interactions.choucair;

import com.choucair.moviles.app.models.DatosCompraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.moviles.app.ui.UIIngresarInformacion.*;

public class IngresarInformacion implements Interaction {

    DatosCompraModel model;

    public IngresarInformacion(DatosCompraModel model) {
        this.model = model;
    }

    public static IngresarInformacion exitoso(DatosCompraModel model) {
        return Tasks.instrumented(IngresarInformacion.class,model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(model.getNombre()).into(TXT_NOMBRE),
                Enter.theValue(model.getApellido()).into(TXT_APELLIDO),
                Enter.theValue(model.getCodigo()).into(TXT_CODIGO),
                Tap.on(BTN_CONTINUAR),
                TakeScreenshot.asEvidence()
        );
    }
}