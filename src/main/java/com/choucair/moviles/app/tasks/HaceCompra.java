package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.AgregarProducto;
import com.choucair.moviles.app.interactions.choucair.IngresarInformacion;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.choucair.moviles.app.interactions.choucair.Tap;
import com.choucair.moviles.app.models.DatosCompraModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import static com.choucair.moviles.app.ui.UICarrito.BTN_CARRITO;
import static com.choucair.moviles.app.ui.UICarrito.BTN_CHECKOUT;
import static com.choucair.moviles.app.ui.UIIngresarInformacion.BTN_TERMINAR;

public class HaceCompra implements Task {

    DatosCompraModel datosCompraModel;

    public static HaceCompra exitoso(DatosCompraModel datosCompraModel) {
        return Tasks.instrumented(HaceCompra.class,datosCompraModel);
    }

    public HaceCompra(DatosCompraModel datosCompraModel) {
        this.datosCompraModel = datosCompraModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AgregarProducto.exitoso(datosCompraModel.getProducto()),
                Tap.on(BTN_CARRITO),
                Tap.on(BTN_CHECKOUT),
                TakeScreenshot.asEvidence(),
                IngresarInformacion.exitoso(datosCompraModel),
                Tap.on(BTN_TERMINAR)
        );
    }
}