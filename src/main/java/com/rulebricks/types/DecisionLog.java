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
    builder = DecisionLog.Builder.class
)
public final class DecisionLog {
  private final Optional<DecisionLogRequest> request;

  private final Optional<DecisionLogResponse> response;

  private final Optional<DecisionLogDecision> decision;

  private final Map<String, Object> additionalProperties;

  private DecisionLog(Optional<DecisionLogRequest> request, Optional<DecisionLogResponse> response,
      Optional<DecisionLogDecision> decision, Map<String, Object> additionalProperties) {
    this.request = request;
    this.response = response;
    this.decision = decision;
    this.additionalProperties = additionalProperties;
  }

  @JsonProperty("request")
  public Optional<DecisionLogRequest> getRequest() {
    return request;
  }

  @JsonProperty("response")
  public Optional<DecisionLogResponse> getResponse() {
    return response;
  }

  @JsonProperty("decision")
  public Optional<DecisionLogDecision> getDecision() {
    return decision;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DecisionLog && equalTo((DecisionLog) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(DecisionLog other) {
    return request.equals(other.request) && response.equals(other.response) && decision.equals(other.decision);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.request, this.response, this.decision);
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
    private Optional<DecisionLogRequest> request = Optional.empty();

    private Optional<DecisionLogResponse> response = Optional.empty();

    private Optional<DecisionLogDecision> decision = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(DecisionLog other) {
      request(other.getRequest());
      response(other.getResponse());
      decision(other.getDecision());
      return this;
    }

    @JsonSetter(
        value = "request",
        nulls = Nulls.SKIP
    )
    public Builder request(Optional<DecisionLogRequest> request) {
      this.request = request;
      return this;
    }

    public Builder request(DecisionLogRequest request) {
      this.request = Optional.ofNullable(request);
      return this;
    }

    @JsonSetter(
        value = "response",
        nulls = Nulls.SKIP
    )
    public Builder response(Optional<DecisionLogResponse> response) {
      this.response = response;
      return this;
    }

    public Builder response(DecisionLogResponse response) {
      this.response = Optional.ofNullable(response);
      return this;
    }

    @JsonSetter(
        value = "decision",
        nulls = Nulls.SKIP
    )
    public Builder decision(Optional<DecisionLogDecision> decision) {
      this.decision = decision;
      return this;
    }

    public Builder decision(DecisionLogDecision decision) {
      this.decision = Optional.ofNullable(decision);
      return this;
    }

    public DecisionLog build() {
      return new DecisionLog(request, response, decision, additionalProperties);
    }
  }
}
