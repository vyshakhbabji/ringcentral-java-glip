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
 * CreatePostRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:29:16.640Z")
public class CreatePostRequest {
  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("text")
  private String text = null;

  public CreatePostRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Id of a group to send post to
   * @return groupId
  **/
  @ApiModelProperty(example = "null", value = "Id of a group to send post to")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public CreatePostRequest text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of a post,up to 10000 unicode characters. All text must be returned
   * @return text
  **/
  @ApiModelProperty(example = "null", value = "Text of a post,up to 10000 unicode characters. All text must be returned")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatePostRequest createPostRequest = (CreatePostRequest) o;
    return Objects.equals(this.groupId, createPostRequest.groupId) &&
        Objects.equals(this.text, createPostRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, text);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatePostRequest {\n");
    
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

