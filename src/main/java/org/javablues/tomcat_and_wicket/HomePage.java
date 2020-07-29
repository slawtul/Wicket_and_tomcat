package org.javablues.tomcat_and_wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.javablues.wicket_reusables.behaviors.fieldrequired.FieldRequiredBehavior;
import org.javablues.wicket_reusables.behaviors.popover.PopoverBehavior;
import org.javablues.wicket_reusables.behaviors.popover.Trigger;
import org.javablues.wicket_reusables.behaviors.shared.Placement;
import org.javablues.wicket_reusables.behaviors.tooltip.TooltipBehavior;

public class HomePage extends GenericPage {

  public HomePage(PageParameters parameters) {
    super(parameters);
    add(createLabel());
    add(createUsernameField());
    add(createRegisterButton());
    add(createAddButton());
  }

  private Button createAddButton() {
    Button button = new Button("add", Model.of("Add"));
    button.add(new TooltipBehavior("Add new user", Placement.RIGHT));
    return button;
  }

  private Label createLabel() {
    Label label = new Label("required", "Username");
    label.add(new FieldRequiredBehavior());
    return label;
  }

  private Button createRegisterButton() {
    Button button = new Button("register", Model.of("Register"));
    button.add(
      new PopoverBehavior("Register user", "Please click to register user")
      .withTrigger(Trigger.HOVER)
    );
    return button;
  }

  private TextField<String> createUsernameField() {
    TextField<String> field = new TextField<>("username");
    field.setRequired(true);
    return field;
  }
}
