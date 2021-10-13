package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIAgregarProducto {

    public static final Target BTN_AGREGAR = Target.the("Agregar al Carrito").located(MobileBy.AccessibilityId("test-AÑADIR A CARRITO"));
    public static final Target BTN_REGRESAR = Target.the("Regresar a la pantalla Productos").located(MobileBy.AccessibilityId("test-REGRESO A PRODUCTOS"));
}

