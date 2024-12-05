/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.values.types;

import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import core.ObjectMappers;
import java.io.IOException;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@JsonDeserialize(
    using = UpdateRequestValue.Deserializer.class
)
public final class UpdateRequestValue {
  private final Object value;

  private final int type;

  private UpdateRequestValue(Object value, int type) {
    this.value = value;
    this.type = type;
  }

  @JsonValue
  public Object get() {
    return this.value;
  }

  public <T> T visit(Visitor<T> visitor) {
    if(this.type == 0) {
      return visitor.visit((String) this.value);
    } else if(this.type == 1) {
      return visitor.visit((double) this.value);
    } else if(this.type == 2) {
      return visitor.visit((boolean) this.value);
    } else if(this.type == 3) {
      return visitor.visit((List<Object>) this.value);
    }
    throw new IllegalStateException("Failed to visit value. This should never happen.");
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof UpdateRequestValue && equalTo((UpdateRequestValue) other);
  }

  private boolean equalTo(UpdateRequestValue other) {
    return value.equals(other.value);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  @java.lang.Override
  public String toString() {
    return this.value.toString();
  }

  public static UpdateRequestValue of(String value) {
    return new UpdateRequestValue(value, 0);
  }

  public static UpdateRequestValue of(double value) {
    return new UpdateRequestValue(value, 1);
  }

  public static UpdateRequestValue of(boolean value) {
    return new UpdateRequestValue(value, 2);
  }

  public static UpdateRequestValue of(List<Object> value) {
    return new UpdateRequestValue(value, 3);
  }

  public interface Visitor<T> {
    T visit(String value);

    T visit(double value);

    T visit(boolean value);

    T visit(List<Object> value);
  }

  static final class Deserializer extends StdDeserializer<UpdateRequestValue> {
    Deserializer() {
      super(UpdateRequestValue.class);
    }

    @java.lang.Override
    public UpdateRequestValue deserialize(JsonParser p, DeserializationContext ctxt) throws
        IOException {
      Object value = p.readValueAs(Object.class);
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, String.class));
      } catch(IllegalArgumentException e) {
      }
      if (value instanceof Double) {
        return of((Double) value);
      }
      if (value instanceof Boolean) {
        return of((Boolean) value);
      }
      try {
        return of(ObjectMappers.JSON_MAPPER.convertValue(value, new TypeReference<List<Object>>() {}));
      } catch(IllegalArgumentException e) {
      }
      throw new JsonParseException(p, "Failed to deserialize");
    }
  }
}