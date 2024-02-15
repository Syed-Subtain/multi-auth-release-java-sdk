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
 * This is a model class for MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP type.
 */
public class MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP {
    private MerchInitMultiPurchaseUnitsEnum issue;
    private ErrMerchInitMultiUnitsNotSupportedDescEnum description;

    /**
     * Default constructor.
     */
    public MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP() {
    }

    /**
     * Initialization constructor.
     * @param  issue  MerchInitMultiPurchaseUnitsEnum value for issue.
     * @param  description  ErrMerchInitMultiUnitsNotSupportedDescEnum value for description.
     */
    public MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP(
            MerchInitMultiPurchaseUnitsEnum issue,
            ErrMerchInitMultiUnitsNotSupportedDescEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the MerchInitMultiPurchaseUnitsEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchInitMultiPurchaseUnitsEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for MerchInitMultiPurchaseUnitsEnum
     */
    @JsonSetter("issue")
    public void setIssue(MerchInitMultiPurchaseUnitsEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the ErrMerchInitMultiUnitsNotSupportedDescEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ErrMerchInitMultiUnitsNotSupportedDescEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for ErrMerchInitMultiUnitsNotSupportedDescEnum
     */
    @JsonSetter("description")
    public void setDescription(ErrMerchInitMultiUnitsNotSupportedDescEnum description) {
        this.description = description;
    }

    /**
     * Converts this MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP [" + "issue=" + issue
                + ", description=" + description + "]";
    }

    /**
     * Builds a new {@link MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP}.
     */
    public static class Builder {
        private MerchInitMultiPurchaseUnitsEnum issue;
        private ErrMerchInitMultiUnitsNotSupportedDescEnum description;



        /**
         * Setter for issue.
         * @param  issue  MerchInitMultiPurchaseUnitsEnum value for issue.
         * @return Builder
         */
        public Builder issue(MerchInitMultiPurchaseUnitsEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  ErrMerchInitMultiUnitsNotSupportedDescEnum value for description.
         * @return Builder
         */
        public Builder description(ErrMerchInitMultiUnitsNotSupportedDescEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP} object using the set
         * fields.
         * @return {@link MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP}
         */
        public MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP build() {
            return new MERCHANTINITIATEDMULTIPURCHASEUNITSERRORRESP(issue, description);
        }
    }
}