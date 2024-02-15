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
 * This is a model class for CardStoredCredential type.
 */
public class CardStoredCredential {
    private PaymentInitiatorEnum paymentInitiator;
    private StoredPaymentSourcePaymentTypeEnum paymentType;
    private StoredPaymentSourceUsageTypeEnum usage;
    private NetworkTransactionReference previousNetworkTransactionReference;

    /**
     * Default constructor.
     */
    public CardStoredCredential() {
        usage = StoredPaymentSourceUsageTypeEnum.DERIVED;
    }

    /**
     * Initialization constructor.
     * @param  paymentInitiator  PaymentInitiatorEnum value for paymentInitiator.
     * @param  paymentType  StoredPaymentSourcePaymentTypeEnum value for paymentType.
     * @param  usage  StoredPaymentSourceUsageTypeEnum value for usage.
     * @param  previousNetworkTransactionReference  NetworkTransactionReference value for
     *         previousNetworkTransactionReference.
     */
    public CardStoredCredential(
            PaymentInitiatorEnum paymentInitiator,
            StoredPaymentSourcePaymentTypeEnum paymentType,
            StoredPaymentSourceUsageTypeEnum usage,
            NetworkTransactionReference previousNetworkTransactionReference) {
        this.paymentInitiator = paymentInitiator;
        this.paymentType = paymentType;
        this.usage = usage;
        this.previousNetworkTransactionReference = previousNetworkTransactionReference;
    }

    /**
     * Getter for PaymentInitiator.
     * The person or party who initiated or triggered the payment.
     * @return Returns the PaymentInitiatorEnum
     */
    @JsonGetter("payment_initiator")
    public PaymentInitiatorEnum getPaymentInitiator() {
        return paymentInitiator;
    }

    /**
     * Setter for PaymentInitiator.
     * The person or party who initiated or triggered the payment.
     * @param paymentInitiator Value for PaymentInitiatorEnum
     */
    @JsonSetter("payment_initiator")
    public void setPaymentInitiator(PaymentInitiatorEnum paymentInitiator) {
        this.paymentInitiator = paymentInitiator;
    }

    /**
     * Getter for PaymentType.
     * Indicates the type of the stored payment_source payment.
     * @return Returns the StoredPaymentSourcePaymentTypeEnum
     */
    @JsonGetter("payment_type")
    public StoredPaymentSourcePaymentTypeEnum getPaymentType() {
        return paymentType;
    }

    /**
     * Setter for PaymentType.
     * Indicates the type of the stored payment_source payment.
     * @param paymentType Value for StoredPaymentSourcePaymentTypeEnum
     */
    @JsonSetter("payment_type")
    public void setPaymentType(StoredPaymentSourcePaymentTypeEnum paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * Getter for Usage.
     * Indicates if this is a `first` or `subsequent` payment using a stored payment source (also
     * referred to as stored credential or card on file).
     * @return Returns the StoredPaymentSourceUsageTypeEnum
     */
    @JsonGetter("usage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public StoredPaymentSourceUsageTypeEnum getUsage() {
        return usage;
    }

    /**
     * Setter for Usage.
     * Indicates if this is a `first` or `subsequent` payment using a stored payment source (also
     * referred to as stored credential or card on file).
     * @param usage Value for StoredPaymentSourceUsageTypeEnum
     */
    @JsonSetter("usage")
    public void setUsage(StoredPaymentSourceUsageTypeEnum usage) {
        this.usage = usage;
    }

    /**
     * Getter for PreviousNetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @return Returns the NetworkTransactionReference
     */
    @JsonGetter("previous_network_transaction_reference")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public NetworkTransactionReference getPreviousNetworkTransactionReference() {
        return previousNetworkTransactionReference;
    }

    /**
     * Setter for PreviousNetworkTransactionReference.
     * Reference values used by the card network to identify a transaction.
     * @param previousNetworkTransactionReference Value for NetworkTransactionReference
     */
    @JsonSetter("previous_network_transaction_reference")
    public void setPreviousNetworkTransactionReference(NetworkTransactionReference previousNetworkTransactionReference) {
        this.previousNetworkTransactionReference = previousNetworkTransactionReference;
    }

    /**
     * Converts this CardStoredCredential into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardStoredCredential [" + "paymentInitiator=" + paymentInitiator + ", paymentType="
                + paymentType + ", usage=" + usage + ", previousNetworkTransactionReference="
                + previousNetworkTransactionReference + "]";
    }

    /**
     * Builds a new {@link CardStoredCredential.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardStoredCredential.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentInitiator, paymentType)
                .usage(getUsage())
                .previousNetworkTransactionReference(getPreviousNetworkTransactionReference());
        return builder;
    }

    /**
     * Class to build instances of {@link CardStoredCredential}.
     */
    public static class Builder {
        private PaymentInitiatorEnum paymentInitiator;
        private StoredPaymentSourcePaymentTypeEnum paymentType;
        private StoredPaymentSourceUsageTypeEnum usage = StoredPaymentSourceUsageTypeEnum.DERIVED;
        private NetworkTransactionReference previousNetworkTransactionReference;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentInitiator  PaymentInitiatorEnum value for paymentInitiator.
         * @param  paymentType  StoredPaymentSourcePaymentTypeEnum value for paymentType.
         */
        public Builder(PaymentInitiatorEnum paymentInitiator,
                StoredPaymentSourcePaymentTypeEnum paymentType) {
            this.paymentInitiator = paymentInitiator;
            this.paymentType = paymentType;
        }

        /**
         * Setter for paymentInitiator.
         * @param  paymentInitiator  PaymentInitiatorEnum value for paymentInitiator.
         * @return Builder
         */
        public Builder paymentInitiator(PaymentInitiatorEnum paymentInitiator) {
            this.paymentInitiator = paymentInitiator;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  StoredPaymentSourcePaymentTypeEnum value for paymentType.
         * @return Builder
         */
        public Builder paymentType(StoredPaymentSourcePaymentTypeEnum paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for usage.
         * @param  usage  StoredPaymentSourceUsageTypeEnum value for usage.
         * @return Builder
         */
        public Builder usage(StoredPaymentSourceUsageTypeEnum usage) {
            this.usage = usage;
            return this;
        }

        /**
         * Setter for previousNetworkTransactionReference.
         * @param  previousNetworkTransactionReference  NetworkTransactionReference value for
         *         previousNetworkTransactionReference.
         * @return Builder
         */
        public Builder previousNetworkTransactionReference(
                NetworkTransactionReference previousNetworkTransactionReference) {
            this.previousNetworkTransactionReference = previousNetworkTransactionReference;
            return this;
        }

        /**
         * Builds a new {@link CardStoredCredential} object using the set fields.
         * @return {@link CardStoredCredential}
         */
        public CardStoredCredential build() {
            return new CardStoredCredential(paymentInitiator, paymentType, usage,
                    previousNetworkTransactionReference);
        }
    }
}
