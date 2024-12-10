/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.tests.types;

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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = ListRuleTestsResponseItem.Builder.class
)
public final class ListRuleTestsResponseItem {
  private final String id;

  private final String name;

  private final Map<String, Object> request;

  private final Map<String, Object> response;

  private final boolean critical;

  private final boolean error;

  private final boolean success;

  private final Optional<Map<String, Object>> testState;

  private final Optional<OffsetDateTime> lastExecuted;

  private final Map<String, Object> additionalProperties;

  private ListRuleTestsResponseItem(String id, String name, Map<String, Object> request,
      Map<String, Object> response, boolean critical, boolean error, boolean success,
      Optional<Map<String, Object>> testState, Optional<OffsetDateTime> lastExecuted,
      Map<String, Object> additionalProperties) {
    this.id = id;
    this.name = name;
    this.request = request;
    this.response = response;
    this.critical = critical;
    this.error = error;
    this.success = success;
    this.testState = testState;
    this.lastExecuted = lastExecuted;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return Unique identifier for the test.
   */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * @return The name of the test.
   */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * @return The request object for the test.
   */
  @JsonProperty("request")
  public Map<String, Object> getRequest() {
    return request;
  }

  /**
   * @return The expected response object for the test.
   */
  @JsonProperty("response")
  public Map<String, Object> getResponse() {
    return response;
  }

  /**
   * @return Indicates whether the test is critical.
   */
  @JsonProperty("critical")
  public boolean getCritical() {
    return critical;
  }

  /**
   * @return Indicates if the test resulted in an error.
   */
  @JsonProperty("error")
  public boolean getError() {
    return error;
  }

  /**
   * @return Indicates if the test was successful.
   */
  @JsonProperty("success")
  public boolean getSuccess() {
    return success;
  }

  /**
   * @return The state of the test after execution.
   */
  @JsonProperty("testState")
  public Optional<Map<String, Object>> getTestState() {
    return testState;
  }

  /**
   * @return The timestamp when the test was last executed.
   */
  @JsonProperty("lastExecuted")
  public Optional<OffsetDateTime> getLastExecuted() {
    return lastExecuted;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListRuleTestsResponseItem && equalTo((ListRuleTestsResponseItem) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(ListRuleTestsResponseItem other) {
    return id.equals(other.id) && name.equals(other.name) && request.equals(other.request) && response.equals(other.response) && critical == other.critical && error == other.error && success == other.success && testState.equals(other.testState) && lastExecuted.equals(other.lastExecuted);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.request, this.response, this.critical, this.error, this.success, this.testState, this.lastExecuted);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static IdStage builder() {
    return new Builder();
  }

  public interface IdStage {
    NameStage id(String id);

    Builder from(ListRuleTestsResponseItem other);
  }

  public interface NameStage {
    CriticalStage name(String name);
  }

  public interface CriticalStage {
    ErrorStage critical(boolean critical);
  }

  public interface ErrorStage {
    SuccessStage error(boolean error);
  }

  public interface SuccessStage {
    _FinalStage success(boolean success);
  }

  public interface _FinalStage {
    ListRuleTestsResponseItem build();

    _FinalStage request(Map<String, Object> request);

    _FinalStage putAllRequest(Map<String, Object> request);

    _FinalStage request(String key, Object value);

    _FinalStage response(Map<String, Object> response);

    _FinalStage putAllResponse(Map<String, Object> response);

    _FinalStage response(String key, Object value);

    _FinalStage testState(Optional<Map<String, Object>> testState);

    _FinalStage testState(Map<String, Object> testState);

    _FinalStage lastExecuted(Optional<OffsetDateTime> lastExecuted);

    _FinalStage lastExecuted(OffsetDateTime lastExecuted);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements IdStage, NameStage, CriticalStage, ErrorStage, SuccessStage, _FinalStage {
    private String id;

    private String name;

    private boolean critical;

    private boolean error;

    private boolean success;

    private Optional<OffsetDateTime> lastExecuted = Optional.empty();

    private Optional<Map<String, Object>> testState = Optional.empty();

    private Map<String, Object> response = new LinkedHashMap<>();

    private Map<String, Object> request = new LinkedHashMap<>();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @java.lang.Override
    public Builder from(ListRuleTestsResponseItem other) {
      id(other.getId());
      name(other.getName());
      request(other.getRequest());
      response(other.getResponse());
      critical(other.getCritical());
      error(other.getError());
      success(other.getSuccess());
      testState(other.getTestState());
      lastExecuted(other.getLastExecuted());
      return this;
    }

    /**
     * <p>Unique identifier for the test.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("id")
    public NameStage id(String id) {
      this.id = id;
      return this;
    }

    /**
     * <p>The name of the test.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("name")
    public CriticalStage name(String name) {
      this.name = name;
      return this;
    }

    /**
     * <p>Indicates whether the test is critical.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("critical")
    public ErrorStage critical(boolean critical) {
      this.critical = critical;
      return this;
    }

    /**
     * <p>Indicates if the test resulted in an error.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("error")
    public SuccessStage error(boolean error) {
      this.error = error;
      return this;
    }

    /**
     * <p>Indicates if the test was successful.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("success")
    public _FinalStage success(boolean success) {
      this.success = success;
      return this;
    }

    /**
     * <p>The timestamp when the test was last executed.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage lastExecuted(OffsetDateTime lastExecuted) {
      this.lastExecuted = Optional.of(lastExecuted);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "lastExecuted",
        nulls = Nulls.SKIP
    )
    public _FinalStage lastExecuted(Optional<OffsetDateTime> lastExecuted) {
      this.lastExecuted = lastExecuted;
      return this;
    }

    /**
     * <p>The state of the test after execution.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage testState(Map<String, Object> testState) {
      this.testState = Optional.of(testState);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "testState",
        nulls = Nulls.SKIP
    )
    public _FinalStage testState(Optional<Map<String, Object>> testState) {
      this.testState = testState;
      return this;
    }

    /**
     * <p>The expected response object for the test.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage response(String key, Object value) {
      this.response.put(key, value);
      return this;
    }

    /**
     * <p>The expected response object for the test.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage putAllResponse(Map<String, Object> response) {
      this.response.putAll(response);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "response",
        nulls = Nulls.SKIP
    )
    public _FinalStage response(Map<String, Object> response) {
      this.response.clear();
      this.response.putAll(response);
      return this;
    }

    /**
     * <p>The request object for the test.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage request(String key, Object value) {
      this.request.put(key, value);
      return this;
    }

    /**
     * <p>The request object for the test.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage putAllRequest(Map<String, Object> request) {
      this.request.putAll(request);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "request",
        nulls = Nulls.SKIP
    )
    public _FinalStage request(Map<String, Object> request) {
      this.request.clear();
      this.request.putAll(request);
      return this;
    }

    @java.lang.Override
    public ListRuleTestsResponseItem build() {
      return new ListRuleTestsResponseItem(id, name, request, response, critical, error, success, testState, lastExecuted, additionalProperties);
    }
  }
}
