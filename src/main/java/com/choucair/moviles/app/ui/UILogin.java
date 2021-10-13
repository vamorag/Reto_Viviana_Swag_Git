package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UILogin {

    public static final Target TXT_USER = Target.the("campo de texto del usuario").located(MobileBy.AccessibilityId("test-Usuario"));
    public static final Target TXT_PASS = Target.the("campo de texto de la contraseña").located(MobileBy.AccessibilityId("test-Contraseña"));
    public static final Target BTN_LOGIN = Target.the("Boton de login").located(MobileBy.AccessibilityId("test-LOGIN"));
}
