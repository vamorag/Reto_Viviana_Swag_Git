package com.choucair.moviles.app.interactions.choucair;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;

public class TapByText implements Interaction {
    private final String atributo;
    private final String selector;

    public TapByText(String selector, String atributo) {
        this.selector = selector;
        this.atributo = atributo;
    }

    @Step("{0} scrolled to (#atributo)")
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo((Performable) Tap.on(GetDriver.as(actor).androidDriver().findElementByAndroidUIAutomator(String.format(selector, atributo))));
        }

}

