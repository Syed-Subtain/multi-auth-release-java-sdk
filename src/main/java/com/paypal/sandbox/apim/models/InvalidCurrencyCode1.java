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
 * This is a model class for InvalidCurrencyCode1 type.
 */
public class InvalidCurrencyCode1 {
    private InvalidCurrencyCode1IssueEnum issue;
    private InvalidCurrencyCode1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public InvalidCurrencyCode1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidCurrencyCode1IssueEnum value for issue.
     * @param  description  InvalidCurrencyCode1DescriptionEnum value for description.
     */
    public InvalidCurrencyCode1(
            InvalidCurrencyCode1IssueEnum issue,
            InvalidCurrencyCode1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidCurrencyCode1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidCurrencyCode1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidCurrencyCode1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidCurrencyCode1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidCurrencyCode1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidCurrencyCode1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidCurrencyCode1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidCurrencyCode1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this InvalidCurrencyCode1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvalidCurrencyCode1 [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link InvalidCurrencyCode1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvalidCurrencyCode1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link InvalidCurrencyCode1}.
     */
    public static class Builder {
        private InvalidCurrencyCode1IssueEnum issue;
        private InvalidCurrencyCode1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidCurrencyCode1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidCurrencyCode1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidCurrencyCode1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidCurrencyCode1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link InvalidCurrencyCode1} object using the set fields.
         * @return {@link InvalidCurrencyCode1}
         */
        public InvalidCurrencyCode1 build() {
            return new InvalidCurrencyCode1(issue, description);
        }
    }
}