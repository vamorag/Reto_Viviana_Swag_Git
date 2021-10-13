package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIIngresarInformacion {

    public static final Target TXT_NOMBRE = Target.the("campo de texto del nobre").located(MobileBy.AccessibilityId("test-Nombre"));
    public static final Target TXT_APELLIDO = Target.the("campo de texto del apellido").located(MobileBy.AccessibilityId("test-Apellido"));
    public static final Target TXT_CODIGO = Target.the("campo de texto del codigo postal").located(MobileBy.AccessibilityId("test-Código postal"));
    public static final Target BTN_CONTINUAR = Target.the("Continuar comprando").located(MobileBy.AccessibilityId("test-CONTINUAR"));
    public static final Target BTN_TERMINAR = Target.the("Terminar la compra").located(MobileBy.AccessibilityId("test-TERMINAR"));
    public static final Target LBL_COMPLETADO = Target.the("Compra Exitosa").located(MobileBy.xpath("//*[@text='CHECKOUT: COMPLETADO!']"));
}
