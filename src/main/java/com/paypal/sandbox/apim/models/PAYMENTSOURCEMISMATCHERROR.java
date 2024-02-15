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
 * This is a model class for PAYMENTSOURCEMISMATCHERROR type.
 */
public class PAYMENTSOURCEMISMATCHERROR {
    private PaymentSourceMismatch1IssueEnum issue;
    private PaymentSourceMismatch1DescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYMENTSOURCEMISMATCHERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaymentSourceMismatch1IssueEnum value for issue.
     * @param  description  PaymentSourceMismatch1DescriptionEnum value for description.
     */
    public PAYMENTSOURCEMISMATCHERROR(
            PaymentSourceMismatch1IssueEnum issue,
            PaymentSourceMismatch1DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaymentSourceMismatch1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceMismatch1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaymentSourceMismatch1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaymentSourceMismatch1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaymentSourceMismatch1DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceMismatch1DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaymentSourceMismatch1DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PaymentSourceMismatch1DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYMENTSOURCEMISMATCHERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYMENTSOURCEMISMATCHERROR [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYMENTSOURCEMISMATCHERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYMENTSOURCEMISMATCHERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYMENTSOURCEMISMATCHERROR}.
     */
    public static class Builder {
        private PaymentSourceMismatch1IssueEnum issue;
        private PaymentSourceMismatch1DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaymentSourceMismatch1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaymentSourceMismatch1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaymentSourceMismatch1DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PaymentSourceMismatch1DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYMENTSOURCEMISMATCHERROR} object using the set fields.
         * @return {@link PAYMENTSOURCEMISMATCHERROR}
         */
        public PAYMENTSOURCEMISMATCHERROR build() {
            return new PAYMENTSOURCEMISMATCHERROR(issue, description);
        }
    }
}
