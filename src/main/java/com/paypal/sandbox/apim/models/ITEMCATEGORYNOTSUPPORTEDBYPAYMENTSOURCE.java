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
 * This is a model class for ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE type.
 */
public class ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE {
    private ItemCategoryNotSupportedPaymentSourceEnum issue;
    private PaymentSourceDoesNotSupportItemCategoryEnum description;

    /**
     * Default constructor.
     */
    public ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE() {
    }

    /**
     * Initialization constructor.
     * @param  issue  ItemCategoryNotSupportedPaymentSourceEnum value for issue.
     * @param  description  PaymentSourceDoesNotSupportItemCategoryEnum value for description.
     */
    public ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE(
            ItemCategoryNotSupportedPaymentSourceEnum issue,
            PaymentSourceDoesNotSupportItemCategoryEnum description) {
        this.issue = issue;
        this.description = description;
    }

    /**
     * Getter for Issue.
     * @return Returns the ItemCategoryNotSupportedPaymentSourceEnum
     */
    @JsonGetter("issue")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ItemCategoryNotSupportedPaymentSourceEnum getIssue() {
        return issue;
    }

    /**
     * Setter for Issue.
     * @param issue Value for ItemCategoryNotSupportedPaymentSourceEnum
     */
    @JsonSetter("issue")
    public void setIssue(ItemCategoryNotSupportedPaymentSourceEnum issue) {
        this.issue = issue;
    }

    /**
     * Getter for Description.
     * @return Returns the PaymentSourceDoesNotSupportItemCategoryEnum
     */
    @JsonGetter("description")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceDoesNotSupportItemCategoryEnum getDescription() {
        return description;
    }

    /**
     * Setter for Description.
     * @param description Value for PaymentSourceDoesNotSupportItemCategoryEnum
     */
    @JsonSetter("description")
    public void setDescription(PaymentSourceDoesNotSupportItemCategoryEnum description) {
        this.description = description;
    }

    /**
     * Converts this ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE [" + "issue=" + issue + ", description="
                + description + "]";
    }

    /**
     * Builds a new {@link ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .issue(getIssue())
                .description(getDescription());
        return builder;
    }

    /**
     * Class to build instances of {@link ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE}.
     */
    public static class Builder {
        private ItemCategoryNotSupportedPaymentSourceEnum issue;
        private PaymentSourceDoesNotSupportItemCategoryEnum description;



        /**
         * Setter for issue.
         * @param  issue  ItemCategoryNotSupportedPaymentSourceEnum value for issue.
         * @return Builder
         */
        public Builder issue(ItemCategoryNotSupportedPaymentSourceEnum issue) {
            this.issue = issue;
            return this;
        }

        /**
         * Setter for description.
         * @param  description  PaymentSourceDoesNotSupportItemCategoryEnum value for description.
         * @return Builder
         */
        public Builder description(PaymentSourceDoesNotSupportItemCategoryEnum description) {
            this.description = description;
            return this;
        }

        /**
         * Builds a new {@link ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE} object using the set fields.
         * @return {@link ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE}
         */
        public ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE build() {
            return new ITEMCATEGORYNOTSUPPORTEDBYPAYMENTSOURCE(issue, description);
        }
    }
}
