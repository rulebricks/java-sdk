/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.values.types;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

public enum UpdateResponseItemType {
  STRING("string"),

  NUMBER("number"),

  BOOLEAN("boolean"),

  LIST("list");

  private final String value;

  UpdateResponseItemType(String value) {
    this.value = value;
  }

  @JsonValue
  @java.lang.Override
  public String toString() {
    return this.value;
  }
}