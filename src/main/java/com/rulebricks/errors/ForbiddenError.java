/**
 * This file was auto-generated by Fern from our API Definition.
 */

package errors;

import core.RulebricksApiApiException;
import types.Error;

public final class ForbiddenError extends RulebricksApiApiException {
  /**
   * The body of the response that triggered the exception.
   */
  private final Error body;

  public ForbiddenError(Error body) {
    super("ForbiddenError", 403, body);
    this.body = body;
  }

  /**
   * @return the body
   */
  @java.lang.Override
  public Error body() {
    return this.body;
  }
}
