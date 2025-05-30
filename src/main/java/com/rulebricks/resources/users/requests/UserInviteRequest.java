/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.users.requests;

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
import org.jetbrains.annotations.NotNull;
import resources.users.types.UserInviteRequestRole;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(
    builder = UserInviteRequest.Builder.class
)
public final class UserInviteRequest {
  private final String email;

  private final Optional<UserInviteRequestRole> role;

  private final Optional<List<String>> accessGroups;

  private final Map<String, Object> additionalProperties;

  private UserInviteRequest(String email, Optional<UserInviteRequestRole> role,
      Optional<List<String>> accessGroups, Map<String, Object> additionalProperties) {
    this.email = email;
    this.role = role;
    this.accessGroups = accessGroups;
    this.additionalProperties = additionalProperties;
  }

  /**
   * @return Email of the user to invite.
   */
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  /**
   * @return System or custom role ID to assign to the user. Available system roles include 'admin', 'editor', and 'developer'.
   */
  @JsonProperty("role")
  public Optional<UserInviteRequestRole> getRole() {
    return role;
  }

  /**
   * @return List of access group names or IDs to assign to the user. All specified groups must exist in your organization.
   */
  @JsonProperty("accessGroups")
  public Optional<List<String>> getAccessGroups() {
    return accessGroups;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof UserInviteRequest && equalTo((UserInviteRequest) other);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  private boolean equalTo(UserInviteRequest other) {
    return email.equals(other.email) && role.equals(other.role) && accessGroups.equals(other.accessGroups);
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.email, this.role, this.accessGroups);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static EmailStage builder() {
    return new Builder();
  }

  public interface EmailStage {
    _FinalStage email(@NotNull String email);

    Builder from(UserInviteRequest other);
  }

  public interface _FinalStage {
    UserInviteRequest build();

    _FinalStage role(Optional<UserInviteRequestRole> role);

    _FinalStage role(UserInviteRequestRole role);

    _FinalStage accessGroups(Optional<List<String>> accessGroups);

    _FinalStage accessGroups(List<String> accessGroups);
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements EmailStage, _FinalStage {
    private String email;

    private Optional<List<String>> accessGroups = Optional.empty();

    private Optional<UserInviteRequestRole> role = Optional.empty();

    @JsonAnySetter
    private Map<String, Object> additionalProperties = new HashMap<>();

    private Builder() {
    }

    @java.lang.Override
    public Builder from(UserInviteRequest other) {
      email(other.getEmail());
      role(other.getRole());
      accessGroups(other.getAccessGroups());
      return this;
    }

    /**
     * <p>Email of the user to invite.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    @JsonSetter("email")
    public _FinalStage email(@NotNull String email) {
      this.email = Objects.requireNonNull(email, "email must not be null");
      return this;
    }

    /**
     * <p>List of access group names or IDs to assign to the user. All specified groups must exist in your organization.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage accessGroups(List<String> accessGroups) {
      this.accessGroups = Optional.ofNullable(accessGroups);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "accessGroups",
        nulls = Nulls.SKIP
    )
    public _FinalStage accessGroups(Optional<List<String>> accessGroups) {
      this.accessGroups = accessGroups;
      return this;
    }

    /**
     * <p>System or custom role ID to assign to the user. Available system roles include 'admin', 'editor', and 'developer'.</p>
     * @return Reference to {@code this} so that method calls can be chained together.
     */
    @java.lang.Override
    public _FinalStage role(UserInviteRequestRole role) {
      this.role = Optional.ofNullable(role);
      return this;
    }

    @java.lang.Override
    @JsonSetter(
        value = "role",
        nulls = Nulls.SKIP
    )
    public _FinalStage role(Optional<UserInviteRequestRole> role) {
      this.role = role;
      return this;
    }

    @java.lang.Override
    public UserInviteRequest build() {
      return new UserInviteRequest(email, role, accessGroups, additionalProperties);
    }
  }
}
