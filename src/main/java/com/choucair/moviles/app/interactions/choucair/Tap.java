package com.choucair.moviles.app.interactions.choucair;

import com.choucair.moviles.app.utils.Utils;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

public class Tap {
	
	public static TapByTarget on(Target target) {
		return Tasks.instrumented(TapByTarget.class, target);
	}
	
	public static TapByCoordinates on(int x, int y) {
		return Tasks.instrumented(TapByCoordinates.class, x, y);
	}

	public static TapByText on(String text) {
		return Tasks.instrumented(TapByText.class,Utils.UI_SELECTOR_TEXT_VERTICAL, text);
	}
	public static TapByElement on(WebElement element) {
		return Tasks.instrumented(TapByElement.class,element);
	}
}