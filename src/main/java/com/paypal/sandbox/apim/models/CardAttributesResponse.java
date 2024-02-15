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
 * This is a model class for CardAttributesResponse type.
 */
public class CardAttributesResponse {
    private SavedPaymentSourceResponse vault;

    /**
     * Default constructor.
     */
    public CardAttributesResponse() {
    }

    /**
     * Initialization constructor.
     * @param  vault  SavedPaymentSourceResponse value for vault.
     */
    public CardAttributesResponse(
            SavedPaymentSourceResponse vault) {
        this.vault = vault;
    }

    /**
     * Getter for Vault.
     * The details about a saved payment source.
     * @return Returns the SavedPaymentSourceResponse
     */
    @JsonGetter("vault")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public SavedPaymentSourceResponse getVault() {
        return vault;
    }

    /**
     * Setter for Vault.
     * The details about a saved payment source.
     * @param vault Value for SavedPaymentSourceResponse
     */
    @JsonSetter("vault")
    public void setVault(SavedPaymentSourceResponse vault) {
        this.vault = vault;
    }

    /**
     * Converts this CardAttributesResponse into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardAttributesResponse [" + "vault=" + vault + "]";
    }

    /**
     * Builds a new {@link CardAttributesResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardAttributesResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .vault(getVault());
        return builder;
    }

    /**
     * Class to build instances of {@link CardAttributesResponse}.
     */
    public static class Builder {
        private SavedPaymentSourceResponse vault;



        /**
         * Setter for vault.
         * @param  vault  SavedPaymentSourceResponse value for vault.
         * @return Builder
         */
        public Builder vault(SavedPaymentSourceResponse vault) {
            this.vault = vault;
            return this;
        }

        /**
         * Builds a new {@link CardAttributesResponse} object using the set fields.
         * @return {@link CardAttributesResponse}
         */
        public CardAttributesResponse build() {
            return new CardAttributesResponse(vault);
        }
    }
}
