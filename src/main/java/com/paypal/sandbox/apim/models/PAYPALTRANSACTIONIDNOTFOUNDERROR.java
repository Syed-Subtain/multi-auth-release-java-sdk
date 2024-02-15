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
 * This is a model class for PAYPALTRANSACTIONIDNOTFOUNDERROR type.
 */
public class PAYPALTRANSACTIONIDNOTFOUNDERROR {
    private PaypalTransactionIdNotFound1IssueEnum issue;
    private PaypalTransactionIdNotFound1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYPALTRANSACTIONIDNOTFOUNDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaypalTransactionIdNotFound1IssueEnum value for issue.
     * @param  description  PaypalTransactionIdNotFound1DescriptionEnum value for description.
     */
    public PAYPALTRANSACTIONIDNOTFOUNDERROR(
            PaypalTransactionIdNotFound1IssueEnum issue,
            PaypalTransactionIdNotFound1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaypalTransactionIdNotFound1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalTransactionIdNotFound1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaypalTransactionIdNotFound1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaypalTransactionIdNotFound1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaypalTransactionIdNotFound1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalTransactionIdNotFound1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaypalTransactionIdNotFound1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PaypalTransactionIdNotFound1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYPALTRANSACTIONIDNOTFOUNDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYPALTRANSACTIONIDNOTFOUNDERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PAYPALTRANSACTIONIDNOTFOUNDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYPALTRANSACTIONIDNOTFOUNDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYPALTRANSACTIONIDNOTFOUNDERROR}.
     */
    public static class Builder {
        private PaypalTransactionIdNotFound1IssueEnum issue;
        private PaypalTransactionIdNotFound1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaypalTransactionIdNotFound1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaypalTransactionIdNotFound1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaypalTransactionIdNotFound1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PaypalTransactionIdNotFound1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYPALTRANSACTIONIDNOTFOUNDERROR} object using the set fields.
         * @return {@link PAYPALTRANSACTIONIDNOTFOUNDERROR}
         */
        public PAYPALTRANSACTIONIDNOTFOUNDERROR build() {
            return new PAYPALTRANSACTIONIDNOTFOUNDERROR(issue, description);
        }
    }
}
