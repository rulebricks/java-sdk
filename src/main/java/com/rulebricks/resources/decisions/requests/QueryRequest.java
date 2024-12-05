/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.decisions.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.ObjectMappers;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = QueryRequest.Builder.class
)
public final class QueryRequest {
  private final String slug;

  private final Optional<OffsetDateTime> from;

  private final Optional<OffsetDateTime> to;

  private final Optional<String> cursor;

  private final Optional<Integer> limit;

  private final Map<String, Object> additionalProperties;

  private QueryRequest(String slug, Optional<OffsetDateTime> from, Optional<OffsetDateTime> to,
      Optional<String> cursor, Optional<Integer> limit, Map<String, Object> additionalProperties) {
    this.slug = slug;
    this.from = from;
    this.to = to;
    this.cursor = cursor;
    this.limit = limit;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return The slug of the rule to query logs for.
   */
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  /**
   * @return Start date for the query range (ISO8601 format).
   */
  @JsonProperty("from")
  public Optional<OffsetDateTime> getFrom() {
    return from;
  }

  /**
   * @return End date for the query range (ISO8601 format).
   */
  @JsonProperty("to")
  public Optional<OffsetDateTime> getTo() {
    return to;
  }

  /**
   * @return Cursor for pagination.
   */
  @JsonProperty("cursor")
  public Optional<String> getCursor() {
    return cursor;
  }

  /**
   * @return Number of results to return per page.
   */
  @JsonProperty("limit")
  public Optional<Integer> getLimit() {
    return limit;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof QueryRequest && equalTo((QueryRequest) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(QueryRequest other) {
    return slug.equals(other.slug) && from.equals(other.from) && to.equals(other.to) && cursor.equals(other.cursor) && limit.equals(other.limit);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.slug, this.from, this.to, this.cursor, this.limit);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static SlugStage builder() {
    return new Builder();
  }

  public interface SlugStage {
    _FinalStage slug(String slug);

    Builder from(QueryRequest other);
  }

  public interface _FinalStage {
    QueryRequest build();

    _FinalStage from(Optional<OffsetDateTime> from);

    _FinalStage from(OffsetDateTime from);

    _FinalStage to(Optional<OffsetDateTime> to);

    _FinalStage to(OffsetDateTime to);

    _FinalStage cursor(Optional<String> cursor);

    _FinalStage cursor(String cursor);

    _FinalStage limit(Optional<Integer> limit);

    _FinalStage limit(Integer limit);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements SlugStage, _FinalStage {
    private String slug;

    private Optional<Integer> limit = Optional.empty();

    private Optional<String> cursor = Optional.empty();

    private Optional<OffsetDateTime> to = Optional.empty();

    private Optional<OffsetDateTime> from = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @java.lang.Override
    public Builder from(QueryRequest other) {
      slug(other.getSlug());
      from(other.getFrom());
      to(other.getTo());
      cursor(other.getCursor());
      limit(other.getLimit());
      return this;
    }

    /**
     * <p>The slug of the rule to query logs for.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("slug")
    public _FinalStage slug(String slug) {
      this.slug = slug;
      return this;
    }

    /**
     * <p>Number of results to return per page.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage limit(Integer limit) {
      this.limit = Optional.of(limit);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "limit",
        nulls = Nulls.SKIP
    )
    public _FinalStage limit(Optional<Integer> limit) {
      this.limit = limit;
      return this;
    }

    /**
     * <p>Cursor for pagination.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage cursor(String cursor) {
      this.cursor = Optional.of(cursor);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "cursor",
        nulls = Nulls.SKIP
    )
    public _FinalStage cursor(Optional<String> cursor) {
      this.cursor = cursor;
      return this;
    }

    /**
     * <p>End date for the query range (ISO8601 format).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage to(OffsetDateTime to) {
      this.to = Optional.of(to);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "to",
        nulls = Nulls.SKIP
    )
    public _FinalStage to(Optional<OffsetDateTime> to) {
      this.to = to;
      return this;
    }

    /**
     * <p>Start date for the query range (ISO8601 format).</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage from(OffsetDateTime from) {
      this.from = Optional.of(from);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "from",
        nulls = Nulls.SKIP
    )
    public _FinalStage from(Optional<OffsetDateTime> from) {
      this.from = from;
      return this;
    }

    @java.lang.Override
    public QueryRequest build() {
      return new QueryRequest(slug, from, to, cursor, limit, additionalProperties);
    }
  }
}