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
import java.lang.Double;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = TestTestState.Builder.class
)
public final class TestTestState {
  private final Optional<Double> duration;

  private final Optional<Map<String, Object>> response;

  private final Optional<List<Map<String, TestTestStateConditionsItemValue>>> conditions;

  private final Optional<Integer> httpStatus;

  private final Optional<List<Integer>> successIdxs;

  private final Optional<TestTestStateEvaluationError> evaluationError;

  private final Map<String, Object> additionalProperties;

  private TestTestState(Optional<Double> duration, Optional<Map<String, Object>> response,
      Optional<List<Map<String, TestTestStateConditionsItemValue>>> conditions,
      Optional<Integer> httpStatus, Optional<List<Integer>> successIdxs,
      Optional<TestTestStateEvaluationError> evaluationError,
      Map<String, Object> additionalProperties) {
    this.duration = duration;
    this.response = response;
    this.conditions = conditions;
    this.httpStatus = httpStatus;
    this.successIdxs = successIdxs;
    this.evaluationError = evaluationError;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return Execution time in seconds
   */
  @JsonProperty("duration")
  public Optional<Double> getDuration() {
    return duration;
  }

  /**
   * @return Actual response returned
   */
  @JsonProperty("response")
  public Optional<Map<String, Object>> getResponse() {
    return response;
  }

  @JsonProperty("conditions")
  public Optional<List<Map<String, TestTestStateConditionsItemValue>>> getConditions() {
    return conditions;
  }

  /**
   * @return HTTP status code returned
   */
  @JsonProperty("httpStatus")
  public Optional<Integer> getHttpStatus() {
    return httpStatus;
  }

  @JsonProperty("successIdxs")
  public Optional<List<Integer>> getSuccessIdxs() {
    return successIdxs;
  }

  /**
   * @return Error message or flag indicating if evaluation error occurred
   */
  @JsonProperty("evaluationError")
  public Optional<TestTestStateEvaluationError> getEvaluationError() {
    return evaluationError;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof TestTestState && equalTo((TestTestState) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(TestTestState other) {
    return duration.equals(other.duration) && response.equals(other.response) && conditions.equals(other.conditions) && httpStatus.equals(other.httpStatus) && successIdxs.equals(other.successIdxs) && evaluationError.equals(other.evaluationError);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.duration, this.response, this.conditions, this.httpStatus, this.successIdxs, this.evaluationError);
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
    private Optional<Double> duration = Optional.empty();

    private Optional<Map<String, Object>> response = Optional.empty();

    private Optional<List<Map<String, TestTestStateConditionsItemValue>>> conditions = Optional.empty();

    private Optional<Integer> httpStatus = Optional.empty();

    private Optional<List<Integer>> successIdxs = Optional.empty();

    private Optional<TestTestStateEvaluationError> evaluationError = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(TestTestState other) {
      duration(other.getDuration());
      response(other.getResponse());
      conditions(other.getConditions());
      httpStatus(other.getHttpStatus());
      successIdxs(other.getSuccessIdxs());
      evaluationError(other.getEvaluationError());
      return this;
    }

    @JsonSetter(
        value = "duration",
        nulls = Nulls.SKIP
    )
    public Builder duration(Optional<Double> duration) {
      this.duration = duration;
      return this;
    }

    public Builder duration(Double duration) {
      this.duration = Optional.ofNullable(duration);
      return this;
    }

    @JsonSetter(
        value = "response",
        nulls = Nulls.SKIP
    )
    public Builder response(Optional<Map<String, Object>> response) {
      this.response = response;
      return this;
    }

    public Builder response(Map<String, Object> response) {
      this.response = Optional.ofNullable(response);
      return this;
    }

    @JsonSetter(
        value = "conditions",
        nulls = Nulls.SKIP
    )
    public Builder conditions(
        Optional<List<Map<String, TestTestStateConditionsItemValue>>> conditions) {
      this.conditions = conditions;
      return this;
    }

    public Builder conditions(List<Map<String, TestTestStateConditionsItemValue>> conditions) {
      this.conditions = Optional.ofNullable(conditions);
      return this;
    }

    @JsonSetter(
        value = "httpStatus",
        nulls = Nulls.SKIP
    )
    public Builder httpStatus(Optional<Integer> httpStatus) {
      this.httpStatus = httpStatus;
      return this;
    }

    public Builder httpStatus(Integer httpStatus) {
      this.httpStatus = Optional.ofNullable(httpStatus);
      return this;
    }

    @JsonSetter(
        value = "successIdxs",
        nulls = Nulls.SKIP
    )
    public Builder successIdxs(Optional<List<Integer>> successIdxs) {
      this.successIdxs = successIdxs;
      return this;
    }

    public Builder successIdxs(List<Integer> successIdxs) {
      this.successIdxs = Optional.ofNullable(successIdxs);
      return this;
    }

    @JsonSetter(
        value = "evaluationError",
        nulls = Nulls.SKIP
    )
    public Builder evaluationError(Optional<TestTestStateEvaluationError> evaluationError) {
      this.evaluationError = evaluationError;
      return this;
    }

    public Builder evaluationError(TestTestStateEvaluationError evaluationError) {
      this.evaluationError = Optional.ofNullable(evaluationError);
      return this;
    }

    public TestTestState build() {
      return new TestTestState(duration, response, conditions, httpStatus, successIdxs, evaluationError, additionalProperties);
    }
  }
}
