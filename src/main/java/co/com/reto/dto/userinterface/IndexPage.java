package co.com.reto.dto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IndexPage {
    public static final Target BUTTON_DOCTOR = Target.the("DOCTOR'S APPOINTMENT BUTTON")
            .located(By.xpath("//*[contains(text(), 'Agregar Doctor')]"));
}