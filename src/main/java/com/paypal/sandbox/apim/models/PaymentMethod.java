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
 * This is a model class for PaymentMethod type.
 */
public class PaymentMethod {
    private PayeePaymentMethodPreferenceEnum payeePreferred;
    private PaymentMethodStandardEntryClassCodeEnum standardEntryClassCode;

    /**
     * Default constructor.
     */
    public PaymentMethod() {
        payeePreferred = PayeePaymentMethodPreferenceEnum.UNRESTRICTED;
        standardEntryClassCode = PaymentMethodStandardEntryClassCodeEnum.WEB;
    }

    /**
     * Initialization constructor.
     * @param  payeePreferred  PayeePaymentMethodPreferenceEnum value for payeePreferred.
     * @param  standardEntryClassCode  PaymentMethodStandardEntryClassCodeEnum value for
     *         standardEntryClassCode.
     */
    public PaymentMethod(
            PayeePaymentMethodPreferenceEnum payeePreferred,
            PaymentMethodStandardEntryClassCodeEnum standardEntryClassCode) {
        this.payeePreferred = payeePreferred;
        this.standardEntryClassCode = standardEntryClassCode;
    }

    /**
     * Getter for PayeePreferred.
     * The merchant-preferred payment methods.
     * @return Returns the PayeePaymentMethodPreferenceEnum
     */
    @JsonGetter("payee_preferred")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PayeePaymentMethodPreferenceEnum getPayeePreferred() {
        return payeePreferred;
    }

    /**
     * Setter for PayeePreferred.
     * The merchant-preferred payment methods.
     * @param payeePreferred Value for PayeePaymentMethodPreferenceEnum
     */
    @JsonSetter("payee_preferred")
    public void setPayeePreferred(PayeePaymentMethodPreferenceEnum payeePreferred) {
        this.payeePreferred = payeePreferred;
    }

    /**
     * Getter for StandardEntryClassCode.
     * NACHA (the regulatory body governing the ACH network) requires that API callers (merchants,
     * partners) obtain the consumer’s explicit authorization before initiating a transaction. To
     * stay compliant, you’ll need to make sure that you retain a compliant authorization for each
     * transaction that you originate to the ACH Network using this API. ACH transactions are
     * categorized (using SEC codes) by how you capture authorization from the Receiver (the person
     * whose bank account is being debited or credited). PayPal supports the following SEC codes.
     * @return Returns the PaymentMethodStandardEntryClassCodeEnum
     */
    @JsonGetter("standard_entry_class_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentMethodStandardEntryClassCodeEnum getStandardEntryClassCode() {
        return standardEntryClassCode;
    }

    /**
     * Setter for StandardEntryClassCode.
     * NACHA (the regulatory body governing the ACH network) requires that API callers (merchants,
     * partners) obtain the consumer’s explicit authorization before initiating a transaction. To
     * stay compliant, you’ll need to make sure that you retain a compliant authorization for each
     * transaction that you originate to the ACH Network using this API. ACH transactions are
     * categorized (using SEC codes) by how you capture authorization from the Receiver (the person
     * whose bank account is being debited or credited). PayPal supports the following SEC codes.
     * @param standardEntryClassCode Value for PaymentMethodStandardEntryClassCodeEnum
     */
    @JsonSetter("standard_entry_class_code")
    public void setStandardEntryClassCode(PaymentMethodStandardEntryClassCodeEnum standardEntryClassCode) {
        this.standardEntryClassCode = standardEntryClassCode;
    }

    /**
     * Converts this PaymentMethod into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentMethod [" + "payeePreferred=" + payeePreferred + ", standardEntryClassCode="
                + standardEntryClassCode + "]";
    }

    /**
     * Builds a new {@link PaymentMethod.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentMethod.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .payeePreferred(getPayeePreferred())
                .standardEntryClassCode(getStandardEntryClassCode());
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentMethod}.
     */
    public static class Builder {
        private PayeePaymentMethodPreferenceEnum payeePreferred =
                PayeePaymentMethodPreferenceEnum.UNRESTRICTED;
        private PaymentMethodStandardEntryClassCodeEnum standardEntryClassCode =
                PaymentMethodStandardEntryClassCodeEnum.WEB;



        /**
         * Setter for payeePreferred.
         * @param  payeePreferred  PayeePaymentMethodPreferenceEnum value for payeePreferred.
         * @return Builder
         */
        public Builder payeePreferred(PayeePaymentMethodPreferenceEnum payeePreferred) {
            this.payeePreferred = payeePreferred;
            return this;
        }

        /**
         * Setter for standardEntryClassCode.
         * @param  standardEntryClassCode  PaymentMethodStandardEntryClassCodeEnum value for
         *         standardEntryClassCode.
         * @return Builder
         */
        public Builder standardEntryClassCode(
                PaymentMethodStandardEntryClassCodeEnum standardEntryClassCode) {
            this.standardEntryClassCode = standardEntryClassCode;
            return this;
        }

        /**
         * Builds a new {@link PaymentMethod} object using the set fields.
         * @return {@link PaymentMethod}
         */
        public PaymentMethod build() {
            return new PaymentMethod(payeePreferred, standardEntryClassCode);
        }
    }
}
