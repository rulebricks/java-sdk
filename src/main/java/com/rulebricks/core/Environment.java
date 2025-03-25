/**
 * This file was auto-generated by Fern from our API Definition.
 */

package core;

import java.lang.String;

public final class Environment {
  public static final Environment DEFAULT = new Environment("https://rulebricks.com/api/v1");

  private final String url;

  private Environment(String url) {
    this.url = url;
  }

  public String getUrl() {
    return this.url;
  }

  public static Environment custom(String url) {
    return new Environment(url);
  }
}
