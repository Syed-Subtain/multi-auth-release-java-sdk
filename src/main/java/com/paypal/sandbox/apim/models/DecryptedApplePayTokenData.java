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
 * This is a model class for DecryptedApplePayTokenData type.
 */
public class DecryptedApplePayTokenData {
    private FinancialTransactionCurrencyAndAmount transactionAmount;
    private Card tokenizedCard;
    private String deviceManufacturerId;
    private ApplePayDecryptedTokenDataPaymentDataTypeEnum paymentDataType;
    private DecryptedApplePayPaymentDetailsData paymentData;

    /**
     * Default constructor.
     */
    public DecryptedApplePayTokenData() {
    }

    /**
     * Initialization constructor.
     * @param  tokenizedCard  Card value for tokenizedCard.
     * @param  transactionAmount  FinancialTransactionCurrencyAndAmount value for transactionAmount.
     * @param  deviceManufacturerId  String value for deviceManufacturerId.
     * @param  paymentDataType  ApplePayDecryptedTokenDataPaymentDataTypeEnum value for
     *         paymentDataType.
     * @param  paymentData  DecryptedApplePayPaymentDetailsData value for paymentData.
     */
    public DecryptedApplePayTokenData(
            Card tokenizedCard,
            FinancialTransactionCurrencyAndAmount transactionAmount,
            String deviceManufacturerId,
            ApplePayDecryptedTokenDataPaymentDataTypeEnum paymentDataType,
            DecryptedApplePayPaymentDetailsData paymentData) {
        this.transactionAmount = transactionAmount;
        this.tokenizedCard = tokenizedCard;
        this.deviceManufacturerId = deviceManufacturerId;
        this.paymentDataType = paymentDataType;
        this.paymentData = paymentData;
    }

