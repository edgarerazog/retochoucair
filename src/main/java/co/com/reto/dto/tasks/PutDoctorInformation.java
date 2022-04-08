package co.com.reto.dto.tasks;

import co.com.reto.dto.model.Doctor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


import static co.com.reto.dto.userinterface.AddDoctorPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PutDoctorInformation implements Task {
    private Doctor doctor;

    public PutDoctorInformation(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public <T extends Actor> void performAs(T theActor){
        String nameDoctor = doctor.getName(); ;
        String lastNameDoctor = doctor.getLastname();
        String telephoneDoctor= doctor.getTelephone();
        double num = Math.random()*100;
        String id=String.valueOf(num);
        theActor.attemptsTo(
                Enter.theValue(nameDoctor).into(ADD_DOCTOR_NAME),
                Enter.theValue(lastNameDoctor).into(ADD_DOCTOR_LASTNAME),
                Enter.theValue(telephoneDoctor).into(ADD_DOCTOR_TELEPHONE),
                Enter.theValue(id).into(ADD_DOCTOR_IDENTIFICATION),
                Click.on(BUTTON_DOCTOR_FINISH),
                Click.on(BUTTON_DOCTOR_INICIO)
        );
    }


    public static PutDoctorInformation putDoctorInformation(Doctor doctor){ return instrumented(PutDoctorInformation.class, doctor); }
}
