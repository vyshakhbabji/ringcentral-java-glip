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

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:29:16.640Z")
public class InlineResponse200 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("gender")
  private String gender = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("companyId")
  private String companyId = null;

  @SerializedName("creationTime")
  private String creationTime = null;

  @SerializedName("lastModifiedTime")
  private String lastModifiedTime = null;

  public InlineResponse200 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of person
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID of person")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse200 firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of person
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "First name of person")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public InlineResponse200 lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of person
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "Last name of person")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public InlineResponse200 gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Gender of person
   * @return gender
  **/
  @ApiModelProperty(example = "null", value = "Gender of person")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public InlineResponse200 email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of user
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "Email of user")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public InlineResponse200 location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Current location of person
   * @return location
  **/
  @ApiModelProperty(example = "null", value = "Current location of person")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public InlineResponse200 companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

   /**
   * ID of company person belongs to
   * @return companyId
  **/
  @ApiModelProperty(example = "null", value = "ID of company person belongs to")
  public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public InlineResponse200 creationTime(String creationTime) {
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

  public InlineResponse200 lastModifiedTime(String lastModifiedTime) {
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
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.id, inlineResponse200.id) &&
        Objects.equals(this.firstName, inlineResponse200.firstName) &&
        Objects.equals(this.lastName, inlineResponse200.lastName) &&
        Objects.equals(this.gender, inlineResponse200.gender) &&
        Objects.equals(this.email, inlineResponse200.email) &&
        Objects.equals(this.location, inlineResponse200.location) &&
        Objects.equals(this.companyId, inlineResponse200.companyId) &&
        Objects.equals(this.creationTime, inlineResponse200.creationTime) &&
        Objects.equals(this.lastModifiedTime, inlineResponse200.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, gender, email, location, companyId, creationTime, lastModifiedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
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
