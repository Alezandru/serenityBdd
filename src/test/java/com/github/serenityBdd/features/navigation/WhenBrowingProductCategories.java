package com.github.serenityBdd.features.navigation;

import com.github.serenityBdd.steps.NavigatingUser;
import com.github.serenityBdd.tasks.NavigateTo;
import com.github.serenityBdd.testData.TestData;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static com.github.serenityBdd.model.Category.*;
import static com.github.serenityBdd.testData.TestData.*;

@RunWith(SerenityRunner.class)
public class WhenBrowingProductCategories {
    @Steps
    NavigatingUser vasile;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigateToSportsCategory() {
        // Given
        vasile.isOnTheHomePage();
        // When
        vasile.navigatesToCategory(Sports);
        // Then
        vasile.shouldSeePageTitleContaining(SPORTS_CAT_PAGE_TITLE);
    }

    @Test
    public void shouldBeAbleToNavigateToMotorsCategory() {
        // GIVEN
        vasile.isOnTheHomePage();
        // WHEN
        vasile.navigatesToCategory(Motors);
        // THEN
        vasile.shouldSeePageTitleContaining(MOTORS_CAT_PAGE_TITLE);
    }
}
