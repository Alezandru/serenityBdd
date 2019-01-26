package com.github.serenityBdd.features.navigation.screenPlayPattern;

import com.github.serenityBdd.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.github.serenityBdd.testData.TestData.*;
import static com.github.serenityBdd.model.Category.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class WhenBrowingProductCategories {

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToViewMotorsCategory() {
        Actor vasile = Actor.named("Vasile");
        //GIVEN
        vasile.can(BrowseTheWeb.with(browser));
        when(vasile).attemptsTo(NavigateTo.theCategory(Motors));
        then(vasile).should(seeThat(TheWebPage.title(), containsString(MOTORS_CAT_PAGE_TITLE)));
    }

    @Test
    public void shouldBeAbleToViewSportsCategory() {
        Actor vasile = Actor.named("Vasile");
        // Given
        vasile.can(BrowseTheWeb.with(browser));
        when(vasile).attemptsTo(NavigateTo.theCategory(Sports));
        then(vasile).should(seeThat(TheWebPage.title(), containsString(SPORTS_CAT_PAGE_TITLE)));
    }

}
