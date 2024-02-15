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
 * This is a model class for BankResponse type.
 */
public class BankResponse {
    private ACHDebitResponse achDebit;

    /**
     * Default constructor.
     */
    public BankResponse() {
    }

    /**
     * Initialization constructor.
     * @param  achDebit  ACHDebitResponse value for achDebit.
     */
    public BankResponse(
            ACHDebitResponse achDebit) {
        this.achDebit = achDebit;
    }

    /**
     * Getter for AchDebit.
     * ACH Debit Response.
     * @return Returns the ACHDebitResponse
     */
    @JsonGetter("ach_debit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ACHDebitResponse getAchDebit() {
        return achDebit;
    }

    /**
     * Setter for AchDebit.
     * ACH Debit Response.
     * @param achDebit Value for ACHDebitResponse
     */
    @JsonSetter("ach_debit")
    public void setAchDebit(ACHDebitResponse achDebit) {
        this.achDebit = achDebit;
    }

    /**
     * Converts this BankResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BankResponse [" + "achDebit=" + achDebit + "]";
    }

    /**
     * Builds a new {@link BankResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link BankResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .achDebit(getAchDebit());
        return builder;
    }

    /**
     * Class to build instances of {@link BankResponse}.
     */
    public static class Builder {
        private ACHDebitResponse achDebit;



        /**
         * Setter for achDebit.
         * @param  achDebit  ACHDebitResponse value for achDebit.
         * @return Builder
         */
        public Builder achDebit(ACHDebitResponse achDebit) {
            this.achDebit = achDebit;
            return this;
        }

        /**
         * Builds a new {@link BankResponse} object using the set fields.
         * @return {@link BankResponse}
         */
        public BankResponse build() {
            return new BankResponse(achDebit);
        }
    }
}
