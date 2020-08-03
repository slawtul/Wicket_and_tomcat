package org.javablues.tomcat_and_wicket;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.IModel;
import org.apache.wicket.model.ResourceModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.javablues.wicket_reusables.behaviors.fieldrequired.FieldRequiredBehavior;
import org.javablues.wicket_reusables.behaviors.popover.PopoverBehavior;
import org.javablues.wicket_reusables.behaviors.popover.Trigger;
import org.javablues.wicket_reusables.behaviors.shared.Placement;
import org.javablues.wicket_reusables.behaviors.tooltip.TooltipBehavior;

public class HomePage extends GenericPage {

  public HomePage(PageParameters parameters) {
    super(parameters);
    add(new RequiredTextField<String>("username"));
    add(new LabelForRequiredField("required", new ResourceModel("Username")));
    add(new RegisterButton("register", new ResourceModel("Register")));
    add(new AddUserButton("addUser", new ResourceModel("Add new user")));
  }

  private class AddUserButton extends Button {

    public AddUserButton(String id, IModel<String> model) {
      super(id, model);
      add(new TooltipBehavior("Add new user", Placement.RIGHT));
    }
  }

  private class LabelForRequiredField extends Label {

    public LabelForRequiredField(String id, IModel<?> model) {
      super(id, model);
      add(new FieldRequiredBehavior());
    }
  }

  private class RegisterButton extends Button {

    public RegisterButton(String id, IModel<String> model) {
      super(id, model);
      add(
        new PopoverBehavior("Register user", "Please click to register user")
        .withTrigger(Trigger.HOVER)
      );
    }
  }
}
