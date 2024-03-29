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
 * This is a model class for UnprocessableEntityErrorIssuesItems type.
 */
public class UnprocessableEntityErrorIssuesItems {
    private AmountMismatchIssueEnum issue;
    private AmountMismatchDescriptionEnum description;

    /**
     * Default constructor.
     */
    public UnprocessableEntityErrorIssuesItems() {
    }

    /**
     * Initialization constructor.
     * @param  issue  AmountMismatchIssueEnum value for issue.
     * @param  description  AmountMismatchDescriptionEnum value for description.
     */
    public UnprocessableEntityErrorIssuesItems(
            AmountMismatchIssueEnum issue,
            AmountMismatchDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the AmountMismatchIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountMismatchIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for AmountMismatchIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(AmountMismatchIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the AmountMismatchDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AmountMismatchDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for AmountMismatchDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(AmountMismatchDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this UnprocessableEntityErrorIssuesItems into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "UnprocessableEntityErrorIssuesItems [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link UnprocessableEntityErrorIssuesItems.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link UnprocessableEntityErrorIssuesItems.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link UnprocessableEntityErrorIssuesItems}.
     */
    public static class Builder {
        private AmountMismatchIssueEnum issue;
        private AmountMismatchDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  AmountMismatchIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(AmountMismatchIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  AmountMismatchDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(AmountMismatchDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link UnprocessableEntityErrorIssuesItems} object using the set fields.
         * @return {@link UnprocessableEntityErrorIssuesItems}
         */
        public UnprocessableEntityErrorIssuesItems build() {
            return new UnprocessableEntityErrorIssuesItems(issue, description);
        }
    }
}
