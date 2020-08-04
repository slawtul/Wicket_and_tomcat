package org.javablues.tomcat_and_wicket;

import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.javablues.wicket_reusables.behaviors.popover.PopoverBehavior;
import org.javablues.wicket_reusables.behaviors.popover.Trigger;
import org.javablues.wicket_reusables.behaviors.shared.Placement;
import org.javablues.wicket_reusables.behaviors.tooltip.TooltipBehavior;
import org.javablues.wicket_reusables.form.LabelForRequiredField;

public class HomePage extends GenericPage {

  public HomePage(PageParameters parameters) {
    super(parameters);
    add(new RequiredTextField<String>("username"));
    add(
      new LabelForRequiredField(
        "required",
        new ResourceModel("USERNAME", "Username")
      )
    );
    add(createRegisterButton());
    add(createUserButton());
  }

  private Button createUserButton() {
    Button button = new Button(
      "add",
      new ResourceModel("ADD_NEW_USER", "Add new user")
    );
    button.add(new TooltipBehavior("Add new user", Placement.RIGHT));
    return button;
  }

  private Button createRegisterButton() {
    Button button = new Button(
      "register",
      new ResourceModel("REGISTER", "Register")
    );
    button.add(
      new PopoverBehavior("Register user", "Please click to register user")
      .withTrigger(Trigger.HOVER)
    );
    return button;
  }
}
