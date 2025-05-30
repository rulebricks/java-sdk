/**
 * This file was auto-generated by Fern from our API Definition.
 */

package types;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.ObjectMappers;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = SuccessMessage.Builder.class
)
public final class SuccessMessage {
  private final Optional<String> message;

  private final Map<String, Object> additionalProperties;

  private SuccessMessage(Optional<String> message, Map<String, Object> additionalProperties) {
    this.message = message;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return Success message
   */
  @JsonProperty("message")
  public Optional<String> getMessage() {
    return message;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SuccessMessage && equalTo((SuccessMessage) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(SuccessMessage other) {
    return message.equals(other.message);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.message);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static Builder builder() {
    return new Builder();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder {
    private Optional<String> message = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(SuccessMessage other) {
      message(other.getMessage());
      return this;
    }

    @JsonSetter(
        value = "message",
        nulls = Nulls.SKIP
    )
    public Builder message(Optional<String> message) {
      this.message = message;
      return this;
    }

    public Builder message(String message) {
      this.message = Optional.ofNullable(message);
      return this;
    }

    public SuccessMessage build() {
      return new SuccessMessage(message, additionalProperties);
    }
  }
}
