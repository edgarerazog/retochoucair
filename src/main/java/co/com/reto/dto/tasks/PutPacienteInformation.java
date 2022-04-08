package co.com.reto.dto.tasks;

import co.com.reto.dto.model.Doctor;
import co.com.reto.dto.model.Paciente;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.reto.dto.userinterface.AddPacientePage.*;
import static co.com.reto.dto.userinterface.AddPacientePage.BUTTON_PACIENTE_INICIO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutPacienteInformation implements Task {
    private Paciente paciente;

    public PutPacienteInformation(Paciente paciente) {
        this.paciente = paciente;
    }
List<List<String>>data.
    @Override
    public <T extends Actor> void performAs(T theActor){
        String namePaciente = paciente.getName(); ;
        String lastNamePaciente = paciente.getLastname();
        String telephonePaciente = paciente.getTelephone();
        double num = Math.random()*100;
        String id=String.valueOf(num);
        theActor.attemptsTo(
                Enter.theValue(namePaciente).into(ADD_PACIENTE_NAME),
                Enter.theValue(lastNamePaciente).into(ADD_PACIENTE_LASTNAME),
                Enter.theValue(telephonePaciente).into(ADD_PACIENTE_TELEPHONE),
                Enter.theValue(id).into(ADD_PACIENTE_IDENTIFICATION),
                Click.on(CLICK_PACIENTE_SALUD),
                Click.on(BUTTON_PACIENTE_FINISH),
                Click.on(BUTTON_PACIENTE_INICIO)
        );
    }


    public static PutPacienteInformation putPacienteInformation(Paciente paciente){ return instrumented(PutPacienteInformation.class, paciente); }
}
