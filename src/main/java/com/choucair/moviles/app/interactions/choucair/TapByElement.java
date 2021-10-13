package com.choucair.moviles.app.interactions.choucair;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

public class TapByElement implements Interaction {
        WebElement element;

        public TapByElement(WebElement element) {
            this.element = element;
        }

        @Step("{0} taps on element #atributo")
        public <T extends Actor> void performAs(T actor) {

            new TouchAction(GetDriver.as(actor).appiumDriver())
                    .tap(new TapOptions()
                            .withElement(new ElementOption()
                                    .withElement(element)))
                    .perform()
                    .release();
        }
}
