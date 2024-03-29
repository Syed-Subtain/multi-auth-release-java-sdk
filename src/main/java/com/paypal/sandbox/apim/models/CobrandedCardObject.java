/*
 * PaypalMergedAPILib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.paypal.sandbox.apim.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;

/**
 * This is a model class for CobrandedCardObject type.
 */
public class CobrandedCardObject {
    private List<String> labels;
    private MerchantBase payee;
    private Money amount;

    /**
     * Default constructor.
     */
    public CobrandedCardObject() {
    }

    /**
     * Initialization constructor.
     * @param  labels  List of String value for labels.
     * @param  payee  MerchantBase value for payee.
     * @param  amount  Money value for amount.
     */
    public CobrandedCardObject(
            List<String> labels,
            MerchantBase payee,
            Money amount) {
        this.labels = labels;
        this.payee = payee;
        this.amount = amount;
    }

    /**
     * Getter for Labels.
     * Array of labels for the cobranded card.
     * @return Returns the List of String
     */
    @JsonGetter("labels")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<String> getLabels() {
        return labels;
    }

    /**
     * Setter for Labels.
     * Array of labels for the cobranded card.
     * @param labels Value for List of String
     */
    @JsonSetter("labels")
    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    /**
     * Getter for Payee.
     * Merchant associated with the purchase.
     * @return Returns the MerchantBase
     */
    @JsonGetter("payee")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantBase getPayee() {
        return payee;
    }

    /**
     * Setter for Payee.
     * Merchant associated with the purchase.
     * @param payee Value for MerchantBase
     */
    @JsonSetter("payee")
    public void setPayee(MerchantBase payee) {
        this.payee = payee;
    }

    /**
     * Getter for Amount.
     * Amount that was charged to the cobranded card.
     * @return Returns the Money
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount that was charged to the cobranded card.
     * @param amount Value for Money
     */
    @JsonSetter("amount")
    public void setAmount(Money amount) {
        this.amount = amount;
    }

    /**
     * Converts this CobrandedCardObject into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CobrandedCardObject [" + "labels=" + labels + ", payee=" + payee + ", amount="
                + amount + "]";
    }

    /**
     * Builds a new {@link CobrandedCardObject.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CobrandedCardObject.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .labels(getLabels())
                .payee(getPayee())
                .amount(getAmount());
        return builder;
    }

    /**
     * Class to build instances of {@link CobrandedCardObject}.
     */
    public static class Builder {
        private List<String> labels;
        private MerchantBase payee;
        private Money amount;



        /**
         * Setter for labels.
         * @param  labels  List of String value for labels.
         * @return Builder
         */
        public Builder labels(List<String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * Setter for payee.
         * @param  payee  MerchantBase value for payee.
         * @return Builder
         */
        public Builder payee(MerchantBase payee) {
            this.payee = payee;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Money value for amount.
         * @return Builder
         */
        public Builder amount(Money amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Builds a new {@link CobrandedCardObject} object using the set fields.
         * @return {@link CobrandedCardObject}
         */
        public CobrandedCardObject build() {
            return new CobrandedCardObject(labels, payee, amount);
        }
    }
}
