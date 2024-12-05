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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = ForbiddenErrorBody.Builder.class
)
public final class ForbiddenErrorBody {
  private final Optional<String> error;

  private final Map<String, Object> additionalProperties;

  private ForbiddenErrorBody(Optional<String> error, Map<String, Object> additionalProperties) {
    this.error = error;
    this.additionalProperties = additionalProperties;
  }

  @JsonProperty("error")
  public Optional<String> getError() {
    return error;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ForbiddenErrorBody && equalTo((ForbiddenErrorBody) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(ForbiddenErrorBody other) {
    return error.equals(other.error);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.error);
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
    private Optional<String> error = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(ForbiddenErrorBody other) {
      error(other.getError());
      return this;
    }

    @JsonSetter(
        value = "error",
        nulls = Nulls.SKIP
    )
    public Builder error(Optional<String> error) {
      this.error = error;
      return this;
    }

    public Builder error(String error) {
      this.error = Optional.of(error);
      return this;
    }

    public ForbiddenErrorBody build() {
      return new ForbiddenErrorBody(error, additionalProperties);
    }
  }
}