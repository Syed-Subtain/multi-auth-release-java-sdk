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
 * This is a model class for InvalidPlatformFeesAccountError type.
 */
public class InvalidPlatformFeesAccountError {
    private InvalidPlatformFeesAccount1IssueEnum issue;
    private InvalidPlatformFeesAccount1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public InvalidPlatformFeesAccountError() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidPlatformFeesAccount1IssueEnum value for issue.
     * @param  description  InvalidPlatformFeesAccount1DescriptionEnum value for description.
     */
    public InvalidPlatformFeesAccountError(
            InvalidPlatformFeesAccount1IssueEnum issue,
            InvalidPlatformFeesAccount1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidPlatformFeesAccount1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPlatformFeesAccount1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidPlatformFeesAccount1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidPlatformFeesAccount1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidPlatformFeesAccount1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPlatformFeesAccount1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidPlatformFeesAccount1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidPlatformFeesAccount1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this InvalidPlatformFeesAccountError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvalidPlatformFeesAccountError [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link InvalidPlatformFeesAccountError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvalidPlatformFeesAccountError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link InvalidPlatformFeesAccountError}.
     */
    public static class Builder {
        private InvalidPlatformFeesAccount1IssueEnum issue;
        private InvalidPlatformFeesAccount1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidPlatformFeesAccount1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidPlatformFeesAccount1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidPlatformFeesAccount1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidPlatformFeesAccount1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link InvalidPlatformFeesAccountError} object using the set fields.
         * @return {@link InvalidPlatformFeesAccountError}
         */
        public InvalidPlatformFeesAccountError build() {
            return new InvalidPlatformFeesAccountError(issue, description);
        }
    }
}
