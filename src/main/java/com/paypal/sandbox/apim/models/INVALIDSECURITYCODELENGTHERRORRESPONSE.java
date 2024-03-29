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
 * This is a model class for INVALIDSECURITYCODELENGTHERRORRESPONSE type.
 */
public class INVALIDSECURITYCODELENGTHERRORRESPONSE {
    private InvalidSecurityCodeLength3IssueEnum issue;
    private InvalidSecurityCodeLength3DescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDSECURITYCODELENGTHERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidSecurityCodeLength3IssueEnum value for issue.
     * @param  description  InvalidSecurityCodeLength3DescriptionEnum value for description.
     */
    public INVALIDSECURITYCODELENGTHERRORRESPONSE(
            InvalidSecurityCodeLength3IssueEnum issue,
            InvalidSecurityCodeLength3DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidSecurityCodeLength3IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidSecurityCodeLength3IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidSecurityCodeLength3IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidSecurityCodeLength3IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidSecurityCodeLength3DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidSecurityCodeLength3DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidSecurityCodeLength3DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidSecurityCodeLength3DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDSECURITYCODELENGTHERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDSECURITYCODELENGTHERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link INVALIDSECURITYCODELENGTHERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDSECURITYCODELENGTHERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDSECURITYCODELENGTHERRORRESPONSE}.
     */
    public static class Builder {
        private InvalidSecurityCodeLength3IssueEnum issue;
        private InvalidSecurityCodeLength3DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidSecurityCodeLength3IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidSecurityCodeLength3IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidSecurityCodeLength3DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidSecurityCodeLength3DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDSECURITYCODELENGTHERRORRESPONSE} object using the set fields.
         * @return {@link INVALIDSECURITYCODELENGTHERRORRESPONSE}
         */
        public INVALIDSECURITYCODELENGTHERRORRESPONSE build() {
            return new INVALIDSECURITYCODELENGTHERRORRESPONSE(issue, description);
        }
    }
}
