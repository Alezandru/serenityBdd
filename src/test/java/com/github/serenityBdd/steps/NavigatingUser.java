package com.github.serenityBdd.steps;

import com.github.serenityBdd.model.Category;
import com.github.serenityBdd.ui.CategoryNavigationBar;
import com.github.serenityBdd.ui.CurrentPage;
import com.github.serenityBdd.ui.EbayHomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigatingUser {

    EbayHomePage ebayHomePage;
    CurrentPage currentPage;
    CategoryNavigationBar categoryNavigationBar;

    @Step
    public void isOnTheHomePage() {
        ebayHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {

        assertThat(currentPage.getTitle()).contains(expectedTitle);
    }

    @Step
    public void navigatesToCategory(Category category) {
        categoryNavigationBar.selectCategory(category);
    }

}
