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
 * This is a model class for PAYMENTSOURCEMISMATCH type.
 */
public class PAYMENTSOURCEMISMATCH {
    private PaymentSourceMismatchIssueEnum issue;
    private PaymentSourceMismatchDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYMENTSOURCEMISMATCH() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaymentSourceMismatchIssueEnum value for issue.
     * @param  description  PaymentSourceMismatchDescriptionEnum value for description.
     */
    public PAYMENTSOURCEMISMATCH(
            PaymentSourceMismatchIssueEnum issue,
            PaymentSourceMismatchDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaymentSourceMismatchIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceMismatchIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaymentSourceMismatchIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaymentSourceMismatchIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaymentSourceMismatchDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceMismatchDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaymentSourceMismatchDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PaymentSourceMismatchDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYMENTSOURCEMISMATCH into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYMENTSOURCEMISMATCH [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PAYMENTSOURCEMISMATCH.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYMENTSOURCEMISMATCH.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYMENTSOURCEMISMATCH}.
     */
    public static class Builder {
        private PaymentSourceMismatchIssueEnum issue;
        private PaymentSourceMismatchDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaymentSourceMismatchIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaymentSourceMismatchIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaymentSourceMismatchDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PaymentSourceMismatchDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYMENTSOURCEMISMATCH} object using the set fields.
         * @return {@link PAYMENTSOURCEMISMATCH}
         */
        public PAYMENTSOURCEMISMATCH build() {
            return new PAYMENTSOURCEMISMATCH(issue, description);
        }
    }
}
