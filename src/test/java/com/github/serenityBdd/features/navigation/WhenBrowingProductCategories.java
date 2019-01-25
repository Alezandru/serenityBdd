package com.github.serenityBdd.features.navigation;

import com.github.serenityBdd.steps.NavigatingUser;
import com.github.serenityBdd.tasks.NavigateTo;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.github.serenityBdd.model.Category.Motors;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.GivenWhenThen.then;
import static net.serenitybdd.screenplay.GivenWhenThen.when;
import static org.hamcrest.Matchers.containsString;

@RunWith(SerenityRunner.class)
public class WhenBrowingProductCategories {

        @Steps
        NavigatingUser mark;

        @Managed
        WebDriver browser;

        @Test
        public void shouldBeAbleToNavigateToMotorsCategory(){
            // GIVEN
            mark.isOnTheHomePage();
            // WHEN
            mark.navigatesToCategory(Motors);
            // THEN
            mark.shouldSeePageTitleContaining("Parts and accessories");
        }

        @Test
        public void shouldBeAbleToViewMotorsCategory(){
            Actor mike = Actor.named("Mike");
            //GIVEN
            mike.can(BrowseTheWeb.with(browser));
            //WHEN
            when(mike).attemptsTo(NavigateTo.theCategory(Motors));
            //THEN
            then(mike).should(seeThat(TheWebPage.title(), containsString("Parts and accessories")));
        }
}
