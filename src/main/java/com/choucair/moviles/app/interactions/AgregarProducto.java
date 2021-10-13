package com.choucair.moviles.app.interactions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.Tap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static com.choucair.moviles.app.ui.UIAgregarProducto.BTN_AGREGAR;
import static com.choucair.moviles.app.ui.UIAgregarProducto.BTN_REGRESAR;

public class AgregarProducto implements Interaction {

    String producto;

    public AgregarProducto(String producto) {
        this.producto = producto;
    }

    public static AgregarProducto exitoso(String producto) {
        return Tasks.instrumented(AgregarProducto.class,producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Tap.on(producto),
                Tap.on(BTN_AGREGAR),
                Tap.on(BTN_REGRESAR),
                TakeScreenshot.asEvidence()
        );
    }
}