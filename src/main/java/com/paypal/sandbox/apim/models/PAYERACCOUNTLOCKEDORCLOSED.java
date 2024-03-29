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
 * This is a model class for PAYERACCOUNTLOCKEDORCLOSED type.
 */
public class PAYERACCOUNTLOCKEDORCLOSED {
    private PayerAccountLockedOrClosedIssueEnum issue;
    private PayerAccountLockedOrClosedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public PAYERACCOUNTLOCKEDORCLOSED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayerAccountLockedOrClosedIssueEnum value for issue.
     * @param  description  PayerAccountLockedOrClosedDescriptionEnum value for description.
     */
    public PAYERACCOUNTLOCKEDORCLOSED(
            PayerAccountLockedOrClosedIssueEnum issue,
            PayerAccountLockedOrClosedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayerAccountLockedOrClosedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerAccountLockedOrClosedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayerAccountLockedOrClosedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayerAccountLockedOrClosedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayerAccountLockedOrClosedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayerAccountLockedOrClosedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayerAccountLockedOrClosedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(PayerAccountLockedOrClosedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYERACCOUNTLOCKEDORCLOSED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYERACCOUNTLOCKEDORCLOSED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYERACCOUNTLOCKEDORCLOSED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYERACCOUNTLOCKEDORCLOSED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYERACCOUNTLOCKEDORCLOSED}.
     */
    public static class Builder {
        private PayerAccountLockedOrClosedIssueEnum issue;
        private PayerAccountLockedOrClosedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  PayerAccountLockedOrClosedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayerAccountLockedOrClosedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayerAccountLockedOrClosedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(PayerAccountLockedOrClosedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYERACCOUNTLOCKEDORCLOSED} object using the set fields.
         * @return {@link PAYERACCOUNTLOCKEDORCLOSED}
         */
        public PAYERACCOUNTLOCKEDORCLOSED build() {
            return new PAYERACCOUNTLOCKEDORCLOSED(issue, description);
        }
    }
}
