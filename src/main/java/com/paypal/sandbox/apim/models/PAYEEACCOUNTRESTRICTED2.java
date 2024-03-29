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
 * This is a model class for PAYEEACCOUNTRESTRICTED2 type.
 */
public class PAYEEACCOUNTRESTRICTED2 {
    private PayeeAccountRestrictedIssueEnum issue;
    private PayeeAccountRestrictedDescription1Enum description;

    /**
     * Default constructor.
     */
    public PAYEEACCOUNTRESTRICTED2() {
    }

    /**
     * Initialization constructor.
     * @param  issue  PayeeAccountRestrictedIssueEnum value for issue.
     * @param  description  PayeeAccountRestrictedDescription1Enum value for description.
     */
    public PAYEEACCOUNTRESTRICTED2(
            PayeeAccountRestrictedIssueEnum issue,
            PayeeAccountRestrictedDescription1Enum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the PayeeAccountRestrictedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeAccountRestrictedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for PayeeAccountRestrictedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(PayeeAccountRestrictedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PayeeAccountRestrictedDescription1Enum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeeAccountRestrictedDescription1Enum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PayeeAccountRestrictedDescription1Enum
     */
    @JsonSetter("description")
    public void setDescription(PayeeAccountRestrictedDescription1Enum description) {
        this.description = description;
    }

    /**
     * Converts this PAYEEACCOUNTRESTRICTED2 into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYEEACCOUNTRESTRICTED2 [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link PAYEEACCOUNTRESTRICTED2.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYEEACCOUNTRESTRICTED2.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYEEACCOUNTRESTRICTED2}.
     */
    public static class Builder {
        private PayeeAccountRestrictedIssueEnum issue;
        private PayeeAccountRestrictedDescription1Enum description;



        /**
         * Setter for issue.
         * @param  issue  PayeeAccountRestrictedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(PayeeAccountRestrictedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PayeeAccountRestrictedDescription1Enum value for description.
         * @return Builder
         */
        public Builder description(PayeeAccountRestrictedDescription1Enum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYEEACCOUNTRESTRICTED2} object using the set fields.
         * @return {@link PAYEEACCOUNTRESTRICTED2}
         */
        public PAYEEACCOUNTRESTRICTED2 build() {
            return new PAYEEACCOUNTRESTRICTED2(issue, description);
        }
    }
}
