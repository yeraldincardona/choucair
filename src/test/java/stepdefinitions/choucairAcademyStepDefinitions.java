package stepdefinitions;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.Answer;
import questions.answer;
import tasks.OpenUp;
import tasks.Search;


public class choucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Pedro wants to register today in https://utest.com/$")
    public void pedroWantsToRegisterTodayInHttpsUtestCom() {
     OnStage.theActorCalled("Pedro").wasAbleTo(OpenUp.thePage());
    }

    @When("^he seeks to earn money by learning new skills$")
    public void heSeeksToEarnMoneyByLearningNewSkills(String inscription) {
       OnStage.theActorInTheSpotlight().attemptsTo(Search.the(inscription));
    }

    @Then("^he finds how to register by pressing the button becomes a tester(.*)$")
    public void heFindsHowToRegisterByPressingTheButtonBecomesATester(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(answer.tothe(question)));
    }

}
