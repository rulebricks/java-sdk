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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = DecisionLogRequest.Builder.class
)
public final class DecisionLogRequest {
  private final Optional<String> ip;

  private final Optional<String> method;

  private final Optional<String> name;

  private final Optional<String> endpoint;

  private final Optional<Map<String, List<String>>> params;

  private final Optional<Object> data;

  private final Map<String, Object> additionalProperties;

  private DecisionLogRequest(Optional<String> ip, Optional<String> method, Optional<String> name,
      Optional<String> endpoint, Optional<Map<String, List<String>>> params, Optional<Object> data,
      Map<String, Object> additionalProperties) {
    this.ip = ip;
    this.method = method;
    this.name = name;
    this.endpoint = endpoint;
    this.params = params;
    this.data = data;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return IP address of the requester
   */
  @JsonProperty("ip")
  public Optional<String> getIp() {
    return ip;
  }

  /**
   * @return HTTP method used
   */
  @JsonProperty("method")
  public Optional<String> getMethod() {
    return method;
  }

  /**
   * @return Name of the rule executed
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return API endpoint called
   */
  @JsonProperty("endpoint")
  public Optional<String> getEndpoint() {
    return endpoint;
  }

  @JsonProperty("params")
  public Optional<Map<String, List<String>>> getParams() {
    return params;
  }

  @JsonProperty("data")
  public Optional<Object> getData() {
    return data;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof DecisionLogRequest && equalTo((DecisionLogRequest) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(DecisionLogRequest other) {
    return ip.equals(other.ip) && method.equals(other.method) && name.equals(other.name) && endpoint.equals(other.endpoint) && params.equals(other.params) && data.equals(other.data);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.ip, this.method, this.name, this.endpoint, this.params, this.data);
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
    private Optional<String> ip = Optional.empty();

    private Optional<String> method = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> endpoint = Optional.empty();

    private Optional<Map<String, List<String>>> params = Optional.empty();

    private Optional<Object> data = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(DecisionLogRequest other) {
      ip(other.getIp());
      method(other.getMethod());
      name(other.getName());
      endpoint(other.getEndpoint());
      params(other.getParams());
      data(other.getData());
      return this;
    }

    @JsonSetter(
        value = "ip",
        nulls = Nulls.SKIP
    )
    public Builder ip(Optional<String> ip) {
      this.ip = ip;
      return this;
    }

    public Builder ip(String ip) {
      this.ip = Optional.ofNullable(ip);
      return this;
    }

    @JsonSetter(
        value = "method",
        nulls = Nulls.SKIP
    )
    public Builder method(Optional<String> method) {
      this.method = method;
      return this;
    }

    public Builder method(String method) {
      this.method = Optional.ofNullable(method);
      return this;
    }

    @JsonSetter(
        value = "name",
        nulls = Nulls.SKIP
    )
    public Builder name(Optional<String> name) {
      this.name = name;
      return this;
    }

    public Builder name(String name) {
      this.name = Optional.ofNullable(name);
      return this;
    }

    @JsonSetter(
        value = "endpoint",
        nulls = Nulls.SKIP
    )
    public Builder endpoint(Optional<String> endpoint) {
      this.endpoint = endpoint;
      return this;
    }

    public Builder endpoint(String endpoint) {
      this.endpoint = Optional.ofNullable(endpoint);
      return this;
    }

    @JsonSetter(
        value = "params",
        nulls = Nulls.SKIP
    )
    public Builder params(Optional<Map<String, List<String>>> params) {
      this.params = params;
      return this;
    }

    public Builder params(Map<String, List<String>> params) {
      this.params = Optional.ofNullable(params);
      return this;
    }

    @JsonSetter(
        value = "data",
        nulls = Nulls.SKIP
    )
    public Builder data(Optional<Object> data) {
      this.data = data;
      return this;
    }

    public Builder data(Object data) {
      this.data = Optional.ofNullable(data);
      return this;
    }

    public DecisionLogRequest build() {
      return new DecisionLogRequest(ip, method, name, endpoint, params, data, additionalProperties);
    }
  }
}
