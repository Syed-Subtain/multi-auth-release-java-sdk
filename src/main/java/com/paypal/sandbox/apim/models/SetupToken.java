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
 * This is a model class for SetupToken type.
 */
public class SetupToken {
    private CustomerRequest customer;
    private SetupTokenRequestPaymentSource paymentSource;
    private Object metadata;

    /**
     * Default constructor.
     */
    public SetupToken() {
    }

    /**
     * Initialization constructor.
     * @param  paymentSource  SetupTokenRequestPaymentSource value for paymentSource.
     * @param  customer  CustomerRequest value for customer.
     * @param  metadata  Object value for metadata.
     */
    public SetupToken(
            SetupTokenRequestPaymentSource paymentSource,
            CustomerRequest customer,
            Object metadata) {
        this.customer = customer;
        this.paymentSource = paymentSource;
        this.metadata = metadata;
    }

    /**
     * Getter for Customer.
     * Customer in merchant's or partner's system of records.
     * @return Returns the CustomerRequest
     */
    @JsonGetter("customer")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public CustomerRequest getCustomer() {
        return customer;
    }

    /**
     * Setter for Customer.
     * Customer in merchant's or partner's system of records.
     * @param customer Value for CustomerRequest
     */
    @JsonSetter("customer")
    public void setCustomer(CustomerRequest customer) {
        this.customer = customer;
    }

    /**
     * Getter for PaymentSource.
     * The payment method to vault with the instrument details.
     * @return Returns the SetupTokenRequestPaymentSource
     */
    @JsonGetter("payment_source")
    public SetupTokenRequestPaymentSource getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment method to vault with the instrument details.
     * @param paymentSource Value for SetupTokenRequestPaymentSource
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(SetupTokenRequestPaymentSource paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for Metadata.
     * @return Returns the Object
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Object getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * @param metadata Value for Object
     */
    @JsonSetter("metadata")
    public void setMetadata(Object metadata) {
        this.metadata = metadata;
    }

    /**
     * Converts this SetupToken into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SetupToken [" + "paymentSource=" + paymentSource + ", customer=" + customer
                + ", metadata=" + metadata + "]";
    }

    /**
     * Builds a new {@link SetupToken.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SetupToken.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(paymentSource)
                .customer(getCustomer())
                .metadata(getMetadata());
        return builder;
    }

    /**
     * Class to build instances of {@link SetupToken}.
     */
    public static class Builder {
        private SetupTokenRequestPaymentSource paymentSource;
        private CustomerRequest customer;
        private Object metadata;

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  paymentSource  SetupTokenRequestPaymentSource value for paymentSource.
         */
        public Builder(SetupTokenRequestPaymentSource paymentSource) {
            this.paymentSource = paymentSource;
        }

        /**
         * Setter for paymentSource.
         * @param  paymentSource  SetupTokenRequestPaymentSource value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(SetupTokenRequestPaymentSource paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Setter for customer.
         * @param  customer  CustomerRequest value for customer.
         * @return Builder
         */
        public Builder customer(CustomerRequest customer) {
            this.customer = customer;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  Object value for metadata.
         * @return Builder
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds a new {@link SetupToken} object using the set fields.
         * @return {@link SetupToken}
         */
        public SetupToken build() {
            return new SetupToken(paymentSource, customer, metadata);
        }
    }
}
