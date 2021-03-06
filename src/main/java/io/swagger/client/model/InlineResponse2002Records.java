/*
 * RingCentral Glip REST API
 * API Explorer for RingCentral Glip Messaging API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002Records
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:29:16.640Z")
public class InlineResponse2002Records {
  @SerializedName("id")
  private String id = null;

  /**
   * Type of group
   */
  public enum TypeEnum {
    @SerializedName("Group")
    GROUP("Group"),
    
    @SerializedName("Team")
    TEAM("Team");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("members")
  private List<String> members = new ArrayList<String>();

  @SerializedName("email")
  private String email = null;

  @SerializedName("isPublic")
  private Boolean isPublic = null;

  @SerializedName("creationTime")
  private String creationTime = null;

  @SerializedName("lastModifiedTime")
  private String lastModifiedTime = null;

  public InlineResponse2002Records id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of team
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Id of team")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2002Records type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of group
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Type of group")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InlineResponse2002Records displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Name of team
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "Name of team")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public InlineResponse2002Records description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Short description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public InlineResponse2002Records members(List<String> members) {
    this.members = members;
    return this;
  }

  public InlineResponse2002Records addMembersItem(String membersItem) {
    this.members.add(membersItem);
    return this;
  }

   /**
   * Array of group participants
   * @return members
  **/
  @ApiModelProperty(example = "null", value = "Array of group participants")
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public InlineResponse2002Records email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of team
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Email of team")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse2002Records isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

   /**
   * Shows if team is public or not
   * @return isPublic
  **/
  @ApiModelProperty(example = "null", value = "Shows if team is public or not")
  public Boolean getIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public InlineResponse2002Records creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Time of creation (ISO format)
   * @return creationTime
  **/
  @ApiModelProperty(example = "null", value = "Time of creation (ISO format)")
  public String getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }

  public InlineResponse2002Records lastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }

   /**
   * Time of last modification (ISO format)
   * @return lastModifiedTime
  **/
  @ApiModelProperty(example = "null", value = "Time of last modification (ISO format)")
  public String getLastModifiedTime() {
    return lastModifiedTime;
  }

  public void setLastModifiedTime(String lastModifiedTime) {
    this.lastModifiedTime = lastModifiedTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Records inlineResponse2002Records = (InlineResponse2002Records) o;
    return Objects.equals(this.id, inlineResponse2002Records.id) &&
        Objects.equals(this.type, inlineResponse2002Records.type) &&
        Objects.equals(this.displayName, inlineResponse2002Records.displayName) &&
        Objects.equals(this.description, inlineResponse2002Records.description) &&
        Objects.equals(this.members, inlineResponse2002Records.members) &&
        Objects.equals(this.email, inlineResponse2002Records.email) &&
        Objects.equals(this.isPublic, inlineResponse2002Records.isPublic) &&
        Objects.equals(this.creationTime, inlineResponse2002Records.creationTime) &&
        Objects.equals(this.lastModifiedTime, inlineResponse2002Records.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, displayName, description, members, email, isPublic, creationTime, lastModifiedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Records {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    lastModifiedTime: ").append(toIndentedString(lastModifiedTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

