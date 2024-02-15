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
 * This is a model class for OrderCaptureRequest type.
 */
public class OrderCaptureRequest {
    private PaymentSourceDefinition paymentSource;

    /**
     * Default constructor.
     */
    public OrderCaptureRequest() {
    }

    /**
     * Initialization constructor.
     * @param  paymentSource  PaymentSourceDefinition value for paymentSource.
     */
    public OrderCaptureRequest(
            PaymentSourceDefinition paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Getter for PaymentSource.
     * The payment source definition.
     * @return Returns the PaymentSourceDefinition
     */
    @JsonGetter("payment_source")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public PaymentSourceDefinition getPaymentSource() {
        return paymentSource;
    }

    /**
     * Setter for PaymentSource.
     * The payment source definition.
     * @param paymentSource Value for PaymentSourceDefinition
     */
    @JsonSetter("payment_source")
    public void setPaymentSource(PaymentSourceDefinition paymentSource) {
        this.paymentSource = paymentSource;
    }

    /**
     * Converts this OrderCaptureRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderCaptureRequest [" + "paymentSource=" + paymentSource + "]";
    }

    /**
     * Builds a new {@link OrderCaptureRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderCaptureRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .paymentSource(getPaymentSource());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderCaptureRequest}.
     */
    public static class Builder {
        private PaymentSourceDefinition paymentSource;



        /**
         * Setter for paymentSource.
         * @param  paymentSource  PaymentSourceDefinition value for paymentSource.
         * @return Builder
         */
        public Builder paymentSource(PaymentSourceDefinition paymentSource) {
            this.paymentSource = paymentSource;
            return this;
        }

        /**
         * Builds a new {@link OrderCaptureRequest} object using the set fields.
         * @return {@link OrderCaptureRequest}
         */
        public OrderCaptureRequest build() {
            return new OrderCaptureRequest(paymentSource);
        }
    }
}