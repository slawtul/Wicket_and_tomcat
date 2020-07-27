package org.javablues.tomcat_and_wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.javablues.wicket_reusables.behaviors.fieldrequired.FieldRequiredBehavior;
import org.javablues.wicket_reusables.behaviors.popover.PopoverBehavior;

import java.util.Date;

public class HomePage extends GenericPage {
    public HomePage(PageParameters parameters) {
        super(parameters);
        add(new Label("hello", new Date().getTime()));
        add(new Label("world", "World!"));
        add(createUsernameField());
        add(createRegisterButton());
    }

    private Button createRegisterButton() {
        Button button = new Button("register");
        button.add(new PopoverBehavior("Register user",
            "Please click to register user"));
        return button;
    }

    private TextField<String> createUsernameField() {
        TextField<String> field = new TextField<>("username");
        field.setRequired(true);
        field.add(new FieldRequiredBehavior());
        return field;
    }
}
