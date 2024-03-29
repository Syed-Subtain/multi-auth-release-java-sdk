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
 * This is a model class for INVALIDPAYEEPRICINGTIERID type.
 */
public class INVALIDPAYEEPRICINGTIERID {
    private InvalidPayeePricingTierIdIssueEnum issue;
    private InvalidPayeePricingTierIdDescriptionEnum description;

    /**
     * Default constructor.
     */
    public INVALIDPAYEEPRICINGTIERID() {
    }

    /**
     * Initialization constructor.
     * @param  issue  InvalidPayeePricingTierIdIssueEnum value for issue.
     * @param  description  InvalidPayeePricingTierIdDescriptionEnum value for description.
     */
    public INVALIDPAYEEPRICINGTIERID(
            InvalidPayeePricingTierIdIssueEnum issue,
            InvalidPayeePricingTierIdDescriptionEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the InvalidPayeePricingTierIdIssueEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPayeePricingTierIdIssueEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for InvalidPayeePricingTierIdIssueEnum
     */
    @JsonSetter("issue")
    public void setIssue(InvalidPayeePricingTierIdIssueEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the InvalidPayeePricingTierIdDescriptionEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public InvalidPayeePricingTierIdDescriptionEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for InvalidPayeePricingTierIdDescriptionEnum
     */
    @JsonSetter("description")
    public void setDescription(InvalidPayeePricingTierIdDescriptionEnum description) {
        this.description = description;
    }

    /**
     * Converts this INVALIDPAYEEPRICINGTIERID into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "INVALIDPAYEEPRICINGTIERID [" + "issue=" + issue + ", description=" + description
                + "]";
    }

    /**
     * Builds a new {@link INVALIDPAYEEPRICINGTIERID.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link INVALIDPAYEEPRICINGTIERID.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link INVALIDPAYEEPRICINGTIERID}.
     */
    public static class Builder {
        private InvalidPayeePricingTierIdIssueEnum issue;
        private InvalidPayeePricingTierIdDescriptionEnum description;



        /**
         * Setter for issue.
         * @param  issue  InvalidPayeePricingTierIdIssueEnum value for issue.
         * @return Builder
         */
        public Builder issue(InvalidPayeePricingTierIdIssueEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  InvalidPayeePricingTierIdDescriptionEnum value for description.
         * @return Builder
         */
        public Builder description(InvalidPayeePricingTierIdDescriptionEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link INVALIDPAYEEPRICINGTIERID} object using the set fields.
         * @return {@link INVALIDPAYEEPRICINGTIERID}
         */
        public INVALIDPAYEEPRICINGTIERID build() {
            return new INVALIDPAYEEPRICINGTIERID(issue, description);
        }
    }
}
