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
 * Filters
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-03-05T00:04:57.018823+03:00[Europe/Moscow]")
public class Filters {
    public static final String SERIALIZED_NAME_SEARCH = "search";
    public static final String SERIALIZED_NAME_MILESTONE_ID = "milestone_id";
    public static final String SERIALIZED_NAME_SUITE_ID = "suite_id";
    public static final String SERIALIZED_NAME_SEVERITY = "severity";
    public static final String SERIALIZED_NAME_PRIORITY = "priority";
    public static final String SERIALIZED_NAME_TYPE = "type";
    public static final String SERIALIZED_NAME_BEHAVIOR = "behavior";
    public static final String SERIALIZED_NAME_AUTOMATION = "automation";
    public static final String SERIALIZED_NAME_STATUS = "status";
    @SerializedName(SERIALIZED_NAME_SEARCH)
    private String search;
    @SerializedName(SERIALIZED_NAME_MILESTONE_ID)
    private Integer milestoneId;
    @SerializedName(SERIALIZED_NAME_SUITE_ID)
    private Integer suiteId;
    @SerializedName(SERIALIZED_NAME_SEVERITY)
    private String severity;
    @SerializedName(SERIALIZED_NAME_PRIORITY)
    private String priority;
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;
    @SerializedName(SERIALIZED_NAME_BEHAVIOR)
    private String behavior;
    @SerializedName(SERIALIZED_NAME_AUTOMATION)
    private String automation;
    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;


    public Filters search(String search) {

        this.search = search;
        return this;
    }

    /**
     * Provide a string that will be used to search by name.
     *
     * @return search
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Provide a string that will be used to search by name.")

    public String getSearch() {
        return search;
    }


    public void setSearch(String search) {
        this.search = search;
    }


    public Filters milestoneId(Integer milestoneId) {

        this.milestoneId = milestoneId;
        return this;
    }

    /**
     * ID of milestone.
     *
     * @return milestoneId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of milestone.")

    public Integer getMilestoneId() {
        return milestoneId;
    }


    public void setMilestoneId(Integer milestoneId) {
        this.milestoneId = milestoneId;
    }


    public Filters suiteId(Integer suiteId) {

        this.suiteId = suiteId;
        return this;
    }

    /**
     * ID of test suite.
     *
     * @return suiteId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID of test suite.")

    public Integer getSuiteId() {
        return suiteId;
    }


    public void setSuiteId(Integer suiteId) {
        this.suiteId = suiteId;
    }


    public Filters severity(String severity) {

        this.severity = severity;
        return this;
    }

    /**
     * A list of severity values separated by comma. Possible values: undefined, blocker, critical, major, normal, minor, trivial
     *
     * @return severity
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of severity values separated by comma. Possible values: undefined, blocker, critical, major, normal, minor, trivial ")

    public String getSeverity() {
        return severity;
    }


    public void setSeverity(String severity) {
        this.severity = severity;
    }


    public Filters priority(String priority) {

        this.priority = priority;
        return this;
    }

    /**
     * A list of priority values separated by comma. Possible values: undefined, high, medium, low
     *
     * @return priority
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of priority values separated by comma. Possible values: undefined, high, medium, low ")

    public String getPriority() {
        return priority;
    }


    public void setPriority(String priority) {
        this.priority = priority;
    }


    public Filters type(String type) {

        this.type = type;
        return this;
    }

    /**
     * A list of type values separated by comma. Possible values: other, functional smoke, regression, security, usability, performance, acceptance
     *
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of type values separated by comma. Possible values: other, functional smoke, regression, security, usability, performance, acceptance ")

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public Filters behavior(String behavior) {

        this.behavior = behavior;
        return this;
    }

    /**
     * A list of behavior values separated by comma. Possible values: undefined, positive negative, destructive
     *
     * @return behavior
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of behavior values separated by comma. Possible values: undefined, positive negative, destructive ")

    public String getBehavior() {
        return behavior;
    }


    public void setBehavior(String behavior) {
        this.behavior = behavior;
    }


    public Filters automation(String automation) {

        this.automation = automation;
        return this;
    }

    /**
     * A list of values separated by comma. Possible values: is-not-automated, automated to-be-automated
     *
     * @return automation
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of values separated by comma. Possible values: is-not-automated, automated to-be-automated ")

    public String getAutomation() {
        return automation;
    }


    public void setAutomation(String automation) {
        this.automation = automation;
    }


    public Filters status(String status) {

        this.status = status;
        return this;
    }

    /**
     * A list of values separated by comma. Possible values: actual, draft deprecated
     *
     * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "A list of values separated by comma. Possible values: actual, draft deprecated ")

    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Filters filters = (Filters) o;
        return Objects.equals(this.search, filters.search) &&
                Objects.equals(this.milestoneId, filters.milestoneId) &&
                Objects.equals(this.suiteId, filters.suiteId) &&
                Objects.equals(this.severity, filters.severity) &&
                Objects.equals(this.priority, filters.priority) &&
                Objects.equals(this.type, filters.type) &&
                Objects.equals(this.behavior, filters.behavior) &&
                Objects.equals(this.automation, filters.automation) &&
                Objects.equals(this.status, filters.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(search, milestoneId, suiteId, severity, priority, type, behavior, automation, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Filters {\n");
        sb.append("    search: ").append(toIndentedString(search)).append("\n");
        sb.append("    milestoneId: ").append(toIndentedString(milestoneId)).append("\n");
        sb.append("    suiteId: ").append(toIndentedString(suiteId)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    behavior: ").append(toIndentedString(behavior)).append("\n");
        sb.append("    automation: ").append(toIndentedString(automation)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
