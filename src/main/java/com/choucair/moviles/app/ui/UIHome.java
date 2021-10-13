package com.choucair.moviles.app.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class UIHome {

    public static final Target LBL_PRODUCTO = Target.the("Label Productos").located(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Zona de caída del carrito de compras\"]/android.view.ViewGroup/android.widget.TextView\n"));
}
