package co.com.reto.dto.tasks;

import co.com.reto.dto.userinterface.IndexPage;
import co.com.reto.dto.userinterface.IndexPagePaciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectPacientePage implements Task {


    @Override
    public  <T extends Actor> void performAs(T theActor ){
        theActor.attemptsTo(
                Click.on(IndexPagePaciente.BUTTON_PACIENTE)

        );
    }
    public static SelectPacientePage clickonPacientePage (){
        return instrumented(SelectPacientePage.class);
    }
}
