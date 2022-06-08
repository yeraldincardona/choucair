package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.By;

import java.lang.annotation.Target;

public class formButton extends PageObject {

public static final Target form_button = Target.the("button that shows the form of inscription").
            located(By.xpath("//*[@id="unauthenticated-dropdown-nav"]/ul/li[6]/a "));

    public  static final Target form_name = Target.the("input to enter the name ").
            located(By.xpath("//*[@id=\"firstName\"]"));

    public  static final Target form_lasname = Target.the("input to enter the lastname").
            located(By.xpath("//*[@id=\"lastName\"] "));

    public  static final Target form_Email = Target.the("input to enter the email").
            located(By.xpath("//*[@id=\"email\"]"));

    public  static final Target Dateofbirth = Target.the("input to enter the Month").
            located(By.xpath("//*[@id=\"birthMonth\"]"));

    public  static final Target Dateofbirthday = Target.the("input to enter the day").
            located(By.xpath("//*[@id=\"birthDay\"]"));

    public  static final Target Dateofbirthano = Target.the("input to enter the ano").
            located(By.xpath("//*[@id=\"birthYear\"]"));

    public  static final Target Languages = Target.the("input to enter the Languages").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));

    public  static final Target city = Target.the("input to enter the city").
            located(By.xpath("//*[@id=\"city\"]"));

    public  static final Target postal = Target.the("input to enter the city").
            located(By.xpath("//*[@id=\"zip\"]"));

    public  static final Target country = Target.the("input to enter the country").
            located(By.xpath("//*[@id=\"zip\"]"));

    public  static final Target next = Target.the("input to enter the next").
            located(By.xpath(" //*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/i"));

    public  static final Target yourcomputer = Target.the("input to enter the yourcomputer").
            located(By.xpath(" //*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));


    public  static final Target version = Target.the("input to enter the version").
            located(By.xpath(" //*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span/span[2]"));

    public  static final Target languaje2 = Target.the("input to enter the languaje2 ").
            located(By.xpath(" //*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span/span[2]"));

    public  static final Target YourMobileDevice = Target.the("input to enter the  YourMobileDevice").
            located(By.xpath(" //*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));

    public  static final Target model = Target.the("input to enter the model").
            located(By.xpath(" //*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));

    public  static final Target OperatingSystem= Target.the("input to enter the OperatingSystem").
            located(By.xpath(" //*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public  static final Target next2= Target.the( "input to enter the next2").
            located(By.xpath(" //*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));

    public  static final Target createpassword= Target.the("input to enter the  createpassword").
            located(By.xpath(" //*[@id=\"password\"]"));

    public  static final Target confirmpassword= Target.the("input to enter the  confirmpassword").
            located(By.xpath(" //*[@id=\"confirmPassword\"]"));

    public  static final Target checkstayinformed= Target.the("input to enter the  checkstayinformed").
            located(By.xpath(" //*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/div[2]"));

    public  static final Target checkacepttermino = Target.the("input to enter the  checkacepttermino").
            located(By.xpath(" //*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label"));

    public  static final Target checkpolitica = Target.the("input to enter the  checkpolitica").
            located(By.xpath(" //*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label"));

    public  static final Target complete = Target.the("input to enter the  complete").
            located(By.xpath(" //*[@id=\"laddaBtn\"]/span"));
}
*/
