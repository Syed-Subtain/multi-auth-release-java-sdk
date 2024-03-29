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
 * This is a model class for InvalidParameterSyntaxError type.
 */
public class InvalidParameterSyntaxError {
    private InvalidParameterSyntax2IssueEnum issue;
    private InvalidParameterSyntax2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public InvalidParameterSyntaxError() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidParameterSyntax2IssueEnum value for issue.
     * @param  description  InvalidParameterSyntax2DescriptionEnum value for description.
     */
    public InvalidParameterSyntaxError(
            InvalidParameterSyntax2IssueEnum issue,
            InvalidParameterSyntax2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidParameterSyntax2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterSyntax2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidParameterSyntax2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidParameterSyntax2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidParameterSyntax2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterSyntax2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidParameterSyntax2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidParameterSyntax2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this InvalidParameterSyntaxError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "InvalidParameterSyntaxError [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link InvalidParameterSyntaxError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link InvalidParameterSyntaxError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link InvalidParameterSyntaxError}.
     */
    public static class Builder {
        private InvalidParameterSyntax2IssueEnum issue;
        private InvalidParameterSyntax2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidParameterSyntax2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidParameterSyntax2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidParameterSyntax2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidParameterSyntax2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link InvalidParameterSyntaxError} object using the set fields.
         * @return {@link InvalidParameterSyntaxError}
         */
        public InvalidParameterSyntaxError build() {
            return new InvalidParameterSyntaxError(issue, description);
        }
    }
}
