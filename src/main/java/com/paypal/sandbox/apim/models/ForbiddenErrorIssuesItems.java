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
 * This is a model class for ForbiddenErrorIssuesItems type.
 */
public class ForbiddenErrorIssuesItems {
    private PermissionDeniedIssueEnum issue;
    private PermissionDeniedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public ForbiddenErrorIssuesItems() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PermissionDeniedIssueEnum value for issue.
     * @param  description  PermissionDeniedDescriptionEnum value for description.
     */
    public ForbiddenErrorIssuesItems(
            PermissionDeniedIssueEnum issue,
            PermissionDeniedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PermissionDeniedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDeniedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PermissionDeniedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PermissionDeniedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PermissionDeniedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PermissionDeniedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PermissionDeniedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PermissionDeniedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ForbiddenErrorIssuesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ForbiddenErrorIssuesItems [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link ForbiddenErrorIssuesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ForbiddenErrorIssuesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ForbiddenErrorIssuesItems}.
     */
    public static class Builder {
        private PermissionDeniedIssueEnum issue;
        private PermissionDeniedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PermissionDeniedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PermissionDeniedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PermissionDeniedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PermissionDeniedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ForbiddenErrorIssuesItems} object using the set fields.
         * @return {@link ForbiddenErrorIssuesItems}
         */
        public ForbiddenErrorIssuesItems build() {
            return new ForbiddenErrorIssuesItems(issue, description);
        }
    }
}
