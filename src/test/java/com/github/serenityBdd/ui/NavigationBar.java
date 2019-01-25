package com.github.serenityBdd.ui;

import com.github.serenityBdd.model.Category;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBar {
    public static Target category(Category category) {
        return Target.the(category.name() + " category")
                     .locatedBy("//li[contains(@class, 'cat')]/a[contains(text(), 'Motors')]")
                     .of(category.name());
    }
}
