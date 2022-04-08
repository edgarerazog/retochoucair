package co.com.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPatientPage {
    public static final Target ADD_PATIENT_NAME = Target.the("Patient's Name")
            .located(By.xpath("//input[@name='name']"));
    public static final Target ADD_PATIENT_LASTNAME = Target.the( "Patient LASTNAME")
            .located(By.name("last_name"));
    public static final Target ADD_PATIENT_TELEPHONE = Target.the( "Patient TELEPHONE")
            .located(By.name("telephone"));
    public static final Target ADD_PATIENT_IDENTIFICATION = Target.the( "Patient IDENTIFICATION")
            .located(By.name("identification"));
    public static final Target CLICK_PATIENT_SALUD = Target.the("Salud click")
            .located(By.name("prepaid"));
    public static final Target BUTTON_PATIENT_FINISH = Target.the("PACIENTE'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Guardar')]"));
    public static final Target BUTTON_PATIENT_INICIO = Target.the("PACIENTE´S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Inicio')]"));
}
