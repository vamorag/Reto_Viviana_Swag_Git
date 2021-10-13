package com.choucair.moviles.app.tasks;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

public class AbreLaApp implements Task {

    public AbreLaApp(){}

    public static AbreLaApp swaglabs(){
        return Tasks.instrumented(AbreLaApp.class);
    }

    @Override
    @Step("App SwagLabs abierta")
    public <T extends Actor> void performAs(T actor) {
           actor.attemptsTo(
                   TakeScreenshot.asEvidence()
           );
    }
}