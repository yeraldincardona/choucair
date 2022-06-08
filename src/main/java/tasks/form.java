package tasks;

import javafx.concurrent.Task;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import userinterface.formButton;

public class form extends Task {
    public static form OnThePage(){
        return (formButton) Tasks.instrumented(form.class);
    }

    @Override
    public < T extends Actor> void performAs(T actor){

    }

    @Override
    protected Object call() throws Exception {
        return null;
    }
}*/
