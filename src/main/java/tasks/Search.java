package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Search implements Task {
    public static Search the(String inscription) {
        return Tasks.instrumented(Search.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
