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
 * This is a model class for PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE type.
 */
public class PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE {
    private NotEligiblePaypalTxIdProcessingIssueEnum issue;
    private PaypalTxIdProcessingPermissionNeededDescEnum description;

    /**
     * Default constructor.
     */
    public PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligiblePaypalTxIdProcessingIssueEnum value for issue.
     * @param  description  PaypalTxIdProcessingPermissionNeededDescEnum value for description.
     */
    public PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE(
            NotEligiblePaypalTxIdProcessingIssueEnum issue,
            PaypalTxIdProcessingPermissionNeededDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligiblePaypalTxIdProcessingIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligiblePaypalTxIdProcessingIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligiblePaypalTxIdProcessingIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligiblePaypalTxIdProcessingIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaypalTxIdProcessingPermissionNeededDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalTxIdProcessingPermissionNeededDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaypalTxIdProcessingPermissionNeededDescEnum
     */
    @JsonSetter("description")
    public void setDescription(PaypalTxIdProcessingPermissionNeededDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE [" + "issue=" + issue
                + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE}.
     */
    public static class Builder {
        private NotEligiblePaypalTxIdProcessingIssueEnum issue;
        private PaypalTxIdProcessingPermissionNeededDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligiblePaypalTxIdProcessingIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligiblePaypalTxIdProcessingIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaypalTxIdProcessingPermissionNeededDescEnum value for description.
         * @return Builder
         */
        public Builder description(PaypalTxIdProcessingPermissionNeededDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE} object using the set
         * fields.
         * @return {@link PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE}
         */
        public PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE build() {
            return new PAYPALIDPROCESSINGINELIGIBILITYERRORRESPONSE(issue, description);
        }
    }
}
