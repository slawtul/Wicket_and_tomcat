package org.javablues.tomcat_and_wicket;

import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.ContextRelativeResourceReference;
import org.apache.wicket.request.resource.CssResourceReference;

public class GenericPage extends WebPage {
    public GenericPage() {
    }

    public GenericPage(IModel<?> model) {
        super(model);
    }

    public GenericPage(PageParameters parameters) {
        super(parameters);
    }

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);

        //css imports
        response.render(CssHeaderItem.forReference(
            new ContextRelativeResourceReference(
                "webjars/bootstrap/4.5.0/css/bootstrap.css")));
        response.render(CssHeaderItem.forReference(
            new CssResourceReference(GenericPage.class, "GenericPage.css")));

        //javascript imports
        response.render(JavaScriptHeaderItem.forReference(
            new ContextRelativeResourceReference(
                "webjars/popper.js/1.16.0/umd/popper.js")));
        response.render(JavaScriptHeaderItem.forReference(
            new ContextRelativeResourceReference(
                "webjars/bootstrap/4.5.0/js/bootstrap.js")));
    }
}
