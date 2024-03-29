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
 * This is a model class for INVALIDSTRINGLENGTHERROR1 type.
 */
public class INVALIDSTRINGLENGTHERROR1 {
    private InvalidStringLength3IssueEnum issue;
    private InvalidStringLength3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDSTRINGLENGTHERROR1() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidStringLength3IssueEnum value for issue.
     * @param  description  InvalidStringLength3DescriptionEnum value for description.
     */
    public INVALIDSTRINGLENGTHERROR1(
            InvalidStringLength3IssueEnum issue,
            InvalidStringLength3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidStringLength3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringLength3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidStringLength3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidStringLength3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidStringLength3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidStringLength3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidStringLength3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidStringLength3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDSTRINGLENGTHERROR1 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDSTRINGLENGTHERROR1 [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link INVALIDSTRINGLENGTHERROR1.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDSTRINGLENGTHERROR1.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDSTRINGLENGTHERROR1}.
     */
    public static class Builder {
        private InvalidStringLength3IssueEnum issue;
        private InvalidStringLength3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidStringLength3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidStringLength3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidStringLength3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidStringLength3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDSTRINGLENGTHERROR1} object using the set fields.
         * @return {@link INVALIDSTRINGLENGTHERROR1}
         */
        public INVALIDSTRINGLENGTHERROR1 build() {
            return new INVALIDSTRINGLENGTHERROR1(issue, description);
        }
    }
}
