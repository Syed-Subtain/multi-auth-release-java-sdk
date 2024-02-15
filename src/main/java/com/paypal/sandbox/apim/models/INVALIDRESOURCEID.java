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
 * This is a model class for INVALIDRESOURCEID type.
 */
public class INVALIDRESOURCEID {
    private InvalidResourceIdIssueEnum issue;
    private InvalidResourceIdDescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDRESOURCEID() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidResourceIdIssueEnum value for issue.
     * @param  description  InvalidResourceIdDescriptionEnum value for description.
     */
    public INVALIDRESOURCEID(
            InvalidResourceIdIssueEnum issue,
            InvalidResourceIdDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidResourceIdIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidResourceIdIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidResourceIdIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidResourceIdIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidResourceIdDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidResourceIdDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidResourceIdDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidResourceIdDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDRESOURCEID into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDRESOURCEID [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link INVALIDRESOURCEID.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDRESOURCEID.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDRESOURCEID}.
     */
    public static class Builder {
        private InvalidResourceIdIssueEnum issue;
        private InvalidResourceIdDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidResourceIdIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidResourceIdIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidResourceIdDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidResourceIdDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDRESOURCEID} object using the set fields.
         * @return {@link INVALIDRESOURCEID}
         */
        public INVALIDRESOURCEID build() {
            return new INVALIDRESOURCEID(issue, description);
        }
    }
}