    /**
     * Getter for TransactionAmount.
     * The transaction amount for the payment that the payer has approved on apple platform.
     * @return Returns the FinancialTransactionCurrencyAndAmount
     */
    @JsonGetter("transaction_amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public FinancialTransactionCurrencyAndAmount getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter for TransactionAmount.
     * The transaction amount for the payment that the payer has approved on apple platform.
     * @param transactionAmount Value for FinancialTransactionCurrencyAndAmount
     */
    @JsonSetter("transaction_amount")
    public void setTransactionAmount(FinancialTransactionCurrencyAndAmount transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    /**
     * Getter for TokenizedCard.
     * Apple Pay tokenized credit card used to pay.
     * @return Returns the Card
     */
    @JsonGetter("tokenized_card")
    public Card getTokenizedCard() {
        return tokenizedCard;
    }

    /**
     * Setter for TokenizedCard.
     * Apple Pay tokenized credit card used to pay.
     * @param tokenizedCard Value for Card
     */
    @JsonSetter("tokenized_card")
    public void setTokenizedCard(Card tokenizedCard) {
        this.tokenizedCard = tokenizedCard;
    }

    /**
     * Getter for DeviceManufacturerId.
     * Apple Pay Hex-encoded device manufacturer identifier. The pattern is defined by an external
     * party and supports Unicode.
     * @return Returns the String
     */
    @JsonGetter("device_manufacturer_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDeviceManufacturerId() {
        return deviceManufacturerId;
    }

    /**
     * Setter for DeviceManufacturerId.
     * Apple Pay Hex-encoded device manufacturer identifier. The pattern is defined by an external
     * party and supports Unicode.
     * @param deviceManufacturerId Value for String
     */
    @JsonSetter("device_manufacturer_id")
    public void setDeviceManufacturerId(String deviceManufacturerId) {
        this.deviceManufacturerId = deviceManufacturerId;
    }

    /**
     * Getter for PaymentDataType.
     * Indicates the type of payment data passed, in case of Non China the payment data is 3DSECURE
     * and for China it is EMV.
     * @return Returns the ApplePayDecryptedTokenDataPaymentDataTypeEnum
     */
    @JsonGetter("payment_data_type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ApplePayDecryptedTokenDataPaymentDataTypeEnum getPaymentDataType() {
        return paymentDataType;
    }

    /**
     * Setter for PaymentDataType.
     * Indicates the type of payment data passed, in case of Non China the payment data is 3DSECURE
     * and for China it is EMV.
     * @param paymentDataType Value for ApplePayDecryptedTokenDataPaymentDataTypeEnum
     */
    @JsonSetter("payment_data_type")
    public void setPaymentDataType(ApplePayDecryptedTokenDataPaymentDataTypeEnum paymentDataType) {
        this.paymentDataType = paymentDataType;
    }

    /**
     * Getter for PaymentData.
     * Apple Pay payment data object which contains the cryptogram, eci_indicator and other data.
     * @return Returns the DecryptedApplePayPaymentDetailsData
     */
    @JsonGetter("payment_data")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DecryptedApplePayPaymentDetailsData getPaymentData() {
        return paymentData;
    }

    /**
     * Setter for PaymentData.
     * Apple Pay payment data object which contains the cryptogram, eci_indicator and other data.
     * @param paymentData Value for DecryptedApplePayPaymentDetailsData
     */
    @JsonSetter("payment_data")
    public void setPaymentData(DecryptedApplePayPaymentDetailsData paymentData) {
        this.paymentData = paymentData;
    }

    /**
     * Converts this DecryptedApplePayTokenData into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DecryptedApplePayTokenData [" + "tokenizedCard=" + tokenizedCard
                + ", transactionAmount=" + transactionAmount + ", deviceManufacturerId="
                + deviceManufacturerId + ", paymentDataType=" + paymentDataType + ", paymentData="
                + paymentData + "]";
    }

    /**
     * Builds a new {@link DecryptedApplePayTokenData.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DecryptedApplePayTokenData.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(tokenizedCard)
                .transactionAmount(getTransactionAmount())
                .deviceManufacturerId(getDeviceManufacturerId())
                .paymentDataType(getPaymentDataType())
                .paymentData(getPaymentData());
        return builder;
    }

    /**
     * Class to build instances of {@link DecryptedApplePayTokenData}.
     */
    public static class Builder {
        private Card tokenizedCard;
        private FinancialTransactionCurrencyAndAmount transactionAmount;
        private String deviceManufacturerId;
        private ApplePayDecryptedTokenDataPaymentDataTypeEnum paymentDataType;
        private DecryptedApplePayPaymentDetailsData paymentData;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  tokenizedCard  Card value for tokenizedCard.
         */
        public Builder(Card tokenizedCard) {
            this.tokenizedCard = tokenizedCard;
        }

        /**
         * Setter for tokenizedCard.
         * @param  tokenizedCard  Card value for tokenizedCard.
         * @return Builder
         */
        public Builder tokenizedCard(Card tokenizedCard) {
            this.tokenizedCard = tokenizedCard;
            return this;
        }

        /**
         * Setter for transactionAmount.
         * @param  transactionAmount  FinancialTransactionCurrencyAndAmount value for
         *         transactionAmount.
         * @return Builder
         */
        public Builder transactionAmount(
                FinancialTransactionCurrencyAndAmount transactionAmount) {
            this.transactionAmount = transactionAmount;
            return this;
        }

        /**
         * Setter for deviceManufacturerId.
         * @param  deviceManufacturerId  String value for deviceManufacturerId.
         * @return Builder
         */
        public Builder deviceManufacturerId(String deviceManufacturerId) {
            this.deviceManufacturerId = deviceManufacturerId;
            return this;
        }

        /**
         * Setter for paymentDataType.
         * @param  paymentDataType  ApplePayDecryptedTokenDataPaymentDataTypeEnum value for
         *         paymentDataType.
         * @return Builder
         */
        public Builder paymentDataType(
                ApplePayDecryptedTokenDataPaymentDataTypeEnum paymentDataType) {
            this.paymentDataType = paymentDataType;
            return this;
        }

        /**
         * Setter for paymentData.
         * @param  paymentData  DecryptedApplePayPaymentDetailsData value for paymentData.
         * @return Builder
         */
        public Builder paymentData(DecryptedApplePayPaymentDetailsData paymentData) {
            this.paymentData = paymentData;
            return this;
        }

        /**
         * Builds a new {@link DecryptedApplePayTokenData} object using the set fields.
         * @return {@link DecryptedApplePayTokenData}
         */
        public DecryptedApplePayTokenData build() {
            return new DecryptedApplePayTokenData(tokenizedCard, transactionAmount,
                    deviceManufacturerId, paymentDataType, paymentData);
        }
    }
}
