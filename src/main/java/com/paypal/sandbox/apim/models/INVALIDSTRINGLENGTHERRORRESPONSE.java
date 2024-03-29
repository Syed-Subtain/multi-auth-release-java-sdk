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
 * This is a model class for INVALIDSTRINGLENGTHERRORRESPONSE type.
 */
public class INVALIDSTRINGLENGTHERRORRESPONSE {
    private InvalidStringLength5IssueEnum issue;
    private InvalidStringLength5DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDSTRINGLENGTHERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidStringLength5IssueEnum value for issue.
     * @param  description  InvalidStringLength5DescriptionEnum value for description.
     */
    public INVALIDSTRINGLENGTHERRORRESPONSE(
            InvalidStringLength5IssueEnum issue,
            InvalidStringLength5DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidStringLength5IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringLength5IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidStringLength5IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidStringLength5IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidStringLength5DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringLength5DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidStringLength5DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidStringLength5DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDSTRINGLENGTHERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDSTRINGLENGTHERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link INVALIDSTRINGLENGTHERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDSTRINGLENGTHERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDSTRINGLENGTHERRORRESPONSE}.
     */
    public static class Builder {
        private InvalidStringLength5IssueEnum issue;
        private InvalidStringLength5DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidStringLength5IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidStringLength5IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidStringLength5DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidStringLength5DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDSTRINGLENGTHERRORRESPONSE} object using the set fields.
         * @return {@link INVALIDSTRINGLENGTHERRORRESPONSE}
         */
        public INVALIDSTRINGLENGTHERRORRESPONSE build() {
            return new INVALIDSTRINGLENGTHERRORRESPONSE(issue, description);
        }
    }
}
