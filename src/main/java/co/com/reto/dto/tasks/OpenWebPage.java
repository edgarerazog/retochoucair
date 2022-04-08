package co.com.reto.dto.tasks;

import co.com.reto.dto.util.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWebPage implements Task {

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(Open.url(Constants.LINK_WEB_PAGE));

    }
    public static OpenWebPage openWebPage() {
        return instrumented(OpenWebPage.class);
    }
}
