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
 * This is a model class for MISSINGPARAMCIPERRORRESP type.
 */
public class MISSINGPARAMCIPERRORRESP {
    private RequiredParamForCustInitiatedPaymentIssueEnum issue;
    private ReqParamCustPresentInitiatorMerchErrorEnum description;

    /**
     * Default constructor.
     */
    public MISSINGPARAMCIPERRORRESP() {
    }

    /**
     * Initialization constructor.
     * @param  issue  RequiredParamForCustInitiatedPaymentIssueEnum value for issue.
     * @param  description  ReqParamCustPresentInitiatorMerchErrorEnum value for description.
     */
    public MISSINGPARAMCIPERRORRESP(
            RequiredParamForCustInitiatedPaymentIssueEnum issue,
            ReqParamCustPresentInitiatorMerchErrorEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the RequiredParamForCustInitiatedPaymentIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public RequiredParamForCustInitiatedPaymentIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for RequiredParamForCustInitiatedPaymentIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(RequiredParamForCustInitiatedPaymentIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ReqParamCustPresentInitiatorMerchErrorEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ReqParamCustPresentInitiatorMerchErrorEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ReqParamCustPresentInitiatorMerchErrorEnum
     */
    @JsonSetter("description")
    public void setDescription(ReqParamCustPresentInitiatorMerchErrorEnum description) {
        this.description = description;
    }

    /**
     * Converts this MISSINGPARAMCIPERRORRESP into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MISSINGPARAMCIPERRORRESP [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link MISSINGPARAMCIPERRORRESP.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MISSINGPARAMCIPERRORRESP.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MISSINGPARAMCIPERRORRESP}.
     */
    public static class Builder {
        private RequiredParamForCustInitiatedPaymentIssueEnum issue;
        private ReqParamCustPresentInitiatorMerchErrorEnum description;



        /**
         * Setter for issue.
         * @param  issue  RequiredParamForCustInitiatedPaymentIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(RequiredParamForCustInitiatedPaymentIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ReqParamCustPresentInitiatorMerchErrorEnum value for description.
         * @return Builder
         */
        public Builder description(ReqParamCustPresentInitiatorMerchErrorEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MISSINGPARAMCIPERRORRESP} object using the set fields.
         * @return {@link MISSINGPARAMCIPERRORRESP}
         */
        public MISSINGPARAMCIPERRORRESP build() {
            return new MISSINGPARAMCIPERRORRESP(issue, description);
        }
    }
}
