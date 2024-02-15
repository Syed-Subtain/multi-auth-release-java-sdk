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
 * This is a model class for REFERENCEIDNOTFOUND type.
 */
public class REFERENCEIDNOTFOUND {
    private ReferenceIdNotFoundIssueEnum issue;
    private ReferenceIdNotFoundDescriptionEnum description;

    /**
     * Default constructor.
     */
    public REFERENCEIDNOTFOUND() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ReferenceIdNotFoundIssueEnum value for issue.
     * @param  description  ReferenceIdNotFoundDescriptionEnum value for description.
     */
    public REFERENCEIDNOTFOUND(
            ReferenceIdNotFoundIssueEnum issue,
            ReferenceIdNotFoundDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ReferenceIdNotFoundIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReferenceIdNotFoundIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ReferenceIdNotFoundIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ReferenceIdNotFoundIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ReferenceIdNotFoundDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReferenceIdNotFoundDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ReferenceIdNotFoundDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ReferenceIdNotFoundDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this REFERENCEIDNOTFOUND into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "REFERENCEIDNOTFOUND [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link REFERENCEIDNOTFOUND.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link REFERENCEIDNOTFOUND.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link REFERENCEIDNOTFOUND}.
     */
    public static class Builder {
        private ReferenceIdNotFoundIssueEnum issue;
        private ReferenceIdNotFoundDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ReferenceIdNotFoundIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ReferenceIdNotFoundIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ReferenceIdNotFoundDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ReferenceIdNotFoundDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link REFERENCEIDNOTFOUND} object using the set fields.
         * @return {@link REFERENCEIDNOTFOUND}
         */
        public REFERENCEIDNOTFOUND build() {
            return new REFERENCEIDNOTFOUND(issue, description);
        }
    }
}
