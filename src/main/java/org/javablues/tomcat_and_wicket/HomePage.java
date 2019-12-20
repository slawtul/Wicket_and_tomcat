package org.javablues.tomcat_and_wicket;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {

    public HomePage(PageParameters parameters) {
        super(parameters);
        add(new Label("message", Model.of("Hello world!")));
    }
}
