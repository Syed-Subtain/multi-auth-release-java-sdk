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
 * This is a model class for MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED type.
 */
public class MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED {
    private MaxNumberOfPaymentAttemptsExceededIssueEnum issue;
    private ExceededMaxPaymentAttemptsEnum description;

    /**
     * Default constructor.
     */
    public MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MaxNumberOfPaymentAttemptsExceededIssueEnum value for issue.
     * @param  description  ExceededMaxPaymentAttemptsEnum value for description.
     */
    public MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED(
            MaxNumberOfPaymentAttemptsExceededIssueEnum issue,
            ExceededMaxPaymentAttemptsEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MaxNumberOfPaymentAttemptsExceededIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MaxNumberOfPaymentAttemptsExceededIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MaxNumberOfPaymentAttemptsExceededIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(MaxNumberOfPaymentAttemptsExceededIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ExceededMaxPaymentAttemptsEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ExceededMaxPaymentAttemptsEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ExceededMaxPaymentAttemptsEnum
     */
    @JsonSetter("description")
    public void setDescription(ExceededMaxPaymentAttemptsEnum description) {
        this.description = description;
    }

    /**
     * Converts this MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED}.
     */
    public static class Builder {
        private MaxNumberOfPaymentAttemptsExceededIssueEnum issue;
        private ExceededMaxPaymentAttemptsEnum description;



        /**
         * Setter for issue.
         * @param  issue  MaxNumberOfPaymentAttemptsExceededIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(MaxNumberOfPaymentAttemptsExceededIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ExceededMaxPaymentAttemptsEnum value for description.
         * @return Builder
         */
        public Builder description(ExceededMaxPaymentAttemptsEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED} object using the set fields.
         * @return {@link MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED}
         */
        public MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED build() {
            return new MAXNUMBEROFPAYMENTATTEMPTSEXCEEDED(issue, description);
        }
    }
}
