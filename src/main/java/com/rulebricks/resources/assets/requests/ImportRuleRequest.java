/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.assets.requests;

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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = ImportRuleRequest.Builder.class
)
public final class ImportRuleRequest {
  private final Map<String, Object> rule;

  private final Map<String, Object> additionalProperties;

  private ImportRuleRequest(Map<String, Object> rule, Map<String, Object> additionalProperties) {
    this.rule = rule;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return The rule data to import.
   */
  @JsonProperty("rule")
  public Map<String, Object> getRule() {
    return rule;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ImportRuleRequest && equalTo((ImportRuleRequest) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(ImportRuleRequest other) {
    return rule.equals(other.rule);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.rule);
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
    private Map<String, Object> rule = new LinkedHashMap<>();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(ImportRuleRequest other) {
      rule(other.getRule());
      return this;
    }

    @JsonSetter(
        value = "rule",
        nulls = Nulls.SKIP
    )
    public Builder rule(Map<String, Object> rule) {
      this.rule.clear();
      this.rule.putAll(rule);
      return this;
    }

    public Builder putAllRule(Map<String, Object> rule) {
      this.rule.putAll(rule);
      return this;
    }

    public Builder rule(String key, Object value) {
      this.rule.put(key, value);
      return this;
    }

    public ImportRuleRequest build() {
      return new ImportRuleRequest(rule, additionalProperties);
    }
  }
}
