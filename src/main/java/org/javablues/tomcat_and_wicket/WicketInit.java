package org.javablues.tomcat_and_wicket;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketInit extends WebApplication {

  @Override
  public Class<? extends Page> getHomePage() {
    return HomePage.class;
  }
}
