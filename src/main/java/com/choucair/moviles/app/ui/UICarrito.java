package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UICarrito {

    public static final Target BTN_CARRITO = Target.the("Ingresar al Carrito").located(MobileBy.AccessibilityId("test-Carrito"));
    public static final Target BTN_CHECKOUT = Target.the("Hacer checkout").located(MobileBy.AccessibilityId("test-CHECKOUT"));
}
