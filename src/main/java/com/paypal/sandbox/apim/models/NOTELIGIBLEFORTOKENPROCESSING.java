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
 * This is a model class for NOTELIGIBLEFORTOKENPROCESSING type.
 */
public class NOTELIGIBLEFORTOKENPROCESSING {
    private NotEligibleForTokenProcessingIssueEnum issue;
    private NotEligibleForTokenProcessingDescriptionEnum description;

    /**
     * Default constructor.
     */
    public NOTELIGIBLEFORTOKENPROCESSING() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligibleForTokenProcessingIssueEnum value for issue.
     * @param  description  NotEligibleForTokenProcessingDescriptionEnum value for description.
     */
    public NOTELIGIBLEFORTOKENPROCESSING(
            NotEligibleForTokenProcessingIssueEnum issue,
            NotEligibleForTokenProcessingDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligibleForTokenProcessingIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForTokenProcessingIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligibleForTokenProcessingIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligibleForTokenProcessingIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotEligibleForTokenProcessingDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForTokenProcessingDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotEligibleForTokenProcessingDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(NotEligibleForTokenProcessingDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this NOTELIGIBLEFORTOKENPROCESSING into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NOTELIGIBLEFORTOKENPROCESSING [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link NOTELIGIBLEFORTOKENPROCESSING.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NOTELIGIBLEFORTOKENPROCESSING.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link NOTELIGIBLEFORTOKENPROCESSING}.
     */
    public static class Builder {
        private NotEligibleForTokenProcessingIssueEnum issue;
        private NotEligibleForTokenProcessingDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligibleForTokenProcessingIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligibleForTokenProcessingIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotEligibleForTokenProcessingDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(NotEligibleForTokenProcessingDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link NOTELIGIBLEFORTOKENPROCESSING} object using the set fields.
         * @return {@link NOTELIGIBLEFORTOKENPROCESSING}
         */
        public NOTELIGIBLEFORTOKENPROCESSING build() {
            return new NOTELIGIBLEFORTOKENPROCESSING(issue, description);
        }
    }
}
