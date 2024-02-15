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
 * This is a model class for PAYPALIDERROR type.
 */
public class PAYPALIDERROR {
    private NotEligiblePaypalTxIdProcessingEnum issue;
    private PaypalTxIdProcessingPermissionNeededEnum description;

    /**
     * Default constructor.
     */
    public PAYPALIDERROR() {
    }

    /**
     * Initialization constructor.
     * @param  issue  NotEligiblePaypalTxIdProcessingEnum value for issue.
     * @param  description  PaypalTxIdProcessingPermissionNeededEnum value for description.
     */
    public PAYPALIDERROR(
            NotEligiblePaypalTxIdProcessingEnum issue,
            PaypalTxIdProcessingPermissionNeededEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the NotEligiblePaypalTxIdProcessingEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NotEligiblePaypalTxIdProcessingEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for NotEligiblePaypalTxIdProcessingEnum
     */
    @JsonSetter("issue")
    public void setIssue(NotEligiblePaypalTxIdProcessingEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaypalTxIdProcessingPermissionNeededEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaypalTxIdProcessingPermissionNeededEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaypalTxIdProcessingPermissionNeededEnum
     */
    @JsonSetter("description")
    public void setDescription(PaypalTxIdProcessingPermissionNeededEnum description) {
        this.description = description;
    }

    /**
     * Converts this PAYPALIDERROR into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PAYPALIDERROR [" + "issue=" + issue + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link PAYPALIDERROR.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PAYPALIDERROR.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link PAYPALIDERROR}.
     */
    public static class Builder {
        private NotEligiblePaypalTxIdProcessingEnum issue;
        private PaypalTxIdProcessingPermissionNeededEnum description;



        /**
         * Setter for issue.
         * @param  issue  NotEligiblePaypalTxIdProcessingEnum value for issue.
         * @return Builder
         */
        public Builder issue(NotEligiblePaypalTxIdProcessingEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaypalTxIdProcessingPermissionNeededEnum value for description.
         * @return Builder
         */
        public Builder description(PaypalTxIdProcessingPermissionNeededEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link PAYPALIDERROR} object using the set fields.
         * @return {@link PAYPALIDERROR}
         */
        public PAYPALIDERROR build() {
            return new PAYPALIDERROR(issue, description);
        }
    }
}
