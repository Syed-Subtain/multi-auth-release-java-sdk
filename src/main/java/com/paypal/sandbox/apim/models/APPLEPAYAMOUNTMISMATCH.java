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
 * This is a model class for APPLEPAYAMOUNTMISMATCH type.
 */
public class APPLEPAYAMOUNTMISMATCH {
    private ApplePayAmountMismatchIssueEnum issue;
    private ApplePayAmountMismatchDescriptionEnum description;

    /**
     * Default constructor.
     */
    public APPLEPAYAMOUNTMISMATCH() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ApplePayAmountMismatchIssueEnum value for issue.
     * @param  description  ApplePayAmountMismatchDescriptionEnum value for description.
     */
    public APPLEPAYAMOUNTMISMATCH(
            ApplePayAmountMismatchIssueEnum issue,
            ApplePayAmountMismatchDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ApplePayAmountMismatchIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayAmountMismatchIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ApplePayAmountMismatchIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(ApplePayAmountMismatchIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ApplePayAmountMismatchDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayAmountMismatchDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ApplePayAmountMismatchDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(ApplePayAmountMismatchDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this APPLEPAYAMOUNTMISMATCH into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "APPLEPAYAMOUNTMISMATCH [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link APPLEPAYAMOUNTMISMATCH.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link APPLEPAYAMOUNTMISMATCH.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link APPLEPAYAMOUNTMISMATCH}.
     */
    public static class Builder {
        private ApplePayAmountMismatchIssueEnum issue;
        private ApplePayAmountMismatchDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  ApplePayAmountMismatchIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(ApplePayAmountMismatchIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ApplePayAmountMismatchDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(ApplePayAmountMismatchDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link APPLEPAYAMOUNTMISMATCH} object using the set fields.
         * @return {@link APPLEPAYAMOUNTMISMATCH}
         */
        public APPLEPAYAMOUNTMISMATCH build() {
            return new APPLEPAYAMOUNTMISMATCH(issue, description);
        }
    }
}
