package co.com.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddDoctorPage {
    public static final Target ADD_DOCTOR_NAME = Target.the("DOCTOR'S APPOINTMENT BUTTON")
            .located(By.id("name"));

    public static final Target ADD_DOCTOR_LASTNAME= Target.the( "DOCTOR LASTNAME")
            .located(By.id("last_name"));
    public static final Target ADD_DOCTOR_TELEPHONE= Target.the( "DOCTOR TELEPHONE")
            .located(By.id("telephone"));
    public static final Target ADD_DOCTOR_IDENTIFICATION= Target.the( "DOCTOR IDENTIFICATION")
            .located(By.id("identification"));
    public static final Target BUTTON_DOCTOR_FINISH = Target.the("DOCTOR'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Guardar')]"));
    public static final Target BUTTON_DOCTOR_INICIO = Target.the("DOCTOR´S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Inicio')]"));
}
