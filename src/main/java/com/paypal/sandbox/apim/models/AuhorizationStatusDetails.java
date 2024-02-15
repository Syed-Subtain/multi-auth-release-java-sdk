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
 * This is a model class for AuhorizationStatusDetails type.
 */
public class AuhorizationStatusDetails {
    private AuthorizationStatusDetailsReasonEnum reason;

    /**
     * Default constructor.
     */
    public AuhorizationStatusDetails() {
    }

    /**
     * Initialization constructor.
     * @param  reason  AuthorizationStatusDetailsReasonEnum value for reason.
     */
    public AuhorizationStatusDetails(
            AuthorizationStatusDetailsReasonEnum reason) {
        this.reason = reason;
    }

    /**
     * Getter for Reason.
     * The reason why the authorized status is `PENDING`.
     * @return Returns the AuthorizationStatusDetailsReasonEnum
     */
    @JsonGetter("reason")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public AuthorizationStatusDetailsReasonEnum getReason() {
        return reason;
    }

    /**
     * Setter for Reason.
     * The reason why the authorized status is `PENDING`.
     * @param reason Value for AuthorizationStatusDetailsReasonEnum
     */
    @JsonSetter("reason")
    public void setReason(AuthorizationStatusDetailsReasonEnum reason) {
        this.reason = reason;
    }

    /**
     * Converts this AuhorizationStatusDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "AuhorizationStatusDetails [" + "reason=" + reason + "]";
    }

    /**
     * Builds a new {@link AuhorizationStatusDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link AuhorizationStatusDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .reason(getReason());
        return builder;
    }

    /**
     * Class to build instances of {@link AuhorizationStatusDetails}.
     */
    public static class Builder {
        private AuthorizationStatusDetailsReasonEnum reason;



        /**
         * Setter for reason.
         * @param  reason  AuthorizationStatusDetailsReasonEnum value for reason.
         * @return Builder
         */
        public Builder reason(AuthorizationStatusDetailsReasonEnum reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Builds a new {@link AuhorizationStatusDetails} object using the set fields.
         * @return {@link AuhorizationStatusDetails}
         */
        public AuhorizationStatusDetails build() {
            return new AuhorizationStatusDetails(reason);
        }
    }
}
