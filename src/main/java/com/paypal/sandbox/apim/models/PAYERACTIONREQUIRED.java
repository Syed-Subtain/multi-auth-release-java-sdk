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
 * This is a model class for PAYERACTIONREQUIRED type.
 */
public class PAYERACTIONREQUIRED {
    private PayerActionRequiredIssueEnum issue;
    private PayerActionRequiredDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYERACTIONREQUIRED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayerActionRequiredIssueEnum value for issue.
     * @param  description  PayerActionRequiredDescriptionEnum value for description.
     */
    public PAYERACTIONREQUIRED(
            PayerActionRequiredIssueEnum issue,
            PayerActionRequiredDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayerActionRequiredIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerActionRequiredIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayerActionRequiredIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayerActionRequiredIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayerActionRequiredDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerActionRequiredDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayerActionRequiredDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PayerActionRequiredDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYERACTIONREQUIRED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYERACTIONREQUIRED [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PAYERACTIONREQUIRED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYERACTIONREQUIRED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYERACTIONREQUIRED}.
     */
    public static class Builder {
        private PayerActionRequiredIssueEnum issue;
        private PayerActionRequiredDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PayerActionRequiredIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayerActionRequiredIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayerActionRequiredDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PayerActionRequiredDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYERACTIONREQUIRED} object using the set fields.
         * @return {@link PAYERACTIONREQUIRED}
         */
        public PAYERACTIONREQUIRED build() {
            return new PAYERACTIONREQUIRED(issue, description);
        }
    }
}
