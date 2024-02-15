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
 * This is a model class for PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR type.
 */
public class PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR {
    private PaymentSourceInfoCannotBeVerified1IssueEnum issue;
    private UnverifiedPaymentSourceAndAddressCombinationEnum description;

    /**
     * Default constructor.
     */
    public PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PaymentSourceInfoCannotBeVerified1IssueEnum value for issue.
     * @param  description  UnverifiedPaymentSourceAndAddressCombinationEnum value for description.
     */
    public PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR(
            PaymentSourceInfoCannotBeVerified1IssueEnum issue,
            UnverifiedPaymentSourceAndAddressCombinationEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PaymentSourceInfoCannotBeVerified1IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceInfoCannotBeVerified1IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PaymentSourceInfoCannotBeVerified1IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PaymentSourceInfoCannotBeVerified1IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the UnverifiedPaymentSourceAndAddressCombinationEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UnverifiedPaymentSourceAndAddressCombinationEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for UnverifiedPaymentSourceAndAddressCombinationEnum
     */
    @JsonSetter("description")
    public void setDescription(UnverifiedPaymentSourceAndAddressCombinationEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR}.
     */
    public static class Builder {
        private PaymentSourceInfoCannotBeVerified1IssueEnum issue;
        private UnverifiedPaymentSourceAndAddressCombinationEnum description;



        /**
         * Setter for issue.
         * @param  issue  PaymentSourceInfoCannotBeVerified1IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PaymentSourceInfoCannotBeVerified1IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  UnverifiedPaymentSourceAndAddressCombinationEnum value for
         *         description.
         * @return Builder
         */
        public Builder description(UnverifiedPaymentSourceAndAddressCombinationEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR} object using the set fields.
         * @return {@link PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR}
         */
        public PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR build() {
            return new PAYMENTSOURCEINFOCANNOTBEVERIFIEDERROR(issue, description);
        }
    }
}
