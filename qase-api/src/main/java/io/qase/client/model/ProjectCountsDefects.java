/*
 * Qase.io API
 * Qase API Specification.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@qase.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.qase.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * ProjectCountsDefects
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-18T22:03:57.773028+03:00[Europe/Moscow]")
public class ProjectCountsDefects {
  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_OPEN = "open";
  @SerializedName(SERIALIZED_NAME_OPEN)
  private Integer open;


  public ProjectCountsDefects total(Integer total) {

    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }


  public ProjectCountsDefects open(Integer open) {

    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOpen() {
    return open;
  }


  public void setOpen(Integer open) {
    this.open = open;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCountsDefects projectCountsDefects = (ProjectCountsDefects) o;
    return Objects.equals(this.total, projectCountsDefects.total) &&
        Objects.equals(this.open, projectCountsDefects.open);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, open);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCountsDefects {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

