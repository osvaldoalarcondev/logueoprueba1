package co.com.choucair.certification.academy.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target NAME_COURSE = Target.the("Extrae el nombre del curso").
            located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section[1]/div[2]/aside/section[2]/div/h5"));
}
