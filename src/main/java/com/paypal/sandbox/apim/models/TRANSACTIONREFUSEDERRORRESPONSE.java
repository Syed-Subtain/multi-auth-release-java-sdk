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
 * This is a model class for TRANSACTIONREFUSEDERRORRESPONSE type.
 */
public class TRANSACTIONREFUSEDERRORRESPONSE {
    private TransactionRefused2IssueEnum issue;
    private TransactionRefused2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public TRANSACTIONREFUSEDERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  TransactionRefused2IssueEnum value for issue.
     * @param  description  TransactionRefused2DescriptionEnum value for description.
     */
    public TRANSACTIONREFUSEDERRORRESPONSE(
            TransactionRefused2IssueEnum issue,
            TransactionRefused2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the TransactionRefused2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionRefused2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for TransactionRefused2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(TransactionRefused2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the TransactionRefused2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TransactionRefused2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for TransactionRefused2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(TransactionRefused2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this TRANSACTIONREFUSEDERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TRANSACTIONREFUSEDERRORRESPONSE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link TRANSACTIONREFUSEDERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TRANSACTIONREFUSEDERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link TRANSACTIONREFUSEDERRORRESPONSE}.
     */
    public static class Builder {
        private TransactionRefused2IssueEnum issue;
        private TransactionRefused2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  TransactionRefused2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(TransactionRefused2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  TransactionRefused2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(TransactionRefused2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link TRANSACTIONREFUSEDERRORRESPONSE} object using the set fields.
         * @return {@link TRANSACTIONREFUSEDERRORRESPONSE}
         */
        public TRANSACTIONREFUSEDERRORRESPONSE build() {
            return new TRANSACTIONREFUSEDERRORRESPONSE(issue, description);
        }
    }
}
