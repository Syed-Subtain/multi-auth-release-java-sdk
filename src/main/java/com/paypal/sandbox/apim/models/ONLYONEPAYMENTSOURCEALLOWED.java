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
 * This is a model class for ONLYONEPAYMENTSOURCEALLOWED type.
 */
public class ONLYONEPAYMENTSOURCEALLOWED {
    private OnlyOnePaymentSourceAllowedIssueEnum issue;
    private OnlyOnePaymentSourceAllowedDescriptionEnum description;

    /**
     * Default constructor.
     */
    public ONLYONEPAYMENTSOURCEALLOWED() {
    }

    /**
     * Initialization constructor.
     * @param  issue  OnlyOnePaymentSourceAllowedIssueEnum value for issue.
     * @param  description  OnlyOnePaymentSourceAllowedDescriptionEnum value for description.
     */
    public ONLYONEPAYMENTSOURCEALLOWED(
            OnlyOnePaymentSourceAllowedIssueEnum issue,
            OnlyOnePaymentSourceAllowedDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the OnlyOnePaymentSourceAllowedIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnlyOnePaymentSourceAllowedIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for OnlyOnePaymentSourceAllowedIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(OnlyOnePaymentSourceAllowedIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the OnlyOnePaymentSourceAllowedDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OnlyOnePaymentSourceAllowedDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for OnlyOnePaymentSourceAllowedDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(OnlyOnePaymentSourceAllowedDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this ONLYONEPAYMENTSOURCEALLOWED into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ONLYONEPAYMENTSOURCEALLOWED [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link ONLYONEPAYMENTSOURCEALLOWED.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ONLYONEPAYMENTSOURCEALLOWED.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ONLYONEPAYMENTSOURCEALLOWED}.
     */
    public static class Builder {
        private OnlyOnePaymentSourceAllowedIssueEnum issue;
        private OnlyOnePaymentSourceAllowedDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  OnlyOnePaymentSourceAllowedIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(OnlyOnePaymentSourceAllowedIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  OnlyOnePaymentSourceAllowedDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(OnlyOnePaymentSourceAllowedDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ONLYONEPAYMENTSOURCEALLOWED} object using the set fields.
         * @return {@link ONLYONEPAYMENTSOURCEALLOWED}
         */
        public ONLYONEPAYMENTSOURCEALLOWED build() {
            return new ONLYONEPAYMENTSOURCEALLOWED(issue, description);
        }
    }
}
