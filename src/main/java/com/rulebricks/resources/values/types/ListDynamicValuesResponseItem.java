/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.values.types;

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

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = ListDynamicValuesResponseItem.Builder.class
)
public final class ListDynamicValuesResponseItem {
  private final Optional<String> id;

  private final Optional<String> name;

  private final Optional<ListDynamicValuesResponseItemType> type;

  private final Optional<ListDynamicValuesResponseItemValue> value;

  private final Optional<List<ListDynamicValuesResponseItemUsagesItem>> usages;

  private final Map<String, Object> additionalProperties;

  private ListDynamicValuesResponseItem(Optional<String> id, Optional<String> name,
      Optional<ListDynamicValuesResponseItemType> type,
      Optional<ListDynamicValuesResponseItemValue> value,
      Optional<List<ListDynamicValuesResponseItemUsagesItem>> usages,
      Map<String, Object> additionalProperties) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.value = value;
    this.usages = usages;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return Unique identifier for the dynamic value.
   */
  @JsonProperty("id")
  public Optional<String> getId() {
    return id;
  }

  /**
   * @return Name of the dynamic value.
   */
  @JsonProperty("name")
  public Optional<String> getName() {
    return name;
  }

  /**
   * @return Data type of the dynamic value.
   */
  @JsonProperty("type")
  public Optional<ListDynamicValuesResponseItemType> getType() {
    return type;
  }

  /**
   * @return Value of the dynamic value.
   */
  @JsonProperty("value")
  public Optional<ListDynamicValuesResponseItemValue> getValue() {
    return value;
  }

  @JsonProperty("usages")
  public Optional<List<ListDynamicValuesResponseItemUsagesItem>> getUsages() {
    return usages;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof ListDynamicValuesResponseItem && equalTo((ListDynamicValuesResponseItem) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(ListDynamicValuesResponseItem other) {
    return id.equals(other.id) && name.equals(other.name) && type.equals(other.type) && value.equals(other.value) && usages.equals(other.usages);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.id, this.name, this.type, this.value, this.usages);
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
    private Optional<String> id = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<ListDynamicValuesResponseItemType> type = Optional.empty();

    private Optional<ListDynamicValuesResponseItemValue> value = Optional.empty();

    private Optional<List<ListDynamicValuesResponseItemUsagesItem>> usages = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    public Builder from(ListDynamicValuesResponseItem other) {
      id(other.getId());
      name(other.getName());
      type(other.getType());
      value(other.getValue());
      usages(other.getUsages());
      return this;
    }

    @JsonSetter(
        value = "id",
        nulls = Nulls.SKIP
    )
    public Builder id(Optional<String> id) {
      this.id = id;
      return this;
    }

    public Builder id(String id) {
      this.id = Optional.of(id);
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
      this.name = Optional.of(name);
      return this;
    }

    @JsonSetter(
        value = "type",
        nulls = Nulls.SKIP
    )
    public Builder type(Optional<ListDynamicValuesResponseItemType> type) {
      this.type = type;
      return this;
    }

    public Builder type(ListDynamicValuesResponseItemType type) {
      this.type = Optional.of(type);
      return this;
    }

    @JsonSetter(
        value = "value",
        nulls = Nulls.SKIP
    )
    public Builder value(Optional<ListDynamicValuesResponseItemValue> value) {
      this.value = value;
      return this;
    }

    public Builder value(ListDynamicValuesResponseItemValue value) {
      this.value = Optional.of(value);
      return this;
    }

    @JsonSetter(
        value = "usages",
        nulls = Nulls.SKIP
    )
    public Builder usages(Optional<List<ListDynamicValuesResponseItemUsagesItem>> usages) {
      this.usages = usages;
      return this;
    }

    public Builder usages(List<ListDynamicValuesResponseItemUsagesItem> usages) {
      this.usages = Optional.of(usages);
      return this;
    }

    public ListDynamicValuesResponseItem build() {
      return new ListDynamicValuesResponseItem(id, name, type, value, usages, additionalProperties);
    }
  }
}