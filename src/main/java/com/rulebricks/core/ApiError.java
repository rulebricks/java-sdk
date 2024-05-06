/**
 * This file was auto-generated by Fern from our API Definition.
 */

package core;

import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.String;

public final class ApiError extends RuntimeException {
  private final int statusCode;

  private final Object body;

  public ApiError(int statusCode, Object body) {
    this.statusCode = statusCode;
    this.body = body;
  }

  public int statusCode() {
    return this.statusCode;
  }

  public Object body() {
    return this.body;
  }

  @java.lang.Override
  public String toString() {
    return "ApiError{" + "statusCode: " + statusCode + ", body: " + body + "}";
  }
}
