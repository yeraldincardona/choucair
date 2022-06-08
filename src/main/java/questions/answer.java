package questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class answer implements Question<Boolean> {
    private String question;

    public answer(String question){
        this.question = question;
    }
    public static Question<Boolean> tothe(String question) {
        return null;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        boolean result;
        String name = Text.of(formButton.form_button).viewedBy(actor).asstring();
        if (question.equals(form_button)){
            result = true;

        }
        else{
            result = false
        }

        return result;
    }
}
