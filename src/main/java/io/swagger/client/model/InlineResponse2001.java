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
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:29:16.640Z")
public class InlineResponse2001 {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("creationTime")
  private String creationTime = null;

  @SerializedName("lastModifiedTime")
  private String lastModifiedTime = null;

  public InlineResponse2001 id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of company
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "ID of company")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2001 name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of company
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "Name of company")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2001 domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Domain name of company
   * @return domain
  **/
  @ApiModelProperty(example = "null", value = "Domain name of company")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public InlineResponse2001 creationTime(String creationTime) {
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

  public InlineResponse2001 lastModifiedTime(String lastModifiedTime) {
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
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.id, inlineResponse2001.id) &&
        Objects.equals(this.name, inlineResponse2001.name) &&
        Objects.equals(this.domain, inlineResponse2001.domain) &&
        Objects.equals(this.creationTime, inlineResponse2001.creationTime) &&
        Objects.equals(this.lastModifiedTime, inlineResponse2001.lastModifiedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, domain, creationTime, lastModifiedTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

