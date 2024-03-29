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
 * This is a model class for INVALIDPARAMETERSYNTAXRESULT type.
 */
public class INVALIDPARAMETERSYNTAXRESULT {
    private InvalidParameterSyntax4IssueEnum issue;
    private InvalidParameterSyntax4DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDPARAMETERSYNTAXRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidParameterSyntax4IssueEnum value for issue.
     * @param  description  InvalidParameterSyntax4DescriptionEnum value for description.
     */
    public INVALIDPARAMETERSYNTAXRESULT(
            InvalidParameterSyntax4IssueEnum issue,
            InvalidParameterSyntax4DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidParameterSyntax4IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterSyntax4IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidParameterSyntax4IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidParameterSyntax4IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidParameterSyntax4DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterSyntax4DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidParameterSyntax4DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidParameterSyntax4DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDPARAMETERSYNTAXRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDPARAMETERSYNTAXRESULT [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link INVALIDPARAMETERSYNTAXRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDPARAMETERSYNTAXRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDPARAMETERSYNTAXRESULT}.
     */
    public static class Builder {
        private InvalidParameterSyntax4IssueEnum issue;
        private InvalidParameterSyntax4DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidParameterSyntax4IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidParameterSyntax4IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidParameterSyntax4DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidParameterSyntax4DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDPARAMETERSYNTAXRESULT} object using the set fields.
         * @return {@link INVALIDPARAMETERSYNTAXRESULT}
         */
        public INVALIDPARAMETERSYNTAXRESULT build() {
            return new INVALIDPARAMETERSYNTAXRESULT(issue, description);
        }
    }
}
