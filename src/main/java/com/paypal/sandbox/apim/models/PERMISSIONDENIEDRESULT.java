/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

/**
 * This is a model class for PERMISSIONDENIEDRESULT type.
 */
public class PERMISSIONDENIEDRESULT {
    private PermissionDenied2IssueEnum issue;
    private PermissionDenied2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PERMISSIONDENIEDRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PermissionDenied2IssueEnum value for issue.
     * @param  description  PermissionDenied2DescriptionEnum value for description.
     */
    public PERMISSIONDENIEDRESULT(
            PermissionDenied2IssueEnum issue,
            PermissionDenied2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PermissionDenied2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDenied2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PermissionDenied2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PermissionDenied2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PermissionDenied2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDenied2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PermissionDenied2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PermissionDenied2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PERMISSIONDENIEDRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PERMISSIONDENIEDRESULT [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PERMISSIONDENIEDRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PERMISSIONDENIEDRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PERMISSIONDENIEDRESULT}.
     */
    public static class Builder {
        private PermissionDenied2IssueEnum issue;
        private PermissionDenied2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PermissionDenied2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PermissionDenied2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PermissionDenied2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PermissionDenied2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PERMISSIONDENIEDRESULT} object using the set fields.
         * @return {@link PERMISSIONDENIEDRESULT}
         */
        public PERMISSIONDENIEDRESULT build() {
            return new PERMISSIONDENIEDRESULT(issue, description);
        }
    }
}
