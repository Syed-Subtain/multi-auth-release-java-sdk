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
 * This is a model class for InvalidPlatformFeesAmount1 type.
 */
public class InvalidPlatformFeesAmount1 {
    private InvalidPlatformFeesAmount1IssueEnum issue;
    private InvalidPlatformFeesAmount1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public InvalidPlatformFeesAmount1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidPlatformFeesAmount1IssueEnum value for issue.
     * @param  description  InvalidPlatformFeesAmount1DescriptionEnum value for description.
     */
    public InvalidPlatformFeesAmount1(
            InvalidPlatformFeesAmount1IssueEnum issue,
            InvalidPlatformFeesAmount1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidPlatformFeesAmount1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPlatformFeesAmount1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidPlatformFeesAmount1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidPlatformFeesAmount1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidPlatformFeesAmount1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPlatformFeesAmount1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidPlatformFeesAmount1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidPlatformFeesAmount1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this InvalidPlatformFeesAmount1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvalidPlatformFeesAmount1 [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link InvalidPlatformFeesAmount1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvalidPlatformFeesAmount1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link InvalidPlatformFeesAmount1}.
     */
    public static class Builder {
        private InvalidPlatformFeesAmount1IssueEnum issue;
        private InvalidPlatformFeesAmount1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidPlatformFeesAmount1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidPlatformFeesAmount1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidPlatformFeesAmount1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidPlatformFeesAmount1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link InvalidPlatformFeesAmount1} object using the set fields.
         * @return {@link InvalidPlatformFeesAmount1}
         */
        public InvalidPlatformFeesAmount1 build() {
            return new InvalidPlatformFeesAmount1(issue, description);
        }
    }
}
