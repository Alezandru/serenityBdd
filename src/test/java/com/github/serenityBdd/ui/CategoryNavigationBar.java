package com.github.serenityBdd.ui;

import com.github.serenityBdd.model.Category;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CategoryNavigationBar extends PageObject{

    public void selectCategory(Category category) {
        $("//*[@id=\"mainContent\"]/div[1]/ul").find(By.linkText(category.name())).click();
    }
}
