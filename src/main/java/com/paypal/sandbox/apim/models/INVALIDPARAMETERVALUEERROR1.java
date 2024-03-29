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
 * This is a model class for INVALIDPARAMETERVALUEERROR1 type.
 */
public class INVALIDPARAMETERVALUEERROR1 {
    private InvalidParameterValue3IssueEnum issue;
    private InvalidParameterValue3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDPARAMETERVALUEERROR1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidParameterValue3IssueEnum value for issue.
     * @param  description  InvalidParameterValue3DescriptionEnum value for description.
     */
    public INVALIDPARAMETERVALUEERROR1(
            InvalidParameterValue3IssueEnum issue,
            InvalidParameterValue3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidParameterValue3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterValue3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidParameterValue3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidParameterValue3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidParameterValue3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidParameterValue3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidParameterValue3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidParameterValue3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDPARAMETERVALUEERROR1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDPARAMETERVALUEERROR1 [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link INVALIDPARAMETERVALUEERROR1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDPARAMETERVALUEERROR1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDPARAMETERVALUEERROR1}.
     */
    public static class Builder {
        private InvalidParameterValue3IssueEnum issue;
        private InvalidParameterValue3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidParameterValue3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidParameterValue3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidParameterValue3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidParameterValue3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDPARAMETERVALUEERROR1} object using the set fields.
         * @return {@link INVALIDPARAMETERVALUEERROR1}
         */
        public INVALIDPARAMETERVALUEERROR1 build() {
            return new INVALIDPARAMETERVALUEERROR1(issue, description);
        }
    }
}
