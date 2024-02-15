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
 * This is a model class for CannotBeZeroOrNegative1 type.
 */
public class CannotBeZeroOrNegative1 {
    private CannotBeZeroOrNegative1IssueEnum issue;
    private CannotBeZeroOrNegative1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public CannotBeZeroOrNegative1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  CannotBeZeroOrNegative1IssueEnum value for issue.
     * @param  description  CannotBeZeroOrNegative1DescriptionEnum value for description.
     */
    public CannotBeZeroOrNegative1(
            CannotBeZeroOrNegative1IssueEnum issue,
            CannotBeZeroOrNegative1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the CannotBeZeroOrNegative1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CannotBeZeroOrNegative1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for CannotBeZeroOrNegative1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(CannotBeZeroOrNegative1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the CannotBeZeroOrNegative1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CannotBeZeroOrNegative1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for CannotBeZeroOrNegative1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(CannotBeZeroOrNegative1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this CannotBeZeroOrNegative1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CannotBeZeroOrNegative1 [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link CannotBeZeroOrNegative1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CannotBeZeroOrNegative1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link CannotBeZeroOrNegative1}.
     */
    public static class Builder {
        private CannotBeZeroOrNegative1IssueEnum issue;
        private CannotBeZeroOrNegative1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  CannotBeZeroOrNegative1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(CannotBeZeroOrNegative1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  CannotBeZeroOrNegative1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(CannotBeZeroOrNegative1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link CannotBeZeroOrNegative1} object using the set fields.
         * @return {@link CannotBeZeroOrNegative1}
         */
        public CannotBeZeroOrNegative1 build() {
            return new CannotBeZeroOrNegative1(issue, description);
        }
    }
}
