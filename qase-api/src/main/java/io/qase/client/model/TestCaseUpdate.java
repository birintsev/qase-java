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

import java.util.*;

/**
 * TestCaseUpdate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-18T22:03:57.773028+03:00[Europe/Moscow]")
public class TestCaseUpdate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PRECONDITIONS = "preconditions";
  @SerializedName(SERIALIZED_NAME_PRECONDITIONS)
  private String preconditions;

  public static final String SERIALIZED_NAME_POSTCONDITIONS = "postconditions";
  @SerializedName(SERIALIZED_NAME_POSTCONDITIONS)
  private String postconditions;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private Integer severity;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
  @SerializedName(SERIALIZED_NAME_BEHAVIOR)
  private Integer behavior;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Integer type;

  public static final String SERIALIZED_NAME_LAYER = "layer";
  @SerializedName(SERIALIZED_NAME_LAYER)
  private Integer layer;

  public static final String SERIALIZED_NAME_IS_FLAKY = "is_flaky";
  @SerializedName(SERIALIZED_NAME_IS_FLAKY)
  private Integer isFlaky;

  public static final String SERIALIZED_NAME_SUITE_ID = "suite_id";
  @SerializedName(SERIALIZED_NAME_SUITE_ID)
  private Long suiteId;

  public static final String SERIALIZED_NAME_MILESTONE_ID = "milestone_id";
  @SerializedName(SERIALIZED_NAME_MILESTONE_ID)
  private Long milestoneId;

  public static final String SERIALIZED_NAME_AUTOMATION = "automation";
  @SerializedName(SERIALIZED_NAME_AUTOMATION)
  private Integer automation;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<TestCaseCreateSteps> steps = null;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_CUSTOM_FIELD = "custom_field";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD)
  private Map<String, String> customField = null;


  public TestCaseUpdate description(String description) {

    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TestCaseUpdate preconditions(String preconditions) {

    this.preconditions = preconditions;
    return this;
  }

   /**
   * Get preconditions
   * @return preconditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPreconditions() {
    return preconditions;
  }


  public void setPreconditions(String preconditions) {
    this.preconditions = preconditions;
  }


  public TestCaseUpdate postconditions(String postconditions) {

    this.postconditions = postconditions;
    return this;
  }

   /**
   * Get postconditions
   * @return postconditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPostconditions() {
    return postconditions;
  }


  public void setPostconditions(String postconditions) {
    this.postconditions = postconditions;
  }


  public TestCaseUpdate title(String title) {

    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public TestCaseUpdate severity(Integer severity) {

    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getSeverity() {
    return severity;
  }


  public void setSeverity(Integer severity) {
    this.severity = severity;
  }


  public TestCaseUpdate priority(Integer priority) {

    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public TestCaseUpdate behavior(Integer behavior) {

    this.behavior = behavior;
    return this;
  }

   /**
   * Get behavior
   * @return behavior
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBehavior() {
    return behavior;
  }


  public void setBehavior(Integer behavior) {
    this.behavior = behavior;
  }


  public TestCaseUpdate type(Integer type) {

    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getType() {
    return type;
  }


  public void setType(Integer type) {
    this.type = type;
  }


  public TestCaseUpdate layer(Integer layer) {

    this.layer = layer;
    return this;
  }

   /**
   * Get layer
   * @return layer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getLayer() {
    return layer;
  }


  public void setLayer(Integer layer) {
    this.layer = layer;
  }


  public TestCaseUpdate isFlaky(Integer isFlaky) {

    this.isFlaky = isFlaky;
    return this;
  }

   /**
   * Get isFlaky
   * @return isFlaky
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getIsFlaky() {
    return isFlaky;
  }


  public void setIsFlaky(Integer isFlaky) {
    this.isFlaky = isFlaky;
  }


  public TestCaseUpdate suiteId(Long suiteId) {

    this.suiteId = suiteId;
    return this;
  }

   /**
   * Get suiteId
   * @return suiteId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSuiteId() {
    return suiteId;
  }


  public void setSuiteId(Long suiteId) {
    this.suiteId = suiteId;
  }


  public TestCaseUpdate milestoneId(Long milestoneId) {

    this.milestoneId = milestoneId;
    return this;
  }

   /**
   * Get milestoneId
   * @return milestoneId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMilestoneId() {
    return milestoneId;
  }


  public void setMilestoneId(Long milestoneId) {
    this.milestoneId = milestoneId;
  }


  public TestCaseUpdate automation(Integer automation) {

    this.automation = automation;
    return this;
  }

   /**
   * Get automation
   * @return automation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAutomation() {
    return automation;
  }


  public void setAutomation(Integer automation) {
    this.automation = automation;
  }


  public TestCaseUpdate status(Integer status) {

    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatus() {
    return status;
  }


  public void setStatus(Integer status) {
    this.status = status;
  }


  public TestCaseUpdate attachments(List<String> attachments) {

    this.attachments = attachments;
    return this;
  }

  public TestCaseUpdate addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * A list of Attachment hashes.
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of Attachment hashes.")

  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public TestCaseUpdate steps(List<TestCaseCreateSteps> steps) {

    this.steps = steps;
    return this;
  }

  public TestCaseUpdate addStepsItem(TestCaseCreateSteps stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<TestCaseCreateSteps> getSteps() {
    return steps;
  }


  public void setSteps(List<TestCaseCreateSteps> steps) {
    this.steps = steps;
  }


  public TestCaseUpdate tags(List<String> tags) {

    this.tags = tags;
    return this;
  }

  public TestCaseUpdate addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public TestCaseUpdate customField(Map<String, String> customField) {

    this.customField = customField;
    return this;
  }

  public TestCaseUpdate putCustomFieldItem(String key, String customFieldItem) {
    if (this.customField == null) {
      this.customField = new HashMap<>();
    }
    this.customField.put(key, customFieldItem);
    return this;
  }

   /**
   * A map of custom fields values (id &#x3D;&gt; value)
   * @return customField
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A map of custom fields values (id => value)")

  public Map<String, String> getCustomField() {
    return customField;
  }


  public void setCustomField(Map<String, String> customField) {
    this.customField = customField;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TestCaseUpdate testCaseUpdate = (TestCaseUpdate) o;
    return Objects.equals(this.description, testCaseUpdate.description) &&
        Objects.equals(this.preconditions, testCaseUpdate.preconditions) &&
        Objects.equals(this.postconditions, testCaseUpdate.postconditions) &&
        Objects.equals(this.title, testCaseUpdate.title) &&
        Objects.equals(this.severity, testCaseUpdate.severity) &&
        Objects.equals(this.priority, testCaseUpdate.priority) &&
        Objects.equals(this.behavior, testCaseUpdate.behavior) &&
        Objects.equals(this.type, testCaseUpdate.type) &&
        Objects.equals(this.layer, testCaseUpdate.layer) &&
        Objects.equals(this.isFlaky, testCaseUpdate.isFlaky) &&
        Objects.equals(this.suiteId, testCaseUpdate.suiteId) &&
        Objects.equals(this.milestoneId, testCaseUpdate.milestoneId) &&
        Objects.equals(this.automation, testCaseUpdate.automation) &&
        Objects.equals(this.status, testCaseUpdate.status) &&
        Objects.equals(this.attachments, testCaseUpdate.attachments) &&
        Objects.equals(this.steps, testCaseUpdate.steps) &&
        Objects.equals(this.tags, testCaseUpdate.tags) &&
        Objects.equals(this.customField, testCaseUpdate.customField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, preconditions, postconditions, title, severity, priority, behavior, type, layer, isFlaky, suiteId, milestoneId, automation, status, attachments, steps, tags, customField);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TestCaseUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
    sb.append("    isFlaky: ").append(toIndentedString(isFlaky)).append("\n");
    sb.append("    suiteId: ").append(toIndentedString(suiteId)).append("\n");
    sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
    sb.append("    automation: ").append(toIndentedString(automation)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    customField: ").append(toIndentedString(customField)).append("\n");
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

