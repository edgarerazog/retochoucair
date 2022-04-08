package co.com.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddPacientePage {
    public static final Target ADD_PACIENTE_NAME = Target.the("PACIENTE'S APPOINTMENT BUTTON")
            .located(By.name("name"));

    public static final Target ADD_PACIENTE_LASTNAME = Target.the( "PACIENTE LASTNAME")
            .located(By.name("last_name"));
    public static final Target ADD_PACIENTE_TELEPHONE = Target.the( "PACIENTE TELEPHONE")
            .located(By.name("telephone"));
    public static final Target ADD_PACIENTE_IDENTIFICATION = Target.the( "PACIENTE IDENTIFICATION")
            .located(By.name("identification"));
    public static final Target CLICK_PACIENTE_SALUD = Target.the("Salud click")
            .located(By.name("prepaid"));
    public static final Target BUTTON_PACIENTE_FINISH = Target.the("PACIENTE'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Guardar')]"));
    public static final Target BUTTON_PACIENTE_INICIO = Target.the("PACIENTE´S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Inicio')]"));

}
