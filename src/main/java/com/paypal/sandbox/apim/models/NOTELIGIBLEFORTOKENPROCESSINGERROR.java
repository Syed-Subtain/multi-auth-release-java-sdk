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
 * This is a model class for NOTELIGIBLEFORTOKENPROCESSINGERROR type.
 */
public class NOTELIGIBLEFORTOKENPROCESSINGERROR {
    private NotEligibleForTokenProcessing1IssueEnum issue;
    private NotEligibleForTokenProcessing1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public NOTELIGIBLEFORTOKENPROCESSINGERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligibleForTokenProcessing1IssueEnum value for issue.
     * @param  description  NotEligibleForTokenProcessing1DescriptionEnum value for description.
     */
    public NOTELIGIBLEFORTOKENPROCESSINGERROR(
            NotEligibleForTokenProcessing1IssueEnum issue,
            NotEligibleForTokenProcessing1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligibleForTokenProcessing1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForTokenProcessing1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligibleForTokenProcessing1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligibleForTokenProcessing1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the NotEligibleForTokenProcessing1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligibleForTokenProcessing1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for NotEligibleForTokenProcessing1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(NotEligibleForTokenProcessing1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this NOTELIGIBLEFORTOKENPROCESSINGERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "NOTELIGIBLEFORTOKENPROCESSINGERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link NOTELIGIBLEFORTOKENPROCESSINGERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link NOTELIGIBLEFORTOKENPROCESSINGERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link NOTELIGIBLEFORTOKENPROCESSINGERROR}.
     */
    public static class Builder {
        private NotEligibleForTokenProcessing1IssueEnum issue;
        private NotEligibleForTokenProcessing1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligibleForTokenProcessing1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligibleForTokenProcessing1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  NotEligibleForTokenProcessing1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(NotEligibleForTokenProcessing1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link NOTELIGIBLEFORTOKENPROCESSINGERROR} object using the set fields.
         * @return {@link NOTELIGIBLEFORTOKENPROCESSINGERROR}
         */
        public NOTELIGIBLEFORTOKENPROCESSINGERROR build() {
            return new NOTELIGIBLEFORTOKENPROCESSINGERROR(issue, description);
        }
    }
}
