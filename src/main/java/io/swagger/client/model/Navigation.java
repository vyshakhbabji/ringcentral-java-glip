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
 * Navigation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-14T22:29:16.640Z")
public class Navigation {
  @SerializedName("prevPage")
  private String prevPage = null;

  @SerializedName("nextPage")
  private String nextPage = null;

  public Navigation prevPage(String prevPage) {
    this.prevPage = prevPage;
    return this;
  }

   /**
   * prev page token. To get previous page, user should pass one of returned token in next request and, in turn, required page will be returned with new tokens.
   * @return prevPage
  **/
  @ApiModelProperty(example = "null", value = "prev page token. To get previous page, user should pass one of returned token in next request and, in turn, required page will be returned with new tokens.")
  public String getPrevPage() {
    return prevPage;
  }

  public void setPrevPage(String prevPage) {
    this.prevPage = prevPage;
  }

  public Navigation nextPage(String nextPage) {
    this.nextPage = nextPage;
    return this;
  }

   /**
   * next page token. To get next page, user should pass one of returned token in next request and, in turn, required page will be returned with new tokens.
   * @return nextPage
  **/
  @ApiModelProperty(example = "null", value = "next page token. To get next page, user should pass one of returned token in next request and, in turn, required page will be returned with new tokens.")
  public String getNextPage() {
    return nextPage;
  }

  public void setNextPage(String nextPage) {
    this.nextPage = nextPage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Navigation navigation = (Navigation) o;
    return Objects.equals(this.prevPage, navigation.prevPage) &&
        Objects.equals(this.nextPage, navigation.nextPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prevPage, nextPage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Navigation {\n");
    
    sb.append("    prevPage: ").append(toIndentedString(prevPage)).append("\n");
    sb.append("    nextPage: ").append(toIndentedString(nextPage)).append("\n");
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

