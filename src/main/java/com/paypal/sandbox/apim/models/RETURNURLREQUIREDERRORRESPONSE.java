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
 * This is a model class for RETURNURLREQUIREDERRORRESPONSE type.
 */
public class RETURNURLREQUIREDERRORRESPONSE {
    private ReturnUrlRequired2IssueEnum issue;
    private ReturnUrlRequired2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public RETURNURLREQUIREDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ReturnUrlRequired2IssueEnum value for issue.
     * @param  description  ReturnUrlRequired2DescriptionEnum value for description.
     */
    public RETURNURLREQUIREDERRORRESPONSE(
            ReturnUrlRequired2IssueEnum issue,
            ReturnUrlRequired2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ReturnUrlRequired2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReturnUrlRequired2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ReturnUrlRequired2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ReturnUrlRequired2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ReturnUrlRequired2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReturnUrlRequired2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ReturnUrlRequired2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ReturnUrlRequired2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this RETURNURLREQUIREDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "RETURNURLREQUIREDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link RETURNURLREQUIREDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RETURNURLREQUIREDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link RETURNURLREQUIREDERRORRESPONSE}.
     */
    public static class Builder {
        private ReturnUrlRequired2IssueEnum issue;
        private ReturnUrlRequired2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ReturnUrlRequired2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ReturnUrlRequired2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ReturnUrlRequired2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ReturnUrlRequired2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link RETURNURLREQUIREDERRORRESPONSE} object using the set fields.
         * @return {@link RETURNURLREQUIREDERRORRESPONSE}
         */
        public RETURNURLREQUIREDERRORRESPONSE build() {
            return new RETURNURLREQUIREDERRORRESPONSE(issue, description);
        }
    }
}
