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
 * This is a model class for BILLINGAGREEMENTNOTFOUNDRESULT type.
 */
public class BILLINGAGREEMENTNOTFOUNDRESULT {
    private BillingAgreementNotFound2IssueEnum issue;
    private BillingAgreementNotFound2DescriptionEnum description;

    /**
     * Default constructor.
     */
    public BILLINGAGREEMENTNOTFOUNDRESULT() {
    }

    /**
     * Initialization constructor.
     * @param  issue  BillingAgreementNotFound2IssueEnum value for issue.
     * @param  description  BillingAgreementNotFound2DescriptionEnum value for description.
     */
    public BILLINGAGREEMENTNOTFOUNDRESULT(
            BillingAgreementNotFound2IssueEnum issue,
            BillingAgreementNotFound2DescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the BillingAgreementNotFound2IssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAgreementNotFound2IssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for BillingAgreementNotFound2IssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(BillingAgreementNotFound2IssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the BillingAgreementNotFound2DescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public BillingAgreementNotFound2DescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for BillingAgreementNotFound2DescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(BillingAgreementNotFound2DescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this BILLINGAGREEMENTNOTFOUNDRESULT into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BILLINGAGREEMENTNOTFOUNDRESULT [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link BILLINGAGREEMENTNOTFOUNDRESULT.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BILLINGAGREEMENTNOTFOUNDRESULT.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link BILLINGAGREEMENTNOTFOUNDRESULT}.
     */
    public static class Builder {
        private BillingAgreementNotFound2IssueEnum issue;
        private BillingAgreementNotFound2DescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  BillingAgreementNotFound2IssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(BillingAgreementNotFound2IssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  BillingAgreementNotFound2DescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(BillingAgreementNotFound2DescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link BILLINGAGREEMENTNOTFOUNDRESULT} object using the set fields.
         * @return {@link BILLINGAGREEMENTNOTFOUNDRESULT}
         */
        public BILLINGAGREEMENTNOTFOUNDRESULT build() {
            return new BILLINGAGREEMENTNOTFOUNDRESULT(issue, description);
        }
    }
}
