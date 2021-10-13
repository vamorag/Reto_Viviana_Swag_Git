package com.choucair.moviles.app.interactions.choucair;

import com.choucair.moviles.app.interactions.choucair.Swipe;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;

    public class ScrollTarget implements Interaction {
        private final Target target;

        public ScrollTarget(Target target) {
            this.target = target;
        }

        public <T extends Actor> void performAs(T actor) {

                if (!this.target.resolveFor(actor).isCurrentlyVisible() ) {
                    actor.attemptsTo(Swipe.as(actor).fromBottom().toTop());
            }
        }
}
