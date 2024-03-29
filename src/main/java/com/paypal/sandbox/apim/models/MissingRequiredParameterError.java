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
 * This is a model class for MissingRequiredParameterError type.
 */
public class MissingRequiredParameterError {
    private MissingRequiredParameter2IssueEnum issue;
    private MissingRequiredParameter2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public MissingRequiredParameterError() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MissingRequiredParameter2IssueEnum value for issue.
     * @param  description  MissingRequiredParameter2DescriptionEnum value for description.
     */
    public MissingRequiredParameterError(
            MissingRequiredParameter2IssueEnum issue,
            MissingRequiredParameter2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MissingRequiredParameter2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MissingRequiredParameter2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MissingRequiredParameter2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the MissingRequiredParameter2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MissingRequiredParameter2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for MissingRequiredParameter2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(MissingRequiredParameter2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this MissingRequiredParameterError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MissingRequiredParameterError [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link MissingRequiredParameterError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MissingRequiredParameterError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MissingRequiredParameterError}.
     */
    public static class Builder {
        private MissingRequiredParameter2IssueEnum issue;
        private MissingRequiredParameter2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  MissingRequiredParameter2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MissingRequiredParameter2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  MissingRequiredParameter2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(MissingRequiredParameter2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MissingRequiredParameterError} object using the set fields.
         * @return {@link MissingRequiredParameterError}
         */
        public MissingRequiredParameterError build() {
            return new MissingRequiredParameterError(issue, description);
        }
    }
}
